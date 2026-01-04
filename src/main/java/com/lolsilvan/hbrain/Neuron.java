package com.lolsilvan.hbrain;

import java.util.List;

public class Neuron {

    public static final float LEAK_CURRENT = 0.1f;
    public static final float SPIKE_DURATION = 1f;

    private float voltage;
    private float threshold;
    private float size;
    private List<Dendrite> dendrites;
    private Axon axon;
    // +20 - +40 mV
    private float spike_voltage;

    /*

    absolute period = 1-2ms

    relative period = 2-10ms, can still fire but requires stronger signal

    fast-spiking interneurons = very short refractory 200+ Hz
    cortical pyramidal neurons = 10-50ms
    pacemaker neurons = special dynamics

     */
    private float refractory_period;

    private float leak_current() {

        /*
        I_leak = g_leak * (V - E_leak)

        g_leak = leak conductance
        E_leak ≈ resting potential (~ -65 mV)

         */

        return 0f;
    }

    /*

    Define how quickly voltage changes on input, depends on neuron size

     */
    private float voltage_change_delay(float size) {
        return 0f;
    }

    private float integration_window(float membraneCapacitance, float leakConductance) {
        return membraneCapacitance / leakConductance;
    }
}
