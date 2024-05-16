![spring-color](https://github.com/hwanyeong-choi/travelpickup-api/assets/47169718/429b02b5-e027-4d9c-a369-b7e5f5c24998)![spring](https://github.com/hwanyeong-choi/travelpickup-api/assets/47169718/1603a7c8-4092-4c9d-89ef-8db9538fb0bd)


# TrabelPickup Backend

## Tech Stack
![Uploading spring-col<svg fill="#6DB33F" role="img" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><title>Spring</title><path d="M21.8537 1.4158a10.4504 10.4504 0 0 1-1.284 2.2471A11.9666 11.9666 0 1 0 3.8518 20.7757l.4445.3951a11.9543 11.9543 0 0 0 19.6316-8.2971c.3457-3.0126-.568-6.8649-2.0743-11.458zM5.5805 20.8745a1.0174 1.0174 0 1 1-.1482-1.4323 1.0396 1.0396 0 0 1 .1482 1.4323zm16.1991-3.5806c-2.9385 3.9263-9.2601 2.5928-13.2852 2.7904 0 0-.7161.0494-1.4323.1481 0 0 .2717-.1234.6174-.2469 2.8398-.9877 4.1732-1.1853 5.9018-2.0743 3.2349-1.6545 6.4698-5.2844 7.1118-9.0379-1.2347 3.6053-4.9881 6.7167-8.3959 7.9761-2.3459.8643-6.5685 1.7039-6.5685 1.7039l-.1729-.0988c-2.8645-1.4076-2.9632-7.6304 2.2718-9.6306 2.2966-.889 4.4696-.395 6.9637-.9877 2.6422-.6174 5.7043-2.5929 6.939-5.1857 1.3828 4.1732 3.062 10.643.0493 14.6434z"/></svg>or.svg…]()

## Local 개발환경 설정

### Docker
- 1. docker, docker-compose 설치 진행
- 2. /infra 디렉토리로 이동
- 3. docker-compose up -d 명령어 실행하여 mariadb, localstack 컨테이너 생성

### Bucket
- 1. Docker 로컬 컨테이너 환경 구현
- 2. LocalStack S3 Bucket 생성 aws --endpoint-url=http://localhost:4566 s3 mb s3://pickupimg
