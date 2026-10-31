package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.crd;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class CarStateEventSource_Factory implements jly0 {
    private final jly0 carDetectionStateProvider;

    private CarStateEventSource_Factory(jly0 jly0Var) {
        this.carDetectionStateProvider = jly0Var;
    }

    public static CarStateEventSource_Factory create(jly0 jly0Var) {
        return new CarStateEventSource_Factory(jly0Var);
    }

    public static CarStateEventSource newInstance(crd crdVar) {
        return new CarStateEventSource(crdVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CarStateEventSource m219get() {
        return newInstance((crd) this.carDetectionStateProvider.get());
    }
}
