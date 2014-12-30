package com.gwt.kyu.client.views;

import java.util.ArrayList;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.gwt.kyu.client.presenters.CustomerPresenter;
import com.gwt.kyu.shared.Customer;

public class CustomerPage extends Composite implements CustomerPresenter.Display{
	
	private CustomerPresenter customerPresenter;
	public static Customer SelectedCustomer;
	private static CustomerPageUiBinder uiBinder = GWT
			.create(CustomerPageUiBinder.class);

	interface CustomerPageUiBinder extends UiBinder<Widget, CustomerPage> {
	}

	public CustomerPage() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
	@UiField
	CellTable<Customer> customerCellTable;

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void setPresenter(CustomerPresenter customerPresenter) {
		// TODO Auto-generated method stub
		this.customerPresenter = customerPresenter;
	}

	

	@Override
	public void fillTable(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		TextColumn<Customer> CustomerID = new TextColumn<Customer>() {
			
			@Override
			public String getValue(Customer object) {
				// TODO Auto-generated method stub
				return object.getCustomerID();
			}
		};
		
		TextColumn<Customer> CustomerName = new TextColumn<Customer>() {
			
			@Override
			public String getValue(Customer object) {
				// TODO Auto-generated method stub
				return object.getCustomerName();
			}
		};
		
		TextColumn<Customer> CustomerSurname = new TextColumn<Customer>() {
			
			@Override
			public String getValue(Customer object) {
				// TODO Auto-generated method stub
				return object.getCustomerSurname();
			}
		};
		
		TextColumn<Customer> CustomerMail = new TextColumn<Customer>() {
			
			@Override
			public String getValue(Customer object) {
				// TODO Auto-generated method stub
				return object.getCustomerMail();
			}
		};
		
		
		Column<Customer, String> buttonColumn = 
			    new Column<Customer, String>(new ButtonCell())  {
			         @Override
			         public String getValue(Customer object)  {
			             return "branch";
			         }
			    };
			buttonColumn.setFieldUpdater(new FieldUpdater<Customer, String>() {
			         @Override
			         public void update(int index, Customer object, String value) {
			             SelectedCustomer = object;
			             Window.alert(object.getCustomerID() + "Selam");
			         }
			});
		
		
		
		
		
		
		
		customerCellTable.addColumn(CustomerID,"ID");
		customerCellTable.addColumn(CustomerName,"Name");
		customerCellTable.addColumn(CustomerSurname,"Surname");
		customerCellTable.addColumn(CustomerMail,"Mail");
		customerCellTable.addColumn(buttonColumn,SafeHtmlUtils.fromSafeConstant("<br/>"));
		customerCellTable.setRowCount(customerList.size(),true);
		customerCellTable.setRowData(0,customerList);
		
	}

}
