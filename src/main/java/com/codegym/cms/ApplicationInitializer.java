package com.codegym.cms;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// đây là lớp  cấu hình khởi tạo cho ứng dụng, nó thay thế cho việc cấu hình bằng file web.xml nếu cấu hình bằng xml
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
