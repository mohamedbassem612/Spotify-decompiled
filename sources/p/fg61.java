package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fg61 implements eg61 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg61(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.eg61
    public final void a(ca61 ca61Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).d(tho1.z((b4e) ca61Var), i);
                break;
            default:
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.g(i);
                break;
        }
    }

    @Override // p.eg61
    public final void b(ca61 ca61Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).l(tho1.z((b4e) ca61Var));
                break;
            default:
                txo1.h().a("onSessionStarting", new Object[0]);
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                if (txo1Var.l() != null) {
                    txo1.h().c("Start a session while there's already an active session. Create a new one.", new Object[0]);
                }
                txo1Var.c();
                qzo1 qzo1VarL = txo1Var.l();
                txo1Var.i().a(txo1Var.j().b(qzo1VarL), 221);
                break;
        }
    }

    @Override // p.eg61
    public final void c(ca61 ca61Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).j(tho1.z((b4e) ca61Var), i);
                break;
            default:
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.g(i);
                break;
        }
    }

    @Override // p.eg61
    public final void d(ca61 ca61Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).e(tho1.z((b4e) ca61Var));
                break;
            default:
                ((txo1) obj).m((b4e) ca61Var);
                break;
        }
    }

    @Override // p.eg61
    public final void e(ca61 ca61Var, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).i(tho1.z((b4e) ca61Var), str);
                break;
            default:
                txo1.h().a("onSessionResuming with sessionId = %s", str);
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.e(txo1Var.k(), str);
                zod.s(txo1Var.l());
                txo1Var.i().a(txo1Var.j().c(txo1Var.l()), 226);
                break;
        }
    }

    @Override // p.eg61
    public final void f(ca61 ca61Var, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).h(tho1.z((b4e) ca61Var), z);
                break;
            default:
                pue0 pue0Var = txo1.i;
                txo1.h().a("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.d();
                zod.s(txo1Var.l());
                txo1Var.i().a(txo1Var.j().d(txo1Var.l(), z), 227);
                txo1Var.f();
                txo1Var.a();
                break;
        }
    }

    @Override // p.eg61
    public final void g(ca61 ca61Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).g(tho1.z((b4e) ca61Var), i);
                break;
            default:
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.g(i);
                break;
        }
    }

    @Override // p.eg61
    public final void h(ca61 ca61Var, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).k(tho1.z((b4e) ca61Var), str);
                break;
            default:
                txo1.h().a("onSessionStarted with sessionId = %s", str);
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.d();
                txo1Var.l().f = str;
                txo1Var.i().a(txo1Var.j().a(txo1Var.l()), 222);
                txo1Var.f();
                txo1Var.a();
                break;
        }
    }

    @Override // p.eg61
    public final void i(ca61 ca61Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wcr) obj).m(tho1.z((b4e) ca61Var), i);
                break;
            default:
                pue0 pue0Var = txo1.i;
                txo1.h().a("onSessionSuspended with reason = %d", Integer.valueOf(i));
                txo1 txo1Var = (txo1) obj;
                txo1Var.m((b4e) ca61Var);
                txo1Var.d();
                zod.s(txo1Var.l());
                txo1Var.i().a(txo1Var.j().e(txo1Var.l(), i), 225);
                txo1Var.f();
                txo1Var.b();
                break;
        }
    }
}
