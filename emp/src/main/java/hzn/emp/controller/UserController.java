package hzn.emp.controller;

import hzn.emp.bean.User;
import hzn.emp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    UserMapper dao;
    //@RequestMapping(method = RequestMethod.POST,value="/login")
    @PostMapping("/login")
    public void login(User u, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String p = dao.selectPassByName(u.getName());
        System.out.println("正确密码："+p);
        if(p!=null&&p.equals(u.getPass())){
            req.getSession().setAttribute("user",u.getName());
            resp.sendRedirect("/showEmps");
        }else{
            resp.sendRedirect("/showLogin");
        }
    }
}
