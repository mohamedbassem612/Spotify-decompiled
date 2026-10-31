package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rel1 extends hab0 implements xu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ drr0 c;
    public final /* synthetic */ drr0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rel1(ven0 ven0Var, ven0 ven0Var2, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3, drr0 drr0Var4, drr0 drr0Var5, float f, int i, float f2, float f3, iu30 iu30Var, tob1 tob1Var) {
        super(3);
        this.a = ven0Var;
        this.b = ven0Var2;
        this.c = drr0Var;
        this.d = drr0Var2;
        this.e = drr0Var3;
        this.f = drr0Var4;
        this.g = drr0Var5;
        this.h = f;
        this.i = i;
        this.t = f2;
        this.X = f3;
        this.Y = iu30Var;
        this.Z = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iS;
        int iS2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        drr0 drr0Var = this.d;
        drr0 drr0Var2 = this.e;
        ven0 ven0Var = this.a;
        if (zBooleanValue) {
            boolean zBooleanValue2 = ((Boolean) ven0Var.getValue()).booleanValue();
            drr0 drr0Var3 = this.g;
            drr0 drr0Var4 = this.f;
            drr0 drr0Var5 = this.c;
            if (!zBooleanValue2) {
                Boolean bool = Boolean.TRUE;
                ven0Var.setValue(bool);
                this.b.setValue(bool);
                drr0Var5.t(((Number) this.Z.getValue()).floatValue() + fFloatValue2);
                drr0Var.t(drr0Var2.s());
                drr0Var4.t(drr0Var3.s());
            }
            float fO = yoi1.o(drr0Var2.s() * fFloatValue, 1.0f, this.h);
            drr0Var2.t(fO);
            float f = this.i;
            float f2 = this.t;
            float f3 = f * f2;
            float f4 = this.X * f2;
            float f5 = (f3 - f4) / 2.0f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            float fS = (((fO / drr0Var.s()) - 1.0f) * (drr0Var5.s() - f5)) + drr0Var4.s();
            float f6 = (((f4 * fO) + f5) + f5) - f3;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            drr0Var3.t(yoi1.o(fS, 0.0f, f6));
        } else {
            if (((Boolean) ven0Var.getValue()).booleanValue() && (iS = (int) (drr0Var.s() * 100.0f)) != (iS2 = (int) (drr0Var2.s() * 100.0f))) {
                this.Y.invoke(new ynk0(iS, iS2));
            }
            ven0Var.setValue(Boolean.FALSE);
        }
        return rih1.a;
    }
}
