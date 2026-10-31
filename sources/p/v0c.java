package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v0c extends pim0 implements mv40, zlb0 {
    public Function0 O0;
    public Function0 P0;
    public Function0 Q0;
    public final drr0 R0 = new drr0(1.0f);
    public float S0;
    public float T0;

    public v0c(Function0 function0, Function0 function1, Function0 function2) {
        this.O0 = function0;
        this.P0 = function1;
        this.Q0 = function2;
    }

    public final void E(elb0 elb0Var) {
        ndo0 ndo0Var = (ndo0) elb0Var;
        if (ndo0Var.J() == null) {
            return;
        }
        float fAbs = Math.abs(((((int) (((q5t0) ndo0Var).c >> 32)) / 2.0f) + Float.intBitsToFloat((int) (nho1.A(elb0Var) >> 32))) - ((Number) this.O0.invoke()).floatValue());
        float f = this.S0;
        float f2 = 1.0f;
        if (fAbs >= f) {
            float f3 = this.T0;
            f2 = fAbs < f + f3 ? 1.0f - (((fAbs - f) / f3) * 0.5f) : 0.5f;
        }
        this.R0.t(f2);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        this.S0 = ifh0Var.X0(90.0f);
        this.T0 = ifh0Var.X0(360.0f);
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new ztb(q5t0VarH, this, (byte) 2));
    }
}
