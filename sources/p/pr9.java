package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pr9 implements d6o0 {
    public final /* synthetic */ or9 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ ven0 d;

    public pr9(or9 or9Var, float f, c9n c9nVar, ven0 ven0Var) {
        this.a = or9Var;
        this.b = f;
        this.c = c9nVar;
        this.d = ven0Var;
    }

    public final long M(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            return 0L;
        }
        float fB = this.a.b(Float.intBitsToFloat(i2));
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    public final long h0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(this.a.b(Float.intBitsToFloat(i2)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final Object k0(long j, lnm lnmVar) {
        if (!this.a.c(this.b, this.c, qui1.e(j), (Function0) this.d.getValue())) {
            j = 0;
        }
        return new qui1(j);
    }
}
