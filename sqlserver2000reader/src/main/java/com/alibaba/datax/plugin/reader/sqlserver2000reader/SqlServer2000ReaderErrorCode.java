package com.alibaba.datax.plugin.reader.sqlserver2000reader;

import com.alibaba.datax.common.spi.ErrorCode;

public enum SqlServer2000ReaderErrorCode implements ErrorCode {
    ;

    private String code;
    private String description;

    private SqlServer2000ReaderErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

}
