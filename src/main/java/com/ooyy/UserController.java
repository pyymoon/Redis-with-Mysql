package com.ooyy;

import com.ooyy.jdbc.UserJdbc;
import com.ooyy.jedis.UserJedis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index","command",new User());
    }

    @RequestMapping(value = "/yanIndex",method = RequestMethod.POST)
    public String yanIndex(@ModelAttribute("SpringWeb")User user, ModelMap model){
        model.addAttribute("userName",user.getUserName());
        model.addAttribute("password",user.getPassword());
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserJdbc userJdbc = (UserJdbc) context.getBean("userJdbc");
        int i = userJdbc.login(user);
        if (i==0){
            return "error";
        }
        return "success";
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register(){
        return new ModelAndView("register","command",new User());
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String  register(@ModelAttribute("SpringWeb")User user, ModelMap model){
        model.addAttribute("userName",user.getUserName());
        model.addAttribute("password",user.getPassword());
        model.addAttribute("address",user.getAddress());
        model.addAttribute("phoneNumber",user.getPhoneNumber());
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserJedis userJedis = (UserJedis) context.getBean("userJedis");
        userJedis.register(user);
        userJedis.update();
        ((ConfigurableApplicationContext)context).close();

        return "success";
    }

    @RequestMapping("/goRegister")
    public String go(){
        return "register";
    }
}

