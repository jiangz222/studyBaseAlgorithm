/**
*	this program run base on JAVA, but algorithm actually used C data structure
*/ 
 final static int chaosArray[]={1,2,-3,4,1,-6,111,111,-333,444,555,-666,777,-888,999,1111,1112,1113,
			1114,-115,1116,-100,888,99,200};
/**
 * @param args
 */
public static void main(String[] args) {
	normalQuickSort(0,24);
	for(int i=0; i<25;i++)
	{
		System.out.println("array["+i+"] is:"+ chaosArray[i]);
// OUTPUT:
/*
array[0] is:-888
array[1] is:-666
array[2] is:-333
array[3] is:-115
array[4] is:-100
array[5] is:-6
array[6] is:-3
array[7] is:1
array[8] is:1
array[9] is:2
array[10] is:4
array[11] is:99
array[12] is:111
array[13] is:111
array[14] is:200
array[15] is:444
array[16] is:555
array[17] is:777
array[18] is:888
array[19] is:999
array[20] is:1111
array[21] is:1112
array[22] is:1113
array[23] is:1114
array[24] is:1116
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
 * 快速排序
 * @param start
 * @param end
 */
static void normalQuickSort(int start, int end)
{
	if(start >= end){
		return;
	}
	// wherePutNextElement初始值为keyvalue的位置，如果有比 keyvalue小的值，应该换到这个wherePutNextElement位置的下一个位置，
	int wherePutNextElement = start;
	int keyCompareElement = chaosArray[start];// key value 选择第一个
	for(int i= start+1;i<=end;i++)
	{
		if(chaosArray[i]< keyCompareElement)
		{// 如果比keyvalue小，与wherePutNextElement加1后交换
	   	// 注意，swap的是++wherePutNextElement，第一个元素是一直没有移动的，直到最后跳出for了才swap
			// 比如 13 22 23 9 10
			// 在这里第一次swap后，应该是 13 9 23 22 10，是9和22 swap，而不是9和13 swap
			// 这样做，逻辑上，即第一个13就是key，先不放入比较队列，等队列做完一次比较，再把key放入队列的分割点
			// 如果13和9一开始就互换，那么13就出现在比较队列里了
			swapElement(++wherePutNextElement,i);
		}
		// 如果比keyvalue大，不需要移动
	}
	// 最后，将start位置上的keyvlue和wherePutNextElement交换
	// wherePutNextElement停留在最后一个小于key的位置
	swapElement(wherePutNextElement,start);
	normalQuickSort(start, wherePutNextElement-1);
	normalQuickSort(wherePutNextElement+1,end);
}