package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.blc;
import p.md00;
import p.o6j0;
import p.ojc;
import p.pjc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/ViewRequestEventSource;", "Lp/md00;", "Lp/blc;", "Lp/ojc;", "viewRequestDelegate", "<init>", "(Lp/ojc;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/ojc;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ViewRequestEventSource implements md00 {
    public static final int $stable = 8;
    private final ojc viewRequestDelegate;

    public ViewRequestEventSource(ojc ojcVar) {
        this.viewRequestDelegate = ojcVar;
    }

    @Override // p.md00
    public Observable<blc> eventSource() {
        return ((pjc) this.viewRequestDelegate).a.hide().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ViewRequestEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final blc apply(o6j0 o6j0Var) {
                return new blc(o6j0Var.a(), o6j0Var.g(), o6j0Var.f(), o6j0Var.c(), o6j0Var.b(), o6j0Var.e(), o6j0Var.d());
            }
        });
    }
}
