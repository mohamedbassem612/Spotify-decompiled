package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qvg0 extends hab0 implements Function0 {
    public final /* synthetic */ tui1 a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ o95 h;
    public final /* synthetic */ o95 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvg0(tui1 tui1Var, c9n c9nVar, float f, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, o95 o95Var, o95 o95Var2) {
        super(0);
        this.a = tui1Var;
        this.b = c9nVar;
        this.c = f;
        this.d = iu30Var;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = ven0Var3;
        this.h = o95Var;
        this.i = o95Var2;
    }

    public final Object invoke() {
        Float fValueOf = Float.valueOf(0.0f);
        ceo ceoVar = uvg0.a;
        this.e.setValue(Boolean.FALSE);
        long jB = this.a.b();
        float fMax = Math.max(Math.abs(qui1.d(jB)), Math.abs(qui1.e(jB)));
        ven0 ven0Var = this.f;
        float fAbs = Math.abs(uvg0.g(ven0Var));
        ven0 ven0Var2 = this.g;
        float fMax2 = Math.max(fAbs, Math.abs(uvg0.h(ven0Var2)));
        float fSqrt = (float) Math.sqrt((((Number) ven0Var2.getValue()).floatValue() * ((Number) ven0Var2.getValue()).floatValue()) + (((Number) ven0Var.getValue()).floatValue() * ((Number) ven0Var.getValue()).floatValue()));
        c9n c9nVar = this.b;
        if (fMax > 400.0f && fMax2 > 200.0f) {
            fn31.T(c9nVar, (o8n) null, 0, new nr9(this.d, this.h, (Math.abs(qui1.d(jB)) * ((Number) ven0Var.getValue()).floatValue()) / 100.0f, this.i, (Math.abs(qui1.e(jB)) * ((Number) ven0Var2.getValue()).floatValue()) / 100.0f, (lnm) null), 3);
        } else if (fSqrt > this.c) {
            this.d.invoke(bwg0.a);
        } else {
            float fFloatValue = ((Number) ven0Var.getValue()).floatValue();
            float fFloatValue2 = ((Number) ven0Var2.getValue()).floatValue();
            ven0Var.setValue(fValueOf);
            ven0Var2.setValue(fValueOf);
            fn31.T(c9nVar, (o8n) null, 0, new ovg0(this.h, fFloatValue, this.i, fFloatValue2, null, (byte) 1), 3);
        }
        return rih1.a;
    }
}
