package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pa01 implements tyq {
    public final js20 X;
    public final ia00 Y;
    public final psw Z;
    public final d0r a;
    public final sma1 b;
    public final n6r0 c;
    public final boolean d;
    public final s801 e;
    public final jz51 f;
    public final tag1 g;
    public final o3r h;
    public final o3r i;
    public final o3r t;

    public pa01(d0r d0rVar, sma1 sma1Var, n6r0 n6r0Var, boolean z, uag1 uag1Var, s801 s801Var, jz51 jz51Var) {
        this.a = d0rVar;
        this.b = sma1Var;
        this.c = n6r0Var;
        this.d = z;
        this.e = s801Var;
        this.f = jz51Var;
        this.g = uag1Var.a();
        pwc0 pwc0Var = pwc0.w;
        o3r o3rVarO = w3p1.o(new l4r(pwc0Var, 1, oa01.c, new j4r(k301.e1), oa01.d), oa01.b);
        this.h = o3rVarO;
        this.i = w3p1.o(new l4r(pwc0Var, 1, oa01.e, new j4r(k301.c1), oa01.f), k301.d1);
        this.t = o3rVarO;
        this.X = x3p1.n(new na01(this, (byte) 0), k301.b1, atz0.Z, (o8n) null, new na01(this, (byte) 1), 8);
        this.Y = n3o1.q(this).a(new g001(this, (byte) 2), kxz0.O0);
        j2i j2iVar = new j2i(-245249269, new zyy0(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.Z = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.Z;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.X;
    }

    public final f4r getData() {
        return this.t;
    }
}
