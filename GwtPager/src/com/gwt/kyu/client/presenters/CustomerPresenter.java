package com.gwt.kyu.client.presenters;


import java.util.ArrayList;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.gwt.kyu.shared.Customer;

public class CustomerPresenter implements Presenter {
	Display view;
	ArrayList<Customer> customerList;
	
	
	public CustomerPresenter(ArrayList<Customer> customerList,Display view) {
		// TODO Auto-generated constructor stub
		this.customerList = customerList;
		this.view = view;
		bind();
	}
	
	public interface Display{
		
		public void clear();
		public Widget asWidget();
		public void setPresenter(CustomerPresenter customerPresenter);
		public void fillTable(ArrayList<Customer> customerList);
		
		
		
	}
	@Override
	public void bind() {
		// TODO Auto-generated method stub
		view.clear();
		view.setPresenter(this);
		view.fillTable(customerList);

	}

	@Override
	public void go(HasWidgets container) {
		// TODO Auto-generated method stub
		container.clear();
		container.add(view.asWidget());
	}

}
