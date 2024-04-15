package solіd.dependencyInversion.goodPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExceptionHandler {
    ExceptionResolver resolver;

    public ExceptionHandler(HttpExceptionResolver resolver){
        this.resolver = resolver;
    }

    public void handleException(Exception exception) {
        resolver.resolveException();
        log.info("Process handling exception: {}", exception);
    }
}
