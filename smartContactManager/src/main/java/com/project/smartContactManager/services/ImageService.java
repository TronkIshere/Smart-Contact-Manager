package com.project.smartContactManager.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    String uploadImage(MultipartFile contactImage, String filename);
    String getUrlFromPublicId(String publicId);
}
