
// Initializrで名前を変更してたらこれを合わせる必要があります。Quick Fixでできます。
package com.example.demo;

// importは抜けてます。
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
class ViewController {
    @GetMapping
    public String view() {
        return"view";
    }
}