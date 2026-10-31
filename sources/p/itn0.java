package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class itn0 implements xpw {
    public static final long h;
    public static final ssn0 i;
    public final lzn0 a;
    public final d1n0 b;
    public final hcs c;
    public final t0n0 d;
    public final js20 e;
    public final ia00 f;
    public final psw g;

    static {
        ytw0 ytw0Var = jfv.b;
        h = fdg1.k0(500, ngv.MILLISECONDS);
        i = new ssn0(null, sbn0.d1, sbn0.e1);
    }

    public itn0(lzn0 lzn0Var, d1n0 d1n0Var, hcs hcsVar, t0n0 t0n0Var) {
        this.a = lzn0Var;
        this.b = d1n0Var;
        this.c = hcsVar;
        this.d = t0n0Var;
        xy50 xy50Var = new xy50(this, (byte) 18);
        fns fnsVar = igu.a;
        this.e = x3p1.l(xy50Var, pyf0.a.f, new xkm0(this, (byte) 22));
        this.f = n3o1.q(this).a(h40.Y0, new kds(this, (byte) 27));
        j2i j2iVarJ = apo.j(-1399399467, new m04(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
