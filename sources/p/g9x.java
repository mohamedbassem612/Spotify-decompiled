package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g9x implements AutoCloseable {
    public static final g9x c;
    public static esw0 d;
    public static final f9x e;
    public final Object a;
    public volatile boolean b;

    static {
        g9x g9xVar = new g9x();
        c = g9xVar;
        k7x k7xVar = new k7x(g9xVar);
        d = k7xVar;
        e = new f9x(-1L, -1L, "Empty Thread", k7xVar);
        nsh.a.incrementAndGet();
    }

    public g9x() {
        h9x h9xVar = h9x.a;
        this.a = new Object();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        h9x.a.close();
    }
}
