package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class hf30 implements fka1 {
    public final fka1 a;

    public hf30(fka1 fka1Var) {
        this.a = fka1Var;
    }

    @Override // p.fka1
    public long O0(nac nacVar, long j) {
        return this.a.O0(nacVar, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.a.l();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
