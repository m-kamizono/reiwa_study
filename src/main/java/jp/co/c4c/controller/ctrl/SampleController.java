package jp.co.c4c.controller.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.c4c.controller.form.SampleForm;
import jp.co.c4c.service.SampleService;

@Controller
@RequestMapping("/")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping
    public String init(Model model, SampleForm form) {
        form.setClsDtoList(sampleService.getClsDtoList());

        return "sample";
    }

}
