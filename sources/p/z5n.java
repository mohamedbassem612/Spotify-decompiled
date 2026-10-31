package p;

import com.spotify.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.p000esperantoimpl.SchedulingTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z5n implements Runnable {
    public final /* synthetic */ b6n a;
    public final /* synthetic */ SharedCosmosRouterApi b;

    public z5n(b6n b6nVar, SharedCosmosRouterApi sharedCosmosRouterApi) {
        this.a = b6nVar;
        this.b = sharedCosmosRouterApi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeApplicationScopeImpl.Companion companion = NativeApplicationScopeImpl.INSTANCE;
        b6n b6nVar = this.a;
        NativeApplicationScopeImpl nativeApplicationScopeImplCreate = companion.create(((d8n) b6nVar.a).a, this.b.getNativeRouter(), b6nVar.c.a, b6nVar.d, b6nVar.e, b6nVar.f.a);
        b6nVar.g = nativeApplicationScopeImplCreate;
        z7n z7nVar = b6nVar.b.a;
        if (nativeApplicationScopeImplCreate != null) {
            b6nVar.h = new SchedulingTransport(z7nVar, nativeApplicationScopeImplCreate.serverTimeTransport());
        } else {
            u890.C("nativeCoreApplicationScopeImpl");
            throw null;
        }
    }
}
