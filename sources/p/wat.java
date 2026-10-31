package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface wat {
    default long I(int i) {
        return s(M0(i));
    }

    default long L(float f) {
        return s(N0(f));
    }

    default float M0(int i) {
        return i / h();
    }

    default float N0(float f) {
        return f / h();
    }

    float U0();

    default float X0(float f) {
        return h() * f;
    }

    float h();

    default int i0(float f) {
        float fX0 = X0(f);
        if (Float.isInfinite(fX0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fX0);
    }

    default long k1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fX0 = X0(s3v.b(j));
        float fX1 = X0(s3v.a(j));
        return (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX1)) & 4294967295L);
    }

    default float q0(long j) {
        if (!wee1.a(TextUnit.b(j), 4294967296L)) {
            sf80.b("Only Sp can convert to Px");
        }
        return X0(y(j));
    }

    default long s(float f) {
        float[] fArr = aa30.a;
        if (U0() < 1.03f) {
            return fc11.Y(f / U0(), 4294967296L);
        }
        z930 z930VarA = aa30.a(U0());
        return fc11.Y(z930VarA != null ? z930VarA.a(f) : f / U0(), 4294967296L);
    }

    default long t(long j) {
        if (j != 9205357640488583168L) {
            return jhc1.c(N0(Float.intBitsToFloat((int) (j >> 32))), N0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float y(long j) {
        if (!wee1.a(TextUnit.b(j), 4294967296L)) {
            sf80.b("Only Sp can convert to Px");
        }
        float[] fArr = aa30.a;
        if (U0() < 1.03f) {
            return U0() * TextUnit.c(j);
        }
        z930 z930VarA = aa30.a(U0());
        if (z930VarA != null) {
            return z930VarA.b(TextUnit.c(j));
        }
        return U0() * TextUnit.c(j);
    }
}
