package com.levunguyen.import_annotation;

import com.levunguyen.import_annotation.config.Web;
import com.levunguyen.import_annotation.models.Connection;
import com.levunguyen.import_annotation.models.Page;
import com.levunguyen.import_annotation.models.Share;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ctx.register(Web.class);
        Share share = (Share) ctx.getBean("share");
        Connection connection = (Connection) ctx.getBean("connect");
        Page page = (Page) ctx.getBean("page");
        share.doWork();
        connection.doWork();
        page.doWork();
    }
}
