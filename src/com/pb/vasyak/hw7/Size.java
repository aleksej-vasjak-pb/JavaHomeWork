package com.pb.vasyak.hw7;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private final int EuroSize;
    Size(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    public void getEuroSize() {
        System.out.println();
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }
}
