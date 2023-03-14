package com.ll.p120816;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("1 1 => 1")
    void t1() {
        assertThat(new Solution().solution(1, 1)).isEqualTo(1);
    }

    @Test
    @DisplayName("1 2 => 2")
    void t2() {
        assertThat(new Solution().solution(1, 2)).isEqualTo(2);
    }

    @Test
    @DisplayName("1 3 => 3")
    void t3() {
        assertThat(new Solution().solution(1, 3)).isEqualTo(3);
    }

    @Test
    @DisplayName("2 3 => 2")
    void t4() {
        assertThat(new Solution().solution(2, 3)).isEqualTo(2);
    }

}