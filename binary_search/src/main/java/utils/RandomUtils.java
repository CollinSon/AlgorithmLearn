package utils;

import java.util.Random;

/**
 * @ProjectName: algorithm$
 * @Package: utils$
 * @ClassName: RandomUtils$
 * @Description: java类作用描述
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/11$ 16:56$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/11$ 16:56$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
public class RandomUtils {
    public static int getARandomNum(int maxNum){
        Random rand = new Random();
        return rand.nextInt(maxNum);
    }
}
