package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        List<Integer> range = IntStream.range(1, number+1).boxed().collect(Collectors.toList());
        List<String> strRange = new ArrayList<>();
        for (Integer num : range) {
            strRange.addAll(Arrays.stream(num.toString().split("")).collect(Collectors.toList()));
        }



        return answer;
    }


}

