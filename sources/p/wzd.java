package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wzd implements mfv0 {
    public final long a;
    public final int b;
    public final int c;
    public final ur80 d;
    public final boolean e;
    public final wat f;
    public final ven0 g;
    public Integer h;

    public wzd(long j, int i, int i2, ur80 ur80Var, boolean z, wat watVar, ven0 ven0Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = ur80Var;
        this.e = z;
        this.f = watVar;
        this.g = ven0Var;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        int iIntValue;
        long j3 = this.a;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j2 >> 32);
        int i3 = i2 / 2;
        int i4 = i - i3;
        ur80 ur80Var2 = this.d;
        int i5 = ur80Var2.a;
        int i6 = this.c;
        int i7 = i5 + i6;
        int i8 = (ur80Var2.c - i6) - i2;
        if (i8 < i7) {
            i8 = i7;
        }
        int iP = yoi1.p(i4, i7, i8);
        float fM0 = this.f.M0(i - (i3 + iP));
        ven0 ven0Var = this.g;
        if (!p3v.c(((p3v) ven0Var.getValue()).a, fM0)) {
            pzm.k(fM0, ven0Var);
        }
        Integer num = this.h;
        boolean z = this.e;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int i9 = this.b;
            int i10 = z ? ((int) (j3 & 4294967295L)) - i9 : ((int) (j3 & 4294967295L)) + i9;
            this.h = Integer.valueOf(i10);
            iIntValue = i10;
        }
        if (z) {
            iIntValue -= (int) (j2 & 4294967295L);
        }
        return (((long) iP) << 32) | (((long) iIntValue) & 4294967295L);
    }
}
