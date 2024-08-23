package com.project.smartContactManager.forms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class ContactSearchForm {
    private String field;
    private String value;
}
