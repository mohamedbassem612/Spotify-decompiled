package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pfs {
    public final AtomicReference a;

    public pfs(lik1 lik1Var, tzo tzoVar) {
        this.a = new AtomicReference(new yol0(((p6r0) tzoVar.b).c, lik1Var.a));
    }

    public final yol0 a() {
        return (yol0) this.a.get();
    }
}
