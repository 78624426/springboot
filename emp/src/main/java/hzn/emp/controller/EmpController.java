package hzn.emp.controller;

import hzn.emp.bean.Emp;
import hzn.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    EmpMapper dao;
    @RequestMapping("/showEmps")
    public String showEmps(Model m){
        List<Emp>list = dao.selectAllEmp();
        m.addAttribute("emps",list);
        return "emps";
    }
}
