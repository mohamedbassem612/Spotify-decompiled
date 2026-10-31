package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u7e0 {
    public final Scheduler a;
    public final q8n b;
    public final lzn0 c;

    public u7e0(Scheduler scheduler, q8n q8nVar, lzn0 lzn0Var) {
        this.a = scheduler;
        this.b = q8nVar;
        this.c = lzn0Var;
    }

    public final v7e0 a(q6e0 q6e0Var, boolean z, String str) {
        return new v7e0(this.a, this.b, this.c, z, str, q6e0Var);
    }
}
