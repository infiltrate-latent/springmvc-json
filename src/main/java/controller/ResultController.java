package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ResultController {
    @RequestMapping("/test03-1")
    @ResponseBody
    public String test031() {
        return "result";
    }
}
