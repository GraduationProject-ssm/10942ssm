package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangdongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangdongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangdongView;


/**
 * 房东
 *
 * @author 
 * @email 
 * @date 2021-03-26 21:34:19
 */
public interface FangdongService extends IService<FangdongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangdongVO> selectListVO(Wrapper<FangdongEntity> wrapper);
   	
   	FangdongVO selectVO(@Param("ew") Wrapper<FangdongEntity> wrapper);
   	
   	List<FangdongView> selectListView(Wrapper<FangdongEntity> wrapper);
   	
   	FangdongView selectView(@Param("ew") Wrapper<FangdongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangdongEntity> wrapper);
   	
}

