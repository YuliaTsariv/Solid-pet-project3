package solіd.dependencyInversion.badPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExceptionHandler {
    SocketIOExceptionResolver resolver;

    public void handleException(Exception exception) {
        resolver.resolveSocketIOException();
        log.info("Process handling exception: {}", exception);
    }
}
