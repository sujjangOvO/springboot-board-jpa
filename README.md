# [미션] Spring Boot JPA로 게시판 구현

## 미션 소개 😎
Spring Boot JPA - Rest API를 강의를 듣고, 게시판 구현 미션을 수행해봅시다.

## 코드 리뷰(PR 내역) 링크
https://github.com/prgrms-be-devcourse/springboot-board-jpa/pull/219

## 프로젝트 설계도
![JPA게시판](https://github.com/sujjangOvO/query-builder/assets/89267864/1efa5c80-bc33-4940-833d-ab4df20dc259)

## 수정 후 프로젝트 설계도
![JPA게시판](https://github.com/sujjangOvO/query-builder/assets/89267864/a4e75c3b-2fef-4975-abc6-6775bf6ba96b)

## 작업 목록
주의: 커밋 메시지는 한 문장으로 표현 + 깃모지로 커밋 메시지 목적 표시
- [x] 설계도 작성 및 작업 목록 구상
- [x] 프로젝트 init
- [x] SpringDataJpa, mysql 설정
- [x] BaseEntity 추가
- [x] User Entity 구현
- [x] Post Entity 구현
- [x] User, Post 1:n 연관 관계 설정
- [x] UserController 구현
- [x] UserService 구현
- [x] UserDto 구현
- [x] JPAUserRepository 구현
- [x] PostRestRepository 구현
  - 페이징 조회(GET /posts)
  - 단건 조회(GET post/{id})
  - 게시글 작성(POST /posts)
  - 게시글 수정(POST /posts/{id})
- [x] PostService 구현
- [x] PostDto 구현
- [x] JPAPostRepository 구현
- [x] REST-DOCS 의존성 추가
- [x] REST-DOCS을 이용한 API 명세 작성
