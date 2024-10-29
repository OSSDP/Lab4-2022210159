import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    // 测试全为正数的情况
    @Test
    public void testPositiveNumbers() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    // 测试包含负数的情况
    @Test
    public void testWithNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    // 测试数组包含一个元素的情况
    @Test
    public void testSingleElement() {
        Solution solution = new Solution();
        int[] nums = {5};
        int[] expected = {1};  // 自己除外
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    // 测试全为 1 的情况
    @Test
    public void testAllOnes() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    // 测试数组全为负数的情况
    @Test
    public void testAllNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-2, -3, -4, -5};
        int[] expected = {-60, -40, -30, -24};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    // 测试包含零的情况
    @Test
    public void testAllZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }
}