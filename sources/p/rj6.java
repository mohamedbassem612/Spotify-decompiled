package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rj6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj6(pe peVar, boolean z, boolean z2, ven0 ven0Var) {
        super(0);
        this.d = peVar;
        this.b = z;
        this.c = z2;
        this.e = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        Object obj = this.d;
        Object obj2 = this.e;
        boolean z2 = this.c;
        boolean z3 = this.b;
        switch (b) {
            case 0:
                if (z3) {
                    tob1 tob1Var = (tob1) obj2;
                    float fAbs = Math.abs((((b4g1) obj).c.s() + (tob1Var != null ? ((Number) tob1Var.getValue()).floatValue() : 0.0f)) % 360.0f);
                    if (fAbs > 90.0f && fAbs < 270.0f) {
                        z = false;
                    }
                } else {
                    z = z2;
                }
                return Boolean.valueOf(z);
            case 1:
                if (((pe) obj).b(5) && z3) {
                    return (z2 || ((Boolean) ((ven0) obj2).getValue()).booleanValue()) ? r8v.b : r8v.c;
                }
                return r8v.a;
            case 2:
                if (z3) {
                    ((ss50) obj).a(17);
                }
                if (!z2) {
                    ((Function0) obj2).invoke();
                }
                return rih1Var;
            default:
                if (!z3) {
                    if (z2) {
                        wpb1.n((ven0) obj2, true);
                    } else {
                        ((Function0) obj).invoke();
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj6(boolean z, ss50 ss50Var, boolean z2, Function0 function0) {
        super(0);
        this.b = z;
        this.d = ss50Var;
        this.c = z2;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj6(boolean z, b4g1 b4g1Var, tob1 tob1Var, boolean z2) {
        super(0);
        this.b = z;
        this.d = b4g1Var;
        this.e = tob1Var;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj6(boolean z, boolean z2, Function0 function0, ven0 ven0Var) {
        super(0);
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = ven0Var;
    }
}
