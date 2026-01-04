package com.lolsilvan.hbrain.receptor;

import com.lolsilvan.hbrain.Ion;

import java.util.EnumSet;

final class AmpaReceptor extends Receptor {

    public AmpaReceptor(double gMax) {
        super(
                Transmitter.GLUTAMATE,
                ReceptorType.IONOTROPIC,
                GatingType.LIGAND,
                EnumSet.of(Ion.SODIUM, Ion.POTASSIUM),
                gMax,
                0.0,        // reversal potential
                0.0002,      // rise
                0.0020,      // decay
                false,       // voltageDependent
                true,        // plastic (AMPAR insertion/removal)
                true,        // desensitizes
                0.010        // desensitization time
        );
    }
}