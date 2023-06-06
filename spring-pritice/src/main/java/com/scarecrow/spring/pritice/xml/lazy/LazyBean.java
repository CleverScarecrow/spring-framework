package com.scarecrow.spring.pritice.xml.lazy;

/**
 * @author wangbo
 * @since 2022/10/24 11:43
 */
public class LazyBean {

    private String desc;

    public LazyBean() {
        System.out.println("lazyBean Constructor");
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
