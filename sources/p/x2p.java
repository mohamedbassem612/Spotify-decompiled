package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;
import com.spotify.blend.tastematch.GroupBlendTasteMatchFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x2p {
    public final /* synthetic */ byte a;
    public final jly0 b;
    public final Object c;
    public final Object d;

    public x2p(asn asnVar) {
        this.a = (byte) 15;
        this.c = asnVar;
        byte b = 8;
        this.b = iy81.a(new i8p(this, 0, b));
        this.d = iy81.a(new i8p(this, 1, b));
    }

    public hx7 a() {
        h72 h72Var = (h72) this.c;
        Scheduler scheduler = (Scheduler) ((otu) h72Var.Y).b;
        c8o.m(scheduler);
        Flowable flowable = (Flowable) h72Var.d;
        c8o.l(flowable);
        Activity activity = (Activity) h72Var.i;
        c8o.l(activity);
        ut71 ut71Var = (ut71) h72Var.h;
        c8o.l(ut71Var);
        ix7 ix7Var = new ix7(activity, ut71Var, (bx7) this.b.get());
        b7n b7nVar = (b7n) h72Var.e;
        c8o.l(b7nVar);
        return new hx7(scheduler, flowable, ix7Var, b7nVar);
    }

    public ajq0 b() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 2:
                l5e l5eVar = (l5e) obj;
                pnv0 pnv0Var = (pnv0) l5eVar.c.get();
                c8o.l(pnv0Var);
                oto0 oto0VarA = l5eVar.a();
                c8o.l(oto0VarA);
                tym0 tym0Var = new tym0(oto0VarA, (byte) 29);
                c881 c881Var = (c881) l5eVar.e.get();
                c8o.l(c881Var);
                yla ylaVar = new yla((byte) 25);
                oto0 oto0VarA2 = l5eVar.a();
                c8o.l(oto0VarA2);
                return new ajq0(pnv0Var, tym0Var, c881Var, ylaVar, oto0VarA2);
            default:
                t5e t5eVar = (t5e) obj;
                pnv0 pnv0Var2 = (pnv0) t5eVar.c.get();
                c8o.l(pnv0Var2);
                tym0 tym0Var2 = new tym0(i(), (byte) 29);
                c881 c881Var2 = (c881) t5eVar.e.get();
                c8o.l(c881Var2);
                return new ajq0(pnv0Var2, tym0Var2, c881Var2, new yla((byte) 25), i());
        }
    }

    public cce c() {
        tbg tbgVar = (tbg) this.c;
        swv0 swv0Var = (swv0) tbgVar.d.get();
        c8o.l(swv0Var);
        lzn0 lzn0Var = (lzn0) tbgVar.b.get();
        c8o.l(lzn0Var);
        ybg ybgVar = (ybg) tbgVar.c.get();
        c8o.l(ybgVar);
        return new cce(swv0Var, lzn0Var, ybgVar, (byte) 10);
    }

    public dg8 d() {
        w4h w4hVar = (w4h) ((mak) this.c).n.get();
        c8o.l(w4hVar);
        return new dg8((Object) w4hVar, (byte) 24);
    }

    public rm5 e() {
        mak makVar = (mak) this.c;
        RetrofitMaker retrofitMaker = (RetrofitMaker) makVar.k.get();
        c8o.l(retrofitMaker);
        ybk ybkVarO = wyj.o(retrofitMaker);
        xrk xrkVar = (xrk) makVar.s.get();
        c8o.l(xrkVar);
        return new rm5(ybkVarO, xrkVar);
    }

    public suu f() {
        hx7 hx7VarA = a();
        h72 h72Var = (h72) this.c;
        Scheduler scheduler = (Scheduler) ((otu) h72Var.Y).c;
        c8o.m(scheduler);
        Activity activity = (Activity) h72Var.i;
        c8o.l(activity);
        nuu nuuVar = new nuu(activity);
        lzn0 lzn0Var = (lzn0) h72Var.t;
        c8o.l(lzn0Var);
        i8h1 i8h1Var = (i8h1) h72Var.b;
        c8o.l(i8h1Var);
        return new suu(hx7VarA, scheduler, nuuVar, lzn0Var, new z5h1(i8h1Var, new uol0(r6h1.c)));
    }

    public x1v g() {
        h72 h72Var = (h72) this.c;
        byp0 byp0Var = (byp0) h72Var.c;
        c8o.l(byp0Var);
        xrc0 xrc0Var = (xrc0) h72Var.f;
        c8o.l(xrc0Var);
        hx7 hx7VarA = a();
        q8n q8nVar = (q8n) ((vun) h72Var.X).b;
        c8o.m(q8nVar);
        b7n b7nVar = (b7n) h72Var.e;
        c8o.l(b7nVar);
        dxz0 dxz0Var = (dxz0) h72Var.g;
        c8o.l(dxz0Var);
        return new x1v(byp0Var, xrc0Var, hx7VarA, q8nVar, new m021(b7nVar, new ka(dxz0Var, (byte) 12)));
    }

    public wr00 h() {
        return new wr00((iac0) this.c, xqu.a(this.b));
    }

    public oto0 i() {
        t5e t5eVar = (t5e) this.c;
        luk lukVar = (luk) t5eVar.i.get();
        c8o.l(lukVar);
        yg4 yg4Var = new yg4(lukVar);
        add addVar = (add) t5eVar.n.get();
        c8o.l(addVar);
        return new oto0(yg4Var, addVar);
    }

    public u9u0 j() {
        y700 y700Var = (y700) this.c;
        t8u0 t8u0Var = (t8u0) y700Var.d.get();
        c8o.l(t8u0Var);
        q7r0 q7r0Var = (q7r0) this.d;
        cyp cypVarA = t8u0Var.a(q7r0Var.d.c.getLifecycle());
        b7r0 b7r0Var = (b7r0) y700Var.f.get();
        c8o.l(b7r0Var);
        t8u0 t8u0Var2 = (t8u0) y700Var.d.get();
        c8o.l(t8u0Var2);
        ruz ruzVarA = t8u0Var2.a(q7r0Var.d.c.getLifecycle()).a();
        Flowable flowable = (Flowable) y700Var.e.get();
        c8o.l(flowable);
        return new u9u0(cypVarA, b7r0Var, ruzVarA, flowable);
    }

    public gp41 k() {
        Bundle bundle = ((zf30) ((pf10) this.d)).f;
        njt parcelable = bundle != null ? bundle.getParcelable("ARG_SOURCE") : null;
        int i = parcelable == null ? -1 : qf10.a[parcelable.ordinal()];
        if (i != 1) {
            return i != 2 ? gp41.X : gp41.t;
        }
        return gp41.i;
    }

    public y1t0 l() {
        mak makVar = (mak) this.c;
        c8o.l((Context) makVar.h.a);
        c8o.l((dg30) makVar.g.a);
        xh71 xh71Var = (xh71) makVar.f.get();
        c8o.l(xh71Var);
        return new y1t0(xh71Var, (byte) 12);
    }

    public q3b1 m() {
        zuj zujVar = (zuj) this.c;
        gw70 gw70VarB = zujVar.b();
        pe peVarA = byo.a(gw70VarB, zujVar);
        c8o.l(zujVar.f());
        return new q3b1(gw70VarB, peVarA);
    }

    public x2p(qop qopVar, jbt jbtVar) {
        this.a = (byte) 8;
        this.c = jbtVar;
        this.d = qopVar;
        this.b = new z1p(this, (byte) 24);
    }

    public x2p(uzp uzpVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 13;
        this.c = qopVar;
        this.d = uzpVar;
        this.b = new j7p(this, (byte) 10);
    }

    public x2p(lzp lzpVar, qop qopVar, bct bctVar) {
        this.a = (byte) 11;
        this.c = lzpVar;
        this.d = qopVar;
        this.b = iy81.a(new j7p(this, (byte) 6));
    }

    public x2p(c21 c21Var) {
        this.a = (byte) 12;
        this.c = c21Var;
        byte b = 1;
        this.b = xqu.b(new i8p(this, 0, b));
        this.d = xqu.b(new i8p(this, b, b));
    }

    public x2p(x390 x390Var, iac0 iac0Var) {
        this.a = (byte) 24;
        this.c = iac0Var;
        this.d = x390Var;
        this.b = new xep(this, (byte) 2);
    }

    public x2p(kzp kzpVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 29;
        this.c = qopVar;
        this.d = kzpVar;
        this.b = new xep(this, (byte) 24);
    }

    public x2p(kzp kzpVar, qop qopVar, qbt qbtVar) {
        this.a = (byte) 19;
        this.c = kzpVar;
        this.d = qbtVar;
        this.b = new j7p(this, (byte) 26);
    }

    public x2p(l5e l5eVar, k5e k5eVar) {
        this.a = (byte) 2;
        this.c = l5eVar;
        this.b = xqu.b(new ewo(this, 1, (byte) 18));
        this.d = iy81.a(new ewo(this, 0, (byte) 18));
    }

    public x2p(kty ktyVar) {
        this.a = (byte) 21;
        this.c = ktyVar;
        byte b = 17;
        this.b = iy81.a(new i8p(this, 0, b));
        this.d = iy81.a(new i8p(this, 1, b));
    }

    public x2p(nf10 nf10Var, pf10 pf10Var) {
        this.a = (byte) 25;
        this.c = nf10Var;
        this.d = pf10Var;
        this.b = xqu.b(new xep(this, (byte) 4));
    }

    public x2p(jty jtyVar) {
        this.a = (byte) 22;
        this.c = jtyVar;
        byte b = 18;
        this.b = iy81.a(new i8p(this, 0, b));
        this.d = iy81.a(new i8p(this, 1, b));
    }

    public x2p(o5b o5bVar, BlendTasteMatchFragment blendTasteMatchFragment) {
        this.a = (byte) 0;
        this.c = o5bVar;
        this.d = blendTasteMatchFragment;
        this.b = iy81.a(new z1p(this, (byte) 12));
    }

    public x2p(bzu bzuVar, czu czuVar) {
        this.a = (byte) 18;
        this.c = bzuVar;
        byte b = 13;
        this.b = xqu.b(new i8p(this, 0, b));
        this.d = new i8p(this, 1, b);
    }

    public x2p(kzp kzpVar, qop qopVar, gl90 gl90Var) {
        this.a = (byte) 14;
        this.c = kzpVar;
        byte b = 4;
        this.d = new i8p(this, 1, b);
        this.b = iy81.a(new i8p(this, 0, b));
    }

    public x2p(pzb pzbVar, j0c j0cVar) {
        this.a = (byte) 1;
        this.c = pzbVar;
        this.b = xqu.b(new ewo(this, 0, (byte) 16));
        this.d = iy81.a(new ewo(this, 1, (byte) 16));
    }

    public x2p(fwe fweVar, gwe gweVar) {
        this.a = (byte) 4;
        this.c = fweVar;
        this.d = new ewo(this, 0, (byte) 21);
        this.b = xqu.b(new ewo(this, 1, (byte) 21));
    }

    public x2p(tbg tbgVar, q7r0 q7r0Var) {
        this.a = (byte) 7;
        this.c = tbgVar;
        this.d = q7r0Var;
        this.b = new z1p(this, (byte) 22);
    }

    public x2p(mqo mqoVar, nqo nqoVar, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.c = mqoVar;
        byte b = 10;
        this.b = xqu.b(new i8p(this, 0, b));
        this.d = new i8p(this, 1, b);
    }

    public x2p(zaf zafVar, abf abfVar) {
        this.a = (byte) 5;
        this.c = zafVar;
        this.b = xqu.b(new ewo(this, 0, (byte) 22));
        this.d = xqu.b(new ewo(this, 1, (byte) 22));
    }

    public x2p(h72 h72Var) {
        this.a = (byte) 17;
        this.c = h72Var;
        byte b = 12;
        this.b = iy81.a(new i8p(this, 0, b));
        this.d = iy81.a(new i8p(this, 1, b));
    }

    public x2p(y700 y700Var, p800 p800Var, q7r0 q7r0Var) {
        this.a = (byte) 23;
        this.c = y700Var;
        this.d = q7r0Var;
        this.b = new xep(this, (byte) 1);
    }

    public x2p(zuj zujVar, t2y t2yVar, q7r0 q7r0Var) {
        this.a = (byte) 20;
        this.c = t2yVar;
        this.d = q7r0Var;
        this.b = xqu.b(new j7p(this, (byte) 28));
    }

    public x2p(mh50 mh50Var, nh50 nh50Var, q7r0 q7r0Var) {
        this.a = (byte) 27;
        this.c = mh50Var;
        this.d = q7r0Var;
        this.b = iy81.a(new xep(this, (byte) 23));
    }

    public x2p(t5e t5eVar) {
        this.a = (byte) 3;
        this.c = t5eVar;
        this.b = xqu.b(new ewo(this, 1, (byte) 19));
        this.d = iy81.a(new ewo(this, 0, (byte) 19));
    }

    public x2p(eml emlVar) {
        this.a = (byte) 10;
        this.c = emlVar;
        byte b = 0;
        this.b = iy81.a(new i8p(this, b, b));
        this.d = iy81.a(new i8p(this, 1, b));
    }

    public x2p(h340 h340Var, zuj zujVar, i340 i340Var, q7r0 q7r0Var) {
        this.a = (byte) 26;
        this.c = zujVar;
        this.d = q7r0Var;
        this.b = xqu.b(new xep(this, (byte) 11));
    }

    public x2p(utf utfVar, vtf vtfVar, q7r0 q7r0Var) {
        this.a = (byte) 6;
        this.c = vtfVar;
        this.d = q7r0Var;
        this.b = xqu.b(new z1p(this, (byte) 20));
    }

    public x2p(vh50 vh50Var, GroupBlendTasteMatchFragment groupBlendTasteMatchFragment) {
        this.a = (byte) 28;
        this.c = vh50Var;
        byte b = 22;
        this.b = xqu.b(new i8p(this, 0, b));
        this.d = iy81.a(new i8p(this, 1, b));
    }

    public x2p(mak makVar, nak nakVar, q7r0 q7r0Var) {
        this.a = (byte) 9;
        this.c = makVar;
        this.b = iy81.a(new ewo(this, 1, (byte) 27));
        this.d = iy81.a(new ewo(this, 0, (byte) 27));
    }
}
