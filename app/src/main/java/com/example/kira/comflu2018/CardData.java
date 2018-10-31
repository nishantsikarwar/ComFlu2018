package com.example.kira.comflu2018;

public class CardData {

    private String lecture_topic;
    private String lecture_time;
    private String professor;
    private String lecture_abstract;
 //   private Boolean marked;

//    public Boolean getMarked() {
//        return marked;
//    }
//
//    public void setMarked(Boolean marked) {
//        this.marked = marked;
//    }



    public String getLecture_topic() {
        return lecture_topic;
    }

    public void setLecture_topic(String lecture_topic) {
        this.lecture_topic = lecture_topic;
    }

    public String getLecture_time() {
        return lecture_time;
    }

    public void setLecture_time(String lecture_time) {
        this.lecture_time = lecture_time;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getLecture_abstract() {
        return lecture_abstract;
    }

    public void setLecture_abstract(String lecture_abstract) {
        this.lecture_abstract = lecture_abstract;
    }

    public CardData(String lecture_topic, String lecture_time, String professor, String lecture_abstract) {
        this.lecture_topic = lecture_topic;
        this.lecture_time = lecture_time;
        this.professor = professor;
        this.lecture_abstract = lecture_abstract;
        //this.marked = marked;
    }


}
