import com.letv.fund.model.OrderAudit;
import com.letv.fund.service.OrderAuditService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kewei on 2014/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class TestOrderAudit {

    @Autowired
    OrderAuditService orderAuditService ;

    @Test
    public void aaa(){

        System.out.println("------test---aaa------");
        OrderAudit oa =  orderAuditService.getByLoginName("wjtest");
        System.out.println(oa.getAuditName()+" -- "+oa.getAuditUid()) ;

    }
}
