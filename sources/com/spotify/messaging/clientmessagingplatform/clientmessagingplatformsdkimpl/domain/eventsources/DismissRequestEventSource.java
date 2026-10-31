package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.alc;
import p.ejc;
import p.fjc;
import p.md00;
import p.ofu;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/DismissRequestEventSource;", "Lp/md00;", "Lp/alc;", "Lp/ejc;", "delegate", "<init>", "(Lp/ejc;)V", "Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/jvm/internal/EnhancedNullability;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/ejc;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class DismissRequestEventSource implements md00 {
    public static final int $stable = 8;
    private final ejc delegate;

    public DismissRequestEventSource(ejc ejcVar) {
        this.delegate = ejcVar;
    }

    @Override // p.md00
    public Observable<alc> eventSource() {
        return ((fjc) this.delegate).a.hide().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.DismissRequestEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final alc apply(ofu ofuVar) {
                return new alc(ofuVar.b(), ofuVar.a());
            }
        });
    }
}
