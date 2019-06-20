package com.bit.web.common.util;

import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * PageProxy
 */
@Component @Data @Lazy
public class PageProxy {
    private int pageNum, pageSize, blockSize, StartRow,
                endRow, startPage, endPage, prevBlock, nextBlock, totalCount;
    private String search;
    private boolean existPrev, existNext;

    public void excute(Map<?,?> paramMap){
        String _pageNum = (String)paramMap.get("page_Num");
        pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum);
        //페이지네이션을 이용한 페이지 이동이 아닌경우 페이지 번호를 1로한다.
        String _pageSize = (String)paramMap.get("page_size");
        pageSize = (_pageSize == null) ? 5 : Integer.parseInt(_pageSize);
        // blocksize 기본값 5
    
        // totalCount = DB에 있는 테이블에서 가져옴
    
        int nmg = totalCount % pageSize;
        int pageCount = (nmg == 0) ? totalCount / pageSize : totalCount / pageSize + 1;

        // startRow
 
        // endRow
    }
    
}