import lombok.extern.slf4j.Slf4j;
import utils.RandomUtils;

import java.util.logging.Logger;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: BinarySerachApp$
 * @Description: java类作用描述
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/11$ 16:36$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/11$ 16:36$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public class BinarySearchApp {
    private static Logger log = Logger.getLogger("BinarySearchApp");
    public static void main(String[] args) {
        //初始化数据数组
        int max=100000000;
        int[] numberArr=new int[max];
        for (int i=0;i<numberArr.length;i++){
            numberArr[i]=i;
        }
        int findNum= RandomUtils.getARandomNum(max);
        log.info("生成的随机数是"+findNum);
        int tick=1;
        //第一次查询
        int min=0;
        int mediumNum=(min+max)/2;
        while (numberArr[mediumNum]!=findNum){
            log.info("第"+tick+"次比较,"+"最大数是"+max+",最小数是"+min+",中间数是"+mediumNum);
            //随机数大于中间数
            if (numberArr[mediumNum]<findNum){
                //更新最小值和中间值
                min=numberArr[mediumNum];
                mediumNum=(min+max)/2;
            }
            //随机数小于中间数
            if (numberArr[mediumNum]>findNum){
                //更新最大值和中间值
                max=numberArr[mediumNum];
                mediumNum=(min+max)/2;
            }
            tick++;
        }
        log.info("共"+tick+"次比较");
    }
    //真他妈快
}
