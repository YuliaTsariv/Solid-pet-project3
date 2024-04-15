package solіd.dependencyInversion.badPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import solіd.dependencyInversion.goodPractice.ExceptionHandler;
import solіd.dependencyInversion.goodPractice.HttpExceptionResolver;

@Slf4j
@Service
public class SocketIOExceptionResolver extends ExceptionHandler {
    public SocketIOExceptionResolver(HttpExceptionResolver resolver) {
        super(resolver);
    }

    public void resolveSocketIOException() {
        log.info("Process resolving socket io exception");
    }
}
