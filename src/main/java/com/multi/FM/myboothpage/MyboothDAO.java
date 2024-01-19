package com.multi.FM.myboothpage;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.multi.FM.booth.BoothProductVO;
import com.multi.FM.fstv.FestivalVO;

@Repository
public class MyboothDAO {
  @Autowired
  SqlSessionTemplate my;

  public void addbooth(BoothVO boothVO) {
    my.insert("Mybooth.insertBooth",boothVO);
  }
  public List<FestivalVO> showAllfstv() {
    return my.selectList("Mybooth.getAllFestivals");
  }
  public void addBoothProduct(BoothProductVO boothProductVO) {
    my.insert("Mybooth.insertBoothProduct", boothProductVO);
  }
  public List<BoothVO> showMybooth(String user_id){
    return my.selectList("Mybooth.showMybooth",user_id);
  }
  public void deleteBooth(int boothNo) {
    // MyBatis를 이용하여 부스 삭제 SQL 호출
    my.delete("Mybooth.deleteBooth", boothNo);
  }
}
