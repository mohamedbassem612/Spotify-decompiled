package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cnl implements mfv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ iu30 f;

    public cnl(int i, int i2, int i3, int i4, int i5, iu30 iu30Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = iu30Var;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        long jP;
        int i = ur80Var.d;
        int i2 = (int) (j2 & 4294967295L);
        int i3 = i2 - this.a;
        int iC = l1d.C(this.b);
        int i4 = this.d;
        int i5 = this.c;
        if (iC == 0) {
            int iF = l1d.f(ur80Var.d(), (int) (j2 >> 32), 2, ur80Var.a);
            int i6 = ((((int) (j & 4294967295L)) - this.e) - i3) - i5;
            int i7 = i4 + i5;
            int i8 = (ur80Var.b - i3) - i5;
            if (i8 < 0) {
                i8 = i + i5;
            }
            jP = (((long) iF) << 32) | (((long) yoi1.p(i8, i7, i6)) & 4294967295L);
        } else {
            if (iC != 1) {
                eg.o();
                return 0L;
            }
            int i9 = ur80Var.c;
            int iF2 = l1d.f(((int) (j >> 32)) - i9, (int) (j2 >> 32), 2, i9);
            int i10 = i - i2;
            int i11 = i9 + i5;
            if (iF2 < i11) {
                iF2 = i11;
            }
            if (i10 >= i4) {
                i4 = i10;
            }
            jP = (((long) i4) & 4294967295L) | (((long) iF2) << 32);
        }
        iu30 iu30Var = this.f;
        if (iu30Var != null) {
            iu30Var.invoke(hm5.e(jP, (((long) i3) & 4294967295L) | (((long) ((int) (j2 >> 32))) << 32)));
        }
        return jP;
    }
}
