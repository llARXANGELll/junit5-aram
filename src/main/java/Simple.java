import org.junit.Before;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple {

    private static final Logger LOG = LoggerFactory.getLogger(Simple.class);

    @BeforeAll
   static void beforeall(){
        LOG.info("beforeall");
    }
    @BeforeEach
    void befor(){
        LOG.info("befor");
    }

   static  @AfterAll
    void afteral(){
        LOG.info("afteral");
    }

    @AfterEach
    void afterea(){
        LOG.info("afterea");
    }

    @Test
    void simple(){
        LOG.info("Oo");
    }
}
