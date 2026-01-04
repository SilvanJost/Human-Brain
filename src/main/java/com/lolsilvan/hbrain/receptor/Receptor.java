package com.lolsilvan.hbrain.receptor;

import com.lolsilvan.hbrain.Ion;

import java.util.Set;

abstract class Receptor {
    final Transmitter transmitter;
    final ReceptorType type;
    final GatingType gating;
    final Set<Ion> permeableIons;

    // Electrical behavior
    final double gMax;
    final double eRev_mV;

    // Kinetics
    final double tauRise_s;
    final double tauDecay_s;

    // Modulation & learning
    final boolean voltageDependent;
    final boolean plastic;

    // Short-term dynamics
    final boolean desensitizes;
    final double tauDesens_s;

    protected Receptor(
            Transmitter transmitter,
            ReceptorType type,
            GatingType gating,
            Set<Ion> permeableIons,
            double gMax,
            double eRev_mV,
            double tauRise_s,
            double tauDecay_s,
            boolean voltageDependent,
            boolean plastic,
            boolean desensitizes,
            double tauDesens_s
    ) {
        this.transmitter = transmitter;
        this.type = type;
        this.gating = gating;
        this.permeableIons = permeableIons;
        this.gMax = gMax;
        this.eRev_mV = eRev_mV;
        this.tauRise_s = tauRise_s;
        this.tauDecay_s = tauDecay_s;
        this.voltageDependent = voltageDependent;
        this.plastic = plastic;
        this.desensitizes = desensitizes;
        this.tauDesens_s = tauDesens_s;
    }
}
