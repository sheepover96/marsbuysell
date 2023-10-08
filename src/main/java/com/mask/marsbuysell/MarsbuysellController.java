package com.mask.marsbuysell;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class MarsbuysellController {

    @GetMapping("/api/data")
    public ResponseEntity<Object> getData() {
        // レスポンスのデータを作成
        Map<String, String> responseData = new HashMap<>();
        responseData.put("key1", "value1");
        responseData.put("key2", "value2");

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
