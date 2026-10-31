package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f32p;
    public final Object q;
    public final Object r;

    public qq(y6i0 y6i0Var, ivj ivjVar, z6i0 z6i0Var, q7r0 q7r0Var) {
        this.a = y6i0Var;
        this.b = z6i0Var;
        this.c = q7r0Var;
        this.d = iy81.a(new blp(this, 2, (byte) 29));
        this.e = iy81.a(new blp(this, 3, (byte) 29));
        this.f = xqu.b(new blp(this, 4, (byte) 29));
        this.g = iy81.a(new blp(this, 6, (byte) 29));
        this.h = iy81.a(new blp(this, 5, (byte) 29));
        this.i = xqu.b(new blp(this, 7, (byte) 29));
        this.j = iy81.a(new blp(this, 1, (byte) 29));
        this.k = iy81.a(new blp(this, 10, (byte) 29));
        this.l = iy81.a(new blp(this, 9, (byte) 29));
        this.m = iy81.a(new blp(this, 8, (byte) 29));
        this.n = iy81.a(new blp(this, 0, (byte) 29));
        this.o = xqu.b(new blp(this, 11, (byte) 29));
        this.f32p = iy81.a(new blp(this, 13, (byte) 29));
        this.q = xqu.b(new blp(this, 12, (byte) 29));
        this.r = xqu.b(new blp(this, 14, (byte) 29));
    }

    public zsc a() {
        n3x0 n3x0Var = (n3x0) this.b;
        ccc0 ccc0Var = (ccc0) n3x0Var.s.get();
        c8o.l(ccc0Var);
        g7h g7hVar = (g7h) n3x0Var.t.get();
        c8o.l(g7hVar);
        uo5 uo5Var = new uo5(ccc0Var, g7hVar, new c4n0((q7r0) this.a));
        r630 r630Var = (r630) n3x0Var.j.get();
        c8o.l(r630Var);
        w430 w430Var = (w430) n3x0Var.q.get();
        c8o.l(w430Var);
        q8n q8nVar = (q8n) n3x0Var.d.get();
        c8o.l(q8nVar);
        return new zsc(uo5Var, r630Var, w430Var, q8nVar, (byte) 9);
    }

    public va40 b() {
        mb1 mb1Var = (mb1) this.a;
        RetrofitMaker retrofitMaker = (RetrofitMaker) mb1Var.i.get();
        c8o.l(retrofitMaker);
        oa40 oa40Var = (oa40) retrofitMaker.createWebgateService(oa40.class, "android-genalphablocking-datasourceimpl");
        uu00 uu00Var = (uu00) mb1Var.j.get();
        c8o.l(uu00Var);
        return new va40(oa40Var, new amd(uu00Var));
    }

    public oxi0 c() {
        q7r0 q7r0Var = (q7r0) this.a;
        return new oxi0(u1n0.z(q7r0Var), cwl1.G(q7r0Var), new hvp0((y3x0) this.c, (byte) 21));
    }

    public wmy d() {
        i8h1 i8h1VarZ = u1n0.z((q7r0) this.a);
        n3x0 n3x0Var = (n3x0) this.b;
        dg30 dg30Var = (dg30) n3x0Var.o.get();
        c8o.l(dg30Var);
        r35 r35Var = (r35) n3x0Var.W.get();
        c8o.l(r35Var);
        return new wmy(i8h1VarZ, dg30Var, r35Var, (o3x0) ((ywp) this.i).get());
    }

    public g5l0 e() {
        nb1 nb1Var = (nb1) this.c;
        n8h1 h7l0Var = new h7l0((byte) 13);
        n8h1 h7l0Var2 = new h7l0((byte) 12);
        int iOrdinal = nb1Var.c.ordinal();
        if (iOrdinal == 0) {
            h7l0Var = h7l0Var2;
        } else if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        return new g5l0(h7l0Var.b(), (byte) 9);
    }

    public qq(gw70 gw70Var, Function0 function0, Function0 function1, p731 p731Var, kko kkoVar, ojv0 ojv0Var, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, cua cuaVar, n801 n801Var, e9g1 e9g1Var, tbw0 tbw0Var, iuj iujVar, yqg yqgVar, mev mevVar, zob1 zob1Var, oyo oyoVar) {
        this.a = gw70Var;
        this.b = function0;
        this.d = function1;
        this.e = p731Var;
        this.f = kkoVar;
        this.g = ojv0Var;
        this.h = aru0Var;
        this.i = ycmVar;
        this.j = aru0Var2;
        this.k = myq0Var;
        this.l = n801Var;
        this.m = e9g1Var;
        this.n = tbw0Var;
        this.o = iujVar;
        this.c = yqgVar;
        this.f32p = mevVar;
        this.q = zob1Var;
        this.r = oyoVar;
    }

    public qq(vwv vwvVar, xwv xwvVar, q7r0 q7r0Var) {
        this.a = xwvVar;
        this.b = vwvVar;
        this.c = q7r0Var;
        byte b = 8;
        this.d = xqu.b(new lbp(this, 0, b));
        this.e = xqu.b(new lbp(this, 2, b));
        this.f = xqu.b(new lbp(this, 1, b));
        this.g = iy81.a(new lbp(this, 4, b));
        this.h = xqu.b(new lbp(this, 3, b));
        this.i = new lbp(this, 7, b);
        this.j = iy81.a(new lbp(this, 9, b));
        this.k = new lbp(this, b, b);
        this.l = new lbp(this, 10, b);
        this.m = xqu.b(new lbp(this, 6, b));
        this.n = iy81.a(new lbp(this, 11, b));
        this.o = new lbp(this, 5, b);
        this.f32p = iy81.a(new lbp(this, 14, b));
        this.q = xqu.b(new lbp(this, 13, b));
        this.r = xqu.b(new lbp(this, 12, b));
    }

    public qq(mb1 mb1Var, nb1 nb1Var, q7r0 q7r0Var) {
        this.a = mb1Var;
        this.b = q7r0Var;
        this.c = nb1Var;
        this.d = new fwo(this, 2, (byte) 3);
        this.e = iy81.a(new fwo(this, 1, (byte) 3));
        this.f = iy81.a(new fwo(this, 0, (byte) 3));
        this.g = iy81.a(new fwo(this, 4, (byte) 3));
        this.h = iy81.a(new fwo(this, 3, (byte) 3));
        this.i = xqu.b(new fwo(this, 7, (byte) 3));
        this.j = new fwo(this, 6, (byte) 3);
        this.k = iy81.a(new fwo(this, 5, (byte) 3));
        this.l = iy81.a(new fwo(this, 8, (byte) 3));
        this.m = iy81.a(new fwo(this, 9, (byte) 3));
        this.n = iy81.a(new fwo(this, 10, (byte) 3));
        this.o = iy81.a(new fwo(this, 11, (byte) 3));
        this.f32p = iy81.a(new fwo(this, 12, (byte) 3));
        this.q = iy81.a(new fwo(this, 13, (byte) 3));
        this.r = xqu.b(new fwo(this, 14, (byte) 3));
    }

    public qq(jyv jyvVar, lyv lyvVar, q7r0 q7r0Var) {
        this.a = lyvVar;
        this.b = jyvVar;
        this.c = q7r0Var;
        byte b = 9;
        this.d = xqu.b(new lbp(this, 0, b));
        this.e = iy81.a(new lbp(this, 2, b));
        this.f = xqu.b(new lbp(this, 4, b));
        this.g = xqu.b(new lbp(this, 3, b));
        this.h = xqu.b(new lbp(this, 1, b));
        this.i = new lbp(this, 7, b);
        this.j = iy81.a(new lbp(this, b, b));
        this.k = new lbp(this, 8, b);
        this.l = new lbp(this, 10, b);
        this.m = new lbp(this, 11, b);
        this.n = xqu.b(new lbp(this, 6, b));
        this.o = new lbp(this, 5, b);
        this.f32p = iy81.a(new lbp(this, 14, b));
        this.q = xqu.b(new lbp(this, 13, b));
        this.r = xqu.b(new lbp(this, 12, b));
    }

    public qq(n3x0 n3x0Var, zuj zujVar, y3x0 y3x0Var, q7r0 q7r0Var) {
        this.a = q7r0Var;
        this.b = n3x0Var;
        this.c = y3x0Var;
        this.d = zujVar;
        this.e = xqu.b(new ywp(this, 0, (byte) 28));
        this.f = xqu.b(new ywp(this, 2, (byte) 28));
        this.g = xqu.b(new ywp(this, 1, (byte) 28));
        this.h = xqu.b(new ywp(this, 3, (byte) 28));
        this.i = new ywp(this, 6, (byte) 28);
        this.j = xqu.b(new ywp(this, 7, (byte) 28));
        this.k = new ywp(this, 5, (byte) 28);
        this.l = xqu.b(new ywp(this, 9, (byte) 28));
        this.m = iy81.a(new ywp(this, 8, (byte) 28));
        this.n = iy81.a(new ywp(this, 4, (byte) 28));
        this.o = iy81.a(new ywp(this, 10, (byte) 28));
        this.f32p = new ywp(this, 11, (byte) 28);
        this.q = new ywp(this, 12, (byte) 28);
        this.r = iy81.a(new ywp(this, 13, (byte) 28));
    }

    public qq(nbq0 nbq0Var, sgq0 sgq0Var, req0 req0Var, q7r0 q7r0Var) {
        this.a = sgq0Var;
        this.b = nbq0Var;
        this.c = q7r0Var;
        this.d = new ywp(this, 0, (byte) 3);
        this.e = new ywp(this, 1, (byte) 3);
        this.f = new ywp(this, 2, (byte) 3);
        this.g = xqu.b(new ywp(this, 4, (byte) 3));
        this.h = iy81.a(new ywp(this, 3, (byte) 3));
        this.i = iy81.a(new ywp(this, 8, (byte) 3));
        this.j = new ywp(this, 7, (byte) 3);
        this.k = new ywp(this, 6, (byte) 3);
        this.l = new ywp(this, 10, (byte) 3);
        this.m = new ywp(this, 9, (byte) 3);
        this.n = new ywp(this, 5, (byte) 3);
        this.o = new ywp(this, 12, (byte) 3);
        this.f32p = new ywp(this, 13, (byte) 3);
        this.q = new ywp(this, 11, (byte) 3);
        this.r = new ywp(this, 14, (byte) 3);
    }

    public qq(Context context, wve0 wve0Var, yqg yqgVar, nfa0 nfa0Var, uh8 uh8Var, Flowable flowable, luk lukVar, mya1 mya1Var, RetrofitMaker retrofitMaker, xm41 xm41Var, xm41 xm41Var2, wbd1 wbd1Var, vbd1 vbd1Var, Scheduler scheduler, q8n q8nVar, yv yvVar, g0l g0lVar, t2j0 t2j0Var, n4f0 n4f0Var) {
        this.a = context;
        this.b = wve0Var;
        this.c = yqgVar;
        this.d = nfa0Var;
        this.e = uh8Var;
        this.f = flowable;
        this.g = lukVar;
        this.h = mya1Var;
        this.i = retrofitMaker;
        this.j = xm41Var;
        this.k = xm41Var2;
        this.l = wbd1Var;
        this.m = vbd1Var;
        this.n = scheduler;
        this.o = q8nVar;
        this.f32p = yvVar;
        this.q = g0lVar;
        this.r = t2j0Var;
    }
}
