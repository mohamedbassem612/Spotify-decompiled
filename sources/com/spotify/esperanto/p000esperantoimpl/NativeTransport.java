package com.spotify.esperanto.p000esperantoimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import kotlin.Metadata;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0003R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/spotify/esperanto/esperantoimpl/NativeTransport;", "Lcom/spotify/esperanto/esperanto/Transport;", "<init>", "()V", "Lio/reactivex/rxjava3/core/ObservableEmitter;", "", "emitter", "", "service", "method", "payload", "Lp/rih1;", "handleStreamSubscription", "(Lio/reactivex/rxjava3/core/ObservableEmitter;Ljava/lang/String;Ljava/lang/String;[B)V", "Lio/reactivex/rxjava3/core/SingleEmitter;", "handleSingleSubscription", "(Lio/reactivex/rxjava3/core/SingleEmitter;Ljava/lang/String;Ljava/lang/String;[B)V", "invalidate", "Lio/reactivex/rxjava3/core/Observable;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/core/Single;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[B)Lio/reactivex/rxjava3/core/Single;", "callSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "destroy", "", "nThis", "J", "getNThis$annotations", "", "isInvalidated", "Z", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NativeTransport implements Transport {
    private boolean isInvalidated;
    private final long nThis;

    private static /* synthetic */ void getNThis$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void handleSingleSubscription(io.reactivex.rxjava3.core.SingleEmitter<byte[]> emitter, String service, String method, byte[] payload);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void handleStreamSubscription(io.reactivex.rxjava3.core.ObservableEmitter<byte[]> emitter, String service, String method, byte[] payload);

    @Override // com.spotify.esperanto.esperanto.Transport
    public Single<byte[]> callSingle(final String service, final String method, final byte[] payload) {
        return Single.create(new SingleOnSubscribe() { // from class: com.spotify.esperanto.esperantoimpl.NativeTransport.callSingle.1
            public final void subscribe(io.reactivex.rxjava3.core.SingleEmitter<byte[]> singleEmitter) {
                if (NativeTransport.this.isInvalidated) {
                    singleEmitter.onError(new RuntimeException(gvg.h("callStream() subscription scheduled after invalidation: ", service, ".", method)));
                } else {
                    NativeTransport.this.handleSingleSubscription(singleEmitter, service, method, payload);
                }
            }
        });
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public Observable<byte[]> callStream(final String service, final String method, final byte[] payload) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.esperanto.esperantoimpl.NativeTransport.callStream.1
            public final void subscribe(io.reactivex.rxjava3.core.ObservableEmitter<byte[]> observableEmitter) {
                if (NativeTransport.this.isInvalidated) {
                    observableEmitter.onError(new RuntimeException(gvg.h("callStream() subscription scheduled after invalidation: ", service, ".", method)));
                } else {
                    NativeTransport.this.handleStreamSubscription(observableEmitter, service, method, payload);
                }
            }
        });
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public native byte[] callSync(String service, String method, byte[] payload);

    public final native void destroy();

    public final void invalidate() {
        this.isInvalidated = true;
    }
}
