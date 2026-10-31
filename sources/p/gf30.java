package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class gf30 implements c291 {
    public final c291 a;

    public gf30(c291 c291Var) {
        this.a = c291Var;
    }

    @Override // p.c291
    public void B0(nac nacVar, long j) {
        this.a.B0(nacVar, j);
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // p.c291, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // p.c291
    public final gve1 l() {
        return this.a.l();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
