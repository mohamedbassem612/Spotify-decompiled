package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import p.ajc;
import p.jly0;
import p.llc;
import p.tic;
import p.wlc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MessageRequestEventSource_Factory implements jly0 {
    private final jly0 backOnlineRequestDelegateProvider;
    private final jly0 customClientRequestDelegateProvider;
    private final jly0 navigationChangedRequestDelegateProvider;
    private final jly0 playbackStartedRequestDelegateProvider;

    private MessageRequestEventSource_Factory(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4) {
        this.customClientRequestDelegateProvider = jly0Var;
        this.navigationChangedRequestDelegateProvider = jly0Var2;
        this.playbackStartedRequestDelegateProvider = jly0Var3;
        this.backOnlineRequestDelegateProvider = jly0Var4;
    }

    public static MessageRequestEventSource_Factory create(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4) {
        return new MessageRequestEventSource_Factory(jly0Var, jly0Var2, jly0Var3, jly0Var4);
    }

    public static MessageRequestEventSource newInstance(ajc ajcVar, llc llcVar, wlc wlcVar, tic ticVar) {
        return new MessageRequestEventSource(ajcVar, llcVar, wlcVar, ticVar);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public MessageRequestEventSource m222get() {
        return newInstance((ajc) this.customClientRequestDelegateProvider.get(), (llc) this.navigationChangedRequestDelegateProvider.get(), (wlc) this.playbackStartedRequestDelegateProvider.get(), (tic) this.backOnlineRequestDelegateProvider.get());
    }
}
