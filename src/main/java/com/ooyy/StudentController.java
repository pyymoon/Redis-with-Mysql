//package com.ooyy;
//import com.ooyy.jdbc.DataBaseOperator;
//import com.ooyy.jedis.JedisController;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller
//public class StudentController {
//    @RequestMapping(value = "/student",method = RequestMethod.GET)
//    public ModelAndView student(){
//        return new ModelAndView("student","command",new Student());
//    }
//
//    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
////    public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model){
////        model.addAttribute("name",student.getName());
////        model.addAttribute("age",student.getAge());
////        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
////        DataBaseOperator dbo = (DataBaseOperator) context.getBean("student");
////        dbo.create(student);
////
////        model.addAttribute("id",dbo.getId(student));
////        ((ConfigurableApplicationContext)context).close();
////        return "result";
////    }
//
//        public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model){
//        model.addAttribute("name",student.getName());
//        model.addAttribute("addr",student.getAddr());
//        model.addAttribute("age",student.getAge());
////        model.addAttribute("id",student.getId());
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        JedisController jc = (JedisController) context.getBean("student");
//        jc.create(student);
//
////        model.addAttribute("id",dbo.getId(student));
//        ((ConfigurableApplicationContext)context).close();
//        return "result";
//    }
//
//
//
////    @RequestMapping(value = "/look",method = RequestMethod.GET)
////    public String look(@ModelAttribute("SpringWeb")Student student, Model model){
////        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
////        DataBaseOperator dbo = (DataBaseOperator) context.getBean("student");
////        Student student1 = dbo.getStudent(student.getId());
////        model.addAttribute("name",student1.getName());
////        model.addAttribute("age",student1.getAge());
////        return "view";
////    }
//}
//
