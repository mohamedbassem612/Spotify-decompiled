package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AdPlayingEventSource_Factory implements jly0 {
    private final jly0 playerStateFlowableProvider;

    private AdPlayingEventSource_Factory(jly0 jly0Var) {
        this.playerStateFlowableProvider = jly0Var;
    }

    public static AdPlayingEventSource_Factory create(jly0 jly0Var) {
        return new AdPlayingEventSource_Factory(jly0Var);
    }

    public static AdPlayingEventSource newInstance(Flowable<PlayerState> flowable) {
        return new AdPlayingEventSource(flowable);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public AdPlayingEventSource m216get() {
        return newInstance((Flowable) this.playerStateFlowableProvider.get());
    }
}
