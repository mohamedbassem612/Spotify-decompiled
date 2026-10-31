package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class luu implements tyq {
    public final psw N0;
    public final kuu O0;
    public final buu X;
    public final js20 Y;
    public final ia00 Z;
    public final rzo0 a;
    public final m021 b;
    public final hx7 c;
    public final e821 d;
    public final cab e;
    public final drp0 f;
    public final boolean g;
    public final d0r h;
    public final y281 i;
    public final o3r t;

    public luu(rzo0 rzo0Var, m021 m021Var, hx7 hx7Var, e821 e821Var, cab cabVar, drp0 drp0Var, s8q s8qVar, boolean z, d0r d0rVar, q8n q8nVar) {
        this.a = rzo0Var;
        this.b = m021Var;
        this.c = hx7Var;
        this.d = e821Var;
        this.e = cabVar;
        this.f = drp0Var;
        this.g = z;
        this.h = d0rVar;
        this.i = new y281(s8qVar);
        wiu wiuVar = wiu.Z0;
        l4r l4rVar = new l4r(b2v.a, 2, juu.d, new j4r(wiuVar), juu.e);
        jd11 jd11Var = rc11.a;
        l4r l4rVar2 = new l4r(new xv00(jd11Var.b(hll.class)), 2, juu.f, new j4r(wiu.a1), juu.g);
        l4r l4rVar3 = new l4r(new xv00(jd11Var.b(l1z.class)), 2, juu.h, new j4r(wiu.b1), juu.i);
        l4r l4rVar4 = new l4r(new xv00(jd11Var.b(jo70.class)), 2, juu.t, new j4r(wiu.c1), juu.X);
        l4r l4rVar5 = new l4r(new xv00(jd11Var.b(prl.class)), 2, juu.Y, new j4r(new guu(this, (byte) 3)), juu.c);
        hvm hvmVar = hvm.d;
        ppa0 ppa0Var = qrl.a;
        this.t = w3p1.g(l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, new l4r(hvmVar, 3, juu.Z, new k4r(new guu(this, (byte) 4), ppa0Var), juu.N0), new l4r(new f7n(), 3, juu.O0, new j4r(wiu.d1), juu.P0), new l4r(new f7n(), 3, juu.Q0, new j4r(wiu.e1), juu.R0), new l4r(jd0.A, 3, juu.S0, new j4r(juu.b), juu.T0), new iuu(this));
        fuu fuuVar = fuu.b;
        this.X = new buu(f2v.a, null, fuuVar, false, fuu.c, fuuVar);
        this.Y = a4p1.h(new guu(this, (byte) 0), new guu(this, (byte) 1), new htu(this, (byte) 1), q8nVar, new guu(this, (byte) 2));
        this.Z = n3o1.q(this).a(riu.X, riu.Y);
        j2i j2iVar = new j2i(-1678333332, new ent(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
        this.O0 = new kuu(this);
    }

    public static final boolean l(euu euuVar) {
        fuu fuuVar = euuVar.f;
        fuu fuuVar2 = fuu.c;
        return fuuVar.equals(fuuVar2) || euuVar.g.equals(fuuVar2);
    }

    public static final boolean m(duu duuVar) {
        return nhc1.Y(duuVar.a, "spotify:local:", false);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.N0;
    }

    public final d0r e() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.Y;
    }

    public final f4r getData() {
        return this.O0;
    }
}
