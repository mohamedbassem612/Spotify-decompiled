package com.spotify.cosmos.p000servicebasedrouter;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;
import kotlin.Metadata;
import p.dem1;
import p.eg;
import p.hoc1;
import p.i5w0;
import p.j5;
import p.loc1;
import p.spq0;
import p.xcg1;
import p.yt91;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/CosmosServiceRxRouter;", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient;", "serviceClient", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient;)V", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;)Lio/reactivex/rxjava3/core/Observable;", "Lp/rih1;", "start", "()V", "stop", "", "Lp/hoc1;", "unsubscribeAndReturnLeaks", "()Ljava/util/List;", "Lcom/spotify/cosmos/servicebasedrouter/RxRouterClient;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lp/spq0;", "routerSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lp/loc1;", "subscriptionTracker", "Lp/loc1;", "", "running", "Z", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class CosmosServiceRxRouter implements RxRouter {
    private volatile boolean running;
    private final RxRouterClient serviceClient;
    private final BehaviorSubject<spq0> routerSubject = BehaviorSubject.f();
    private final loc1 subscriptionTracker = new loc1();

    public CosmosServiceRxRouter(RxRouterClient rxRouterClient) {
        this.serviceClient = rxRouterClient;
        rxRouterClient.setListener(new RxRouterClient.Listener() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter.1
            @Override // com.spotify.cosmos.servicebasedrouter.RxRouterClient.Listener
            public void onConnected(RxRouter r) {
                CosmosServiceRxRouter.this.routerSubject.onNext(new i5w0(r));
            }

            @Override // com.spotify.cosmos.servicebasedrouter.RxRouterClient.Listener
            public void onDisconnected() {
                CosmosServiceRxRouter.this.routerSubject.onNext(j5.a);
            }
        });
    }

    public Observable<Response> resolve(final Request request) {
        Single singleSingleOrError = this.routerSubject.filter(new Predicate() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter$resolve$routerSingle$1
            public final boolean test(spq0 spq0Var) {
                return spq0Var.c();
            }
        }).map(new Function() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter$resolve$routerSingle$2
            public final RxRouter apply(spq0 spq0Var) {
                return (RxRouter) spq0Var.b();
            }
        }).take(1L).singleOrError();
        BehaviorSubject<spq0> behaviorSubject = this.routerSubject;
        Observable observableTakeUntil = singleSingleOrError.flatMapObservable(new Function() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter$resolve$response$1
            public final ObservableSource<? extends Response> apply(RxRouter rxRouter) {
                return rxRouter.resolve(request);
            }
        }).takeUntil(behaviorSubject.skipUntil(behaviorSubject.filter(new Predicate() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter$resolve$disconnected$1
            public final boolean test(spq0 spq0Var) {
                return spq0Var.c();
            }
        })).filter(new Predicate() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter$resolve$disconnected$2
            public final boolean test(spq0 spq0Var) {
                return !spq0Var.c();
            }
        }));
        String strI = xcg1.i(request.getAction(), ": ", request.getUri());
        loc1 loc1Var = this.subscriptionTracker;
        loc1Var.getClass();
        return Observable.create(new yt91(loc1Var, strI, observableTakeUntil, (byte) 29)).doOnSubscribe(new Consumer() { // from class: com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter.resolve.1
            public final void accept(io.reactivex.rxjava3.disposables.Disposable disposable) {
                if (CosmosServiceRxRouter.this.running) {
                    return;
                }
                eg.m("The router can only resolve requests while it is started");
            }
        });
    }

    public void start() {
        dem1.v();
        if (this.running) {
            eg.m("Check failed.");
        } else {
            this.running = true;
            this.serviceClient.connect();
        }
    }

    public void stop() {
        dem1.v();
        if (!this.running) {
            eg.m("Check failed.");
        } else {
            this.running = false;
            this.serviceClient.disconnect();
        }
    }

    public synchronized List<hoc1> unsubscribeAndReturnLeaks() {
        return this.subscriptionTracker.c();
    }
}
