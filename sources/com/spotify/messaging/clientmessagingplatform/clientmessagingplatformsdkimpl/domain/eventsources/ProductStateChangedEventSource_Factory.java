package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.jly0;
import p.o241;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ProductStateChangedEventSource_Factory implements jly0 {
    private final jly0 productStateProvider;

    private ProductStateChangedEventSource_Factory(jly0 jly0Var) {
        this.productStateProvider = jly0Var;
    }

    public static ProductStateChangedEventSource_Factory create(jly0 jly0Var) {
        return new ProductStateChangedEventSource_Factory(jly0Var);
    }

    public static ProductStateChangedEventSource newInstance(o241 o241Var) {
        return new ProductStateChangedEventSource(o241Var);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public ProductStateChangedEventSource m224get() {
        return newInstance((o241) this.productStateProvider.get());
    }
}
