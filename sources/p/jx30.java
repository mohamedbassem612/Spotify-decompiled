package p;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class jx30 implements n8d0 {
    public final n8d0 a;
    public mzc b;

    public jx30() {
        this.a = upn1.t(new laz(this, (byte) 12));
    }

    public static jx30 a(n8d0 n8d0Var) {
        return n8d0Var instanceof jx30 ? (jx30) n8d0Var : new jx30(n8d0Var);
    }

    public final void b(Runnable runnable, Executor executor) {
        this.a.b(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public jx30(n8d0 n8d0Var) {
        n8d0Var.getClass();
        this.a = n8d0Var;
    }
}
