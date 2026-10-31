package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zcc implements gtf1 {
    public final int a;
    public final ie30 b;
    public final x6u c = new x6u();
    public ie30 d;
    public gtf1 e;
    public long f;

    public zcc(int i, int i2, ie30 ie30Var) {
        this.a = i2;
        this.b = ie30Var;
    }

    @Override // p.gtf1
    public final void a(ie30 ie30Var) {
        ie30 ie30Var2 = this.b;
        if (ie30Var2 != null) {
            ie30Var = ie30Var.f(ie30Var2);
        }
        this.d = ie30Var;
        gtf1 gtf1Var = this.e;
        String str = zoi1.a;
        gtf1Var.a(ie30Var);
    }

    @Override // p.gtf1
    public final void b(long j, int i, int i2, int i3, ftf1 ftf1Var) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        gtf1 gtf1Var = this.e;
        String str = zoi1.a;
        gtf1Var.b(j, i, i2, i3, ftf1Var);
    }

    @Override // p.gtf1
    public final void c(izr0 izr0Var, int i, int i2) {
        gtf1 gtf1Var = this.e;
        String str = zoi1.a;
        gtf1Var.f(i, izr0Var);
    }

    @Override // p.gtf1
    public final int d(z0r z0rVar, int i, boolean z) {
        gtf1 gtf1Var = this.e;
        String str = zoi1.a;
        return gtf1Var.e(z0rVar, i, z);
    }
}
