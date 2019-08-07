package learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
    private final static Logger log = LoggerFactory.getLogger(Hello.class);
    public static void main(String[] args) {
//        System.out.println("HELLO MAVEN");
        log.info("Hello info");
        log.info("Hello debug");
    }
}
