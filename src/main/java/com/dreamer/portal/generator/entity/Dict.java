package com.dreamer.portal.generator.entity;

import java.io.Serializable;

public class Dict implements Serializable {
    private String dictId;

    private String dictCode;

    private String dictName;

    private String dDictcol;

    private static final long serialVersionUID = 1L;

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId == null ? null : dictId.trim();
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public String getdDictcol() {
        return dDictcol;
    }

    public void setdDictcol(String dDictcol) {
        this.dDictcol = dDictcol == null ? null : dDictcol.trim();
    }
}