package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cqc extends pim0 implements sjp0, lbc, m7v {
    public final eqc O0;
    public boolean P0;
    public do41 Q0;
    public iu30 R0;

    public cqc(eqc eqcVar, iu30 iu30Var) {
        this.O0 = eqcVar;
        this.R0 = iu30Var;
        eqcVar.a = this;
        eqcVar.d = new hx4(this, (byte) 12);
    }

    @Override // p.pim0
    public final void A1() {
        do41 do41Var = this.Q0;
        if (do41Var != null) {
            do41Var.d();
        }
    }

    @Override // p.pim0
    public final void B1() {
        H1();
    }

    public final void H1() {
        do41 do41Var = this.Q0;
        if (do41Var != null) {
            do41Var.d();
        }
        this.P0 = false;
        this.O0.b = null;
        ha71.x(this);
    }

    @Override // p.m7v
    public final void L0() {
        H1();
    }

    @Override // p.x4t
    public final void T() {
        H1();
    }

    @Override // p.sjp0
    public final void f0() {
        H1();
    }

    @Override // p.lbc
    public final flb0 getLayoutDirection() {
        return oap1.A(this);
    }

    @Override // p.lbc
    public final wat h() {
        return oap1.x(this);
    }

    @Override // p.x4t, p.mav0
    public final void i() {
        H1();
    }

    @Override // p.lbc
    public final long j() {
        return o0c.R(oap1.w(this, 4).c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // p.m7v
    public final void t0(lsl lslVar) throws KotlinNothingValueException {
        boolean z = this.P0;
        eqc eqcVar = this.O0;
        if (!z) {
            eqcVar.b = null;
            eqcVar.c = lslVar;
            p9p1.z(this, new og(this, eqcVar, (byte) 14));
            if (eqcVar.b == null) {
                throw l1d.w("DrawResult not defined, did you forget to call onDraw?");
            }
            this.P0 = true;
        }
        ahs ahsVar = eqcVar.b;
        ahsVar.getClass();
        ahsVar.a().invoke(lslVar);
    }
}
