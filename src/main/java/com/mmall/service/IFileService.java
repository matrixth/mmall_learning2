package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by matri on 2018/5/2.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
