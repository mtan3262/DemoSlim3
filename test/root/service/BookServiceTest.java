package root.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BookServiceTest extends AppEngineTestCase {

    private BookService service = new BookService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
