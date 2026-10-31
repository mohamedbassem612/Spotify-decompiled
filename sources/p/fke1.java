package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fke1 extends l5t implements zlb0 {
    public Function0 Q0;
    public long U0;
    public n8b1 V0;
    public float W0;
    public int X0;
    public int Y0;
    public float Z0;
    public xab1 a1;
    public float c1;
    public float d1;
    public float R0 = 45.0f;
    public float S0 = 0.4f;
    public float T0 = 125.0f;
    public final o95 b1 = c97.b(0.0f);
    public final tui1 e1 = new tui1();
    public float f1 = 1.0f;

    public fke1(Function0 function0, long j, n8b1 n8b1Var) {
        this.Q0 = function0;
        this.U0 = j;
        this.V0 = n8b1Var;
        H1(f8d1.a(new ae4(this, (byte) 15)));
    }

    public final float K1() {
        if (this.d1 <= 0.0f) {
            return 0.0f;
        }
        float degrees = (float) Math.toDegrees(((float) Math.asin(yoi1.o((this.W0 / this.d1) + ((float) Math.sin(this.c1)), -1.0f, 1.0f))) - this.c1);
        float f = this.R0;
        return yoi1.o(degrees, -f, f);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        this.X0 = q5t0VarH.a;
        this.Y0 = q5t0VarH.b;
        this.f1 = ifh0Var.h();
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new cmd1((Object) q5t0VarH, (Object) this, (byte) 11));
    }

    public final boolean w1() {
        return false;
    }
}
