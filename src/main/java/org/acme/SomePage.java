package org.acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/page")
public class SomePage {
    private static final Logger logger = LoggerFactory.getLogger(SomePage.class);

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance pageA();

        public static native TemplateInstance pageA$content();

    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/ok")
    public TemplateInstance get() {
        return Templates.pageA();
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/wrong")
    public TemplateInstance getContent() {
        return Templates.pageA$content();
    }

}
