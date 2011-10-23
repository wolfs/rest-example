package com.tngtech.webapp.easy.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wolfs
 */
@Controller
public class EasyResource {

    @RequestMapping(method = RequestMethod.GET, value = "/hello.txt")
    public @ResponseBody String getString() {
        return "hello, world";
    }

    /**
     * @return EasyModel in JSON marshalled via Jackson
     */
    @RequestMapping(method = RequestMethod.GET, value = "/hello.json")
    public @ResponseBody EasyModel getJson() {
        EasyModel model = new EasyModel();
        model.setHello("world");
        return model;
    }

    public static class EasyModel {
        private String hello;

        public String getHello() {
            return hello;
        }

        public void setHello(String hello) {
            this.hello = hello;
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello.html")
    public void getHtml(HttpServletResponse response) throws IOException {
        response.getWriter().append(toHtml());
    }

    public String toHtml() {
        return new StringBuilder()
                .append("<html><body>")
                .append("<h1>")
                .append("Hello, world")
                .append("</h1>")
                .append("</body></html>")
                .toString();
    }

}
