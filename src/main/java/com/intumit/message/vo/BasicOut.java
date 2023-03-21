package com.intumit.message.vo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BasicOut<T> {
	@Default
	private String status = "s";
	private List<String> message;
	private T data;// 原本的方式
	private Map<String, Set<List<Object>>> data2;// Stream groupBy
}
