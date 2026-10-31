package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fns extends gm00 {
    public static final fns d;
    public b9n c;

    static {
        int i = jsd1.c;
        int i2 = jsd1.d;
        long j = jsd1.e;
        String str = jsd1.a;
        fns fnsVar = new fns();
        fnsVar.c = new b9n(i, j, str, i2);
        d = fnsVar;
    }

    @Override // p.q8n
    public final q8n M(int i) {
        buo1.u(i);
        return i >= jsd1.c ? this : super.M(i);
    }

    @Override // p.gm00
    public final Executor N() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        b9n.d(this.c, runnable, 6);
    }

    @Override // p.q8n
    public final void q(o8n o8nVar, Runnable runnable) {
        b9n.d(this.c, runnable, 2);
    }

    @Override // p.q8n
    public final String toString() {
        return "Dispatchers.Default";
    }
}
