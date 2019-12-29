package com.owner.MainController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C), 2015-2019, XXX有限公司
 * @ClassName: IndexController
 * @Author: wubin
 * @E-mail: 1035644768@qq.com
 * @Date: 2019/12/28 21:35
 * @Version: V1.0
 * @Description: 首页控制层
 */

@RestController
public class IndexController {

    @GetMapping("/helloWorld")
    public String index() {

        return "hello world";
    }
}










