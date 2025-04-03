package com.jinhui.wmissauth.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * DESCRIPTION_OF_YOUR_CLASS
 *
 * @author lupeng (elupeng@163.com)
 */
@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;
    private String password;
}
