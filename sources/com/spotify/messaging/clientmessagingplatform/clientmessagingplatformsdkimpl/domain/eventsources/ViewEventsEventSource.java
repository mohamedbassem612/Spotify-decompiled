package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.eg;
import p.h4j0;
import p.i4j0;
import p.j4j0;
import p.jlc;
import p.md00;
import p.mmc;
import p.nak1;
import p.nmc;
import p.oak1;
import p.pak1;
import p.qak1;
import p.rak1;
import p.wkc;
import p.xkc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/ViewEventsEventSource;", "Lp/md00;", "Lp/jlc;", "Lp/mmc;", "viewEventsDelegate", "<init>", "(Lp/mmc;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/mmc;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ViewEventsEventSource implements md00 {
    public static final int $stable = 8;
    private final mmc viewEventsDelegate;

    public ViewEventsEventSource(mmc mmcVar) {
        this.viewEventsDelegate = mmcVar;
    }

    @Override // p.md00
    public Observable<jlc> eventSource() {
        return ((nmc) this.viewEventsDelegate).a.hide().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ViewEventsEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final jlc apply(rak1 rak1Var) {
                if (rak1Var instanceof nak1) {
                    nak1 nak1Var = (nak1) rak1Var;
                    return new wkc(nak1Var.c(), nak1Var.b(), nak1Var.a());
                }
                if (rak1Var instanceof oak1) {
                    oak1 oak1Var = (oak1) rak1Var;
                    DiscardReason discardReasonA = oak1Var.a();
                    return new xkc(new h4j0(oak1Var.c(), oak1Var.b(), discardReasonA));
                }
                if (rak1Var instanceof pak1) {
                    pak1 pak1Var = (pak1) rak1Var;
                    DismissReason dismissReasonA = pak1Var.a();
                    return new xkc(new i4j0(pak1Var.c(), pak1Var.b(), dismissReasonA));
                }
                if (!(rak1Var instanceof qak1)) {
                    eg.o();
                    return null;
                }
                qak1 qak1Var = (qak1) rak1Var;
                return new xkc(new j4j0(qak1Var.b(), qak1Var.a()));
            }
        });
    }
}
