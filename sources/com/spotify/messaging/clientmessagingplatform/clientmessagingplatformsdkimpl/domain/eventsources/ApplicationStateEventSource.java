package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.md00;
import p.qkc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/ApplicationStateEventSource;", "Lp/md00;", "Lp/qkc;", "Lio/reactivex/rxjava3/core/Observable;", "", "foregroundObservable", "<init>", "(Lio/reactivex/rxjava3/core/Observable;)V", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/core/Observable;", "getForegroundObservable$annotations", "()V", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ApplicationStateEventSource implements md00 {
    public static final int $stable = 8;
    private final Observable<Boolean> foregroundObservable;

    public ApplicationStateEventSource(Observable<Boolean> observable) {
        this.foregroundObservable = observable;
    }

    private static /* synthetic */ void getForegroundObservable$annotations() {
    }

    @Override // p.md00
    public Observable<qkc> eventSource() {
        return this.foregroundObservable.map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ApplicationStateEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final qkc apply(Boolean bool) {
                return new qkc(bool.booleanValue() ? ApplicationState.FOREGROUND : ApplicationState.BACKGROUND);
            }
        });
    }
}
