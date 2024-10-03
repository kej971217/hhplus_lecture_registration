package io.hhplus.lecture.lecture.service.impl;

import io.hhplus.lecture.lecture.model.LectureVO;

import java.util.List;

public interface LectureService {
    List<LectureVO> selectLectureList();

    LectureVO selectLecture(String lectureId);

    List<LectureVO> selectUserLecture(String id);

    LectureVO applyLecture(String id);

    LectureVO deleteUserLecture(String id);
}
