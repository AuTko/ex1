package com.company;

public class Proxy implements Singl {
    private Singl singlInst;

    public Proxy(Singl obj) {
        singlInst = obj;
    }

    @Override
    public String toString() {
        return "Proxy{} " + singlInst;
    }

    @Override
    public String getMsg() {
        return "Msg through proxy - " + singlInst.getMsg();
    }
}
