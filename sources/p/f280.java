package p;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f280 implements n8d0 {
    public static final f280 b = new f280(null);
    public static final bub0 c = new bub0(f280.class);
    public final Object a;

    public f280(Object obj) {
        this.a = obj;
    }

    public final void b(Runnable runnable, Executor executor) {
        dm5.s(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return td6.l(sb, this.a, "]]");
    }

    public final Object get() {
        return this.a;
    }
}
