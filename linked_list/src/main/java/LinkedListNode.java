import lombok.Data;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: LinkedListNode$
 * @Description: 链表节点类
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/12$ 9:15$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/12$ 9:15$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
@Data
public class LinkedListNode {
    /**
     * 下一节点
     */
    private LinkedListNode nextNode;
    /**
     * 数据
     */
    private Object data;
}

