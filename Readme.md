《算法图解》读书笔记

[TOC]



##### 二分查找

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

##### 快速排序

​	昨天读了《算法图解》，对快速排序这种算法总算是有了真正的了解，现在才了解真是对不起当年教我数据结构的老师。

​	快速排序算法，是一种分而治之的算法，它通过“大化小，小化无”的方法来处理问题，其实质是递归算法。先通过例子来介绍这种分而治之的思想。

​	假设有个数组，数组里面放着五个元素，从1到5。要计算他们的总和，不使用循环怎么做？ 一说不使用循环做肯定很多人一脸懵逼，但是其实这种情况是有的，比如说在Haskell语言中没有循环结构，只能用其他方法。这个时候就要用上“分而治之”的算法了。首先先考虑一个条件，什么时候计算总和最简单？当然是只有一个数字时计算总和时最简单，1的总和就是1，2的总和就是2，那么我们就得到了“最简单条件”，计算总和最好只有一个元素，根据分而治之的想法最好就是将“计算五个数的总和”这种复杂的需求分成五个简单的需求“计算一个数的总和”。根据上面的分析可以写出以下代码：

```java
 private static Integer sumFunc(List<Integer> arr,int sum){
        if (arr.size() <=0){
            return sum;
        }
        else {
            int temp=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            sum+=temp;
            return sumFunc(arr,sum);
        }
    }

  public static void main(String[] args) {
        //测试SumFunc函数
        List<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(sumFunc(array,0));
    }
```

​	这种实现简单需求的代码相对有循环的语言结构来，反而显得把简单的问题复杂化了。接下来我就用这种思想去解决一个相对困难的问题：数组排序；

​	假设有个数组/列表，里面装着五个无序的元素，要对它们进行排序，并且不使用冒泡和选择排序，要怎么做？

​	我们试试用这种思想去做

1. 思考什么条件下排序最简单？

   ​	当然是数组/列表中只有一个元素，或者是没有元素，这就是排序好的数组/列表啦。很好，我们获取了“最简单条件”，确定了接下来的工作就是将这个列表拆成只有一个元素的几个列表。

2. 这种“拆分”工作什么时候终止

   ​	当然是数组/列表已经被拆的没有元素，即数组/列表的长度为0。

​	根据上诉条件，可以写出以下代码：

```java
private static List<Integer>  QuickSort(List<Integer> needSortList){
        //列表的长度为0时说明拆分完成
        if (needSortList.size() <=0){
            return needSortList;
        }
        else {
            //取出一个任意数，作为比较数
            int pivot=needSortList.get(0);
            List<Integer> lowerList=new LinkedList<Integer>();
            List<Integer> higherList=new LinkedList<Integer>();
            for (int element : needSortList){
                //如果比比较数小放到小的列表中
                if (element < pivot){
                    lowerList.add(element);
                }
                //如果比比较数大放到大的列表中
                else if (element >pivot){
                    higherList.add(element);
                }
            }
           
            List<Integer> sortedList=new LinkedList<Integer>(QuickSort(lowerList));
            //加上中间数
            sortedList.add(pivot);
            sortedList.addAll(QuickSort(higherList));
            return sortedList;
        }
    }
  public static void main(String[] args) {
        //生成一组随机数组，作为随机数数组
        List<Integer> dataList=new LinkedList<Integer>();
        for (int i=0;i<5;i++){
            Random rand = new Random();
            dataList.add(rand.nextInt(129));
        }
        List<Integer> resultList=QuickSort(dataList);
        for (int i : resultList){
            System.out.println(i);
        }

    }
```





​	

