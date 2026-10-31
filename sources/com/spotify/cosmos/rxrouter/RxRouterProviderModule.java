package com.spotify.cosmos.rxrouter;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.x8c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/rxrouter/RxRouterProviderModule;", "", "Companion", "src_main_java_com_spotify_cosmos_rxrouter-rxrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface RxRouterProviderModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/cosmos/rxrouter/RxRouterProviderModule$Companion;", "", "<init>", "()V", "provideRxRouterProvider", "Lcom/spotify/cosmos/rxrouter/RxRouterProvider;", "rxRouter", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "src_main_java_com_spotify_cosmos_rxrouter-rxrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RxRouterProvider provideRxRouterProvider(final RxRouter rxRouter) {
            return new RxRouterProvider() { // from class: com.spotify.cosmos.rxrouter.RxRouterProviderModule$Companion$provideRxRouterProvider$1
                @Override // com.spotify.cosmos.rxrouter.RxRouterProvider
                public RxRouter provideWithLifecycle(x8c0 lifecycle) {
                    return rxRouter;
                }
            };
        }
    }
}
