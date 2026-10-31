package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.cmc;
import p.jly0;
import p.qlc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AppContextChangedEventSource_Factory implements jly0 {
    private final jly0 navigationChangedDelegateProvider;
    private final jly0 playbackStartedDelegateProvider;

    private AppContextChangedEventSource_Factory(jly0 jly0Var, jly0 jly0Var2) {
        this.navigationChangedDelegateProvider = jly0Var;
        this.playbackStartedDelegateProvider = jly0Var2;
    }

    public static AppContextChangedEventSource_Factory create(jly0 jly0Var, jly0 jly0Var2) {
        return new AppContextChangedEventSource_Factory(jly0Var, jly0Var2);
    }

    public static AppContextChangedEventSource newInstance(qlc qlcVar, cmc cmcVar) {
        return new AppContextChangedEventSource(qlcVar, cmcVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public AppContextChangedEventSource m217get() {
        return newInstance((qlc) this.navigationChangedDelegateProvider.get(), (cmc) this.playbackStartedDelegateProvider.get());
    }
}
