package top.dandan0214.booksite.service.impl;

import top.dandan0214.booksite.entity.User;
import top.dandan0214.booksite.mapper.UserMapper;
import top.dandan0214.booksite.service.IUserService;
import top.dandan0214.booksite.common.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 普通用户表 服务实现类
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {
	
}
