package p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q7g1 implements Executor {
    public final /* synthetic */ byte a;
    public final Executor b;
    public final Object c;
    public Object d;
    public final Object e;

    public q7g1(Executor executor) {
        this.a = (byte) 0;
        this.b = executor;
        this.c = new ArrayDeque();
        this.e = new Object();
    }

    public void a() {
        synchronized (this.e) {
            Object objPoll = ((ArrayDeque) this.c).poll();
            Runnable runnable = (Runnable) objPoll;
            this.d = runnable;
            if (objPoll != null) {
                this.b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.e) {
                    ((ArrayDeque) this.c).offer(new kro(runnable, this));
                    if (((Runnable) this.d) == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                try {
                    this.b.execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((hfp1) ((y1t0) this.c).b).i()) {
                        ((dp5) this.d).e();
                    } else {
                        ((bsd1) this.e).a(e);
                    }
                    throw e;
                }
        }
    }

    public /* synthetic */ q7g1(Executor executor, y1t0 y1t0Var, dp5 dp5Var, bsd1 bsd1Var) {
        this.a = (byte) 1;
        this.b = executor;
        this.c = y1t0Var;
        this.d = dp5Var;
        this.e = bsd1Var;
    }
}
