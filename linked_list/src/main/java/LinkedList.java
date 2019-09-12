import lombok.Data;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: LinkedList$
 * @Description: 链表类
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/12$ 9:15$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/12$ 9:15$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
@Data
public class LinkedList {
    /**
     * 链表长度
     */
    private Integer length;
    /**
     * 头指针
     */
    private LinkedListNode headNode;


    public LinkedList(LinkedListNode headNode) {
        length=1;
        this.headNode = headNode;
    }
}
