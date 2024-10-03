
■ step 3-1. ERD 설명
![img_3.png](img_3.png)

1) 테이블 구성
   * 역할(TB_ROLE)
    역할의 SEQ, ID, 역할명을 저장하는 table 입니다.
    사용자의 역할을 학생은 STUDENT 강사는 INSTRUCTOR로 분류 하였습니다.
    학생은 강의를 신청할 수 있으며, 강사는 강의를 등록할 수 있습니다.

   * 사용자(TB_USER)
    사용자의 SEQ, ID, 이름, 역할을 저장하는 table 입니다.
    ROLE_ID로 역할을 구분합니다.

   * 강의(TB_LECTURE)
    강의의 SEQ, ID, 강의명, 강사, 강의설명, 강의수용인원, 강의시작, 강의종료, 등록일시, 사용여부를 저장합니다.
    강의의 최대 수용인원을 저장하고, 이를 수강 신청시 활용합니다.
    동일한 강의는 신청할 수 없으며,
    수강하고자 하는 강의의 시간이 겹칠 수 없습니다.

   * 수강현황(TB_USER_LECTURE_STATUS)
    강의ID와 사용자(학생)ID 를 JOIN 하여 수강현황을 파악합니다.

2) 테이블 관계
   * 역할(TB_ROLE) - 사용자(TB_USER) 1:1
   * 사용자(TB_USER) - 수강현황(TB_USER_LECTURE_STATUS) 1
   * 강의(TB_LECTURE) - 사용자(TB_USER) 1 
   * 강의(TB_LECTURE) - 수강현황(TB_USER_LECTURE_STATUS) 1
   * 수강현황(TB_USER_LECTURE_STATUS) - 사용자(TB_USER) n:1
    
