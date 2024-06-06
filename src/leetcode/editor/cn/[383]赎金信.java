import java.util.*;
import leetcode.editor.util.*;

//<p>给你两个字符串：<code>ransomNote</code> 和 <code>magazine</code> ，判断 <code>ransomNote</code> 能不能由 <code>magazine</code> 里面的字符构成。</p>
//
//<p>如果可以，返回 <code>true</code> ；否则返回 <code>false</code> 。</p>
//
//<p><code>magazine</code> 中的每个字符只能在 <code>ransomNote</code> 中使用一次。</p>
//
//<p>&nbsp;</p>
//
//<p><strong>示例 1：</strong></p>
//
//<pre>
//<strong>输入：</strong>ransomNote = "a", magazine = "b"
//<strong>输出：</strong>false
//</pre>
//
//<p><strong>示例 2：</strong></p>
//
//<pre>
//<strong>输入：</strong>ransomNote = "aa", magazine = "ab"
//<strong>输出：</strong>false
//</pre>
//
//<p><strong>示例 3：</strong></p>
//
//<pre>
//<strong>输入：</strong>ransomNote = "aa", magazine = "aab"
//<strong>输出：</strong>true
//</pre>
//
//<p>&nbsp;</p>
//
//<p><strong>提示：</strong></p>
//
//<ul> 
// <li><code>1 &lt;= ransomNote.length, magazine.length &lt;= 10<sup>5</sup></code></li> 
// <li><code>ransomNote</code> 和 <code>magazine</code> 由小写英文字母组成</li> 
//</ul>
//
//<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>计数</li></div></div><br><div><li>👍 882</li><li>👎 0</li></div>	
//leetcode submit region begin(Prohibit modification and deletion)
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] record = new int[26];

        for(char c : magazine.toCharArray()){
            record[c - 'a'] += 1;
        }

        for(char c : ransomNote.toCharArray()){
            record[c - 'a'] -= 1;
        }

        for(int i : record){
            if(i < 0){
                return false;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


