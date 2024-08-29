package com.example.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DangKyController {
    /*
    * Đăng ký sử dụng dịch vụ*/
    @GetMapping("/admin/user/dangkydichvu")
    public String dangKyDichVu(Model model){
        return "admin/user/dangkysudungdichvu";
    }
    /*
    * Đăng ký sử dụng máy*/
    @GetMapping("/admin/user/dangkysudungmay")
    public String dangKySuDungMay(Model model){
        return "admin/user/dangkysudungmay";
    }

}
