import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: Node$
 * @Description: java类作用描述
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/25$ 15:32$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/25$ 15:32$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
@Data
public class Node {
    private String name;

    public List<Node> getNeighbourList() {
        if (neighbourList == null){
            neighbourList =new LinkedList<Node>();
        }
        return neighbourList;
    }

    private List<Node> neighbourList;

    public Node(String name) {
        this.name = name;
    }

    public Node() {
    }

    Node addNeighNode(Node node){
        List<Node> neighbourList=getNeighbourList();
        if (neighbourList == null){
            setNeighbourList(new LinkedList<Node>());
        }
        getNeighbourList().add(node);
        return this;
    }
}
