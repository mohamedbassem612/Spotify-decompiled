package p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qj5 implements Executor {
    public final /* synthetic */ byte a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;
    public final Executor e;

    public qj5(ExecutorService executorService) {
        this.a = (byte) 1;
        this.e = executorService;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        Runnable runnable = (Runnable) this.b.poll();
                        this.c = runnable;
                        if (runnable != null) {
                            ((n5u) this.e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.b.poll();
                this.c = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.e).execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        this.b.add(new ny2(this, runnable, (byte) 5));
                        if (this.c == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.d) {
                    try {
                        this.b.add(new aih0(this, runnable, false, (byte) 23));
                        if (this.c == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public qj5(n5u n5uVar) {
        this.a = (byte) 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = n5uVar;
    }
}
