package com.yicj.study.consume.vo;

import lombok.Data;

@Data
public class BaseResponse<T> {
	private Integer code ;
	private String msg ;
	private T data ;
	
	public static <P> BaseResponse<P> success(P p){
		BaseResponse<P> resp = new BaseResponse<P>() ;
		resp.setCode(200);
		resp.setMsg("success");
		resp.setData(p);
		return resp ;
	}
	
	public static <P> BaseResponse<P> error(){
		BaseResponse<P> resp = new BaseResponse<P>() ;
		resp.setCode(400);
		resp.setMsg("error");
		return resp ;
	}
	
	public static <P> BaseResponse<P> error(String msg){
		BaseResponse<P> resp = new BaseResponse<P>() ;
		resp.setCode(400);
		resp.setMsg(msg);
		return resp ;
	}
}
