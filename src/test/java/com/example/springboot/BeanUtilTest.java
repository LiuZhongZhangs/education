package com.example.springboot;

import com.example.springboot.entity.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
 * @author zhongzhang
 * @version 1.0
 * @date 2019/10/9 20:16
 */
public class BeanUtilTest {

    @Test
    public  void test() throws Exception{
        User user = new User ();
        BeanUtils.copyProperty (user,"id",1);
        BeanUtils.copyProperty (user,"username","yaoyi");
        BeanUtils.copyProperty (user,"password","27312150");
        System.out.println (user);
//        User user1 = new User ();
        User newUser = new User ();
//        Person person = new Person ();
        BeanUtils.copyProperties (newUser,user);
        System.out.println (newUser);
    }

    @Test
    public void testCodec() throws Exception{
        Base64 base64 = new Base64 ();
        String string = base64.encodeToString ("liuzhongzhang".getBytes ());
        System.out.println (string);
        String str = new String (base64.decode (string));
        System.out.println (str);
    }

    @Test
    public void testLang() throws Exception{
//        int [] arr = {2,4,5,7};
//        System.out.println (ArrayUtils.toString (arr));
//        System.out.println (ArrayUtils.add (arr,6));
//        System.out.println (ArrayUtils.);

        String string = null;
        if(StringUtils.isBlank (string)){
//            System.out.println (string);
        }
//        StringUtils.isBlank (string);

//        DateUtils.
    }

    @Test
    public void testCollection() throws Exception{
//        Bag bag = new Bag ()
    }



}
