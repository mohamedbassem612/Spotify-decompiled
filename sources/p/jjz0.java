package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jjz0 implements tyq {
    public final d0r a;
    public final lzn0 b;
    public final idd1 c = new idd1(ijz0.b);
    public final o3r d;
    public final js20 e;
    public final ia00 f;
    public final psw g;

    public jjz0(d0r d0rVar, lzn0 lzn0Var, xip xipVar) {
        this.a = d0rVar;
        this.b = lzn0Var;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, lcz0.R0, new j4r(lcz0.P0), lcz0.S0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, lcz0.T0, new j4r(lcz0.Q0), lcz0.U0), j8y0.b1);
        this.e = x3p1.n(new hjz0(this, (byte) 0), new ldz0(this, (byte) 4), new xgr0(this, (byte) 25), (o8n) null, new hjz0(this, (byte) 1), 8);
        this.f = n3o1.q(this).a(g2z0.U0, new ixt0(this, (byte) 27));
        j2i j2iVar = new j2i(954600308, new zyy0(xipVar, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public static gjz0 f(gjz0 gjz0Var) {
        String str = gjz0Var.b;
        String str2 = gjz0Var.g;
        return new gjz0(gjz0Var.a, nhc1.W(str, "{quizName}", str2), gjz0Var.c, gjz0Var.d, gjz0Var.e, gjz0Var.f, str2, gjz0Var.h);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return this.d;
    }
}
