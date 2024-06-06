import java.util.*;
import leetcode.editor.util.*;

//<p>给你四个整数数组 <code>nums1</code>、<code>nums2</code>、<code>nums3</code> 和 <code>nums4</code> ，数组长度都是 <code>n</code> ，请你计算有多少个元组 <code>(i, j, k, l)</code> 能满足：</p>
//
//<ul> 
// <li><code>0 &lt;= i, j, k, l &lt; n</code></li> 
// <li><code>nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0</code></li> 
//</ul>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
//<strong>输出：</strong>2
//<strong>解释：</strong>
//两个元组如下：
//1. (0, 0, 0, 1) -&gt; nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
//2. (1, 1, 0, 0) -&gt; nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
//<strong>输出：</strong>1
//</pre>
//
//<p>&nbsp;</p>
//
//<p>&nbsp; <strong>提示：</strong></p>
//
//<ul> 
// <li><code>n == nums1.length</code></li> 
// <li><code>n == nums2.length</code></li> 
// <li><code>n == nums3.length</code></li> 
// <li><code>n == nums4.length</code></li> 
// <li><code>1 &lt;= n &lt;= 200</code></li> 
// <li><code>-2<sup>28</sup> &lt;= nums1[i], nums2[i], nums3[i], nums4[i] &lt;= 2<sup>28</sup></code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li></div></div><br><div><li>👍 1008</li><li>👎 0</li></div>	
//leetcode submit region begin(Prohibit modification and deletion)
class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int count = 0;
        for( int i = 0; i<nums1.length; i++){

            for( int j = 0; j<nums1.length; j++){
                int sum1 = nums1[i] + nums2[j];
                map1.put(sum1,map1.getOrDefault(sum1,0)+1);
            }
        }
        for( int i = 0; i<nums1.length; i++){
            for ( int j = 0; j<nums3.length; j++){
                int num = 0 - nums3[i] - nums4[j];
                count += map1.getOrDefault(num, 0);
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)



