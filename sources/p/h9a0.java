package p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h9a0 implements Executor {
    public final c9a0 a;
    public final gv40 b = new gv40(this, 8);
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public h9a0(c9a0 c9a0Var) {
        this.a = c9a0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
