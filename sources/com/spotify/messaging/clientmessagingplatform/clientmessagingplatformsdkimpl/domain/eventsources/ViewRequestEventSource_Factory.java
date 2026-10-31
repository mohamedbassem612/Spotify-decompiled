package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.jly0;
import p.ojc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ViewRequestEventSource_Factory implements jly0 {
    private final jly0 viewRequestDelegateProvider;

    private ViewRequestEventSource_Factory(jly0 jly0Var) {
        this.viewRequestDelegateProvider = jly0Var;
    }

    public static ViewRequestEventSource_Factory create(jly0 jly0Var) {
        return new ViewRequestEventSource_Factory(jly0Var);
    }

    public static ViewRequestEventSource newInstance(ojc ojcVar) {
        return new ViewRequestEventSource(ojcVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public ViewRequestEventSource m227get() {
        return newInstance((ojc) this.viewRequestDelegateProvider.get());
    }
}
