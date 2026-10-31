package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.jly0;
import p.mmc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ViewEventsEventSource_Factory implements jly0 {
    private final jly0 viewEventsDelegateProvider;

    private ViewEventsEventSource_Factory(jly0 jly0Var) {
        this.viewEventsDelegateProvider = jly0Var;
    }

    public static ViewEventsEventSource_Factory create(jly0 jly0Var) {
        return new ViewEventsEventSource_Factory(jly0Var);
    }

    public static ViewEventsEventSource newInstance(mmc mmcVar) {
        return new ViewEventsEventSource(mmcVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public ViewEventsEventSource m226get() {
        return newInstance((mmc) this.viewEventsDelegateProvider.get());
    }
}
