package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class enl extends oba {
    public final int n;
    public final adc o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f46p;
    public volatile boolean q;
    public boolean r;

    public enl(o2r o2rVar, n3r n3rVar, ie30 ie30Var, int i, Object obj, long j, long j2, long j3, long j4, int i2, adc adcVar) {
        super(o2rVar, n3rVar, ie30Var, i, obj, j, j2, j3, j4);
        this.n = i2;
        this.o = adcVar;
    }

    @Override // p.f9e0
    public final void a() {
        it8 it8Var = this.l;
        it8Var.getClass();
        if (this.f46p == 0) {
            for (n541 n541Var : (n541[]) it8Var.c) {
                if (n541Var.I != 0) {
                    n541Var.I = 0L;
                    n541Var.C = true;
                }
            }
            adc adcVar = this.o;
            long j = this.k;
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            }
            adcVar.a(it8Var, j, -9223372036854775807L);
        }
        try {
            n3r n3rVarD = this.b.d(this.f46p);
            rsb1 rsb1Var = this.i;
            uyr uyrVar = new uyr(rsb1Var, n3rVarD.f, rsb1Var.t(n3rVarD));
            while (!this.q) {
                try {
                    int iC = this.o.a.c(uyrVar, adc.i);
                    dm5.y(iC != 1);
                    if (!(iC == 0)) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f46p = uyrVar.d - this.b.f;
                    throw th;
                }
            }
            ie30 ie30Var = this.d;
            String str = ie30Var.o;
            int i = ie30Var.R;
            int i2 = ie30Var.S;
            if (asj0.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                gtf1 gtf1VarC = it8Var.C(4);
                int i3 = i * i2;
                long j2 = (this.h - this.g) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    gtf1VarC.f(0, new izr0());
                    gtf1VarC.b(((long) i4) * j2, 0, 0, 0, null);
                }
            }
            this.f46p = uyrVar.d - this.b.f;
            n3p1.k(this.i);
            this.r = !this.q;
        } catch (Throwable th2) {
            n3p1.k(this.i);
            throw th2;
        }
    }

    @Override // p.f9e0
    public final void b() {
        this.q = true;
    }

    @Override // p.tjh0
    public final long c() {
        return this.j + ((long) this.n);
    }

    @Override // p.tjh0
    public final boolean d() {
        return this.r;
    }
}
