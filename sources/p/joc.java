package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class joc implements ioc {
    public final t45 a;
    public final zle1 b;
    public final String c;
    public final int d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public joc(t45 t45Var, zle1 zle1Var, String str, int i, iac0 iac0Var) {
        this.a = t45Var;
        this.b = zle1Var;
        this.c = str;
        this.d = i;
        iac0Var.getLifecycle().a(new xmc(this, (byte) 1));
    }

    @Override // p.ioc
    public final void a() {
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get()) {
            return;
        }
        t45 t45Var = this.a;
        t890.l("cwp_page_load", t45Var);
        t45Var.a("outcome", "failure");
        t45Var.a("page", vno1.p(this.d));
        t45Var.b("cwp_measurement_id", this.c);
        this.b.b(t45Var.e());
        atomicBoolean.set(true);
    }

    @Override // p.ioc
    public final t45 b() {
        return this.a;
    }

    @Override // p.ioc
    public final void c() {
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get()) {
            return;
        }
        t45 t45Var = this.a;
        t890.l("cwp_page_load", t45Var);
        t45Var.a("outcome", "success");
        t45Var.a("page", vno1.p(this.d));
        t45Var.b("cwp_measurement_id", this.c);
        this.b.b(t45Var.e());
        atomicBoolean.set(true);
    }

    @Override // p.ioc
    public final void d() {
        if (this.e.get()) {
            return;
        }
        t890.u("cwp_page_load", this.a);
    }

    public final int g() {
        return this.d;
    }
}
