package com.neko.arc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class papu {

    private Number getpapu() {
        return 34;
    }

    @RequestMapping("/")
    public Number papu() {
        Number index = getpapu();
        return index;
    }

}
