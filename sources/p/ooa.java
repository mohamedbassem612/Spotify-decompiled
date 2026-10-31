package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ooa implements d0u0 {
    public final t2j0 a;
    public final zwz0 b;
    public final Scheduler c;
    public final kba d;
    public final q8n e;

    public ooa(t2j0 t2j0Var, zwz0 zwz0Var, Scheduler scheduler, kba kbaVar, q8n q8nVar) {
        this.a = t2j0Var;
        this.b = zwz0Var;
        this.c = scheduler;
        this.d = kbaVar;
        this.e = q8nVar;
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        return new noa(m0u0Var, this.b, str, this.a, oot0Var, this.c, this.d, np00Var, this.e);
    }
}
