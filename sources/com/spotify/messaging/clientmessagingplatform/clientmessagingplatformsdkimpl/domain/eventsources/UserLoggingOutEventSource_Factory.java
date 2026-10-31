package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Flowable;
import p.jly0;
import p.th61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UserLoggingOutEventSource_Factory implements jly0 {
    private final jly0 sessionStateProvider;

    private UserLoggingOutEventSource_Factory(jly0 jly0Var) {
        this.sessionStateProvider = jly0Var;
    }

    public static UserLoggingOutEventSource_Factory create(jly0 jly0Var) {
        return new UserLoggingOutEventSource_Factory(jly0Var);
    }

    public static UserLoggingOutEventSource newInstance(Flowable<th61> flowable) {
        return new UserLoggingOutEventSource(flowable);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public UserLoggingOutEventSource m225get() {
        return newInstance((Flowable) this.sessionStateProvider.get());
    }
}
