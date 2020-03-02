import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple {

    private static final Logger LOG = LoggerFactory.getLogger(Simple.class);
    @Test
    void befor(){
        LOG.info("Oo");
    }
}
