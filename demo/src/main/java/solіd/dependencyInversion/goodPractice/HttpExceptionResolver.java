package solіd.dependencyInversion.goodPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HttpExceptionResolver implements ExceptionResolver{
    @Override
    public void resolveException() {
        log.info("Process resolving http exception");
    }
}
