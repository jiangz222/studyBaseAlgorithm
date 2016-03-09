/**
*	this program run base on JAVA, but algorithm actually used C data structure
*/ 
 final static int chaosArray[]={1,2,-3,4,1,-6,111,111,-333,444,555,-666,777,-888,999,1111,1112,1113,
			1114,-115,1116,-100,888,99,200};
/**
 * @param args
 */
public static void main(String[] args) {
	/**
	注意这两个排序算法的类似点
	冒泡是每次和相邻的比，找出最小的，和相邻的交换，让最小的冒到最上面
	选择排序是每次都和剩余数据中的第一个比，和第一个交换位置，让最小的总是在剩余位置的第一个
	所以两个算法的元素交换次数应该是一样的
	*/

	pupleSort(25);
	//selectSort(25);
	for(int i=0; i<25;i++)
	{
		System.out.println("array["+i+"] is:"+ chaosArray[i]);
// OUTPUT:
/*
array[0] is:1116
array[1] is:1114
array[2] is:1113
array[3] is:1112
array[4] is:1111
array[5] is:999
array[6] is:888
array[7] is:777
array[8] is:555
array[9] is:444
array[10] is:200
array[11] is:111
array[12] is:111
array[13] is:99
array[14] is:4
array[15] is:2
array[16] is:1
array[17] is:1
array[18] is:-3
array[19] is:-6
array[20] is:-100
array[21] is:-115
array[22] is:-333
array[23] is:-666
array[24] is:-888
		*/
	}
}
static void swapElement(int index1,int index2)
{
	int tmp=0;

	tmp = chaosArray[index1];
	chaosArray[index1] = chaosArray[index2];
	chaosArray[index2] = tmp;
}
	/**
 * 冒泡排序，每一次扫描，让最小的到数组最后
 * @param length
 */
static void pupleSort(int length)
{

	int i=0,j=0;
	for(i=(length-1);i>0;i--)
	{
		for(j=0;j<i;j++)
		{
			if(chaosArray[j]<chaosArray[j+1])
			{
				swapElement(j,j+1);
			}
		}
	}
}
/**
 * 选择排序，每一此扫描，把最大的放到锁剩余列的第一个位置
 * @param length
 */
static void selectSort(int length)
{
	int i=0,j=0;
	for(i=0;i<length;i++)
	{
		for(j=i;j<length;j++)
		{
			if(chaosArray[j]>chaosArray[i])
			{
				swapElement(j,i);
			}
		}
	}
}