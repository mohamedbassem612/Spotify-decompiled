package com.spotify.cosmos.core;

import android.os.Handler;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.gex0;
import p.hab0;
import p.iu30;
import p.tif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ5\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00028\u00002\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRxRouter;", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "router", "Landroid/os/Handler;", "handler", "", "dispatchOnComputationScheduler", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;Landroid/os/Handler;Z)V", "(Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;Z)V", "T", "shouldApply", "Lkotlin/Function1;", "func", "applyIf", "(Ljava/lang/Object;ZLp/iu30;)Ljava/lang/Object;", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;)Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "Landroid/os/Handler;", "Z", "Lp/tif1;", "traceLog", "Lp/tif1;", "Companion", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class RemoteNativeRxRouter implements RxRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TRACE_LOG_GROUP = "esperanto";
    private final boolean dispatchOnComputationScheduler;
    private final Handler handler;
    private final RemoteNativeRouter router;
    private final tif1 traceLog;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRxRouter$Companion;", "", "<init>", "()V", "TRACE_LOG_GROUP", "", "isSubscription", "", "request", "Lcom/spotify/cosmos/cosmos/Request;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSubscription(Request request) {
            return Request.SUB.equals(request.getAction());
        }

        private Companion() {
        }
    }

    public RemoteNativeRxRouter(RemoteNativeRouter remoteNativeRouter, Handler handler, boolean z) {
        this.router = remoteNativeRouter;
        this.handler = handler;
        this.dispatchOnComputationScheduler = z;
        this.traceLog = gex0.f();
    }

    private final <T> T applyIf(T t, boolean z, iu30 iu30Var) {
        return z ? (T) iu30Var.invoke(t) : t;
    }

    @Override // com.spotify.cosmos.rxrouter.RxRouter
    public io.reactivex.rxjava3.core.Observable<Response> resolve(final Request request) {
        return (io.reactivex.rxjava3.core.Observable) applyIf(io.reactivex.rxjava3.core.Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter.resolve.1
            public final void subscribe(final io.reactivex.rxjava3.core.ObservableEmitter<Response> observableEmitter) {
                ResolverCallbackReceiver.Companion companion = ResolverCallbackReceiver.INSTANCE;
                Handler handler = RemoteNativeRxRouter.this.handler;
                final Request request2 = request;
                final RemoteNativeRxRouter remoteNativeRxRouter = RemoteNativeRxRouter.this;
                ResolverCallbackReceiver<T> resolverCallbackReceiverForAny = companion.forAny(handler, new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter$resolve$1$callbackReceiver$1
                    public final void accept(Response response) {
                        if (observableEmitter.isDisposed()) {
                            return;
                        }
                        observableEmitter.onNext(response);
                        if (!RemoteNativeRxRouter.INSTANCE.isSubscription(request2)) {
                            observableEmitter.onComplete();
                        }
                        String uri = request2.getUri();
                        if (uri != null) {
                            remoteNativeRxRouter.traceLog.f(uri, "esperanto");
                        }
                    }
                }, new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter$resolve$1$callbackReceiver$2
                    public final void accept(Throwable th) {
                        if (observableEmitter.isDisposed()) {
                            return;
                        }
                        ObservableEmitter<Response> observableEmitter2 = observableEmitter;
                        if (th != null) {
                            observableEmitter2.onError(th);
                        } else {
                            eg.m("Required value was null.");
                        }
                    }
                });
                if (RemoteNativeRxRouter.this.router == null) {
                    eg.m("Required value was null.");
                    return;
                }
                String uri = request.getUri();
                if (uri != null) {
                    tif1.a(RemoteNativeRxRouter.this.traceLog, uri, RemoteNativeRxRouter.TRACE_LOG_GROUP, 4);
                }
                RemoteNativeRouter remoteNativeRouter = RemoteNativeRxRouter.this.router;
                String action = request.getAction();
                if (action == null) {
                    eg.m("Required value was null.");
                    return;
                }
                String uri2 = request.getUri();
                if (uri2 == null) {
                    eg.m("Required value was null.");
                } else {
                    final Lifetime lifetimeResolve = remoteNativeRouter.resolve(action, uri2, request.getHeaders(), request.getBody(), resolverCallbackReceiverForAny);
                    observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter.resolve.1.2
                        public final void cancel() {
                            lifetimeResolve.release();
                        }
                    });
                }
            }
        }), this.dispatchOnComputationScheduler, Observable.INSTANCE);
    }

    /* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter$resolve$2, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000¢\u0006\u0002\b\u0002*\u0012\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lio/reactivex/rxjava3/core/Observable;)Lio/reactivex/rxjava3/core/Observable;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class Observable extends hab0 implements iu30 {
        public static final Observable INSTANCE = new Observable();

        public Observable() {
            super(1);
        }

        public final io.reactivex.rxjava3.core.Observable<Response> invoke(io.reactivex.rxjava3.core.Observable<Response> observable) {
            return observable.observeOn(Schedulers.b);
        }
    }

    public RemoteNativeRxRouter(RemoteNativeRouter remoteNativeRouter, boolean z) {
        this(remoteNativeRouter, null, z);
    }
}
