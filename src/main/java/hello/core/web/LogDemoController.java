package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;

    @RequestMapping("log-demo")
    @ResponseBody // view 없이 화면에 바로 전송
    public String logDemo(HttpServletRequest request) throws InterruptedException {

        System.out.println("myLogger = " + myLogger.getClass());

        myLogger.setRequestURL(request.getRequestURL().toString());


        myLogger.log("controller test");
        Thread.sleep(1000);
        logDemoService.logic("testId");
        return "ok";
    }
}
