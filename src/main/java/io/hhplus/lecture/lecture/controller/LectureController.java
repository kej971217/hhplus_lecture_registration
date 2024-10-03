package io.hhplus.lecture.lecture.controller;

import io.hhplus.lecture.lecture.service.impl.LectureService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lecture")
public class LectureController {

    @Resource
    private LectureService lectureService;




}

