package com.example.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/8 18:07
 */

@RunWith (SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        // 实例化mockmvc
        mockMvc = MockMvcBuilders.webAppContextSetup (webApplicationContext).build ();
    }

    @Test
    public void testAddUser() throws  Exception{
        MvcResult mvcResult = mockMvc.perform (MockMvcRequestBuilders.post ("/addUser")
                .param ("username","zhongzhang").param ("password","27312150")
                .accept (MediaType.TEXT_HTML_VALUE)).andExpect (MockMvcResultMatchers.status ().isOk ())
//                .andExpect (MockMvcResultMatchers.content ().string ("hello lvgang"))
                .andDo (MockMvcResultHandlers.print ())
                .andReturn ();
//        int status =   mvcResult.getResponse ().getStatus ();
//        String content = mvcResult.getResponse ().getContentAsString ();
//        Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
//        Assert.assertEquals("hello lvgang",content);            //断言，判断返回的值是否正确
    }

    @Test
    public void testUpdateUser() throws  Exception{
        MvcResult mvcResult = mockMvc.perform (MockMvcRequestBuilders.post ("/updateUser")
                .param ("username","zhongzhang").param ("password","27312150").param ("id","2")
                .accept (MediaType.ALL)).andExpect (MockMvcResultMatchers.status ().isOk ())
//                .andExpect (MockMvcResultMatchers.content ().string ("hello lvgang"))
                .andDo (MockMvcResultHandlers.print ())
                .andReturn ();
//        int status =   mvcResult.getResponse ().getStatus ();
//        String content = mvcResult.getResponse ().getContentAsString ();
//        Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
//        Assert.assertEquals("hello lvgang",content);            //断言，判断返回的值是否正确
    }


    @Test
    public void testCount() throws  Exception{
        MvcResult mvcResult = mockMvc.perform (MockMvcRequestBuilders.post ("/count")
//                .param ("username","zhongzhang").param ("password","27312150")
                .accept (MediaType.ALL)).andExpect (MockMvcResultMatchers.status ().isOk ())
//                .andExpect (MockMvcResultMatchers.content ().string ("hello lvgang"))
                .andDo (MockMvcResultHandlers.print ())
                .andReturn ();
//        int status =   mvcResult.getResponse ().getStatus ();
//        String content = mvcResult.getResponse ().getContentAsString ();
//        Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
//        Assert.assertEquals("hello lvgang",content);            //断言，判断返回的值是否正确
    }

    @Test
    public void testFindById() throws  Exception{
        MvcResult mvcResult = mockMvc.perform (MockMvcRequestBuilders.post ("/findById")
//                .param ("username","zhongzhang").param ("password","27312150")
                .param ("id","6")
                .accept (MediaType.ALL)).andExpect (MockMvcResultMatchers.status ().isOk ())
//                .andExpect (MockMvcResultMatchers.content ().string ("hello lvgang"))
                .andDo (MockMvcResultHandlers.print ())
                .andReturn ();
//        int status =   mvcResult.getResponse ().getStatus ();
//        String content = mvcResult.getResponse ().getContentAsString ();
//        Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
//        Assert.assertEquals("hello lvgang",content);            //断言，判断返回的值是否正确
    }



}
