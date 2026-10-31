package com.spotify.cosmos.cosmonautdi;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import p.kly0;
import p.loc1;
import p.nfa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosDeps;", "", "Lp/kly0;", "Lio/reactivex/rxjava3/core/Scheduler;", "ioSchedulerProvider", "Lp/loc1;", "Lcom/spotify/cosmos/cosmos/Response;", "subscriptionTrackerProvider", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouterProvider", "Lp/nfa0;", "jsonProvider", "<init>", "(Lp/kly0;Lp/kly0;Lp/kly0;Lp/kly0;)V", "Lp/kly0;", "getIoSchedulerProvider", "()Lp/kly0;", "getIoSchedulerProvider$annotations", "()V", "getSubscriptionTrackerProvider", "getRxRouterProvider", "getJsonProvider", "getJsonProvider$annotations", "getIoScheduler", "()Lio/reactivex/rxjava3/core/Scheduler;", "ioScheduler", "getSubscriptionTracker", "()Lp/loc1;", "subscriptionTracker", "getRxRouter", "()Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "getJson", "()Lp/nfa0;", "json", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CosmosDeps {
    private final kly0 ioSchedulerProvider;
    private final kly0 jsonProvider;
    private final kly0 rxRouterProvider;
    private final kly0 subscriptionTrackerProvider;

    public CosmosDeps(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4) {
        this.ioSchedulerProvider = kly0Var;
        this.subscriptionTrackerProvider = kly0Var2;
        this.rxRouterProvider = kly0Var3;
        this.jsonProvider = kly0Var4;
    }

    public static /* synthetic */ void getIoSchedulerProvider$annotations() {
    }

    public static /* synthetic */ void getJsonProvider$annotations() {
    }

    public final Scheduler getIoScheduler() {
        return (Scheduler) this.ioSchedulerProvider.get();
    }

    public final kly0 getIoSchedulerProvider() {
        return this.ioSchedulerProvider;
    }

    public final nfa0 getJson() {
        return (nfa0) this.jsonProvider.get();
    }

    public final kly0 getJsonProvider() {
        return this.jsonProvider;
    }

    public final RxRouter getRxRouter() {
        return (RxRouter) this.rxRouterProvider.get();
    }

    public final kly0 getRxRouterProvider() {
        return this.rxRouterProvider;
    }

    public final loc1 getSubscriptionTracker() {
        return (loc1) this.subscriptionTrackerProvider.get();
    }

    public final kly0 getSubscriptionTrackerProvider() {
        return this.subscriptionTrackerProvider;
    }
}
