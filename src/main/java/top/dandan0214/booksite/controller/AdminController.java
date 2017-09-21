package top.dandan0214.booksite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import top.dandan0214.booksite.entity.Admin;
import top.dandan0214.booksite.service.IAdminService;

/**
 * <p>
 * 后台管理员表 前端控制器
 * </p>
 *
 * @author yanggang
 * @since 2017-09-21
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminService adminService;

	@RequestMapping("/test")
	public String test() {
		Admin entity = new Admin();
		entity.setNickname("aaaa");
		adminService.insert(entity);

		Page<Admin> page = new Page<>(1, 10);
		adminService.selectPage(page);

		return "aaa";
	}

}
