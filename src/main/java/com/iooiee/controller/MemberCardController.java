package com.iooiee.controller;

import com.iooiee.common.RestMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 2020-09-26
 */
@Api(value = "会籍卡",tags = "会籍卡基本模板接口")
@RestController
@RequestMapping("/membercard/base")
public class MemberCardController {

    @ApiOperation(value = "info",notes = "通过ID获取会籍卡的基本信息")
    @GetMapping("info")
    public RestMessage info(@RequestParam("id") Long id){
        return new RestMessage(id);
    }

}
