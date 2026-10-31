package p;

import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ncl implements f961 {
    public final a8n a;
    public final SharedCosmosRouterApi b;
    public final obl c;
    public final AnalyticsDelegate d;
    public final AuthenticatedScopeConfiguration e;
    public final ph61 f;
    public final pmy0 g;
    public final lmy0 h;
    public final i420 i;
    public NativeAuthenticatedScope t;

    public ncl(a8n a8nVar, SharedCosmosRouterApi sharedCosmosRouterApi, obl oblVar, AnalyticsDelegate analyticsDelegate, AuthenticatedScopeConfiguration authenticatedScopeConfiguration, ph61 ph61Var, pmy0 pmy0Var, lmy0 lmy0Var, i420 i420Var) {
        this.a = a8nVar;
        this.b = sharedCosmosRouterApi;
        this.c = oblVar;
        this.d = analyticsDelegate;
        this.e = authenticatedScopeConfiguration;
        this.f = ph61Var;
        this.g = pmy0Var;
        this.h = lmy0Var;
        this.i = i420Var;
        ((d8n) a8nVar).c.runBlocking(new g54(this, (byte) 4));
        lmy0Var.b.m((Object) null, lmy0Var.a.invoke());
    }

    public final void shutdown() {
        this.h.b.l((Object) null);
        ((d8n) this.a).c.runBlocking(new s10(this, (byte) 27));
    }

    public final Object getApi() {
        return this;
    }
}
