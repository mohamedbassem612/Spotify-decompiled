package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class za91 implements AutoCloseable {
    public final g9x a;
    public final Object b;
    public final mta c = new mta((byte) 10);

    public za91(g9x g9xVar, long j) {
        this.a = g9xVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public void a() {
    }
}
