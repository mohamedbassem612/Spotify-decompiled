package p;

import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.p000esperantoimpl.SchedulingTransport;
import com.spotify.eventsender.api.EventSenderCoreBridge;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b6n implements f961 {
    public final a8n a;
    public final c8n b;
    public final p5n c;
    public final ApplicationScopeConfiguration d;
    public final EventSenderCoreBridge e;
    public final i420 f;
    public NativeApplicationScopeImpl g;
    public SchedulingTransport h;

    public b6n(a8n a8nVar, c8n c8nVar, p5n p5nVar, ApplicationScopeConfiguration applicationScopeConfiguration, SharedCosmosRouterApi sharedCosmosRouterApi, EventSenderCoreBridge eventSenderCoreBridge, i420 i420Var) {
        this.a = a8nVar;
        this.b = c8nVar;
        this.c = p5nVar;
        this.d = applicationScopeConfiguration;
        this.e = eventSenderCoreBridge;
        this.f = i420Var;
        ((d8n) a8nVar).c.runBlocking(new z5n(this, sharedCosmosRouterApi));
    }

    public final void shutdown() {
        ((d8n) this.a).c.runBlocking(new a6n(this, (byte) 0));
    }

    public final Object getApi() {
        return this;
    }
}
