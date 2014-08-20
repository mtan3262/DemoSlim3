package root.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SachTest extends AppEngineTestCase {

    private Sach model = new Sach();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
