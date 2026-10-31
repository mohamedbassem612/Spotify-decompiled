package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cr60 implements tl3 {
    public final float a;

    public cr60(float f) {
        this.a = f;
    }

    public final long a(long j, long j2, flb0 flb0Var) {
        int iP;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j >> 32);
        if (i2 > i) {
            iP = yoi1.p(jch0.U((i / 2.0f) - (i2 * this.a)), i - i2, 0);
        } else {
            iP = (i - i2) / 2;
        }
        return (((long) iP) << 32) | (((long) ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2)) & 4294967295L);
    }
}
