package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xub0 implements hsb0 {
    public final /* synthetic */ fvb0 a;
    public final /* synthetic */ qqq0 b;
    public final /* synthetic */ cvb0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ zzq0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ c9n g;
    public final /* synthetic */ yd50 h;

    public xub0(fvb0 fvb0Var, qqq0 qqq0Var, cvb0 cvb0Var, ima0 ima0Var, zzq0 zzq0Var, float f, c9n c9nVar, yd50 yd50Var) {
        this.a = fvb0Var;
        this.b = qqq0Var;
        this.c = cvb0Var;
        this.d = ima0Var;
        this.e = zzq0Var;
        this.f = f;
        this.g = c9nVar;
        this.h = yd50Var;
    }

    public final hfh0 a(isb0 isb0Var, long j) {
        dvb0 dvb0Var;
        float fN;
        float fM;
        float fN2;
        long j2;
        long j3;
        int iG;
        tlc1 tlc1Var = isb0Var.b;
        zzq0 zzq0Var = this.e;
        float f = zzq0Var.e;
        float f2 = zzq0Var.c;
        fvb0 fvb0Var = this.a;
        fvb0Var.v.getValue();
        boolean z = fvb0Var.a || tlc1Var.W();
        qqq0 qqq0Var = this.b;
        vxo1.k(j, qqq0Var);
        cvb0 cvb0Var = this.c;
        if (cvb0Var.d != null && hjl.c(cvb0Var.b, j) && cvb0Var.c == tlc1Var.h()) {
            dvb0 dvb0Var2 = cvb0Var.d;
            dvb0Var2.getClass();
            dvb0Var = dvb0Var2;
        } else {
            cvb0Var.b = j;
            cvb0Var.c = tlc1Var.h();
            dvb0Var = (dvb0) cvb0Var.a.invoke(isb0Var, new hjl(j));
            cvb0Var.d = dvb0Var;
        }
        boolean z2 = qqq0Var == qqq0.a;
        qub0 qub0Var = (qub0) this.d.invoke();
        flb0 layoutDirection = tlc1Var.getLayoutDirection();
        int iOrdinal = qqq0Var.ordinal();
        if (iOrdinal == 0) {
            fN = f2;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            fN = uyn1.n(zzq0Var, layoutDirection);
        }
        int iI0 = tlc1Var.i0(fN);
        flb0 layoutDirection2 = tlc1Var.getLayoutDirection();
        int iOrdinal2 = qqq0Var.ordinal();
        if (iOrdinal2 == 0) {
            fM = f;
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return null;
            }
            fM = uyn1.m(zzq0Var, layoutDirection2);
        }
        int iI1 = tlc1Var.i0(fM);
        flb0 layoutDirection3 = tlc1Var.getLayoutDirection();
        int iOrdinal3 = qqq0Var.ordinal();
        if (iOrdinal3 == 0) {
            fN2 = uyn1.n(zzq0Var, layoutDirection3);
        } else {
            if (iOrdinal3 != 1) {
                eg.o();
                return null;
            }
            fN2 = f2;
        }
        int iI2 = tlc1Var.i0(fN2);
        int iH = ((z2 ? hjl.h(j) : hjl.i(j)) - iI0) - iI1;
        if (z2) {
            j2 = ((long) iI2) << 32;
            j3 = iI0;
        } else {
            j2 = ((long) iI0) << 32;
            j3 = iI2;
        }
        long j4 = j2 | (j3 & 4294967295L);
        int iI3 = tlc1Var.i0(uyn1.m(zzq0Var, tlc1Var.getLayoutDirection()) + uyn1.n(zzq0Var, tlc1Var.getLayoutDirection()));
        int iI4 = tlc1Var.i0(f + f2);
        edn0 edn0VarI = ulo1.i(qub0Var, fvb0Var.s, fvb0Var.k);
        long jB = hjl.b(j, jjl.g(iI3, j), 0, jjl.f(iI4, j), 0, 10);
        int iI5 = tlc1Var.i0(this.f);
        boolean zW = tlc1Var.W();
        yub0 yub0Var = fvb0Var.b;
        vub0 vub0Var = new vub0(fvb0Var, edn0VarI, qub0Var, dvb0Var, jB, z2, isb0Var, iH, j4, iI0, iI1, iI5, this.g, z, yub0Var != null ? yub0Var.m : null, this.h);
        uu0 uu0Var = fvb0Var.c;
        int[] iArr = (int[]) uu0Var.c;
        Object obj = uu0Var.g;
        Integer numM0 = f46.m0(0, iArr);
        int iP = qmo1.p(numM0 != null ? numM0.intValue() : 0, obj, qub0Var);
        if (!f46.L(iArr, iP)) {
            ((ksb0) uu0Var.h).c(iP);
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                iArr = (int[]) ((c4z) uu0Var.b).invoke(Integer.valueOf(iP), Integer.valueOf(iArr.length));
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                uu0Var.c = iArr;
                ((err0) uu0Var.d).t(uu0.h(iArr));
            } catch (Throwable th) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                throw th;
            }
        }
        int[] iArr2 = (int[]) uu0Var.e;
        int length = iArr.length;
        int i = vub0Var.s;
        if (length != i) {
            mgc mgcVar = vub0Var.r;
            mgcVar.M();
            int[] iArr3 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= iArr.length || (iG = iArr[i2]) == -1) {
                    if (i2 == 0) {
                        iG = 0;
                    } else {
                        iG = ioo1.G(iArr3, ((long) i2) & 4294967295L) + 1;
                    }
                }
                iArr3[i2] = iG;
                mgcVar.R(iG, i2);
            }
            iArr = iArr3;
        }
        if (iArr2.length != i) {
            int[] iArr4 = new int[i];
            int i3 = 0;
            while (i3 < i) {
                iArr4[i3] = i3 < iArr2.length ? iArr2[i3] : i3 == 0 ? 0 : iArr4[i3 - 1];
                i3++;
            }
            iArr2 = iArr4;
        }
        yub0 yub0VarH = ioo1.H(vub0Var, Math.round((zW || !fvb0Var.a) ? fvb0Var.o : fvb0Var.w.f()), iArr, iArr2, true);
        fvb0Var.f(yub0VarH, tlc1Var.W(), false);
        return yub0VarH;
    }
}
