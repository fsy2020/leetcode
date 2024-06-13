import java.util.*;
import leetcode.editor.util.*;

//<p>假设你正在爬楼梯。需要 <code>n</code>&nbsp;阶你才能到达楼顶。</p>
//
//<p>每次你可以爬 <code>1</code> 或 <code>2</code> 个台阶。你有多少种不同的方法可以爬到楼顶呢？</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 2
//<strong>输出：</strong>2
//<strong>解释：</strong>有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 3
//<strong>输出：</strong>3
//<strong>解释：</strong>有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= n &lt;= 45</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>记忆化搜索</li><li>数学</li><li>动态规划</li></div></div><br><div><li>👍 3531</li><li>👎 0</li></div>	
//leetcode submit region begin(Prohibit modification and deletion)
class Solution70 {
    public int climbStairs(int n) {
        if (n == 0)return 0;
        if (n == 1)return 1;
        if (n == 2)return 2;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3;i <= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
            //n=5, dp[3] = 3,
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)



