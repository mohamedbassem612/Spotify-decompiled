package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.ejc;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DismissRequestEventSource_Factory implements jly0 {
    private final jly0 delegateProvider;

    private DismissRequestEventSource_Factory(jly0 jly0Var) {
        this.delegateProvider = jly0Var;
    }

    public static DismissRequestEventSource_Factory create(jly0 jly0Var) {
        return new DismissRequestEventSource_Factory(jly0Var);
    }

    public static DismissRequestEventSource newInstance(ejc ejcVar) {
        return new DismissRequestEventSource(ejcVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public DismissRequestEventSource m220get() {
        return newInstance((ejc) this.delegateProvider.get());
    }
}
