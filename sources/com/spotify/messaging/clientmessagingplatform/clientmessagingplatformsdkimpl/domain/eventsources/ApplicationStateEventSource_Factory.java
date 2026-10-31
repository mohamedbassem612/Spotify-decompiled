package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Observable;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ApplicationStateEventSource_Factory implements jly0 {
    private final jly0 foregroundObservableProvider;

    private ApplicationStateEventSource_Factory(jly0 jly0Var) {
        this.foregroundObservableProvider = jly0Var;
    }

    public static ApplicationStateEventSource_Factory create(jly0 jly0Var) {
        return new ApplicationStateEventSource_Factory(jly0Var);
    }

    public static ApplicationStateEventSource newInstance(Observable<Boolean> observable) {
        return new ApplicationStateEventSource(observable);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public ApplicationStateEventSource m218get() {
        return newInstance((Observable) this.foregroundObservableProvider.get());
    }
}
