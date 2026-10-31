package com.spotify.cosmos.core;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.servicebasedrouter.CosmosServiceRxRouter;
import java.util.Arrays;
import kotlin.Metadata;
import p.dem1;
import p.hoc1;
import p.iac0;
import p.n57;
import p.o5s;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RouterLifecycleObserver;", "Lp/o5s;", "Lcom/spotify/cosmos/servicebasedrouter/CosmosServiceRxRouter;", "serviceRxRouter", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/CosmosServiceRxRouter;)V", "Lp/rih1;", "unsubscribeAndReportLeaks", "()V", "Lp/iac0;", "owner", "onStart", "(Lp/iac0;)V", "onStop", "Lcom/spotify/cosmos/servicebasedrouter/CosmosServiceRxRouter;", "", "entered", "Z", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class RouterLifecycleObserver implements o5s {
    private boolean entered;
    private final CosmosServiceRxRouter serviceRxRouter;

    public RouterLifecycleObserver(CosmosServiceRxRouter cosmosServiceRxRouter) {
        this.serviceRxRouter = cosmosServiceRxRouter;
    }

    private final void unsubscribeAndReportLeaks() {
        for (hoc1 hoc1Var : this.serviceRxRouter.unsubscribeAndReturnLeaks()) {
            n57.q(hoc1Var.a(String.format("Possible leaked subscription detected. Leaked subscription detected during lifecycle stop: %s. Subscription was originally created here:", Arrays.copyOf(new Object[]{hoc1Var.b()}, 1))));
        }
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onCreate(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onDestroy(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onPause(iac0 iac0Var) {
    }

    @Override // p.o5s
    public /* bridge */ /* synthetic */ void onResume(iac0 iac0Var) {
    }

    @Override // p.o5s
    public void onStart(iac0 owner) {
        dem1.v();
        if (this.entered) {
            return;
        }
        Logger.g("Starting CosmosServiceRxRouter", new Object[0]);
        this.serviceRxRouter.start();
        this.entered = true;
    }

    @Override // p.o5s
    public void onStop(iac0 owner) {
        dem1.v();
        if (this.entered) {
            this.serviceRxRouter.stop();
            this.entered = false;
            unsubscribeAndReportLeaks();
        }
    }
}
