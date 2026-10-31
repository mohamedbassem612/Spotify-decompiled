package p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g661 implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final xfz0 c = new xfz0(this, (byte) 10);
    public int d = 1;
    public long e = 0;

    public g661(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.e;
                r7a0 r7a0Var = new r7a0(runnable, (byte) 4);
                this.a.add(r7a0Var);
                this.d = 2;
                try {
                    this.b.execute(this.c);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.a) {
                        try {
                            if (this.e == j && this.d == 2) {
                                this.d = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            int i2 = this.d;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.a.removeLastOccurrence(r7a0Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.a.add(runnable);
        }
    }
}
