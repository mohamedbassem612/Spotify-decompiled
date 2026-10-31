package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class miz0 implements xpw {
    public final kiz0 a;
    public final amq b;
    public final bmq c;
    public final xip d;
    public final zja1 e;
    public final rgn0 f;
    public final jce g;
    public final e7m0 h;
    public final ia00 i;
    public final psw t;

    public miz0(kiz0 kiz0Var, zlq zlqVar, amq amqVar, bmq bmqVar, xip xipVar, zja1 zja1Var, rgn0 rgn0Var) {
        this.a = kiz0Var;
        this.b = amqVar;
        this.c = bmqVar;
        this.d = xipVar;
        this.e = zja1Var;
        this.f = rgn0Var;
        wwo1 wwo1Var = kiz0Var.b;
        yh yhVar = wwo1Var instanceof yh ? (yh) wwo1Var : null;
        jce jceVar = yhVar != null ? yhVar.b : null;
        this.g = jceVar;
        fiz0 fiz0Var = new fiz0(kiz0Var.a, jceVar != null ? jceVar.b : null, jceVar != null ? jceVar.a : null);
        wam0 wam0Var = new wam0((byte) 10);
        ojq ojqVar = (ojq) zlqVar.a.c;
        i6n0 i6n0VarC = ojqVar.c();
        jiz0 jiz0Var = (jiz0) ojqVar.b;
        jiz0 jiz0Var2 = (jiz0) ojqVar.b;
        RetrofitMaker retrofitMaker = (RetrofitMaker) jiz0Var.g.get();
        c8o.l(retrofitMaker);
        e5l0 e5l0Var = new e5l0((p7n0) retrofitMaker.createWebgateService(p7n0.class, "android-musicquiz-network-quizui"), (byte) 3);
        lzn0 lzn0VarB = jiz0Var2.b();
        c8o.l(lzn0VarB);
        q8n q8nVar = (q8n) jiz0Var2.a.get();
        c8o.l(q8nVar);
        q8n q8nVarA = jiz0Var2.a();
        c8o.l(q8nVarA);
        this.h = sbl.z(fiz0Var, wam0Var, new zhz0(i6n0VarC, e5l0Var, lzn0VarB, q8nVar, q8nVarA).e, j8y0.Y0, new liz0(this, (byte) 1));
        this.i = n3o1.q(this).a(new ixt0(this, (byte) 26), g2z0.R0);
        j2i j2iVar = new j2i(-363617658, new zyy0(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
