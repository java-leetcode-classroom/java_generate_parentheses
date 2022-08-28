import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void generateParenthesisExample1() {
    assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), sol.generateParenthesis(3));
  }
  @Test
  void generateParenthesisExample2() {
    assertEquals(List.of("()"), sol.generateParenthesis(1));
  }
}