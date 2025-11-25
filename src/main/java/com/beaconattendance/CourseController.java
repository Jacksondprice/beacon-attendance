package com.beaconattendance;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
