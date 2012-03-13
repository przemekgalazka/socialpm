package com.ocpsoft.socialpm.gwt.client.local.view;

import com.google.gwt.place.shared.Place;


public interface LoginView extends FixedLayout
{
   public interface Presenter 
   {
      void doLogin(String username, String password);

      void goTo(Place place);
   }
   
   void focusUsername();
   
   Presenter getPresenter();
   
   void setPresenter(Presenter presenter);
}
