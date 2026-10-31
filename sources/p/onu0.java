package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class onu0 implements xpw {
    public final String a;
    public final rzq b;
    public final o3r c;
    public final o3r d;
    public final o3r e;
    public final js20 f;
    public final eih1 g;
    public final psw h;

    /* JADX WARN: Multi-variable type inference failed */
    public onu0(String str, kxc0 kxc0Var, mwc0 mwc0Var, dv00 dv00Var) {
        this.a = str;
        j3r j3rVar = rzq.y;
        this.b = l2p1.f(new w1k(new l2r[]{kxc0Var.a(bdc1.a), mwc0Var.a(), dv00Var}));
        this.c = w3p1.o(new l4r(pwc0.b, 2, rku0.P0, new j4r(rku0.N0), rku0.Q0), rku0.O0);
        this.d = w3p1.o(new l4r(pwc0.a, 2, rku0.R0, new j4r(rku0.Y), rku0.S0), rku0.Z);
        this.e = w3p1.o(new l4r(new xv00(rc11.a.b(xkk1.class)), 2, rku0.T0, new j4r(rku0.t), rku0.U0), rku0.X);
        this.f = x3p1.n(new mnu0(this, (byte) 0), new mnu0(this, (byte) 1), new t1t0(this, (byte) 14), (o8n) null, rku0.i, 8);
        this.g = new eih1();
        j2i j2iVar = q8j.a;
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
