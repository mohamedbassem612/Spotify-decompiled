package com.spotify.cosmos.p000servicebasedrouter;

import com.spotify.cosmos.observability.CosmosRequestObserver;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/Cosmos;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Cosmos {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/Cosmos$Companion;", "", "<init>", "()V", "Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "observer", "Lp/rih1;", "setObserver", "(Lcom/spotify/cosmos/observability/CosmosRequestObserver;)V", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setObserver(CosmosRequestObserver observer) {
            RemoteNativeRouter.Companion.setObserver(observer);
        }

        private Companion() {
        }
    }

    public static final void setObserver(CosmosRequestObserver cosmosRequestObserver) {
        INSTANCE.setObserver(cosmosRequestObserver);
    }
}
