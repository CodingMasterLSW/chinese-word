package sungwoo.chinese_word.exception;

import lombok.Getter;

@Getter
public enum ErrorMessage {

    FILE_LOAD_EXCEPTION("잘못된 파일 형식입니다. 파일을 확인해주세요"),
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
}
