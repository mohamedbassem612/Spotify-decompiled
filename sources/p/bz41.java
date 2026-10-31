package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bz41 implements xpw {
    public final cz00 a;
    public final b431 b;
    public final rey0 c = new rey0(new lw11(this, (byte) 28));
    public final hy00 d;
    public final psw e;

    public bz41(lik1 lik1Var, g431 g431Var, n6r0 n6r0Var, cz00 cz00Var) {
        this.a = cz00Var;
        this.b = g431Var.a(uj1.h, new az41(this, (byte) 0));
        xr6 xr6VarQ = n3o1.q(this);
        String strPath = n6r0Var.path();
        String str = lik1Var.a;
        krz0 krz0Var = krz0.T0;
        this.d = new hy00(xr6VarQ.a(new gk0(strPath, str, krz0Var, (byte) 12), new aaq0(this, (byte) 21)), krz0Var, (byte) 0);
        j2i j2iVar = sej.b;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
