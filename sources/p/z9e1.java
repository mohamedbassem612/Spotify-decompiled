package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z9e1 {
    public final y9e1 a;
    public elb0 b = null;
    public elb0 c;

    public z9e1(y9e1 y9e1Var, elb0 elb0Var) {
        this.a = y9e1Var;
        this.c = elb0Var;
    }

    public final long a(long j) {
        n511 n511VarM;
        elb0 elb0Var = this.b;
        n511 n511Var = n511.e;
        if (elb0Var != null) {
            if (elb0Var.a()) {
                elb0 elb0Var2 = this.c;
                n511VarM = elb0Var2 != null ? elb0Var2.M(elb0Var, true) : null;
            } else {
                n511VarM = n511Var;
            }
            if (n511VarM != null) {
                n511Var = n511VarM;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = n511Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = n511Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = n511Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = n511Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        y9e1 y9e1Var = this.a;
        int iE = y9e1Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= y9e1Var.g(iE) && Float.intBitsToFloat(i) <= y9e1Var.h(iE);
    }

    public final long d(long j) {
        elb0 elb0Var;
        elb0 elb0Var2 = this.b;
        if (elb0Var2 != null) {
            if (!elb0Var2.a()) {
                elb0Var2 = null;
            }
            if (elb0Var2 != null && (elb0Var = this.c) != null) {
                elb0 elb0Var3 = elb0Var.a() ? elb0Var : null;
                if (elb0Var3 != null) {
                    return elb0Var2.K(elb0Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        elb0 elb0Var;
        elb0 elb0Var2 = this.b;
        if (elb0Var2 != null) {
            if (!elb0Var2.a()) {
                elb0Var2 = null;
            }
            if (elb0Var2 != null && (elb0Var = this.c) != null) {
                elb0 elb0Var3 = elb0Var.a() ? elb0Var : null;
                if (elb0Var3 != null) {
                    return elb0Var3.K(elb0Var2, j);
                }
            }
        }
        return j;
    }
}
