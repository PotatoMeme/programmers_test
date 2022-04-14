package com.potatomeme.unite.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lessons_42577 {
    public Boolean solution_ver1(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            if (phone_book[i].length()<phone_book[i+1].length()){
                if(phone_book[i+1].startsWith(phone_book[i])){
                    return false;
                }
            }
        }
        return true;
    }// 효율성 테스트 - 시간:19~350ms  메모리:55~98MB
}
