package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bhe1 {
    public final int a;
    public final byte b;
    public final byte c;
    public final pim0 d;
    public final iu30 e;
    public bhe1 f;
    public long g;
    public long h;
    public long i = Long.MIN_VALUE;
    public long j = -1;
    public final /* synthetic */ che1 k;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte, int] */
    public bhe1(che1 che1Var, int i, long j, long j2, pim0 pim0Var, iu30 iu30Var) {
        this.k = che1Var;
        this.a = i;
        this.b = (int) j;
        this.c = (int) j2;
        this.d = pim0Var;
        this.e = iu30Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        ho11 ho11VarT = b9p1.t(j, j2, j3, j4, this.k.f, this.d, fArr);
        if (ho11VarT == null) {
            return;
        }
        this.e.invoke(ho11VarT);
    }

    public final void b() {
        che1 che1Var = this.k;
        fdn0 fdn0Var = che1Var.a;
        int i = this.a;
        bhe1 bhe1Var = (bhe1) fdn0Var.g(i);
        if (bhe1Var != null) {
            if (bhe1Var == this) {
                bhe1 bhe1Var2 = this.f;
                this.f = null;
                if (bhe1Var2 != null) {
                    int iD = fdn0Var.d(i);
                    Object[] objArr = fdn0Var.c;
                    Object obj = objArr[iD];
                    fdn0Var.b[iD] = i;
                    objArr[iD] = bhe1Var2;
                    return;
                }
                hmb0 hmb0VarB = oap1.B(this.d.a);
                if (hmb0VarB.I()) {
                    q511 rectManager = ((ha4) kmb0.a(hmb0VarB)).getRectManager();
                    rectManager.getClass();
                    if (hmb0VarB.g != -4) {
                        que0 que0Var = rectManager.c;
                        int iD2 = rectManager.d(hmb0VarB);
                        long[] jArr = (long[]) que0Var.c;
                        int i2 = iD2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD3 = fdn0Var.d(i);
            Object[] objArr2 = fdn0Var.c;
            Object obj2 = objArr2[iD3];
            fdn0Var.b[iD3] = i;
            objArr2[iD3] = bhe1Var;
            while (true) {
                bhe1 bhe1Var3 = bhe1Var.f;
                if (bhe1Var3 == null) {
                    break;
                }
                if (bhe1Var3 == this) {
                    bhe1Var.f = this.f;
                    this.f = null;
                    return;
                }
                bhe1Var = bhe1Var3;
            }
        }
        bhe1 bhe1Var4 = che1Var.b;
        if (bhe1Var4 == this) {
            che1Var.b = bhe1Var4.f;
            this.f = null;
            return;
        }
        bhe1 bhe1Var5 = bhe1Var4 != null ? bhe1Var4.f : null;
        while (true) {
            bhe1 bhe1Var6 = bhe1Var4;
            bhe1Var4 = bhe1Var5;
            if (bhe1Var4 == null) {
                return;
            }
            if (bhe1Var4 == this) {
                if (bhe1Var6 != null) {
                    bhe1Var6.f = bhe1Var4.f;
                }
                this.f = null;
                return;
            }
            bhe1Var5 = bhe1Var4.f;
        }
    }
}
