package p;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u8a0 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;

    public u8a0(w8a0 w8a0Var, Executor executor) {
        this.a = (byte) 0;
        this.b = executor;
        this.c = w8a0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.c;
        Executor executor = this.b;
        switch (b) {
            case 0:
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((w8a0) obj).c(e);
                    return;
                }
                break;
            case 1:
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    ((nw20) obj).v(e2);
                    return;
                }
                break;
            default:
                executor.execute(runnable);
                break;
        }
    }

    public /* synthetic */ u8a0(Executor executor, Object obj, byte b) {
        this.a = b;
        this.b = executor;
        this.c = obj;
    }
}
