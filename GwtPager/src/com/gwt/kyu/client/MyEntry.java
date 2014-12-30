package com.gwt.kyu.client;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwt.kyu.client.presenters.CustomerPresenter;
import com.gwt.kyu.client.presenters.Presenter;
import com.gwt.kyu.client.views.CustomerPage;
import com.gwt.kyu.shared.Customer;

public class MyEntry implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Presenter prsntr = new CustomerPresenter(customer.addPersonList(), new CustomerPage());
		prsntr.go(RootPanel.get());
	}

}
