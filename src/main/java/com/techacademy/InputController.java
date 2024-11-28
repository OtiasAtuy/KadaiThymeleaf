package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    // @RequestParamアノテーションはrequiredオプションを設定しないと初期接続でエラーになる
    public String getInput( @RequestParam(name = "previous", required = false) String previous, Model model ) {
        // クエリパラメータの値をModelに登録
        model.addAttribute("previous", previous);
        // input.htmlに画面遷移
        return "input";
    }
}
