package com.example.melnikov.myapp.dto;

/**
 * Created by MelnikOV on 031 31.03.16.
 */
public class RemindDTO {

    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
