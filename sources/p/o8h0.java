package p;

import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class o8h0 {
    public static final long a = z4p1.g(4291998118L);
    public static final long b = z4p1.g(4282384499L);
    public static final long c = z4p1.g(4290876292L);
    public static final long d = z4p1.g(4293581525L);
    public static final float e = 7.0f;
    public static final float f = 10.0f;

    public static final void a(af5 af5Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1518354108);
        int i2 = i | (x340Var.g(af5Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.d(af5Var, b, u291.f(qim0Var, 1.0f), cbx.d(x340Var).j, new a0e1(3), (iu30) null, 0, false, bjc0.a, 0, (qx8) null, (cqs0) null, x340Var, (i2 & 14) | 100663344, 0, 3808);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sex(af5Var, qim0Var, i);
        }
    }

    public static final void b(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(919287871);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(str, (qim0) null, lee1Var, b, (a0e1) null, 0, false, bjc0.a, (qx8) null, 150.0f, (FontWeight) ((bjx) yfuVar.c).e, (iu30) null, x340Var, (i2 & 14) | 12585984, 0, 2418);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5d0(str, i, (byte) 19);
        }
    }

    public static final void c(x340 x340Var) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
    }
}
