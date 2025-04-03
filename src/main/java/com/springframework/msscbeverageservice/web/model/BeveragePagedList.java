package com.springframework.msscbeverageservice.web.model;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeveragePagedList extends PageImpl<BeverageDto> {

    public BeveragePagedList(List<BeverageDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeveragePagedList(List<BeverageDto> content) {
        super(content);
    }
}
