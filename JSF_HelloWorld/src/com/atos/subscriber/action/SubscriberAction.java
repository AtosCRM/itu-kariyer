package com.atos.subscriber.action;

import java.io.Serializable;

import javax.faces.bean.ManagedProperty;

import com.atos.subscriber.model.Subscriber;


public class SubscriberAction implements Serializable {

	@ManagedProperty(value = "#{subscriber}")
	private Subscriber subscriber;



	public Subscriber getSubscriber() {
		return subscriber;
	}



	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}



	public void insertSub() {

		this.subscriber.toString();
	}

}
