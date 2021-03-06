package emcon.domain;

import emcon.conf.factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by graham on 2015/04/26.
 */
public class UserTest {
    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testCreateUser() throws Exception{

        Long rNo = 8000L;

        User user = UserFactory.createUser(rNo,"Graham","Becker","20/11/1984","15 Oranje Street", "graham@fang.co.za");

        Assert.assertEquals(rNo,user.getRegNo());
        Assert.assertEquals("Graham",user.getFirstName());
        Assert.assertEquals("Becker",user.getLastName());
        Assert.assertEquals("20/11/1984",user.getDob());
        Assert.assertEquals("15 Oranje Street",user.getAddress());
        Assert.assertEquals("graham@fang.co.za",user.getContact());



    }

}
