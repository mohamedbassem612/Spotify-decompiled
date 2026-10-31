package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xc80 extends yag {
    public final adc j;
    public it8 k;
    public long l;
    public volatile boolean m;

    public xc80(o2r o2rVar, n3r n3rVar, ie30 ie30Var, int i, Object obj, adc adcVar) {
        super(o2rVar, n3rVar, 2, ie30Var, i, obj, -9223372036854775807L, -9223372036854775807L, null);
        this.j = adcVar;
    }

    @Override // p.f9e0
    public final void a() {
        if (this.l == 0) {
            this.j.a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            n3r n3rVarD = this.b.d(this.l);
            rsb1 rsb1Var = this.i;
            uyr uyrVar = new uyr(rsb1Var, n3rVarD.f, rsb1Var.t(n3rVarD));
            while (!this.m) {
                try {
                    int iC = this.j.a.c(uyrVar, adc.i);
                    boolean z = false;
                    dm5.y(iC != 1);
                    if (iC == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } catch (Throwable th) {
                    this.l = uyrVar.d - this.b.f;
                    throw th;
                }
            }
            this.l = uyrVar.d - this.b.f;
            n3p1.k(this.i);
        } catch (Throwable th2) {
            n3p1.k(this.i);
            throw th2;
        }
    }

    @Override // p.f9e0
    public final void b() {
        this.m = true;
    }
}
