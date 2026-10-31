package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u0c0 implements b1c0 {
    public final Scheduler a;
    public final kdn0 b = new kdn0();

    public u0c0(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final dbr0 a() {
        return (bn70) this.b.e();
    }

    public final void b(String str, zf30 zf30Var) {
        if (!(zf30Var instanceof ug30)) {
            this.b.m((Object) null);
            return;
        }
        tac0 tac0Var = zf30Var.s1;
        vku vkuVar = new vku();
        vkuVar.a(((lir0) zf30Var).c().a.observeOn(this.a).subscribe(new w090(this, str, (byte) 6)));
        tac0Var.a(new wku(vkuVar));
    }

    public final void c(rjp0 rjp0Var) {
        this.b.k(rjp0Var);
    }

    public final void d(rjp0 rjp0Var) {
        this.b.g(rjp0Var);
    }
}
