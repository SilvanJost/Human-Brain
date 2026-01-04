package com.lolsilvan.hbrain;

public abstract class Receptor {
    private final Ion ion;
    private final Transmitter transmitter;
    private final ReceptorType type;

    protected Receptor(Ion ion, Transmitter transmitter, ReceptorType type) {
        this.ion = ion;
        this.transmitter = transmitter;
        this.type = type;
    }
}
