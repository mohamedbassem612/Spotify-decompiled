package com.spotify.cosmos.p000servicebasedrouter;

import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import com.spotify.cosmos.servicebasedrouter.RouterLifecycleObserver;
import kotlin.Metadata;
import p.kly0;
import p.x8c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/CosmosServiceRxRouterProvider;", "Lcom/spotify/cosmos/rxrouter/RxRouterProvider;", "Lp/kly0;", "Lcom/spotify/cosmos/servicebasedrouter/CosmosServiceRxRouter;", "routerFactory", "<init>", "(Lp/kly0;)V", "Lp/x8c0;", "lifecycle", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "provideWithLifecycle", "(Lp/x8c0;)Lcom/spotify/cosmos/rxrouter/RxRouter;", "Lp/kly0;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CosmosServiceRxRouterProvider implements RxRouterProvider {
    private final kly0 routerFactory;

    public CosmosServiceRxRouterProvider(kly0 kly0Var) {
        this.routerFactory = kly0Var;
    }

    public RxRouter provideWithLifecycle(x8c0 lifecycle) {
        CosmosServiceRxRouter cosmosServiceRxRouter = (CosmosServiceRxRouter) this.routerFactory.get();
        cosmosServiceRxRouter.getClass();
        lifecycle.a(new RouterLifecycleObserver(cosmosServiceRxRouter));
        return cosmosServiceRxRouter;
    }
}
