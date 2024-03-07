//<p>给你一个正整数&nbsp;<code>n</code> ，生成一个包含 <code>1</code> 到&nbsp;<code>n<sup>2</sup></code>&nbsp;所有元素，且元素按顺时针顺序螺旋排列的&nbsp;<code>n x n</code> 正方形矩阵 <code>matrix</code> 。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p> 
//<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg" style="width: 242px; height: 242px;" /> 
//<pre>
//<strong>输入：</strong>n = 3
//<strong>输出：</strong>[[1,2,3],[8,9,4],[7,6,5]]
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>n = 1
//<strong>输出：</strong>[[1]]
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= n &lt;= 20</code></li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>数组</li><li>矩阵</li><li>模拟</li></div></div><br><div><li>👍 1261</li><li>👎 0</li></div>

//leetcode submit region begin(Prohibit modification and deletion)
class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int start_x = 0;
        int start_y = 0;
        int offset = 1;
        int count = 1;
        for (int k = 0; k < n/2; k++){
            for(int j = start_y; j < n - offset; j++){
                res[start_x][j] = count++;
            }
            for(int i = start_x; i < n - offset; i++){
                res[i][n - offset] = count++;
            }
            for(int j = n - offset; j > start_y; j--){
                res[n - offset][j] = count++;
            }
            for(int i = n - offset; i > start_x; i--){
                res[i][start_x] = count++;
            }
            offset++;
            start_x++;
            start_y++;
        }
        if (n % 2 == 1){
            res[n/2][n/2] = count;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
