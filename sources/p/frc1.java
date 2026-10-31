package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class frc1 implements gtf1 {
    public final gtf1 a;
    public final jqc1 b;
    public lqc1 g;
    public ie30 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = zoi1.b;
    public final izr0 c = new izr0();

    public frc1(gtf1 gtf1Var, jqc1 jqc1Var) {
        this.a = gtf1Var;
        this.b = jqc1Var;
    }

    @Override // p.gtf1
    public final void a(ie30 ie30Var) {
        ie30Var.f66p.getClass();
        String str = ie30Var.f66p;
        dm5.m(asj0.i(str) == 3);
        boolean zEquals = ie30Var.equals(this.h);
        jqc1 jqc1Var = this.b;
        if (!zEquals) {
            this.h = ie30Var;
            this.g = jqc1Var.e(ie30Var) ? jqc1Var.h(ie30Var) : null;
        }
        lqc1 lqc1Var = this.g;
        gtf1 gtf1Var = this.a;
        if (lqc1Var == null) {
            gtf1Var.a(ie30Var);
            return;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.o = asj0.p("application/x-media3-cues");
        ge30VarA.k = str;
        ge30VarA.t = Long.MAX_VALUE;
        ge30VarA.P = jqc1Var.c(ie30Var);
        xvj1.q(ge30VarA, gtf1Var);
    }

    @Override // p.gtf1
    public final void b(long j, int i, int i2, int i3, ftf1 ftf1Var) {
        int i4;
        if (this.g == null) {
            this.a.b(j, i, i2, i3, ftf1Var);
            return;
        }
        dm5.n(ftf1Var == null, "DRM on subtitles is not supported");
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.g(this.f, i4, i2, kqc1.c, new mfr(this, j, i));
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                oon1.I("Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // p.gtf1
    public final void c(izr0 izr0Var, int i, int i2) {
        if (this.g == null) {
            this.a.c(izr0Var, i, i2);
            return;
        }
        h(i);
        izr0Var.o(this.e, this.f, i);
        this.e += i;
    }

    @Override // p.gtf1
    public final int d(z0r z0rVar, int i, boolean z) {
        if (this.g == null) {
            return this.a.d(z0rVar, i, z);
        }
        h(i);
        int i2 = z0rVar.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        eg.l();
        return 0;
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
