package p;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class djn implements Executor {
    public final ExecutorService a;
    public final Object b = new Object();
    public hfp1 c = o0c.z((Object) null);

    public djn(ExecutorService executorService) {
        this.a = executorService;
    }

    public final hfp1 a(Runnable runnable) {
        hfp1 hfp1VarE;
        synchronized (this.b) {
            hfp1VarE = this.c.e(this.a, new czh(runnable, (byte) 2));
            this.c = hfp1VarE;
        }
        return hfp1VarE;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
