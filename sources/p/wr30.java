package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wr30 implements xpw {
    public final ynb0 a;
    public final pqq0 b;
    public final t2p0 c;
    public final boolean d;
    public final s2p0 e;
    public final js20 f;
    public final ia00 g;
    public final psw h;

    public wr30(ynb0 ynb0Var, pqq0 pqq0Var, t2p0 t2p0Var, ah4 ah4Var) {
        this.a = ynb0Var;
        this.b = pqq0Var;
        this.c = t2p0Var;
        boolean zA = ah4Var.a();
        this.d = zA;
        s2p0 s2p0Var = pqq0Var == pqq0.b ? s2p0.b : s2p0.a;
        this.e = zA ? (s2p0) t2p0Var.a().a.getValue() : s2p0Var;
        this.f = x3p1.m(zA ? t2p0Var.a() : new huz(s2p0Var, (byte) 10), new vr30(this, (byte) 0), bp30.i, (o8n) null, new vr30(this, (byte) 1), 8);
        this.g = n3o1.q(this).a(rc30.R0, rc30.S0);
        j2i j2iVar = upi.a;
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
