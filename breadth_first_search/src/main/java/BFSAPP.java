import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: BFSAPP$
 * @Description: java类作用描述
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/25$ 15:14$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/25$ 15:14$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
//广度优先搜索算法
public class BFSAPP {

    public static void main(String[] args) {
        List<Node> searchList=new LinkedList<Node>();
        searchList.add(defineAllNode());
        System.out.println(BFS(searchList).getName());
    }

    /**
     * 定义好所有的位置
     * @return
     */
    public static Node defineAllNode(){
        Node startNode=new Node("start");
        //定义起点的邻居
        Node aNode=new Node("aNode");
        Node bNode=new Node("bNode");
        //添加起点节点的邻居
        startNode.addNeighNode(aNode).addNeighNode(bNode);
        Node cNode=new Node("cNode");
        Node endNode=new Node("endNode");
        Node dNode=new Node("dNode");
        //添加a节点的邻居
        aNode.addNeighNode(cNode).addNeighNode(endNode);
        //添加b节点的邻居
        bNode.addNeighNode(cNode).addNeighNode(dNode);
        //添加d节点的邻居
        dNode.addNeighNode(endNode);
        return startNode;
    }

    private static Node BFS(List<Node> searchList){
        List<Node> anotherList=new LinkedList<Node>();
        for (Node node : searchList){
            if (node.getName().equals("endNode")){
                return node;
            }

            anotherList.addAll(node.getNeighbourList());

        }
        if (anotherList.size() == 0){
            return new Node("找不到该节点");
        }
        return BFS(anotherList);
    }
}
