package com.tngtech.webapp.easy.restlet;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * @author wolfs
 */
public class EasyResource extends ServerResource {

    public static void main(String[] args) throws Exception {
        // Create the HTTP server and listen on port 8182
        new Server(Protocol.HTTP, 8182, EasyResource.class).start();
    }

    @Get("txt")
    public String toString() {
        return "hello, world";
    }

    @Get("htm")
    public String toHtml() {
        return new StringBuilder()
                .append("<html><body>")
                .append("<h1>")
                .append("Hello, world")
                .append("</h1>")
                .append("</body></html>")
                .toString();
    }

    @Get("json")
    public String toJson() {
        return "hello: world";
    }

}
