package com.markey.messageboard.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Message {
	@Id
	private String id;
	private String body;
	private Timestamp createTime;
	LngLat position = new LngLat();

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public LngLat getPosition() {
		return position;
	}

	public void setPosition(LngLat position) {
		this.position = position;
	}
	//获取经度
	public float getLng() {
		return position.getLng();
	}
	public void setLng(float lng) {
		this.position.setLng(lng);;
	}
	public float getLat() {
		return this.position.getLat();
	}

	public void setLat(float lat) {
		this.position.setLat(lat);
	}
	
	public void setLngLat(float lng, float lat) {
		this.position.setLng(lng);
		this.position.setLat(lat);
	}
	//经纬度内部类
	protected class LngLat{
		float lng, lat;
		public LngLat() {
			super();
		}
		public float getLng() {
			return lng;
		}

		public void setLng(float lng) {
			this.lng = lng;
		}

		public float getLat() {
			return lat;
		}

		public void setLat(float lat) {
			this.lat = lat;
		}
	}
}
