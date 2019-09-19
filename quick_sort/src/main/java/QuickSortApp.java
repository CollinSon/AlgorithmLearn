import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: QucickSortApp$
 * @Description: 快排demo代码
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/19$ 14:33$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/19$ 14:33$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public class QuickSortApp {

    public static void main(String[] args) {
        //生成一组随机数组，作为随机数数组
        List<Integer> dataList=new LinkedList<Integer>();
        for (int i=0;i<10;i++){
            Random rand = new Random();
            dataList.add(rand.nextInt(129));
        }
        List<Integer> resultList=quickSort(dataList);
        for (int i : resultList){
            System.out.println(i);
        }
    }

    private static List<Integer> quickSort(List<Integer> dataList){
        //包含一个元素的数组是有序的
        if (dataList.size()<2){
            return dataList;
        }
        else {
            //用第一个做中间值
            int pivot=dataList.get(0);
            List<Integer> lowerList=new LinkedList<Integer>();
            List<Integer> higherList=new LinkedList<Integer>();
           for(int i : dataList){
               //遍历获取比自己小的集合
                if (i < pivot){
                    lowerList.add(i);
                }
                //获取比自己大的集合
                if (i>pivot){
                    higherList.add(i);
                }
           }
           List<Integer> sortedLowerList=quickSort(lowerList);
           List<Integer> sortedHigherList=quickSort(higherList);
           sortedLowerList.add(pivot);
           sortedLowerList.addAll(sortedHigherList);
           return  sortedLowerList;
        }
    }


}
