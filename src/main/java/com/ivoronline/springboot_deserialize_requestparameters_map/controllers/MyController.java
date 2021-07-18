package com.ivoronline.springboot_deserialize_requestparameters_map.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/AddPerson")
  public String addPerson(@RequestParam Map<String, Object> requestParameters) {

    //ITERATE OVER MAP
    for (var entry : requestParameters.entrySet()) {
      String key   = entry.getKey();
      Object value = entry.getValue();
      System.out.println(key + " = " + value);
    }

    //GET PARAMETERS
    Object name   = requestParameters.get("firstName");
    Object height = requestParameters.get("height");
    Object age    = requestParameters.get("age");

    //RETURN SOMETHING
    return name + " is " + height + " meters high";

  }

}
