package com.x9.approval.dto;

import com.x9.enums.ApprovalFunctionalEnum;
import com.x9.enums.ApprovalOperateEnum;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Description 审批实例
 * @Author <a href="mailto:caihao@xi-9.com">CaiHao</a>
 * @Date 2023/5/8 11:49
 **/
@Data
public class BusinessApprovalDto {


    private ApprovalFunctionalEnum approvalFunctional;

    private ApprovalOperateEnum approvalOperate;

    private List<Map<String,String>> dataList;

    private Long depId;

    private String dingUserId;
}
