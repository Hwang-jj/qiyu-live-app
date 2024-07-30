package org.qiyu.live.user.provider.rpc;

import org.apache.dubbo.config.annotation.DubboService;
import org.qiyu.live.user.interfaces.IUserRpc;

/**
  * @ClassName UserRpcImpl
  * @description:
  * @author Hwangjj
  * @date 2024/7/30 下午2:29
  * @version: 1.0
  */ 

@DubboService //dubbo服务暴露
public class UserRpcImpl implements IUserRpc {
    @Override
    public String test() {
        System.out.println("this is a dubbo test");
        return "success";
    }
}
