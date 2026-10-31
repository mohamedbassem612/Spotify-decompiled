package p;

import com.spotify.connectivity.pubsubsetupv2impl.NativePubSubSetupV2Impl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pmy0 implements f961 {
    public final a8n a;
    public final kmn0 b;
    public final obl c;
    public final c85 d;
    public NativePubSubSetupV2Impl e;

    public pmy0(a8n a8nVar, kmn0 kmn0Var, obl oblVar, c8n c8nVar, azp0 azp0Var, q8n q8nVar, ajg ajgVar) {
        this.a = a8nVar;
        this.b = kmn0Var;
        this.c = oblVar;
        this.d = new c85(azp0Var, q8nVar, c8nVar.a, ajgVar);
        ((d8n) a8nVar).c.runBlocking(new g54(this, (byte) 11));
    }

    public final void shutdown() {
        ((d8n) this.a).c.runBlocking(new an90(this, (byte) 27));
    }

    public final Object getApi() {
        return this;
    }
}
