package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dgu extends Scheduler.Worker {
    public final long a;
    public final q8n b;
    public final j0d1 c;
    public final llm d;
    public final bbc e;

    public dgu(long j, q8n q8nVar, j0d1 j0d1Var) {
        this.a = j;
        this.b = q8nVar;
        j0d1 j0d1VarA = guo1.A(j0d1Var);
        this.c = j0d1VarA;
        llm llmVarE = smo1.e(ha71.A(j0d1VarA, q8nVar));
        this.d = llmVarE;
        this.e = mno1.a(Integer.MAX_VALUE, 0, 6);
        c921.y(llmVarE, (o8n) null, 0, new cgu(this, (lnm) null), 3);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
        return w0h1.F(this.d, runnable, timeUnit.toMillis(j), new z94(this, (byte) 1));
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.e.H(null);
        this.c.d(null);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return !smo1.u(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" (worker ");
        sb.append(this.a);
        sb.append(", ");
        return gvg.k(sb, isDisposed() ? "disposed" : "active", ')');
    }
}
