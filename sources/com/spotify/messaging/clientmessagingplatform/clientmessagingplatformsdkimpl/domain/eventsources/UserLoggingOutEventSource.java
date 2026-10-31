package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.UserLoginState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import kotlin.Metadata;
import p.ilc;
import p.md00;
import p.th61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/UserLoggingOutEventSource;", "Lp/md00;", "Lp/ilc;", "Lio/reactivex/rxjava3/core/Flowable;", "Lp/th61;", "sessionState", "<init>", "(Lio/reactivex/rxjava3/core/Flowable;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/core/Flowable;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class UserLoggingOutEventSource implements md00 {
    public static final int $stable = 8;
    private final Flowable<th61> sessionState;

    public UserLoggingOutEventSource(Flowable<th61> flowable) {
        this.sessionState = flowable;
    }

    @Override // p.md00
    public Observable<ilc> eventSource() {
        return new ObservableFromPublisher(this.sessionState.x(new Predicate() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.UserLoggingOutEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Predicate
            public final boolean test(th61 th61Var) {
                return th61Var.d;
            }
        }).J(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.UserLoggingOutEventSource.eventSource.2
            @Override // io.reactivex.rxjava3.functions.Function
            public final ilc apply(th61 th61Var) {
                return new ilc(th61Var.d ? UserLoginState.LOGGING_OUT : UserLoginState.LOGGED_IN);
            }
        }));
    }
}
