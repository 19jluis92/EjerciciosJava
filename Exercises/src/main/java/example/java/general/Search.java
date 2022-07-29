package example.java.general;

public class Search {

	public static int findFirt(int []A, int n, int x)
	{
		
		int low=0, high = n-1, result =-1, mid;
		
		while(low <= high)
		{
			mid = (low+high)/2;
			if(x==A[mid])
			{	result=mid;
			
				high= mid-1;
			}
			else if(x < A[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
			
		}
		return result;
		
	}
	
	
	public static int findLast(int []A, int n, int x)
	{
		
		int low=0, high = n-1, result =-1, mid;
		
		while(low <= high)
		{
			mid = (low+high)/2;
			if(x==A[mid])
			{	result=mid;
			
				low= mid+1;
			}
			else if(x < A[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
			
		}
		return result;
		
	}
	
	public static int findCountElement(int A[],int n,int x)
	{
		int first = findFirt(A, n, x);
		int last = findLast(A, n, x);
		return (last - first + 1);
	}
	
	public static int findRotatioCount(int A[],int n)
	{
		int low = 0, high = n-1,mid,next, prev;
		
		while(low<=high)
		{
			if(A[low]<= A[high])
			{
				return low;
			}
			mid=(low + high)/2;
			next = (mid +1)% n;
			prev = (mid + n -1)%n;
			
		}
		return -1;
	}
}
