package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.AdPlayingState;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.l4o1;
import p.md00;
import p.okc;
import p.x0d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/AdPlayingEventSource;", "Lp/md00;", "Lp/okc;", "Lio/reactivex/rxjava3/core/Flowable;", "Lcom/spotify/player/model/PlayerState;", "playerStateFlowable", "<init>", "(Lio/reactivex/rxjava3/core/Flowable;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/core/Flowable;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class AdPlayingEventSource implements md00 {
    public static final int $stable = 8;
    private final Flowable<PlayerState> playerStateFlowable;

    public AdPlayingEventSource(Flowable<PlayerState> flowable) {
        this.playerStateFlowable = flowable;
    }

    @Override // p.md00
    public Observable<okc> eventSource() {
        Flowable<PlayerState> flowable = this.playerStateFlowable;
        return x0d.j(flowable, flowable).map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AdPlayingEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final Boolean apply(PlayerState playerState) {
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                return Boolean.valueOf(contextTrack != null ? l4o1.E(contextTrack) : false);
            }
        }).map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AdPlayingEventSource.eventSource.2
            @Override // io.reactivex.rxjava3.functions.Function
            public final okc apply(Boolean bool) {
                return new okc(bool.booleanValue() ? AdPlayingState.AD_PLAYING : AdPlayingState.AD_NOT_PLAYING);
            }
        }).distinctUntilChanged();
    }
}
