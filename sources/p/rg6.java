package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rg6 extends hab0 implements iu30 {
    public final /* synthetic */ float N0;
    public final /* synthetic */ drr0 O0;
    public final /* synthetic */ float P0;
    public final /* synthetic */ c21 Q0;
    public final /* synthetic */ float R0;
    public final /* synthetic */ boolean S0;
    public final /* synthetic */ boolean T0;
    public final /* synthetic */ tob1 U0;
    public final /* synthetic */ tob1 V0;
    public final /* synthetic */ float W0;
    public final /* synthetic */ float X;
    public final /* synthetic */ drr0 X0;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ ven0 Y0;
    public final /* synthetic */ float Z;
    public final /* synthetic */ drr0 Z0;
    public final /* synthetic */ zvd a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg6(zvd zvdVar, float f, int i, float f2, float f3, float f4, drr0 drr0Var, float f5, float f6, boolean z, float f7, tob1 tob1Var, float f8, float f9, drr0 drr0Var2, float f10, c21 c21Var, float f11, boolean z2, boolean z3, tob1 tob1Var2, tob1 tob1Var3, float f12, drr0 drr0Var3, ven0 ven0Var, drr0 drr0Var4) {
        super(1);
        this.a = zvdVar;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = drr0Var;
        this.h = f5;
        this.i = f6;
        this.t = z;
        this.X = f7;
        this.Y = tob1Var;
        this.Z = f8;
        this.N0 = f9;
        this.O0 = drr0Var2;
        this.P0 = f10;
        this.Q0 = c21Var;
        this.R0 = f11;
        this.S0 = z2;
        this.T0 = z3;
        this.U0 = tob1Var2;
        this.V0 = tob1Var3;
        this.W0 = f12;
        this.X0 = drr0Var3;
        this.Y0 = ven0Var;
        this.Z0 = drr0Var4;
    }

    public final Object invoke(Object obj) {
        float fO;
        tob1 tob1Var;
        kd31 kd31Var = (kd31) obj;
        zvd zvdVar = this.a;
        float fFloatValue = ((Number) zvdVar.b.getValue()).floatValue();
        float f = this.b * this.c;
        float f2 = (this.e / 2.0f) - f;
        float f3 = this.f / 2.0f;
        float f4 = this.d;
        drr0 drr0Var = this.g;
        float fS = drr0Var.s() + f;
        float f5 = this.h;
        float f6 = f5 / 2.0f;
        float f7 = ((f5 * 0.9f) / 2.0f) + this.i;
        float f8 = 1.0f - fFloatValue;
        kd31Var.C((f2 - f3) * f4 * f8);
        kd31Var.E((f7 - (fS + f6)) * f8);
        kd31Var.q(dm5.T(0.9f, 1.0f, fFloatValue));
        kd31Var.r(kd31Var.b);
        kd31Var.b(((Number) zvdVar.a.getValue()).floatValue());
        boolean z = this.t;
        float f9 = this.P0;
        if (z) {
            float fFloatValue2 = ((Number) this.Y.getValue()).floatValue() + this.X + f;
            float f10 = f3 + fFloatValue2;
            float f11 = (this.Z / 2.0f) + fFloatValue2;
            float fS2 = drr0Var.s() + f;
            float f12 = this.N0 / 2.0f;
            float f13 = fS2 + f12;
            float fS3 = this.X0.s() + f + f6;
            float fS4 = this.O0.s() + f12;
            float f14 = kd31Var.e;
            float f15 = f9 / 2.0f;
            c21 c21Var = this.Q0;
            kd31Var.C(((dm5.T(f10, f15, c21Var != null ? ((Number) ((tob1) c21Var.c).getValue()).floatValue() : 1.0f) - f11) * f4) + f14);
            float fFloatValue3 = c21Var != null ? ((Number) ((tob1) c21Var.d).getValue()).floatValue() : 2.0f;
            float f16 = this.R0;
            kd31Var.E(((fFloatValue3 <= 1.0f ? dm5.T(fS3, f16, fFloatValue3) : dm5.T(f16, fS4, fFloatValue3 - 1.0f)) - f13) + kd31Var.f);
            float fFloatValue4 = (c21Var == null || (tob1Var = (tob1) c21Var.e) == null) ? 1.0f : ((Number) tob1Var.getValue()).floatValue();
            kd31Var.q(kd31Var.b * fFloatValue4);
            kd31Var.r(kd31Var.c * fFloatValue4);
        }
        if (this.S0) {
            tob1 tob1Var2 = this.U0;
            drr0 drr0Var2 = this.Z0;
            boolean z2 = this.T0;
            ven0 ven0Var = this.Y0;
            if (z2) {
                x9b1 x9b1Var = (x9b1) ven0Var.getValue();
                if (x9b1Var != null) {
                    float fFloatValue5 = ((Number) tob1Var2.getValue()).floatValue();
                    kd31Var.C(dm5.T(x9b1Var.a, x9b1Var.c, fFloatValue5) + kd31Var.e);
                    kd31Var.E(((Number) this.V0.getValue()).floatValue() + kd31Var.f);
                    kd31Var.p(dm5.T(x9b1Var.b, x9b1Var.d, fFloatValue5));
                } else {
                    kd31Var.C(drr0Var2.s() + kd31Var.e);
                    kd31Var.p(f9 > 0.0f ? 10.0f * (drr0Var2.s() / f9) : 0.0f);
                }
            } else {
                x9b1 x9b1Var2 = (x9b1) ven0Var.getValue();
                float f17 = kd31Var.d;
                float f18 = this.W0;
                if (x9b1Var2 != null) {
                    float f19 = x9b1Var2.a;
                    ceo ceoVar = yh6.a;
                    fO = dm5.T(1.0f - (yoi1.o(Math.abs(f19) / f18, 0.0f, 1.0f) * 0.3f), 1.0f, ((Number) tob1Var2.getValue()).floatValue());
                } else {
                    float fS5 = drr0Var2.s();
                    ceo ceoVar2 = yh6.a;
                    fO = 1.0f - (yoi1.o(Math.abs(fS5) / f18, 0.0f, 1.0f) * 0.3f);
                }
                kd31Var.b(f17 * fO);
            }
        }
        return rih1.a;
    }
}
