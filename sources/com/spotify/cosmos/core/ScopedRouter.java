package com.spotify.cosmos.core;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dm61;
import p.eg;
import p.l811;
import p.o7h;
import p.rku;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter;", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "Lcom/spotify/cosmos/servicebasedrouter/ScopeConnector;", "scopeConnector", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/ScopeConnector;)V", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState;", "Lkotlin/jvm/internal/EnhancedNullability;", "routerState", "(Lcom/spotify/cosmos/servicebasedrouter/ScopeConnector;)Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lcom/spotify/cosmos/cosmos/Response;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;)Lio/reactivex/rxjava3/core/Observable;", "routerStateObservable", "Lio/reactivex/rxjava3/core/Observable;", "Companion", "RouterState", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ScopedRouter implements RxRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> IDEMPOTENT_ACTIONS = dm61.z0(new String[]{Request.GET, Request.SUB});
    private final Observable<RouterState> routerStateObservable;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$Companion;", "", "<init>", "()V", "IDEMPOTENT_ACTIONS", "", "", "getIDEMPOTENT_ACTIONS", "()Ljava/util/Set;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getIDEMPOTENT_ACTIONS() {
            return ScopedRouter.IDEMPOTENT_ACTIONS;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState;", "", "Available", "NotAvailable", "Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState$Available;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState$NotAvailable;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public interface RouterState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState$Available;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState;", "router", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "<init>", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)V", "getRouter", "()Lcom/spotify/cosmos/rxrouter/RxRouter;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
        public static final class Available implements RouterState {
            private final RxRouter router;

            public Available(RxRouter rxRouter) {
                this.router = rxRouter;
            }

            public final RxRouter getRouter() {
                return this.router;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState$NotAvailable;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedRouter$RouterState;", "<init>", "()V", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
        public static final class NotAvailable implements RouterState {
            public static final NotAvailable INSTANCE = new NotAvailable();

            private NotAvailable() {
            }
        }
    }

    public ScopedRouter(ScopeConnector scopeConnector) {
        this.routerStateObservable = routerState(scopeConnector).replay(1).f();
    }

    private final Observable<RouterState> routerState(final ScopeConnector scopeConnector) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter.routerState.1
            public final void subscribe(io.reactivex.rxjava3.core.ObservableEmitter<RouterState> observableEmitter) {
                observableEmitter.setDisposable(scopeConnector.subscribe(new ScopedRouter$routerState$1$disposable$1(observableEmitter), new ScopedRouter$routerState$1$disposable$2(observableEmitter)));
            }
        });
    }

    @Override // com.spotify.cosmos.rxrouter.RxRouter
    public Observable<Response> resolve(final Request request) {
        final boolean zI0 = o7h.i0(IDEMPOTENT_ACTIONS, request.getAction());
        return Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter.resolve.1
            public final void subscribe(final io.reactivex.rxjava3.core.ObservableEmitter<Response> observableEmitter) {
                final rku rkuVar = new rku();
                final l811 l811Var = new l811();
                l811Var.a = true;
                Observable observable = ScopedRouter.this.routerStateObservable;
                final Request request2 = request;
                final boolean z = zI0;
                final Disposable disposableSubscribe = observable.subscribe(new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter$resolve$1$routerDisposable$1
                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public final void accept(ScopedRouter.RouterState routerState) throws NoWhenBranchMatchedException {
                        if (!(routerState instanceof ScopedRouter.RouterState.Available)) {
                            if (routerState.equals(ScopedRouter.RouterState.NotAvailable.INSTANCE)) {
                                rkuVar.a();
                                return;
                            } else {
                                eg.o();
                                return;
                            }
                        }
                        if (l811Var.a) {
                            rku rkuVar2 = rkuVar;
                            Observable<Response> observableResolve = ((ScopedRouter.RouterState.Available) routerState).getRouter().resolve(request2);
                            final Request request3 = request2;
                            final ObservableEmitter<Response> observableEmitter2 = observableEmitter;
                            Consumer consumer = new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter$resolve$1$routerDisposable$1.1
                                public final void accept(Response response) {
                                    if (!ScopedRouterKt.isSuccessful(response)) {
                                        Logger.b("error processing response for " + request3 + ", response: " + response, new Object[0]);
                                    }
                                    observableEmitter2.onNext(response);
                                }
                            };
                            final ObservableEmitter<Response> observableEmitter3 = observableEmitter;
                            observableEmitter3.getClass();
                            Consumer consumer2 = new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter$resolve$1$routerDisposable$1.2
                                public final void accept(Throwable th) {
                                    observableEmitter3.onError(th);
                                }
                            };
                            final ObservableEmitter<Response> observableEmitter4 = observableEmitter;
                            observableEmitter4.getClass();
                            rkuVar2.b(observableResolve.subscribe(consumer, consumer2, new Action() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter$resolve$1$routerDisposable$1.3
                                public final void run() {
                                    observableEmitter4.onComplete();
                                }
                            }));
                            l811Var.a = z;
                        }
                    }
                });
                observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedRouter.resolve.1.1
                    public final void cancel() {
                        disposableSubscribe.dispose();
                        rkuVar.a();
                    }
                });
            }
        });
    }
}
