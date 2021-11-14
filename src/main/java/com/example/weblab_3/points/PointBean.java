package com.example.weblab_3.points;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped

public class PointBean implements Serializable {
    private Point point=new Point();

}
