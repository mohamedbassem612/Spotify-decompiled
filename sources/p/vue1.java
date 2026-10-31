package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vue1 implements hw61 {
    public final int a;

    public vue1(int i) {
        this.a = i;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float fIntBitsToFloat;
        tw4 tw4VarA = ww4.a();
        n511 n511VarG = anm1.g(0L, j);
        float fX0 = watVar.X0(16.0f);
        tw4VarA.e(ila0.h((((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), n511VarG), 1);
        float fX1 = watVar.X0(12.0f);
        int iC = l1d.C(this.a);
        if (iC == 0) {
            fIntBitsToFloat = 0.0f;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        tw4 tw4VarA2 = ww4.a();
        u8s0.b(tw4VarA2, anm1.f(fX1, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)));
        u8s0.b(tw4VarA2, anm1.f(fX1, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)));
        tw4 tw4VarA3 = ww4.a();
        if (tw4VarA3.l(tw4VarA, tw4VarA2, 0)) {
            return new htq0(tw4VarA3);
        }
        hhg1.n("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        return null;
    }
}
