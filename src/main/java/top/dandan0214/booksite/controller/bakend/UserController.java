package top.dandan0214.booksite.controller.bakend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.dandan0214.booksite.common.ResponseModel;

/**
 * 
 * @author yanggang
 *
 */
@RestController
@RequestMapping("/bakend/user")
public class UserController {

	@RequestMapping("/login")
	public ResponseModel login(String username, String password, Integer type) {
		if (null == type) {
			return ResponseModel.error("登录失败，失败原因：不识别的身份。。。。");
		}
		if (null == username || username.trim().equals("")) {
			return ResponseModel.error("登录失败，失败原因：用户名为空");
		}
		if (null == password || password.trim().equals("")) {
			return ResponseModel.error("登录失败，失败原因：密码为空");
		}
		return null;
	}

}
