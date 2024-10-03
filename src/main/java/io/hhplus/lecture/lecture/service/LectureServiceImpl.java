package io.hhplus.lecture.lecture.service;

import io.hhplus.lecture.lecture.model.LectureVO;
import io.hhplus.lecture.lecture.service.impl.LectureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {


    @Override
    public List<LectureVO> selectLectureList() {
        return null;
    }

    @Override
    public LectureVO selectLecture(String lectureId) {
        return null;
    }

    @Override
    public List<LectureVO> selectUserLecture(String id) {
        return null;
    }

    @Override
    public LectureVO applyLecture(String id) {
        return null;
    }

    @Override
    public LectureVO deleteUserLecture(String id) {
        return null;
    }
}
