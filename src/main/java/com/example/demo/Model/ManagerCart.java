package com.example.demo.Model;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class ManagerCart {
    private static final String SESSION_KEY_GIO_HANG = "gioHang" ;


    public Cart getCart(HttpSession session){
      Cart cart = (Cart)session.getAttribute(SESSION_KEY_GIO_HANG);
      if(cart == null){
          cart = new Cart();
          setCart(session , cart);
      }
      return cart;
    }
    public void setCart(HttpSession session , Cart cart){
        session.setAttribute(SESSION_KEY_GIO_HANG , cart);
    }
    public  void removeCart(HttpSession session){
        session.removeAttribute(SESSION_KEY_GIO_HANG);
    }
}
