package com.yyf.system.controller;

import com.yyf.system.pojo.User;
import com.yyf.system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Feng on 2017/6/3.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login.action")
    public ModelAndView login1(@RequestParam("username")String userName,
                              @RequestParam("password")String password,
                               HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> result=loginService.login(userName,password);
        if (result.get("result").equals("success")){
            HttpSession session=request.getSession();
            session.setAttribute("user",result.get("user"));
                modelAndView.setViewName("../../index");
        }else{
            modelAndView.setViewName("/login");
            modelAndView.addObject("msg",result.get("msg"));
        }
        return modelAndView;
    }
    @RequestMapping("/systemChoice.action")
    public ModelAndView systemChoice(@RequestParam("system") int  system, HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        if (system==0){
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if (user.isAdministrator()){
                modelAndView.setViewName("redirect:/system/toIndex1.action");
            }else
                modelAndView.setViewName("redirect:/toIndex2.action");


        }else {
            modelAndView.setViewName("redirect:/toCareerPlanIndex.action");
        }
        return modelAndView;
    }

    @RequestMapping("/toLogin.action")
    public ModelAndView toLogin(){
            return new ModelAndView("/login");
    }

    @RequestMapping("/system/toIndex1.action")
    public ModelAndView toIndex1(){
        return new ModelAndView("/main/index");
    }
    @RequestMapping("/toIndex2.action")
    public ModelAndView toIndex2(){
        return new ModelAndView("/main/customIndex");
    }

    @RequestMapping("/toIndex2Content.action")
    public ModelAndView toIndex2Content(){
        return new ModelAndView("/main/customIndexContent");
    }

    @RequestMapping("/logout.action")
    public ModelAndView logout(HttpServletRequest httpServletRequest){
        ModelAndView modelAndView=new ModelAndView("redirect:/toLogin.action");
        HttpSession session=httpServletRequest.getSession();
        if (session!=null){
            session.removeAttribute("user");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/toError.action")
    public ModelAndView toError(@RequestParam("error")String error) throws Exception {
        ModelAndView modelAndView=new ModelAndView("/error");
        System.out.println(error);
        modelAndView.addObject("error",error);
        return modelAndView;
    }

    @RequestMapping("/toCareerPlanIndex.action")
    public ModelAndView toCareerPlanIndex(){
        return new ModelAndView("/careerPlan/index");
    }

//    @RequestMapping(value = "/captcha", method = RequestMethod.GET)
//    @ResponseBody
//    public void captcha(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException
//    {
//        CaptchaUtil.outputCaptcha(request, response);
//    }

    @RequestMapping("/toTeacher.action")
    public ModelAndView toTeacher(){
        return new ModelAndView("/home/tIntroduction");
    }
}
