package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class up31 {
    public static final pxg1 a;
    public static final pxg1 b;

    static {
        ceo ceoVar = new ceo(0.42f, 0.0f, 0.58f, 1.0f);
        a = irn1.o0(300, 0, ceoVar, 2);
        b = irn1.o0(300, 0, ceoVar, 2);
    }

    public static final void a(c380 c380Var, qim0 qim0Var, boolean z, lee1 lee1Var, long j, djc0 djc0Var, int i, String str, b0k b0kVar, int i2) {
        int i3;
        boolean z2;
        lee1 lee1Var2;
        long j2;
        int i4;
        int i5;
        int i6;
        long j3;
        lee1 lee1Var3;
        boolean z3;
        Object hl0Var;
        err0 err0Var;
        boolean z4;
        c380 c380Var2 = c380Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-980915213);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(c380Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i7 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i7 = i3 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i7 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i7 |= x340Var.i(djc0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i7 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i7 |= x340Var.g(str) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i7 & 1, (4793491 & i7) != 4793490)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                lee1 lee1Var4 = cbx.d(x340Var).j;
                i5 = 2;
                i6 = i7 & (-3734529);
                j3 = cbx.a(x340Var).b.b;
                lee1Var3 = lee1Var4;
                z3 = true;
            } else {
                x340Var.b0();
                lee1Var3 = lee1Var;
                j3 = j;
                i5 = i;
                i6 = i7 & (-3734529);
                z3 = z;
            }
            x340Var.s();
            Object[] objArr = {c380Var2};
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = n521.Z0;
                x340Var.s0(objT);
            }
            err0 err0Var2 = (hdn0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean z5 = z3;
            boolean zI = ((i6 & 896) == 256) | ((i6 & 14) == 4) | x340Var.i(err0Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                err0Var = err0Var2;
                hl0Var = new hl0(z5, c380Var2, err0Var, (lnm) null, (byte) 22);
                z4 = z5;
                c380Var2 = c380Var2;
                x340Var.s0(hl0Var);
            } else {
                z4 = z5;
                hl0Var = objT2;
                err0Var = err0Var2;
            }
            qxd0.s(c380Var2, boolValueOf, (vu30) hl0Var, x340Var);
            Integer numValueOf = Integer.valueOf(err0Var.s());
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = vm31.X;
                x340Var.s0(objT3);
            }
            hm5.a(numValueOf, qim0Var, (iu30) objT3, (tl3) null, str, (iu30) null, apo.r(-995721027, new tp31(c380Var2, lee1Var3, j3, i5, djc0Var), x340Var), x340Var, 1573248 | (i6 & 112) | ((i6 >> 9) & 57344), 40);
            lee1Var2 = lee1Var3;
            j2 = j3;
            i4 = i5;
            z2 = z4;
        } else {
            x340Var.b0();
            z2 = z;
            lee1Var2 = lee1Var;
            j2 = j;
            i4 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gpo(c380Var, qim0Var, z2, lee1Var2, j2, djc0Var, i4, str, i2);
        }
    }
}
