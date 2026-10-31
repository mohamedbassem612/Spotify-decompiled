package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lf01 implements AutoCloseable {
    public final xdu a;

    public lf01(xdu xduVar) {
        this.a = xduVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
