import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> generateParenthesis(int n) {
    if (n == 1) {
      return List.of("()");
    }
    List<String> ans = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    backTrack(ans, sb, 0,0, n);
    return ans;
  }
  public void backTrack(List<String> ans, StringBuffer sb, int openCount, int closeCount, int n) {
    if (sb.length() == 2*n) {
      ans.add(sb.toString());
      return;
    }
    if (openCount < n) {
      sb.append("(");
      backTrack(ans, sb, openCount+1, closeCount, n);
      sb.deleteCharAt(sb.length()-1);
    }
    if (closeCount < openCount) {
      sb.append(")");
      backTrack(ans, sb, openCount, closeCount+1, n);
      sb.deleteCharAt(sb.length()-1);
    }
  }
}
