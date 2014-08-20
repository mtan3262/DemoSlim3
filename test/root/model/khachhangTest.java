package root.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class khachhangTest extends AppEngineTestCase {

    private KhachHang model = new KhachHang();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
