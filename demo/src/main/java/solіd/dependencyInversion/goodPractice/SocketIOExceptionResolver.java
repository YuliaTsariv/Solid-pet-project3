package solіd.dependencyInversion.goodPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SocketIOExceptionResolver implements ExceptionResolver{
    @Override
    public void resolveException() {
        log.info("Process resolving socket io exception");
    }
}
