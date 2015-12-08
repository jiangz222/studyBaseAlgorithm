/**
*	this program run base on JAVA, but algorithm actually used C data structure
*/ 
final static int chaosArray[]={1,2,-3,4,5,-6,111,111,-333,444,555,-666,777,-888,999,1111,1112,1113,
			1114,-115,1116,-100,888,99,200};
/**
 * @param args
 */
public static void main(String[] args) {
	MaxSumOfContinuousArray();
	//out put: find max sum is:7759idx from:9to:24

}
/**
 * 扫描算法，求数组中最大合的连续子向量
 * 本算法基于两个基本前提：
 * 1：如果某个连续子向量的和大于零，则以该子向量为前缀的连续子向量的和可能会更大。
 * 2：如果某个连续子向量的和小于或等于零，则以该子向量为前缀的连续子向量的和不可能大于去掉该子向量前缀之后的子向量的和。
 */
public static void MaxSumOfContinuousArray()
{
	int cusorStart=0,cusorEnd=0,cusorSum=0;
	int maxStart=0,maxEnd=0,maxSum=0;
	while(cusorEnd < 25)
	{
		cusorSum +=chaosArray[cusorEnd];
		if(cusorSum > maxSum)
		{// 前提1
			maxSum = cusorSum;
			maxStart = cusorStart;
			maxEnd = cusorEnd;
		}else if(cusorSum <0)
		{// 前提2
			cusorStart = cusorEnd +1;
			cusorSum = 0;
		}
		cusorEnd++;
	}
	System.out.println("find max sum is:"+maxSum+"idx from:"+maxStart+"to:"+maxEnd);
}