package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h6m implements j6m {
    @Override // p.j6m
    public final long a(long j, long j2) {
        float fK = wqn1.k(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK)) & 4294967295L);
        int i = lg41.a;
        return jFloatToRawIntBits;
    }
}
