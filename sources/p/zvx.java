package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zvx implements hw61 {
    @Override // p.hw61
    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float f = p3v.b(watVar.N0(Float.max(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)))), 33.0f) >= 0 ? 4.0f : 2.0f;
        n511 n511VarG = anm1.g(0L, j);
        float fX0 = watVar.X0(f);
        return new jtq0(ila0.h((((long) Float.floatToRawIntBits(fX0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fX0))), n511VarG));
    }
}
