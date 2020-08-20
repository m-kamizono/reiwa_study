package jp.co.c4c.controller.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.c4c.controller.form.ClsForm;
import jp.co.c4c.db.dto.M_ClsDto;
import jp.co.c4c.service.SampleService;

@Controller
@RequestMapping("cls")
public class ClsController {

    @Autowired
    SampleService sampleService;

    @RequestMapping
    public String init(ClsForm form) {
        M_ClsDto clsDto = sampleService.getClsDto(1);

        form.setClsDto(clsDto);
        form.setClsId(clsDto.getClsId());
        form.setClsName(clsDto.getClsName());

        return "cls";
    }

}
