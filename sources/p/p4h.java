package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p4h implements f961 {
    public final b2p a;
    public final b2p b;
    public final b2p c;
    public final llm d;

    public p4h(b2p b2pVar, b2p b2pVar2, b2p b2pVar3, q8n q8nVar) {
        this.a = b2pVar;
        this.b = b2pVar2;
        this.c = b2pVar3;
        this.d = smo1.e(q8nVar);
    }

    public final void shutdown() {
        smo1.p(this.d, (CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
