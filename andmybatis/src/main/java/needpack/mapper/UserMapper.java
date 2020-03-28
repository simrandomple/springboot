package needpack.mapper;

import needpack.beans.L;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    L findbyage(int age);
List<L> findall();
}
