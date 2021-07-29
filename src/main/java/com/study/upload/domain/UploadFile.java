package com.study.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;

    private UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
    private UploadFile(){}

    public static UploadFile create(String uploadFileName, String storeFileName) {
        return new UploadFile(uploadFileName, storeFileName);
    }
}
