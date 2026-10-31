package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class z95 {
    public static final n8b1 a = irn1.l0(0.0f, 0.0f, (Object) null, 7);
    public static final n8b1 b;

    static {
        n511 n511Var = ckk1.a;
        b = irn1.l0(0.0f, 0.0f, new p3v(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final tob1 a(float f, fe5 fe5Var, String str, b0k b0kVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            fe5Var = b;
        }
        fe5 fe5Var2 = fe5Var;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        p3v p3vVar = new p3v(f);
        int i3 = (i & 14) | ((i << 3) & 896);
        int i4 = i << 6;
        return d(p3vVar, rno1.c, fe5Var2, null, str, null, b0kVar, i3 | (57344 & i4) | (i4 & 458752), 8);
    }

    public static final tob1 b(float f, fe5 fe5Var, String str, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        fe5 fe5Var2;
        int i3 = i2 & 2;
        n8b1 n8b1Var = a;
        if (i3 != 0) {
            fe5Var = n8b1Var;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        iu30 iu30Var2 = (i2 & 16) != 0 ? null : iu30Var;
        if (fe5Var == n8b1Var) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && x340Var.d(0.01f)) || (i & 384) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = irn1.l0(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                x340Var.s0(objT);
            }
            x340Var.r(false);
            fe5Var2 = (n8b1) objT;
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1144225701);
            x340Var2.r(false);
            fe5Var2 = fe5Var;
        }
        int i4 = i << 3;
        return d(Float.valueOf(f), rno1.a, fe5Var2, null, str2, iu30Var2, b0kVar, (i & 14) | (57344 & i4) | (i4 & 458752), 0);
    }

    public static final tob1 c(int i, pxg1 pxg1Var, String str, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            iu30Var = null;
        }
        Integer numValueOf = Integer.valueOf(i);
        int i4 = (i2 & 14) | ((i2 << 3) & 896);
        int i5 = i2 << 6;
        return d(numValueOf, rno1.b, pxg1Var, null, str2, iu30Var, b0kVar, i4 | (57344 & i5) | (i5 & 458752), 8);
    }

    public static final tob1 d(Object obj, tzg1 tzg1Var, fe5 fe5Var, Float f, String str, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        jfe jfeVar;
        o95 o95Var;
        m4c m4cVar = fkj0.X;
        Float f2 = (i2 & 8) != 0 ? null : f;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == m4cVar) {
            objT = xto.t((Object) null);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new o95(obj, tzg1Var, f2);
            x340Var.s0(objT2);
        }
        o95 o95Var2 = (o95) objT2;
        ven0 ven0VarV = xto.v(iu30Var, x340Var);
        if (f2 != null && (fe5Var instanceof n8b1)) {
            n8b1 n8b1Var = (n8b1) fe5Var;
            if (!u890.j(n8b1Var.c, f2)) {
                fe5Var = irn1.k0(n8b1Var.a, n8b1Var.b, f2);
            }
        }
        ven0 ven0VarV2 = xto.v(fe5Var, x340Var);
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = mno1.a(-1, 0, 6);
            x340Var.s0(objT3);
        }
        jfe jfeVar2 = (jfe) objT3;
        boolean zI = x340Var.i(jfeVar2) | ((((i & 14) ^ 6) > 4 && x340Var.i(obj)) || (i & 6) == 4);
        Object objT4 = x340Var.T();
        if (zI || objT4 == m4cVar) {
            objT4 = new og(jfeVar2, obj, (byte) 5);
            x340Var.s0(objT4);
        }
        qxd0.D((Function0) objT4, x340Var);
        boolean zI2 = x340Var.i(jfeVar2) | x340Var.i(o95Var2) | x340Var.g(ven0VarV2) | x340Var.g(ven0VarV);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            jfeVar = jfeVar2;
            o95Var = o95Var2;
            af0 af0Var = new af0(jfeVar, o95Var, ven0VarV2, ven0VarV, (lnm) null, (byte) 3);
            x340Var.s0(af0Var);
            objT5 = af0Var;
        } else {
            jfeVar = jfeVar2;
            o95Var = o95Var2;
        }
        qxd0.t(jfeVar, x340Var, (vu30) objT5);
        tob1 tob1Var = (tob1) ven0Var.getValue();
        return tob1Var == null ? o95Var.c : tob1Var;
    }
}
