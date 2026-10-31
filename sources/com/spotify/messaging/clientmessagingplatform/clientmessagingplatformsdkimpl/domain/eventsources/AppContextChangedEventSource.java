package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.bmc;
import p.cmc;
import p.dmc;
import p.md00;
import p.ml5;
import p.pkc;
import p.plc;
import p.qlc;
import p.tlc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/AppContextChangedEventSource;", "Lp/md00;", "Lp/pkc;", "Lp/qlc;", "navigationChangedDelegate", "Lp/cmc;", "playbackStartedDelegate", "<init>", "(Lp/qlc;Lp/cmc;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/qlc;", "Lp/cmc;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class AppContextChangedEventSource implements md00 {
    public static final int $stable = 0;
    private final qlc navigationChangedDelegate;
    private final cmc playbackStartedDelegate;

    public AppContextChangedEventSource(qlc qlcVar, cmc cmcVar) {
        this.navigationChangedDelegate = qlcVar;
        this.playbackStartedDelegate = cmcVar;
    }

    @Override // p.md00
    public Observable<pkc> eventSource() {
        return Observable.combineLatest(((tlc) this.navigationChangedDelegate).d.hide().distinctUntilChanged(), ((dmc) this.playbackStartedDelegate).a(), new BiFunction() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AppContextChangedEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final ml5 apply(plc plcVar, bmc bmcVar) {
                return new ml5(plcVar, bmcVar);
            }
        }).distinctUntilChanged().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AppContextChangedEventSource.eventSource.2
            @Override // io.reactivex.rxjava3.functions.Function
            public final pkc apply(ml5 ml5Var) {
                return new pkc(ml5Var);
            }
        });
    }
}
