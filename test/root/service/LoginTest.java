package root.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LoginTest extends AppEngineTestCase {

    private LoginService service = new LoginService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
