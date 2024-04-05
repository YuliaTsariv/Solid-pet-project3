package solіd.dependencyInversion.badPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SocketIOExceptionResolver {
    public void resolveSocketIOException() {
        log.info("Process resolving socket io exception");
    }
}
