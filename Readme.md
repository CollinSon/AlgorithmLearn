《算法图解》读书笔记

1. 二分查找

   算法实现：

   ​	在有序列表中查找一个数，每次都与有序列表的中间数比较，如果不同则缩小范围，继续查询。如在int[] arr=[1、2、3、4、5、6、7、8、9、10]的数组中查询3，先获取中间的元素，该数组有10个元素，中间元素为arr[5]=5，5相比3大，那么更新查询数组，在[1,2,3,4,5]中查询，将最大数设为5，再获取中间数,这次中间数arr[5/2=2]为2,相比3又小了，那么更新查询数组，将最小数设为2，在[2,3,4,5]中查询，获取中间数为arr[4/2=2]=3,这次查询成功，中间数等于3。
   
   伪代码：
   
   ```java
     public int binarySearch(int serachNum,int[] arr){
   		int maxLen=arr.length;
           int minLen=0;
           int medium=arr[(maxLen-minLen)/2];
         	while(arr[medium]!=searchNum){
               if(arr[medium]>searchNum){
                   maxLen=medium;
               }
               else if(arr[medium]<searchNum){
                   minLen=medium;
               }
                medium=(maxLen+minLen)/2
           }
           return medium;
     }
   
   ```
   
   算法的复杂度：
   
   ​	算法时间复杂度为log2(n)，是一个对数时间。在128个元素的有序数组中查询最多需要log2(128)=7次。
   
   