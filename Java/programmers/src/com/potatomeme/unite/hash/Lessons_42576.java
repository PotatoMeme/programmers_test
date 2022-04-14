package com.potatomeme.unite.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lessons_42576 {
    public String solution_ver1(String[] participant, String[] completion) {
        ArrayList<String> part = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> comp = new ArrayList<String>(Arrays.asList(completion));
        Collections.sort(part);
        Collections.sort(comp);
        int i;
        for (i = 0; i < part.size() - 1; i++) {
            if (!(part.get(i).equals(comp.get(i)))) {
                return part.get(i);
            }
        }
        return part.get(i);
    }// 효율성 테스트 - 시간:136~231ms  메모리:82~95MB

    public String solution_ver2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < participant.length - 1; i++) {
            if (!(participant[i].equals(completion[i]))) {
                return participant[i];
            }
        }
        return participant[i];
    }// 효율성  테스트 - 시간:124~326ms  메모리:80~96MB
}
