package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nkp {
    public final sr90 a;
    public final uy90 b;
    public final jly0 c = xqu.b(new chp(this, 0, (byte) 27));
    public final chp d = new chp(this, 1, (byte) 27);
    public final jly0 e = byo.k(this, 2);
    public final jly0 f = byo.k(this, 3);
    public final jly0 g = byo.k(this, 6);
    public final jly0 h = byo.k(this, 7);
    public final jly0 i = byo.k(this, 5);
    public final jly0 j = byo.k(this, 4);
    public final jly0 k = byo.k(this, 8);
    public final jly0 l = byo.k(this, 9);
    public final jly0 m = byo.k(this, 10);
    public final jly0 n = xqu.b(new chp(this, 11, (byte) 27));
    public final chp o = new chp(this, 12, (byte) 27);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f30p = byo.k(this, 13);
    public final jly0 q = byo.k(this, 14);
    public final jly0 r = byo.k(this, 15);
    public final chp s = new chp(this, 16, (byte) 27);
    public final chp t = new chp(this, 17, (byte) 27);
    public final chp u = new chp(this, 19, (byte) 27);
    public final jly0 v = byo.k(this, 18);
    public final chp w = new chp(this, 20, (byte) 27);
    public final jly0 x = byo.k(this, 21);
    public final chp y = new chp(this, 22, (byte) 27);
    public final jly0 z = byo.k(this, 25);
    public final jly0 A = byo.k(this, 24);
    public final jly0 B = byo.k(this, 23);
    public final jly0 C = byo.k(this, 26);
    public final jly0 D = byo.k(this, 28);
    public final jly0 E = byo.k(this, 29);
    public final chp F = new chp(this, 27, (byte) 27);
    public final chp G = new chp(this, 30, (byte) 27);
    public final jly0 H = byo.k(this, 31);

    public nkp(uy90 uy90Var, sr90 sr90Var) {
        this.a = sr90Var;
        this.b = uy90Var;
    }

    public final ser a() {
        sr90 sr90Var = this.a;
        return new ser(sr90Var.d(), new ux70((p4a1) sr90Var.O.get(), (byte) 16));
    }

    public final vu60 b() {
        return (vu60) this.j.get();
    }

    public final z1s c() {
        return (z1s) this.h.get();
    }

    public final tq90 d() {
        lx91 lx91VarH = ((ukp) this.b).h();
        c8o.l(lx91VarH);
        sr90 sr90Var = this.a;
        return new tq90(lx91VarH, sr90Var.d(), new ux70((m4a1) sr90Var.N.get(), (byte) 28));
    }

    public final p4s e() {
        sr90 sr90Var = this.a;
        return new p4s(sr90Var.d(), new hu90((q4a1) sr90Var.P.get(), (byte) 6));
    }

    public final byp f() {
        return i();
    }

    public final iw60 g() {
        ser serVarA = a();
        vu60 vu60Var = (vu60) this.j.get();
        z1s z1sVar = (z1s) this.h.get();
        ukp ukpVar = (ukp) this.b;
        return new iw60(serVarA, vu60Var, z1sVar, new vun((zir0) ukpVar.W.get(), (byte) 16), new av60(((dj5) ukpVar.a.b).f(), (g0l) ukpVar.d.get()), this.a.c());
    }

    public final p410 h() {
        sr90 sr90Var = this.a;
        q8n q8nVarC = sr90Var.c();
        yqg yqgVar = (yqg) sr90Var.m.get();
        e831 e831VarD = sr90Var.d();
        xrc0 xrc0Var = (xrc0) sr90Var.G.get();
        Flowable flowable = (Flowable) sr90Var.J.get();
        ukp ukpVar = (ukp) this.b;
        return new p410(q8nVarC, new yz90(yqgVar, e831VarD, xrc0Var, flowable, ukpVar.l(), (t8u0) sr90Var.x.get(), (b7r0) sr90Var.E.get(), (q8n) sr90Var.f.get()), new st60(a(), (z1s) this.h.get(), (qds) this.k.get(), (byte) 2), e(), new j5a1(sr90Var.d(), (xc71) xqu.a(this.o).get()), (g0l) sr90Var.o.get(), ukpVar.j(), (byte) 14);
    }

    public final byp i() {
        ukp ukpVar = (ukp) this.b;
        c9c0 c9c0VarB = ukpVar.b();
        c8o.l(c9c0VarB);
        xap xapVarE = ukpVar.e();
        jly0 jly0Var = this.h;
        z1s z1sVar = (z1s) jly0Var.get();
        up41 up41Var = new up41(new h0y(a(), (byte) 29), (byte) 9);
        lx91 lx91VarH = ukpVar.h();
        c8o.l(lx91VarH);
        jut jutVar = new jut(lx91VarH, (z1s) jly0Var.get(), (byte) 2);
        p410 p410VarH = h();
        mr20 mr20VarE = this.a.e();
        g2z g2zVarL = ukpVar.l();
        b0a0 b0a0VarD = ukpVar.d();
        c8o.l(b0a0VarD);
        return new byp(c9c0VarB, xapVarE, z1sVar, up41Var, jutVar, p410VarH, mr20VarE, g2zVarL, b0a0VarD);
    }

    public final v4o0 j() {
        sr90 sr90Var = this.a;
        o4o0 o4o0Var = (o4o0) sr90Var.u.get();
        kqi0 kqi0Var = new kqi0(a(), (o1o0) this.f.get(), (rfr) this.c.get(), (byte) 21);
        kly0 kly0Var = sr90Var.v;
        return new v4o0(o4o0Var, kqi0Var, new kqi0((v1o0) kly0Var.get(), (yqg) sr90Var.m.get(), new h84((luk) sr90Var.A.get()), (byte) 22), (v1o0) kly0Var.get(), sr90Var.c(), (q8n) sr90Var.f.get());
    }

    public final yt91 k() {
        sr90 sr90Var = this.a;
        Context contextA = sr90Var.a();
        b0a0 b0a0VarD = ((ukp) this.b).d();
        c8o.l(b0a0VarD);
        return new yt91(contextA, b0a0VarD, new vyq0((xvo) sr90Var.L.get(), (byte) 2), sr90Var.f());
    }
}
