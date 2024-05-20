package org.sebi;

import org.jboss.resteasy.reactive.RestPath;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class ChatResource {

    @Inject
    ChatAIService chatAIService;

    @POST
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@RestPath int id, String prompt) {
        return chatAIService.chat(id, prompt);
    }
}
