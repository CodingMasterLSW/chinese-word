package sungwoo.chinese_word.domain;


import lombok.Getter;

@Getter
public class Word {

    private final String chinese;
    private final String korean;

    private Word(String chinese, String korean) {
        this.chinese = chinese;
        this.korean = korean;
    }

    public static Word of (String chinese, String korean) {
        return new Word(chinese, korean);
    }

}
