package org.mbr.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
//@RequestMapping("/demo")
public class TestController 
{
	@RequestMapping(method = RequestMethod.GET,value="/demo1")
    public String hello()
    {
        System.out.println( "Hello World!" );
        return "Welcome1";
    }
}
