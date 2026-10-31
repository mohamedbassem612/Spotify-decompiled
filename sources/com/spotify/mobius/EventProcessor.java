package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class EventProcessor<M, E, F> {
    public final MobiusStore a;
    public final Consumer b;
    public final Consumer c;

    public static class Factory<M, E, F> {
        public final MobiusStore a;

        public Factory(MobiusStore mobiusStore) {
            this.a = mobiusStore;
        }
    }

    public EventProcessor(MobiusStore mobiusStore, Consumer consumer, Consumer consumer2) {
        this.a = mobiusStore;
        this.b = consumer;
        this.c = consumer2;
    }
}
