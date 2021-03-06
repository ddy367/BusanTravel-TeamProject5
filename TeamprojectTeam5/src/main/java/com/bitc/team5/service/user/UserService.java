package com.bitc.team5.service.user;

import java.util.List;

import com.bitc.team5.dto.DibDto;
import com.bitc.team5.dto.LodgeDto;
import com.bitc.team5.dto.UserDto;

public interface UserService {

	void userJoin(UserDto user) throws Exception;

	int loginCheck(String email, String password) throws Exception;

	List<UserDto> selectUserList() throws Exception;

	UserDto selectUserDetail(String email) throws Exception;

	void updateUser(UserDto user) throws Exception;

	void userDelete(UserDto user) throws Exception;

	UserDto selectUserDetail2(String email) throws Exception;

	List<DibDto> dibList(String email) throws Exception;

	List<LodgeDto> lodgeBookList(String email) throws Exception;


}
