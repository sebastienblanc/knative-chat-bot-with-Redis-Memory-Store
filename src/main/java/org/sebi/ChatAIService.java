package org.sebi;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface ChatAIService {

    @SystemMessage("You are an helpful chatbot. You answer user's questions.")
    public String chat(@MemoryId int i, @UserMessage String prompt);
    
}
