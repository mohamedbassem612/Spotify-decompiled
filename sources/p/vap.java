package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vap {
    public final ans a;
    public final pms b;
    public final jly0 c = iy81.a(new i8p(this, 0, (byte) 11));
    public final jly0 d = iy81.a(new i8p(this, 1, (byte) 11));

    public vap(ans ansVar, pms pmsVar) {
        this.a = ansVar;
        this.b = pmsVar;
    }

    public final zms a() {
        d0r d0rVar = (d0r) this.c.get();
        ans ansVar = this.a;
        zwm1 zwm1Var = ansVar.d;
        c8o.l(zwm1Var);
        agc0 agc0Var = ansVar.e;
        c8o.l(agc0Var);
        return new zms(new tm(new nm1(d0rVar, zwm1Var, agc0Var), (oms) this.d.get(), this.b));
    }
}
