package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rqu0 implements tyq {
    public static final o3r h;
    public final Flowable a;
    public final d0r b;
    public final vlu c;
    public final js20 d = z0o1.j(new qqu0(this, (byte) 0), fnt0.X0, new qqu0(this, (byte) 1), 4);
    public final psw e;
    public final o3r f;
    public final ia00 g;

    static {
        jd11 jd11Var = rc11.a;
        h = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, lqu0.t, new j4r(lqu0.c), lqu0.X), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, lqu0.f, new j4r(lqu0.d), lqu0.g), new l4r(new xv00(jd11Var.b(hll.class)), 2, lqu0.h, new j4r(lqu0.e), lqu0.i), mgn0.N0);
    }

    public rqu0(Flowable flowable, d0r d0rVar, vlu vluVar) {
        this.a = flowable;
        this.b = d0rVar;
        this.c = vluVar;
        j2i j2iVar = new j2i(545392162, new t9r0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = h;
        this.g = n3o1.q(this).a(gou0.d, gou0.e);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.e;
    }

    public final d0r e() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.d;
    }

    public final f4r getData() {
        return this.f;
    }
}
