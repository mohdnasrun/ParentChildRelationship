package com.dto.impl;

public class ChildB extends Parent
{

     public String getName(){
         return super.getName();
     }
     
     public String getChildAName(){
         return "Along";
     }
}