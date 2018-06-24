


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.cutomer.utils.MailUtils;
import com.blog.dao.PostDao;
import com.blog.dao.UserDao;
import com.blog.entity.PostEntity;
import com.blog.entity.UserEntity;
import com.blog.utils.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class BlogTest {


	@Autowired
	private PostDao postDao;
	@Autowired
	private UserDao ud;
	
	@Test
	public void testName() throws Exception {
	
		UserEntity u = new UserEntity();
		u .setLogo(0);
		u .setCreateTime(DateUtils.getDateTime());
		u .setEmail("youcong@eluzhu.com");
		u.setPassword("123456");
		u.setSex("1");
		u.setUsername("test001");
		//调用注册方法
		int line = ud.insert(u);	
		if(line==1) {
			MailUtils.sendMail(u.getEmail(), "点击链接,即可激活账户");
			
		}else {
			
		}
	
	}


}
