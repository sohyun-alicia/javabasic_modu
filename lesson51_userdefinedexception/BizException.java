package lesson51_userdefinedexception;

public class BizException extends RuntimeException {

    public BizException(String msg) {           // 생성자 지정 >> 문자열로 된 에러 메세지
        super(msg);
    }

    public BizException(Exception ex) {         // Exception을 받아들여 부모 생성자에 넘겨주는 생성자
        super(ex);
    }
}
    
