package jp.co.c4c.controller.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.c4c.controller.form.ClsDetForm;
import jp.co.c4c.db.dto.M_ClsDto;
import jp.co.c4c.service.SampleService;

@Controller
@RequestMapping("/clsdet")
public class ClsDetController {

    @Autowired
    SampleService sampleService;

    @RequestMapping
    public String init(ClsDetForm form) {
        form.setClsId(1);
        form.setClsName("まつ");

        return "clsdet";
    }

}
