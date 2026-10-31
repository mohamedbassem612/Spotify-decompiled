package com.spotify.cosmos.rxrouter;

import kotlin.Metadata;
import p.dg30;
import p.f0i;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/rxrouter/RxRouterActivityModule;", "", "Companion", "src_main_java_com_spotify_cosmos_rxrouter-rxrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface RxRouterActivityModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/cosmos/rxrouter/RxRouterActivityModule$Companion;", "", "<init>", "()V", "Lcom/spotify/cosmos/rxrouter/RxRouterProvider;", "provider", "Lp/dg30;", "activity", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "provideRouter", "(Lcom/spotify/cosmos/rxrouter/RxRouterProvider;Lp/dg30;)Lcom/spotify/cosmos/rxrouter/RxRouter;", "src_main_java_com_spotify_cosmos_rxrouter-rxrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RxRouter provideRouter(RxRouterProvider provider, dg30 activity) {
            return provider.provideWithLifecycle(((f0i) activity).a);
        }
    }
}
