package com.example.ojas_25.myprojectsecond;

public class PersonActivity {
    String name;
    String sex;
    String course;
    String imgUrl;
    public PersonActivity(String name,String sex,String course,String imgUrl){
        this.name=name;
        this.sex=sex;
        this.course=course;
        this.imgUrl=imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getCourse()
    {
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
}









