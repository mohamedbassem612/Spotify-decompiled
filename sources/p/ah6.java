package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ah6 extends hab0 implements vu30 {
    public final /* synthetic */ drr0 N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ hdn0 P0;
    public final /* synthetic */ ven0 Q0;
    public final /* synthetic */ hdn0 R0;
    public final /* synthetic */ ven0 S0;
    public final /* synthetic */ qam1 T0;
    public final /* synthetic */ ven0 U0;
    public final /* synthetic */ drr0 V0;
    public final /* synthetic */ float W0;
    public final /* synthetic */ hdn0 X;
    public final /* synthetic */ ven0 X0;
    public final /* synthetic */ drr0 Y;
    public final /* synthetic */ drr0 Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dw91 d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ xd6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah6(float f, float f2, boolean z, dw91 dw91Var, xu30 xu30Var, int i, drr0 drr0Var, Function0 function0, float f3, xd6 xd6Var, hdn0 hdn0Var, drr0 drr0Var2, drr0 drr0Var3, drr0 drr0Var4, ven0 ven0Var, hdn0 hdn0Var2, ven0 ven0Var2, hdn0 hdn0Var3, ven0 ven0Var3, qam1 qam1Var, ven0 ven0Var4, drr0 drr0Var5, float f4, ven0 ven0Var5) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = dw91Var;
        this.e = xu30Var;
        this.f = i;
        this.g = drr0Var;
        this.h = function0;
        this.i = f3;
        this.t = xd6Var;
        this.X = hdn0Var;
        this.Y = drr0Var2;
        this.Z = drr0Var3;
        this.N0 = drr0Var4;
        this.O0 = ven0Var;
        this.P0 = hdn0Var2;
        this.Q0 = ven0Var2;
        this.R0 = hdn0Var3;
        this.S0 = ven0Var3;
        this.T0 = qam1Var;
        this.U0 = ven0Var4;
        this.V0 = drr0Var5;
        this.W0 = f4;
        this.X0 = ven0Var5;
    }

    public final Object invoke(Object obj, Object obj2) {
        vf6 vf6Var;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        ydh.m(this.X, 1);
        drr0 drr0Var = this.Y;
        boolean z = Math.abs(drr0Var.s()) > this.a;
        float fS = fFloatValue - fFloatValue2;
        boolean z2 = Math.abs(fS) > this.b;
        if (z) {
            fFloatValue = this.Z.s();
        }
        if (z) {
            fFloatValue2 = this.N0.s();
        }
        if (Math.abs(fFloatValue2) > Math.abs(fFloatValue)) {
            vf6Var = vf6.a;
        } else {
            vf6Var = fFloatValue < 0.0f ? vf6.b : vf6.c;
        }
        boolean z3 = (z || z2) && !((Boolean) this.O0.getValue()).booleanValue();
        ram1 ram1Var = this.T0;
        int i = this.f;
        xu30 xu30Var = this.e;
        tf6 tf6Var = tf6.a;
        tf6 tf6Var2 = tf6.b;
        dw91 dw91Var = this.d;
        err0 err0Var = this.P0;
        if (!z3 || this.c) {
            float f = this.W0;
            ven0 ven0Var = this.X0;
            if (z3) {
                if (z) {
                    fS = drr0Var.s();
                }
                float f2 = fS > 0.0f ? 1.0f : -1.0f;
                err0 err0Var2 = err0Var;
                Object obj3 = dw91Var.get(Integer.valueOf(err0Var2.s()));
                Boolean bool = Boolean.TRUE;
                if (u890.j(obj3, bool)) {
                    tf6Var = tf6Var2;
                }
                xu30Var.invoke(Integer.valueOf(err0Var2.s()), tf6Var, vf6Var);
                if (i != 0) {
                    ram1Var.a(i);
                }
                if (err0Var2.s() == 1) {
                    ven0 ven0Var2 = this.U0;
                    if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                        this.V0.t(this.g.s());
                        ven0Var2.setValue(bool);
                        this.h.invoke();
                    }
                }
                ven0Var.setValue(new x9b1(drr0Var.s(), f > 0.0f ? (drr0Var.s() / f) * 10.0f : 0.0f, f2 * this.i, f2 * 10.0f, true));
            } else {
                ven0Var.setValue(new x9b1(drr0Var.s(), f > 0.0f ? (drr0Var.s() / f) * 10.0f : 0.0f, 0.0f, 0.0f, false));
                this.t.e = false;
            }
        } else {
            err0 err0Var3 = err0Var;
            Object obj4 = dw91Var.get(Integer.valueOf(err0Var3.s()));
            Boolean bool2 = Boolean.TRUE;
            if (u890.j(obj4, bool2)) {
                tf6Var = tf6Var2;
            }
            xu30Var.invoke(Integer.valueOf(err0Var3.s()), tf6Var, vf6Var);
            this.Q0.setValue(Boolean.FALSE);
            ydh.m(this.R0, 1);
            this.S0.setValue(bool2);
            if (i != 0) {
                ram1Var.a(i);
            }
        }
        return rih1.a;
    }
}
