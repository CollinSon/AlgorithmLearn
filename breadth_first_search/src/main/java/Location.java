import lombok.Data;

import java.util.List;

/**
 * @ProjectName: algorithm$
 * @Package: PACKAGE_NAME$
 * @ClassName: Location$
 * @Description: java类作用描述
 * @Author: 许瑞锐
 * @CreateDate: 2019/9/25$ 15:14$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/25$ 15:14$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
@Data
public class Location {
    private String locationName;
    private List<Location> neighbourList;
}
