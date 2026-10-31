package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jj81 implements hw61 {
    public final boolean a;

    public jj81(boolean z) {
        this.a = z;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) > 0.0f) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                float fIntBitsToFloat = Float.intBitsToFloat(i) / 44.0f;
                float f = 15.0f * fIntBitsToFloat;
                float f2 = 25.25f * fIntBitsToFloat;
                float f3 = fIntBitsToFloat * 34.685f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) / 336.0f) * 120.0f;
                float f4 = f2 + f3;
                double dAcos = (float) Math.acos(1.0f - (f / f4));
                float degrees = (float) Math.toDegrees(dAcos);
                float fSin = (f4 * ((float) Math.sin(dAcos))) + fIntBitsToFloat2;
                tw4 tw4VarA = ww4.a();
                tw4VarA.k(0.0f, 0.0f);
                tw4VarA.j(Float.intBitsToFloat(i), 0.0f);
                tw4VarA.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                tw4VarA.j(f, Float.intBitsToFloat(i2));
                tw4VarA.j(f, fSin);
                tw4VarA.f(anm1.f(f3, (((long) Float.floatToRawIntBits(fSin)) & 4294967295L) | (((long) Float.floatToRawIntBits(f - f3)) << 32)), 0.0f, -degrees);
                tw4VarA.f(anm1.f(f2, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32)), 180.0f - degrees, degrees);
                tw4VarA.g();
                if (this.a != (flb0Var == flb0.b)) {
                    float[] fArrA = kch0.a();
                    kch0.k(Float.intBitsToFloat(i), 0.0f, fArrA);
                    kch0.i(-1.0f, 1.0f, fArrA);
                    tw4VarA.q(fArrA);
                }
                return new htq0(tw4VarA);
            }
        }
        return new itq0(anm1.g(0L, j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jj81) && this.a == ((jj81) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
