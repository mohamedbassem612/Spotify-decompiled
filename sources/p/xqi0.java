package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xqi0 implements hw61 {
    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        tw4 tw4VarA = ww4.a();
        u8s0.c(tw4VarA, anm1.g(0L, j));
        tw4 tw4VarA2 = ww4.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fX0 = watVar.X0(87.0f);
        u8s0.b(tw4VarA2, anm1.f(watVar.X0(48.0f) / 2.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fX0)))));
        tw4 tw4VarA3 = ww4.a();
        if (tw4VarA3.l(tw4VarA, tw4VarA2, 0)) {
            return new htq0(tw4VarA3);
        }
        hhg1.n("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        return null;
    }
}
