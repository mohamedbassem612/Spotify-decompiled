package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b3s extends gm00 implements Executor {
    public static final b3s c = new b3s();
    public static final q8n d;

    static {
        bjh1 bjh1Var = bjh1.c;
        int iL = fyo1.l();
        if (64 >= iL) {
            iL = 64;
        }
        d = bjh1Var.M(fyo1.s(iL, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // p.q8n
    public final q8n M(int i) {
        return bjh1.c.M(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(o6x.a, runnable);
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        d.h(o8nVar, runnable);
    }

    @Override // p.q8n
    public final void q(o8n o8nVar, Runnable runnable) {
        d.q(o8nVar, runnable);
    }

    @Override // p.q8n
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p.gm00
    public final Executor N() {
        return this;
    }
}
