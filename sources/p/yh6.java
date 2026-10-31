package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class yh6 {
    public static final ceo a = new ceo(0.0f, 0.0f, 0.7f, 1.0f);
    public static final ceo b = new ceo(0.3f, 0.0f, 1.0f, 1.0f);
    public static final float c = 50.0f;

    public static final hsi1 a(String str) {
        ilv.a.getClass();
        return new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(500, 0, flv.e, 2), rno1.a);
    }

    public static final boolean b(boolean z, boolean z2, Function0 function0, x340 x340Var) {
        x340Var.i0(-761306845);
        if (!z) {
            x340Var.r(false);
            return false;
        }
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = bb00.h(0, x340Var);
        }
        err0 err0Var = (hdn0) objT;
        c9 c9VarS = mqo1.s(new hsi1[]{new hsi1("artistCardsStackNudgeFlipWait", Float.valueOf(0.0f), Float.valueOf(1.0f), new zu91(1600), rno1.a), a("artistCardsStackNudgeFlipToBack"), a("artistCardsStackNudgeFlipToFront")});
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new xh6(err0Var, (byte) 0);
            x340Var.s0(objT2);
        }
        zod.P(c9VarS, z2, "artistCardsStackNudgeFlip", (Function0) objT2, function0, x340Var, 28040, 0);
        boolean z3 = err0Var.s() == 1;
        x340Var.r(false);
        return z3;
    }

    public static final ven0 c(boolean z, boolean z2, String str, int i, x340 x340Var) {
        ilv.a.getClass();
        return d(z, z2, str, 0.0f, 1.0f, new pxg1(2000, i, flv.d), null, x340Var, 438, 16);
    }

    public static final ven0 d(boolean z, boolean z2, String str, float f, float f2, zfv zfvVar, Function0 function0, x340 x340Var, int i, int i2) {
        x340 x340Var2;
        Function0 function1;
        if ((i2 & 16) != 0) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ng5.T0;
                x340Var2 = x340Var;
                x340Var2.s0(objT);
            } else {
                x340Var2 = x340Var;
            }
            function1 = (Function0) objT;
        } else {
            x340Var2 = x340Var;
            function1 = function0;
        }
        return zod.S(new hsi1(str, Float.valueOf(f), Float.valueOf(f2), zfvVar, rno1.a), z, z2, function1, x340Var2, ((i >> 3) & 7168) | 8, 0);
    }

    public static final ven0 e(boolean z, boolean z2, String str, float f, float f2, float f3, int i, int i2, x340 x340Var, int i3) {
        if (!z) {
            x340Var.i0(-427850934);
            ven0 ven0VarD = d(z2, z, str, f, f3, irn1.j0(), null, x340Var, (i3 & 14) | 3072 | (i3 & 112) | ((i3 >> 3) & 896), 16);
            x340Var.r(false);
            return ven0VarD;
        }
        x340Var.i0(-428329233);
        String strConcat = str.concat("-out");
        ilv.a.getClass();
        ceo ceoVar = flv.e;
        pxg1 pxg1VarO0 = irn1.o0(i, 0, ceoVar, 2);
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        tzg1 tzg1Var = rno1.a;
        ven0 ven0VarP = zod.P(mqo1.s(new hsi1[]{new hsi1(strConcat, fValueOf, fValueOf2, pxg1VarO0, tzg1Var), new hsi1(str.concat("-back"), Float.valueOf(f2), Float.valueOf(f3), irn1.o0(i2, 0, ceoVar, 2), tzg1Var)}), z2, str, (Function0) null, (Function0) null, x340Var, 8 | ((i3 << 6) & 896), 24);
        x340Var.r(false);
        return ven0VarP;
    }
}
