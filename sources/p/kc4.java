package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class kc4 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final jyp0 jyp0Var, final qim0 qim0Var, long j, b0k b0kVar, final int i, final int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1776202187);
        int i3 = (x340Var.g(jyp0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && x340Var.f(j)) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            x340Var.s();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j6(jyp0Var, (byte) 8);
                x340Var.s0(objT);
            }
            t4n1.h(jyp0Var, een.e, apo.r(-1653527038, new ic4(j, s161.b(qim0Var, false, (iu30) objT)), x340Var), x340Var, i4 | 432);
        } else {
            x340Var.b0();
        }
        final long j2 = j;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.jc4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kc4.a(jyp0Var, qim0Var, j2, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        }
        byte b = 0;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            op71.g(x340Var, exd0.r(u291.s(qim0Var, a, 25.0f), new gc4(b, ((rce1) x340Var.k(sce1.a)).a)));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fc4(qim0Var, i, i2);
        }
    }
}
