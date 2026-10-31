package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rx8 implements m0e1 {
    public final long a;
    public final long b;
    public final long c;

    public rx8(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = TextUnit.c;
        if (TextUnit.a(j, j4)) {
            hhg1.n("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (TextUnit.a(j2, j4)) {
            hhg1.n("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (TextUnit.a(j3, j4)) {
            hhg1.n("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (wee1.a(TextUnit.b(j), TextUnit.b(j2))) {
            fc11.p(j, j2);
            if (Float.compare(TextUnit.c(j), TextUnit.c(j2)) > 0) {
                this.a = j2;
                j = j2;
            }
        }
        if (wee1.a(TextUnit.b(j3), 4294967296L)) {
            long jY = fc11.Y(1.0E-4f, 4294967296L);
            fc11.p(j3, jY);
            if (Float.compare(TextUnit.c(j3), TextUnit.c(jY)) < 0) {
                hhg1.n("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (TextUnit.c(j) < 0.0f) {
            hhg1.n("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (TextUnit.c(j2) >= 0.0f) {
            return;
        }
        hhg1.n("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean b(y9e1 y9e1Var) {
        zrm0 zrm0Var = y9e1Var.b;
        long j = y9e1Var.c;
        int i = y9e1Var.a.f;
        if (i == 1 || i == 3) {
            return ((float) ((int) (j >> 32))) < zrm0Var.d || zrm0Var.c || ((float) ((int) (j & 4294967295L))) < zrm0Var.e;
        }
        if (i != 4 && i != 5 && i != 2) {
            hhg1.n(f4i1.f("TextOverflow type ", eqr0.U(i), " is not supported."));
            return false;
        }
        int i2 = zrm0Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                return zrm0Var.i(0);
            }
            if (i == 4 || i == 5) {
                return ((float) ((int) (j >> 32))) < zrm0Var.d || zrm0Var.c || ((float) ((int) (j & 4294967295L))) < zrm0Var.e;
            }
            if (i == 2) {
                return zrm0Var.i(i2 - 1);
            }
        }
        return false;
    }

    public final long a(bsm0 bsm0Var, long j, af5 af5Var) {
        float fQ0 = bsm0Var.q0(this.c);
        float fQ1 = bsm0Var.q0(this.a);
        float fQ2 = bsm0Var.q0(this.b);
        float f = (fQ1 + fQ2) / 2.0f;
        float f2 = fQ2;
        float f3 = fQ1;
        while (f2 - f3 >= fQ0) {
            if (b(bsm0Var.b(j, bsm0Var.L(f)))) {
                f2 = f;
            } else {
                f3 = f;
            }
            f = (f3 + f2) / 2.0f;
        }
        float fFloor = (((float) Math.floor((f3 - fQ1) / fQ0)) * fQ0) + fQ1;
        float f4 = fQ0 + fFloor;
        if (f4 <= fQ2 && !b(bsm0Var.b(j, bsm0Var.L(f4)))) {
            fFloor = f4;
        }
        return bsm0Var.L(fFloor);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof rx8)) {
            return false;
        }
        rx8 rx8Var = (rx8) obj;
        return TextUnit.a(rx8Var.a, this.a) && TextUnit.a(rx8Var.b, this.b) && TextUnit.a(rx8Var.c, this.c);
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return Long.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
