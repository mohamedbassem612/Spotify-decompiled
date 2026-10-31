package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cqw implements xsw {
    public final tl7 a;
    public final Function0 b;
    public final Function0 c;
    public boolean d;
    public rl7 e;
    public rl7 f;
    public m511 g;
    public final bqw h = new bqw(this);

    public cqw(tl7 tl7Var, wsw wswVar, Function0 function0, Function0 function1) {
        this.a = tl7Var;
        this.b = function0;
        this.c = function1;
    }

    @Override // p.xsw
    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            sl7 sl7Var = this.h;
            tl7 tl7Var = this.a;
            if (z) {
                tl7Var.c(sl7Var);
                c(false);
                return;
            }
            rl7 rl7Var = this.f;
            if (rl7Var != null) {
                tl7Var.e(rl7Var);
            }
            this.f = null;
            tl7Var.a(sl7Var);
            this.c.invoke();
        }
    }

    public final void b(String str) {
        rl7 rl7Var = this.e;
        if (u890.j(str, rl7Var != null ? rl7Var.a : null)) {
            return;
        }
        rl7 rl7Var2 = this.f;
        if (rl7Var2 != null) {
            this.a.e(rl7Var2);
        }
        this.f = null;
        this.g = null;
        this.e = str != null ? new rl7(str) : null;
        c(false);
    }

    public final void c(boolean z) {
        rl7 rl7Var = this.e;
        m511 m511Var = this.g;
        boolean z2 = this.d;
        tl7 tl7Var = this.a;
        if (!z2 || rl7Var == null || m511Var == null) {
            rl7 rl7Var2 = this.f;
            if (rl7Var2 != null) {
                tl7Var.e(rl7Var2);
            }
            this.f = null;
            return;
        }
        boolean zJ = u890.j(this.f, rl7Var);
        if (!zJ) {
            tl7Var.b(rl7Var);
            this.f = rl7Var;
        }
        if (!zJ || z) {
            tl7Var.j(rl7Var, new jen0(m511Var.a, m511Var.b, m511Var.c, m511Var.d));
        }
    }

    @Override // p.xsw
    public final void onNext(Object obj) {
        m511 m511Var = this.g;
        m511 m511Var2 = ((tsw) obj).a;
        if (u890.j(m511Var, m511Var2)) {
            return;
        }
        this.g = m511Var2;
        c(true);
    }
}
