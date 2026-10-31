package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dkr0 implements wu91 {
    public final /* synthetic */ jkr0 a;
    public final /* synthetic */ kjr0 b;
    public final /* synthetic */ bkr0 c;

    public dkr0(jkr0 jkr0Var, kjr0 kjr0Var, bkr0 bkr0Var) {
        this.a = jkr0Var;
        this.b = kjr0Var;
        this.c = bkr0Var;
    }

    public final float a(float f) {
        jkr0 jkr0Var = this.a;
        xu91 xu91Var = jkr0Var.k().n;
        List list = jkr0Var.k().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            mfh0 mfh0Var = (mfh0) list.get(i);
            int iJ = d1o1.j(jkr0Var.k());
            int i2 = -jkr0Var.k().f;
            int i3 = jkr0Var.k().d;
            int i4 = jkr0Var.k().b;
            int i5 = mfh0Var.k;
            jkr0Var.l();
            float fA = i5 - xu91Var.a(iJ, i4, i2, i3);
            if (fA <= 0.0f && fA > f3) {
                f3 = fA;
            }
            if (fA >= 0.0f && fA < f2) {
                f2 = fA;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!jkr0Var.d()) {
            if (p2o1.w(jkr0Var, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!jkr0Var.c()) {
            f3 = 0.0f;
            if (!p2o1.w(jkr0Var, f)) {
                f2 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) this.b.invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            tf80.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    public final float b(float f, float f2) {
        jkr0 jkr0Var = this.a;
        int iM = jkr0Var.m();
        hrr0 hrr0Var = jkr0Var.m;
        int i = ((xjr0) hrr0Var.getValue()).c + iM;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = jkr0Var.e;
        if (f < 0.0f) {
            i2++;
        }
        int iP = yoi1.p(((int) (f2 / i)) + i2, 0, jkr0Var.l());
        jkr0Var.m();
        int i3 = ((xjr0) hrr0Var.getValue()).c;
        long j = i2;
        this.c.getClass();
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((yoi1.p(yoi1.p(iP, i4, (int) j3), 0, jkr0Var.l()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }
}
