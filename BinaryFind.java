/**
*	this program run base on JVM, but algorithm actually used C data structure
*/ 
 
final static int sortedArray[]={1,2,3,4,5,6,10,100,333,444,555,666,777,888,999,1111,1112,1113,
		1114,1115,1116,10000,88888,99999,20000000};
/**
 * @param args
 */
public static void main(String[] args) {
	BinaryFind(111,0,25);
}
/**
 * 二进制查找
 * @param key
 */
public static void BinaryFind(int key,int start,int end)
{
	if(start == end){
		System.out.println("do not find :"+key);
		return;
	}
	int idx = (start+end)/2;
	
	if (key == sortedArray[idx]){
		System.out.println("find:"+key+",in index:"+idx);
		return;
	}else if(key < sortedArray[idx])
	{
		BinaryFind(key,start,idx-1);
	}else
	{
		BinaryFind(key,idx+1,end);			
	}
}