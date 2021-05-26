package com.meli.dh.resources;

import com.meli.dh.domain.dto.MorseDTO;
import com.meli.dh.utils.TranslatorUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Olar");
    }

    @GetMapping("morse-to-english")
    public ResponseEntity<String> morseToEnglish(@RequestBody MorseDTO morseDTO ){
        String translatedSentence = TranslatorUtils.morseToEnglish(morseDTO.getSentence());

        return ResponseEntity.ok().body(translatedSentence);
    }
}
