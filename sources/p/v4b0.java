package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v4b0 implements tyq {
    public final gw70 a;
    public final lzn0 b;
    public final d0r c;
    public final poy0 d = f2p1.p(new u4b0(this, (byte) 0), new u4b0(this, (byte) 1), new ry90(this, (byte) 3), new u4b0(this, (byte) 2), 8);
    public final ia00 e = n3o1.q(this).a(lta0.d, lta0.e);
    public final psw f;
    public final o3r g;

    public v4b0(d0r d0rVar, gw70 gw70Var, lzn0 lzn0Var) {
        this.a = gw70Var;
        this.b = lzn0Var;
        this.c = d0rVar;
        j2i j2iVar = new j2i(2023351311, new pba0(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        jd11 jd11Var = rc11.a;
        this.g = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, jqa0.T0, new j4r(jqa0.P0), jqa0.U0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, jqa0.R0, new j4r(jqa0.Q0), jqa0.S0), ul90.V0);
    }

    public static h7e f(t4b0 t4b0Var, g7e g7eVar) {
        u7h u7hVar;
        String str = t4b0Var.a;
        String str2 = g7eVar.b;
        int i = g7eVar.c;
        String str3 = t4b0Var.d;
        u7h u7hVar2 = t4b0Var.c;
        return new h7e(str, str2, i, str3, (u7hVar2 == null || (u7hVar = t4b0Var.b) == null) ? null : new e7e(u7hVar2, u7hVar));
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.d;
    }

    public final f4r getData() {
        return this.g;
    }
}
