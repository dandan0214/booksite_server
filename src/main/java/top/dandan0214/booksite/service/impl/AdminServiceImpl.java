package top.dandan0214.booksite.service.impl;

import org.springframework.stereotype.Service;

import top.dandan0214.booksite.common.BaseServiceImpl;
import top.dandan0214.booksite.entity.Admin;
import top.dandan0214.booksite.mapper.AdminMapper;
import top.dandan0214.booksite.service.IAdminService;

/**
 * <p>
 * 后台管理员表 服务实现类
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@Service
public class AdminServiceImpl extends BaseServiceImpl<AdminMapper, Admin> implements IAdminService {

}
