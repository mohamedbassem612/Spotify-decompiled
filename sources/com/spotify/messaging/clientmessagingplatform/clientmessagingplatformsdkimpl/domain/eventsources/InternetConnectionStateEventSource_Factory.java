package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.jly0;
import p.zwz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class InternetConnectionStateEventSource_Factory implements jly0 {
    private final jly0 reachabilityMonitorProvider;

    private InternetConnectionStateEventSource_Factory(jly0 jly0Var) {
        this.reachabilityMonitorProvider = jly0Var;
    }

    public static InternetConnectionStateEventSource_Factory create(jly0 jly0Var) {
        return new InternetConnectionStateEventSource_Factory(jly0Var);
    }

    public static InternetConnectionStateEventSource newInstance(zwz0 zwz0Var) {
        return new InternetConnectionStateEventSource(zwz0Var);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public InternetConnectionStateEventSource m221get() {
        return newInstance((zwz0) this.reachabilityMonitorProvider.get());
    }
}
