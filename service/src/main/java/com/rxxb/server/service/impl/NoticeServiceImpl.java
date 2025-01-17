package com.rxxb.server.data.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.rxxb.server.data.base.BusinessException;
import com.rxxb.server.data.rds.entity.Notice;
import com.rxxb.server.data.rds.entity.User;
import com.rxxb.server.data.rds.mapper.NoticeMapper;
import com.rxxb.server.data.service.INoticeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rxxb.server.data.util.ComUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 消息通知表 服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-07-27
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

    @Override
    public void insertByThemeNo(String themeNo,String  mobile) {
        Notice notice = Notice.builder().themeNo(themeNo).type(1).title("测试通知1111111111")
                                                                        //未读
                .mobile(mobile).createTime(System.currentTimeMillis()).isRead(0).build();
        this.insert(notice);
    }

    @Override
    public void deleteByNotices(User user) throws Exception {
        List<Notice> notices = this.selectList(new EntityWrapper<Notice>().eq("mobile",user.getMobile()));
        if(ComUtil.isEmpty(notices)){
            throw new BusinessException("当前用户不存在消息");
        }else {
            for (Notice notice:notices) {
                this.deleteById(notice.getNoticeId());
            }
        }
    }

    @Override
    public void read(JSONObject requestJson) throws Exception {
        Notice notice = this.selectById(requestJson.getString("noticeId"));
        if(ComUtil.isEmpty(notice)){
            throw new BusinessException("消息不存在");
        }
        //已读
        notice.setIsRead(requestJson.getInteger("isRead"));
        this.updateById(notice);
    }
}
