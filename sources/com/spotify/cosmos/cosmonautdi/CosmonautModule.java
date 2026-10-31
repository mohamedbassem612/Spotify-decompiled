package com.spotify.cosmos.cosmonautdi;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.rxrouter.RxRouter;
import kotlin.Metadata;
import p.nfa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmonautModule;", "", "Companion", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface CosmonautModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmonautModule$Companion;", "", "<init>", "()V", "Lp/nfa0;", "json", "Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "provideCosmonautFactory", "(Lp/nfa0;)Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "cosmonautFactory", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "provideCosmonaut", "(Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;Lcom/spotify/cosmos/rxrouter/RxRouter;)Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Cosmonaut provideCosmonaut(CosmonautFactory cosmonautFactory, RxRouter rxRouter) {
            return cosmonautFactory.provideCosmonaut(rxRouter);
        }

        public final CosmonautFactory provideCosmonautFactory(nfa0 json) {
            return new CosmonautFactoryImpl(json);
        }
    }
}
