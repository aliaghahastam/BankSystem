package ir.mctab.project.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class utf8encoderfilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 =(HttpServletRequest) request;
        HttpServletResponse response1=(HttpServletResponse) response;
        request1.setCharacterEncoding("UTF-8");
        response1.setCharacterEncoding("UTF-8");
        chain.doFilter(request1,response1);

    }
}
