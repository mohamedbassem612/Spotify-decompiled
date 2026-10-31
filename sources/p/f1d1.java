package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f1d1 implements y341 {
    public final sk30 a;

    public f1d1(sk30 sk30Var) {
        this.a = sk30Var;
    }

    @Override // p.y341
    public final boolean V0() {
        return this.a.V0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // p.y341
    public final d441 g1(String str) {
        sk30 sk30Var = this.a;
        if (sk30Var.isOpen()) {
            return luo1.n(sk30Var, str);
        }
        vby0.y(21, "connection is closed");
        throw null;
    }
}
