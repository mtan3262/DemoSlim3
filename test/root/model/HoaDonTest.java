package root.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HoaDonTest extends AppEngineTestCase {

    private HoaDon model = new HoaDon();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
