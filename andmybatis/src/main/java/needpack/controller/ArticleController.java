package needpack.controller;

import needpack.beans.L;
import needpack.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    UserMapper userMapper;



    @RequestMapping("/test")
    @ResponseBody
    public List<L> getArticleByIdMethod() {
        return userMapper.findall();
    }


}
