package p;

import android.graphics.Color;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u9v implements cba {
    public final cba a;
    public final y8h b;
    public final cr20 c;
    public final cr20 d;
    public final cr20 e;
    public final cr20 f;
    public boolean g = true;

    public u9v(cba cbaVar, hba hbaVar, tjq tjqVar) {
        this.a = cbaVar;
        y8h y8hVarC0 = ((p95) tjqVar.b).c0();
        this.b = y8hVarC0;
        y8hVarC0.a(this);
        hbaVar.d(y8hVarC0);
        cr20 cr20VarC0 = ((q95) tjqVar.c).c0();
        this.c = cr20VarC0;
        cr20VarC0.a(this);
        hbaVar.d(cr20VarC0);
        cr20 cr20VarC1 = ((q95) tjqVar.a).c0();
        this.d = cr20VarC1;
        cr20VarC1.a(this);
        hbaVar.d(cr20VarC1);
        cr20 cr20VarC2 = ((q95) tjqVar.d).c0();
        this.e = cr20VarC2;
        cr20VarC2.a(this);
        hbaVar.d(cr20VarC2);
        cr20 cr20VarC3 = ((q95) tjqVar.e).c0();
        this.f = cr20VarC3;
        cr20VarC3.a(this);
        hbaVar.d(cr20VarC3);
    }

    public final void a() {
        this.g = true;
        this.a.a();
    }

    public final void b(p9b0 p9b0Var) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) ((Float) this.d.e()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.e.e()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.e()).intValue();
            p9b0Var.setShadowLayer(((Float) this.f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void c(j2e0 j2e0Var) {
        this.b.j(j2e0Var);
    }

    public final void d(j2e0 j2e0Var) {
        this.d.j(j2e0Var);
    }

    public final void e(j2e0 j2e0Var) {
        this.e.j(j2e0Var);
    }

    public final void f(j2e0 j2e0Var) {
        cr20 cr20Var = this.c;
        if (j2e0Var == null) {
            cr20Var.j((j2e0) null);
        } else {
            cr20Var.j(new t9v(j2e0Var, (byte) 0));
        }
    }

    public final void g(j2e0 j2e0Var) {
        this.f.j(j2e0Var);
    }
}
