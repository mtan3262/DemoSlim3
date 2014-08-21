package root.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TypeServiceTest extends AppEngineTestCase {

    private TypeService service = new TypeService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
