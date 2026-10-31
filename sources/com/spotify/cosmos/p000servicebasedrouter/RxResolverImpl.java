package com.spotify.cosmos.p000servicebasedrouter;

import android.os.Handler;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.hoc1;
import p.kly0;
import p.loc1;
import p.yt91;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RxResolverImpl;", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "Lp/kly0;", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "router", "Lio/reactivex/rxjava3/core/Scheduler;", "ioScheduler", "Lp/loc1;", "Lcom/spotify/cosmos/cosmos/Response;", "subscriptionTrackerProvider", "<init>", "(Lp/kly0;Lio/reactivex/rxjava3/core/Scheduler;Lp/kly0;)V", "Lcom/spotify/cosmos/cosmos/Request;", "request", "requestWithoutConnectedUpstream", "(Lcom/spotify/cosmos/cosmos/Request;)Lio/reactivex/rxjava3/core/Observable;", "initSubscriptionTrackerIfNull", "()Lp/loc1;", "resolve", "", "Lp/hoc1;", "unsubscribeAndReturnLeaks", "()Ljava/util/List;", "Lp/kly0;", "Lio/reactivex/rxjava3/core/Scheduler;", "getIoScheduler$annotations", "()V", "subscriptionTracker", "Lp/loc1;", "Companion", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RxResolverImpl implements RxRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Scheduler ioScheduler;
    private final kly0 router;
    private loc1 subscriptionTracker;
    private final kly0 subscriptionTrackerProvider;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RxResolverImpl$Companion;", "", "<init>", "()V", "performRequest", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "router", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "request", "Lcom/spotify/cosmos/cosmos/Request;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Observable<Response> performRequest(final RemoteNativeRouter router, final Request request) {
            final boolean zEquals = "SUB".equals(request.getAction());
            return Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.cosmos.servicebasedrouter.RxResolverImpl$Companion$performRequest$1
                public final void subscribe(final io.reactivex.rxjava3.core.ObservableEmitter<Response> observableEmitter) {
                    RemoteNativeRouter remoteNativeRouter = router;
                    String action = request.getAction();
                    if (action == null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    String uri = request.getUri();
                    if (uri == null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    Map headers = request.getHeaders();
                    byte[] body = request.getBody();
                    ResolverCallbackReceiver.Companion companion = ResolverCallbackReceiver.Companion;
                    final boolean z = zEquals;
                    final Lifetime lifetimeResolve = remoteNativeRouter.resolve(action, uri, headers, body, companion.forAny((Handler) null, new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.RxResolverImpl$Companion$performRequest$1$lifetime$1
                        public final void accept(com.spotify.cosmos.cosmos.Response response) {
                            if (observableEmitter.isDisposed()) {
                                return;
                            }
                            observableEmitter.onNext(response);
                            if (z) {
                                return;
                            }
                            observableEmitter.onComplete();
                        }
                    }, new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.RxResolverImpl$Companion$performRequest$1$lifetime$2
                        public final void accept(Throwable th) {
                            if (observableEmitter.isDisposed()) {
                                return;
                            }
                            observableEmitter.onError(th);
                        }
                    }));
                    observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.cosmos.servicebasedrouter.RxResolverImpl$Companion$performRequest$1.1
                        public final void cancel() {
                            lifetimeResolve.release();
                        }
                    });
                }
            });
        }

        private Companion() {
        }
    }

    public RxResolverImpl(kly0 kly0Var, Scheduler scheduler, kly0 kly0Var2) {
        this.router = kly0Var;
        this.ioScheduler = scheduler;
        this.subscriptionTrackerProvider = kly0Var2;
    }

    private static /* synthetic */ void getIoScheduler$annotations() {
    }

    private final loc1 initSubscriptionTrackerIfNull() {
        loc1 loc1Var = this.subscriptionTracker;
        if (loc1Var == null) {
            loc1Var = (loc1) this.subscriptionTrackerProvider.get();
            this.subscriptionTracker = loc1Var;
        }
        if (loc1Var != null) {
            return loc1Var;
        }
        eg.m("Required value was null.");
        return null;
    }

    private final Observable<Response> requestWithoutConnectedUpstream(final Request request) {
        return ((Observable) this.router.get()).firstOrError().observeOn(this.ioScheduler).toObservable().switchMap(new Function() { // from class: com.spotify.cosmos.servicebasedrouter.RxResolverImpl.requestWithoutConnectedUpstream.1
            public final ObservableSource<? extends Response> apply(RemoteNativeRouter remoteNativeRouter) {
                return RxResolverImpl.INSTANCE.performRequest(remoteNativeRouter, request);
            }
        });
    }

    public Observable<Response> resolve(Request request) {
        loc1 loc1VarInitSubscriptionTrackerIfNull = initSubscriptionTrackerIfNull();
        String str = String.format("RxResolverImpl: %s", Arrays.copyOf(new Object[]{request}, 1));
        Observable<Response> observableRequestWithoutConnectedUpstream = requestWithoutConnectedUpstream(request);
        loc1VarInitSubscriptionTrackerIfNull.getClass();
        return Observable.create(new yt91(loc1VarInitSubscriptionTrackerIfNull, str, observableRequestWithoutConnectedUpstream, (byte) 29));
    }

    public final List<hoc1> unsubscribeAndReturnLeaks() {
        return initSubscriptionTrackerIfNull().c();
    }
}
