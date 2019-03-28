package hzn.emp.bean;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object u = request.getSession().getAttribute("user");
        if(u==null){
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/showLogin").forward(request,response);
            return false;
        }
        return true;
    }
}
