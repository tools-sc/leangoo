package com.team6.leangoo.conf;

import com.team6.leangoo.model.User;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by AgZou on 2017/8/25.
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if (isLoginRequest(request, response))
        {
            if (isLoginSubmission(request, response))
            {
                //本次用户登陆账号
                String account = this.getUsername(request);

                Subject subject = this.getSubject(request, response);
                //之前登陆的用户
                User user = (User) subject.getPrincipal();
                //如果两次登陆的用户不一样，则先退出之前登陆的用户
                if (account != null && user != null && !account.equals(user.getUserAccount()))
                {
                    subject.logout();
                }
            }
        }
        System.out.println("自定义shiro接口运行");
        return super.isAccessAllowed(request, response, mappedValue);
    }
}
