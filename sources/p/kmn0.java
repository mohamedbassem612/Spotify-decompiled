package p;

import com.spotify.authentication.oauthsetupimpl.NativeOAuthSetupImpl;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kmn0 implements f961 {
    public final a8n a;
    public final c8n b;
    public NativeOAuthSetupImpl c;
    public d520 d;

    public kmn0(ajg ajgVar, tg8 tg8Var, obl oblVar, SharedCosmosRouterApi sharedCosmosRouterApi, xz11 xz11Var, yqg yqgVar, a8n a8nVar, c8n c8nVar) {
        this.a = a8nVar;
        this.b = c8nVar;
        w54 w54Var = new w54(xz11Var);
        ((d8n) a8nVar).c.runBlocking(new jmn0(tg8Var, this, oblVar, sharedCosmosRouterApi, w54Var.a(), kln1.A(w54Var.b()), yqgVar, ajgVar));
    }

    public final NativeOAuthSetupImpl a() {
        NativeOAuthSetupImpl nativeOAuthSetupImpl = this.c;
        if (nativeOAuthSetupImpl != null) {
            return nativeOAuthSetupImpl;
        }
        u890.C("nativeOAuthSetup");
        throw null;
    }

    public final void shutdown() {
        d520 d520Var = this.d;
        if (d520Var == null) {
            u890.C("accessTokenClient");
            throw null;
        }
        d520Var.D().set(true);
        ((d8n) this.a).c.runBlocking(new an90(this, (byte) 13));
    }

    public final Object getApi() {
        return this;
    }
}
