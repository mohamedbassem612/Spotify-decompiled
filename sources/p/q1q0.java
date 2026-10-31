package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q1q0 implements hhd {
    public final m1q0 a;
    public final /* synthetic */ r1q0 b;

    public q1q0(r1q0 r1q0Var, m1q0 m1q0Var) {
        this.b = r1q0Var;
        this.a = m1q0Var;
    }

    @Override // p.hhd
    public final void cancel() {
        r1q0 r1q0Var = this.b;
        n36 n36Var = r1q0Var.b;
        m1q0 m1q0Var = this.a;
        n36Var.remove(m1q0Var);
        if (u890.j(r1q0Var.c, m1q0Var)) {
            m1q0Var.a();
            r1q0Var.c = null;
        }
        m1q0Var.b.remove(this);
        Function0 function0 = m1q0Var.c;
        if (function0 != null) {
            function0.invoke();
        }
        m1q0Var.c = null;
    }
}
