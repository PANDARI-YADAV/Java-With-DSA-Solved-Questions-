public class merge {
    public static void main(String[] args) {
        int  arr [] = {6,3,9,5,2,8};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }

        
        
    }

    static  void divide(int [] arr ,int low ,int high){
        if(low>=high){
            return;
        }
        int mid= (low+high)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        sort(arr, low, mid, high);
    }

    static void sort(int [] arr,int low,int mid,int high){
        int  mergeArr []= new int[high-low+1];
        int a=low;
        int b=mid+1;
        int x=0;
        while(a<=mid && b<=high){
            if(arr[a]<=arr[b]){
                mergeArr[x++]=arr[a++];
                
            }
            else{
                mergeArr[x++]=arr[b++];
            }
        }
        while(a<=mid){
            mergeArr[x++]=arr[a++];
        }
        while(b<=high){
            mergeArr[x++]=arr[b++];
        }
        
        for(int j=0,i=low;j<mergeArr.length;j++,i++){
            arr[i]=mergeArr[j];
        }
        
        
        
        
    }
}
