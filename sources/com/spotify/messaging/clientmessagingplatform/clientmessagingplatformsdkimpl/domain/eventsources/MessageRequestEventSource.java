package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.ajc;
import p.cjc;
import p.dmc;
import p.gmc;
import p.llc;
import p.md00;
import p.mlc;
import p.mm10;
import p.mp8;
import p.ns80;
import p.pzs0;
import p.qzs0;
import p.rzs0;
import p.stf0;
import p.tic;
import p.tlc;
import p.wlc;
import p.xlc;
import p.ykc;
import p.zwa;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/MessageRequestEventSource;", "Lp/md00;", "Lp/ykc;", "Lp/ajc;", "customClientRequestDelegate", "Lp/llc;", "navigationChangedRequestDelegate", "Lp/wlc;", "playbackStartedRequestDelegate", "Lp/tic;", "backOnlineRequestDelegate", "<init>", "(Lp/ajc;Lp/llc;Lp/wlc;Lp/tic;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/ajc;", "Lp/llc;", "Lp/wlc;", "Lp/tic;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class MessageRequestEventSource implements md00 {
    public static final int $stable = 0;
    private final tic backOnlineRequestDelegate;
    private final ajc customClientRequestDelegate;
    private final llc navigationChangedRequestDelegate;
    private final wlc playbackStartedRequestDelegate;

    public MessageRequestEventSource(ajc ajcVar, llc llcVar, wlc wlcVar, tic ticVar) {
        this.customClientRequestDelegate = ajcVar;
        this.navigationChangedRequestDelegate = llcVar;
        this.playbackStartedRequestDelegate = wlcVar;
        this.backOnlineRequestDelegate = ticVar;
    }

    @Override // p.md00
    public Observable<ykc> eventSource() {
        cjc cjcVar = (cjc) this.customClientRequestDelegate;
        Observable map = cjcVar.d.hide().withLatestFrom((ObservableSource) ((tlc) cjcVar.c).e.hide().distinctUntilChanged(), (BiFunction) mm10.T0).map(ns80.Q0);
        mlc mlcVar = (mlc) this.navigationChangedRequestDelegate;
        Observable map2 = ((tlc) mlcVar.b).d.hide().distinctUntilChanged().filter(stf0.R0).distinctUntilChanged().map(new mp8(mlcVar, (byte) 9));
        xlc xlcVar = (xlc) this.playbackStartedRequestDelegate;
        return Observable.merge(map, map2, ((dmc) xlcVar.b).a().filter(qzs0.O0).map(rzs0.N0).withLatestFrom((ObservableSource) ((tlc) xlcVar.c).e.hide().distinctUntilChanged(), (BiFunction) pzs0.N0).map(new zwa(xlcVar, (byte) 4)), this.backOnlineRequestDelegate.a()).map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.MessageRequestEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final ykc apply(gmc gmcVar) {
                return new ykc(gmcVar);
            }
        });
    }
}
