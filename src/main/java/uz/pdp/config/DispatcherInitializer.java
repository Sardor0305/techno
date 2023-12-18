package uz.pdp.config;

import io.micrometer.common.lang.NonNullApi;
import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration;
import lombok.NonNull;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import uz.pdp.config.security.WebSecurityConfig;
import uz.pdp.db.DatasourceConfig;

@NonNullApi
public class DispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }



}
