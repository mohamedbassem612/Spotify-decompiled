package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.player.esperanto.proto.EsGetErrorRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ppw0 implements ebr0 {
    public final /* synthetic */ byte a;
    public ynb0 b;

    public /* synthetic */ ppw0(byte b) {
        this.a = b;
    }

    private final h0r0 c(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        oa21 oa21Var = (oa21) this.b.get();
        oa21Var.getClass();
        ((rih1) obj).getClass();
        lbq lbqVar = new lbq(oa21Var, q7r0Var);
        q7e0 q7e0VarG = oa21Var.g();
        c8o.l(q7e0VarG);
        gw70 gw70VarB = oa21Var.b();
        c8o.l(gw70VarB);
        pe peVarH = oa21Var.h();
        c8o.l(peVarH);
        c8o.l(oa21Var.f());
        yuj yujVar = new yuj(q7e0VarG, new q3b1(gw70VarB, peVarH));
        kly0 kly0Var = oa21Var.a;
        e2b0 e2b0Var = (e2b0) kly0Var.get();
        c8o.l(e2b0Var);
        rpv0 rpv0Var = new rpv0(e2b0Var, (byte) 20);
        e2b0 e2b0Var2 = (e2b0) kly0Var.get();
        c8o.l(e2b0Var2);
        lzn0 lzn0Var = (lzn0) oa21Var.b.get();
        c8o.l(lzn0Var);
        kt91 kt91Var = (kt91) oa21Var.c.get();
        c8o.l(kt91Var);
        Resources resources = (Resources) oa21Var.d.get();
        c8o.l(resources);
        q8n q8nVar = (q8n) oa21Var.e.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) oa21Var.f.get();
        c8o.l(q8nVar2);
        return new la21(yujVar, rpv0Var, new ba21(e2b0Var2, lzn0Var, kt91Var, resources, q8nVar, q8nVar2), new k811((uyp) lbqVar.c, new h7l0((byte) 17)));
    }

    private final h0r0 d(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        cc21 cc21Var = (cc21) parcelable;
        ac21 ac21Var = (ac21) this.b.get();
        ac21Var.getClass();
        ((rih1) obj).getClass();
        a1q a1qVar = new a1q(ac21Var, cc21Var, q7r0Var);
        q7e0 q7e0VarG = ac21Var.g();
        c8o.l(q7e0VarG);
        gw70 gw70VarB = ac21Var.b();
        c8o.l(gw70VarB);
        pe peVarH = ac21Var.h();
        c8o.l(peVarH);
        c8o.l(ac21Var.f());
        yuj yujVar = new yuj(q7e0VarG, new q3b1(gw70VarB, peVarH));
        kly0 kly0Var = ac21Var.a;
        n2b0 n2b0Var = (n2b0) kly0Var.get();
        c8o.l(n2b0Var);
        rut0 rut0Var = new rut0(n2b0Var, (byte) 28);
        n2b0 n2b0Var2 = (n2b0) kly0Var.get();
        c8o.l(n2b0Var2);
        lzn0 lzn0Var = (lzn0) ac21Var.b.get();
        c8o.l(lzn0Var);
        z710 z710Var = (z710) ac21Var.c.get();
        c8o.l(z710Var);
        kt91 kt91Var = (kt91) ac21Var.d.get();
        c8o.l(kt91Var);
        Resources resources = (Resources) ac21Var.e.get();
        c8o.l(resources);
        q8n q8nVar = (q8n) ac21Var.f.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) ac21Var.g.get();
        c8o.l(q8nVar2);
        return new yb21(yujVar, cc21Var, rut0Var, new ob21(n2b0Var2, lzn0Var, z710Var, kt91Var, resources, q8nVar, q8nVar2), new k811((uyp) a1qVar.c, new h7l0((byte) 18), (byte) 0));
    }

    private final h0r0 e(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        gj21 gj21Var = (gj21) parcelable;
        ej21 ej21Var = (ej21) this.b.get();
        ej21Var.getClass();
        ((rih1) obj).getClass();
        jnq jnqVar = new jnq(ej21Var, gj21Var);
        jma jmaVar = new jma((byte) 23);
        q7e0 q7e0Var = (q7e0) ej21Var.b.get();
        c8o.l(q7e0Var);
        caq caqVar = ej21Var.a;
        Scheduler scheduler = (Scheduler) caqVar.get();
        c8o.l(scheduler);
        RetrofitMaker retrofitMaker = (RetrofitMaker) ej21Var.e.get();
        c8o.l(retrofitMaker);
        lux0 lux0Var = new lux0((kux0) retrofitMaker.createWebgateService(kux0.class, "android-playlist-creation-promptcreation-networkimpl"));
        lzn0 lzn0Var = (lzn0) ej21Var.c.get();
        c8o.l(lzn0Var);
        Scheduler scheduler2 = (Scheduler) caqVar.get();
        c8o.l(scheduler2);
        ai21 ai21Var = new ai21(lux0Var, lzn0Var, scheduler2);
        zwz0 zwz0Var = (zwz0) ej21Var.d.get();
        c8o.l(zwz0Var);
        Observable observableI = yoi1.i(zwz0Var.c(), o6x.a);
        c8o.m(observableI);
        return new cj21(jmaVar, q7e0Var, scheduler, gj21Var, new wi21(ai21Var, new acl(observableI, (byte) 7)), (joq) ((jly0) jnqVar.d).get());
    }

    private final h0r0 f(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        fj21 fj21Var = (fj21) parcelable;
        dj21 dj21Var = (dj21) this.b.get();
        dj21Var.getClass();
        ((rih1) obj).getClass();
        jnq jnqVar = new jnq(dj21Var, fj21Var);
        kyj kyjVar = (kyj) dj21Var.a.get();
        c8o.l(kyjVar);
        return new bj21(kyjVar, fj21Var, new vi21((ioq) ((jly0) jnqVar.b).get()), new yla((byte) 23), new ks10());
    }

    private final h0r0 g(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        ok21 ok21Var = (ok21) this.b.get();
        ok21Var.getClass();
        ((rih1) obj).getClass();
        k2q k2qVar = new k2q(ok21Var, q7r0Var);
        qyj qyjVar = (qyj) ok21Var.a.get();
        c8o.l(qyjVar);
        ul21 ul21Var = (ul21) ok21Var.b.get();
        c8o.l(ul21Var);
        return new nk21(qyjVar, q7r0Var, ul21Var, (los) ((jly0) k2qVar.c).get());
    }

    private final h0r0 h(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        yl21 yl21Var = (yl21) parcelable;
        xl21 xl21Var = (xl21) this.b.get();
        xl21Var.getClass();
        ((rih1) obj).getClass();
        lbq lbqVar = new lbq(xl21Var, yl21Var);
        ix81 ix81VarA = xl21Var.a();
        c8o.l(ix81VarA);
        gw70 gw70VarB = xl21Var.b();
        c8o.l(gw70VarB);
        pe peVarH = xl21Var.h();
        c8o.l(peVarH);
        c8o.l(xl21Var.f());
        qyj qyjVar = new qyj(ix81VarA, new q3b1(gw70VarB, peVarH));
        los losVar = (los) ((jly0) lbqVar.c).get();
        g341 g341Var = (g341) xl21Var.b.get();
        c8o.l(g341Var);
        return new vl21(qyjVar, yl21Var, losVar, g341Var);
    }

    private final h0r0 i(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        rr21 rr21Var = (rr21) parcelable;
        pr21 pr21Var = (pr21) this.b.get();
        pr21Var.getClass();
        ((rih1) obj).getClass();
        jmq jmqVar = new jmq(pr21Var, rr21Var, q7r0Var);
        qyj qyjVar = (qyj) pr21Var.a.get();
        c8o.l(qyjVar);
        yqg yqgVar = (yqg) pr21Var.b.get();
        c8o.l(yqgVar);
        jxp jxpVar = (jxp) jmqVar.b;
        jxp jxpVar2 = (jxp) jmqVar.c;
        uu00 uu00Var = (uu00) pr21Var.d.get();
        c8o.l(uu00Var);
        xrk xrkVar = (xrk) pr21Var.e.get();
        c8o.l(xrkVar);
        return new or21(qyjVar, rr21Var, q7r0Var, yqgVar, jxpVar, jxpVar2, uu00Var, xrkVar);
    }

    private final h0r0 j(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        w531 w531Var = (w531) parcelable;
        u531 u531Var = (u531) this.b.get();
        u531Var.getClass();
        ((rih1) obj).getClass();
        jnq jnqVar = new jnq(u531Var, w531Var, q7r0Var);
        hvj hvjVar = (hvj) u531Var.a.get();
        c8o.l(hvjVar);
        gw70 gw70Var = (gw70) u531Var.f.get();
        c8o.l(gw70Var);
        pe peVar = (pe) u531Var.j.get();
        c8o.l(peVar);
        c8o.l((jtl1) u531Var.h.get());
        q3b1 q3b1Var = new q3b1(gw70Var, peVar);
        lzn0 lzn0Var = (lzn0) u531Var.b.get();
        c8o.l(lzn0Var);
        RetrofitMaker retrofitMaker = (RetrofitMaker) u531Var.g.get();
        c8o.l(retrofitMaker);
        h3n0 h3n0Var = (h3n0) retrofitMaker.createWebgateService(h3n0.class, "android-games-musicguesser-network-retrofitserviceimpl");
        Context context = (Context) u531Var.e.a;
        c8o.l(context);
        upa0 upa0Var = new upa0(new vnr(context.getApplicationContext()), (byte) 15);
        pob pobVar = new pob((byte) 27, false);
        Object obj2 = jnqVar.b;
        cz30 cz30Var = (cz30) ((jly0) obj2).get();
        iyc0 iyc0Var = (iyc0) u531Var.k.get();
        c8o.l(iyc0Var);
        i531 i531Var = new i531(h3n0Var, upa0Var, pobVar, cz30Var, iyc0Var);
        xh71 xh71Var = (xh71) u531Var.c.get();
        c8o.l(xh71Var);
        zgz0 zgz0Var = new zgz0(xh71Var, (byte) 10);
        hq41 hq41Var = (hq41) u531Var.d.get();
        c8o.l(hq41Var);
        i8h1 i8h1Var = (i8h1) u531Var.i.get();
        c8o.l(i8h1Var);
        return new s531(hvjVar, q3b1Var, lzn0Var, i531Var, zgz0Var, hq41Var, w531Var, i8h1Var, (cz30) ((jly0) obj2).get());
    }

    private final h0r0 k(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        pa31 pa31Var = (pa31) this.b.get();
        pa31Var.getClass();
        ((rih1) obj).getClass();
        wj3 wj3Var = new wj3(pa31Var, q7r0Var);
        yuj yujVar = (yuj) pa31Var.i.get();
        c8o.l(yujVar);
        q8n q8nVar = (q8n) pa31Var.g.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) pa31Var.h.get();
        c8o.l(q8nVar2);
        lzn0 lzn0Var = (lzn0) pa31Var.a.get();
        c8o.l(lzn0Var);
        qy7 qy7Var = (qy7) ((jly0) wj3Var.d).get();
        ykq ykqVar = (ykq) wj3Var.e;
        Object obj2 = wj3Var.f;
        nt21 nt21Var = new nt21(ykqVar, (j4m0) ((jly0) obj2).get(), (byte) 3);
        kly0 kly0Var = pa31Var.f;
        ohm1 ohm1Var = (ohm1) kly0Var.get();
        c8o.l(ohm1Var);
        ca31 ca31Var = new ca31(q8nVar, q8nVar2, lzn0Var, qy7Var, nt21Var, ohm1Var);
        RetrofitMaker retrofitMaker = (RetrofitMaker) pa31Var.b.get();
        c8o.l(retrofitMaker);
        da31 da31Var = (da31) retrofitMaker.createWebgateService(da31.class, "android-campaigns-wrapped-retrieval");
        ohm1 ohm1Var2 = (ohm1) kly0Var.get();
        c8o.l(ohm1Var2);
        o931 o931Var = new o931(ohm1Var2, da31Var);
        hj31 hj31Var = (hj31) pa31Var.c.get();
        c8o.l(hj31Var);
        return new oa31(yujVar, ca31Var, o931Var, hj31Var, (noq) ((jly0) wj3Var.P0).get(), (j4m0) ((jly0) obj2).get());
    }

    private final h0r0 l(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        mh31 mh31Var = (mh31) parcelable;
        lh31 lh31Var = (lh31) this.b.get();
        lh31Var.getClass();
        ((rih1) obj).getClass();
        ip31 ip31Var = new ip31(lh31Var, mh31Var, q7r0Var);
        uwn uwnVar = (uwn) lh31Var.a.get();
        c8o.l(uwnVar);
        s45 s45Var = (zle1) lh31Var.c.get();
        c8o.l(s45Var);
        joc jocVar = new joc(s45Var.a("cwp"), s45Var, UUID.randomUUID().toString(), 6, q7r0Var.d.c);
        myq0 myq0Var = new myq0(q7r0Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarR1 = yon1.r1();
        Parcelable.Creator creator = lik1.CREATOR;
        bn70 bn70Var = new bn70(p6r0VarR1, new lik1(mh31Var.a), (nar0) null);
        Activity activityA = lh31Var.a();
        c8o.l(activityA);
        zs11 zs11Var = (zs11) lh31Var.x.get();
        c8o.l(zs11Var);
        muz muzVarD = ((cyp) ((jly0) ip31Var.d).get()).d();
        ruz ruzVarA = ((cyp) ((jly0) ip31Var.d).get()).a();
        s1p s1pVar = (s1p) ((jly0) ip31Var.e).get();
        zwp zwpVar = (zwp) lh31Var.w.get();
        c8o.l(zwpVar);
        t1p t1pVar = (t1p) ((jly0) ip31Var.f).get();
        d2q d2qVar = (d2q) lh31Var.v.get();
        c8o.l(d2qVar);
        p68 p68Var = new p68((Object) muzVarD, (Object) ruzVarA, (Object) s1pVar, (Object) zwpVar, (Object) t1pVar, (Object) d2qVar, false);
        u1p u1pVar = (u1p) ((jly0) ip31Var.g).get();
        Activity activityA2 = lh31Var.a();
        c8o.l(activityA2);
        quc0 quc0Var = (quc0) lh31Var.k.get();
        c8o.l(quc0Var);
        bv40 bv40Var = new bv40(new fb8(activityA2, quc0Var), (byte) 23);
        oum oumVar = (oum) lh31Var.m.get();
        c8o.l(oumVar);
        return new kh31(mh31Var, uwnVar, jocVar, myq0Var, bn70Var, activityA, new ajq0(zs11Var, p68Var, u1pVar, bv40Var, new eb8(oumVar, (v1p) ((jly0) ip31Var.i).get(), (byte) 0)));
    }

    private final h0r0 m(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        vo51 vo51Var = (vo51) parcelable;
        uo51 uo51Var = (uo51) this.b.get();
        uo51Var.getClass();
        ((rih1) obj).getClass();
        jmq jmqVar = new jmq(uo51Var, vo51Var);
        qyj qyjVar = (qyj) uo51Var.a.get();
        c8o.l(qyjVar);
        return new to51(qyjVar, vo51Var, (jxp) jmqVar.c, (los) ((jly0) jmqVar.b).get());
    }

    private final h0r0 n(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        mr51 mr51Var = (mr51) parcelable;
        sct sctVar = (sct) this.b.get();
        sctVar.getClass();
        ((rih1) obj).getClass();
        k2q k2qVar = new k2q(sctVar, mr51Var);
        Resources resources = (Resources) sctVar.b.get();
        c8o.l(resources);
        qyj qyjVar = (qyj) sctVar.a.get();
        c8o.l(qyjVar);
        los losVar = (los) ((jly0) k2qVar.c).get();
        e220 e220Var = (e220) sctVar.c.get();
        c8o.l(e220Var);
        q120 q120Var = (q120) sctVar.d.get();
        c8o.l(q120Var);
        nu nuVar = new nu((byte) 14);
        RetrofitMaker retrofitMaker = (RetrofitMaker) sctVar.f.get();
        c8o.l(retrofitMaker);
        up41 up41Var = new up41((vl51) retrofitMaker.createWebgateService(vl51.class, "android-promptedplaylists-seedsearchimpl"), (byte) 4);
        uu00 uu00Var = (uu00) sctVar.g.get();
        c8o.l(uu00Var);
        nl51 nl51Var = new nl51(uu00Var, (byte) 0);
        kt91 kt91Var = (kt91) sctVar.h.get();
        c8o.l(kt91Var);
        return new lr51(resources, qyjVar, mr51Var, losVar, e220Var, q120Var, nuVar, up41Var, nl51Var, kt91Var);
    }

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        p6r0 p6r0VarG1;
        yxe1 yxe1Var;
        boolean zD;
        switch (this.a) {
            case 0:
                npw0 npw0Var = (npw0) this.b.get();
                npw0Var.getClass();
                ((rih1) obj).getClass();
                Resources resources = (Resources) npw0Var.a.get();
                c8o.l(resources);
                qyj qyjVar = (qyj) npw0Var.b.get();
                c8o.l(qyjVar);
                zpw0 zpw0Var = (zpw0) npw0Var.c.get();
                c8o.l(zpw0Var);
                a1r0 a1r0Var = (a1r0) npw0Var.d.get();
                c8o.l(a1r0Var);
                i8h1 i8h1Var = (i8h1) npw0Var.e.get();
                c8o.l(i8h1Var);
                return new mpw0(resources, qyjVar, (opw0) parcelable, zpw0Var, a1r0Var, new yeu0(i8h1Var));
            case 1:
                m0x0 m0x0Var = (m0x0) parcelable;
                k0x0 k0x0Var = (k0x0) this.b.get();
                k0x0Var.getClass();
                ((rih1) obj).getClass();
                byp bypVar = new byp(k0x0Var, m0x0Var, q7r0Var);
                qyj qyjVar2 = (qyj) k0x0Var.b.get();
                c8o.l(qyjVar2);
                jo80 jo80Var = k0x0Var.f;
                dg30 dg30Var = (dg30) jo80Var.a;
                c8o.l(dg30Var);
                ma41 ma41Var = (ma41) k0x0Var.j.get();
                c8o.l(ma41Var);
                lzn0 lzn0Var = (lzn0) k0x0Var.a.get();
                c8o.l(lzn0Var);
                b0x0 b0x0Var = (b0x0) k0x0Var.k.get();
                c8o.l(b0x0Var);
                l0x0 l0x0Var = new l0x0(b0x0Var, m0x0Var, lzn0Var, (byte) 0);
                dg30 dg30Var2 = (dg30) jo80Var.a;
                c8o.l(dg30Var2);
                lls0 lls0Var = new lls0(dg30Var2, (byte) 19);
                nzw0 nzw0Var = new nzw0(m0x0Var.a, m0x0Var.b, m0x0Var.c, m0x0Var.d);
                Scheduler scheduler = (Scheduler) k0x0Var.h.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) k0x0Var.i.get();
                c8o.l(scheduler2);
                Object obj2 = bypVar.a;
                lzw0 lzw0Var = (lzw0) ((jly0) obj2).get();
                dg30 dg30Var3 = (dg30) jo80Var.a;
                c8o.l(dg30Var3);
                dg30 dg30Var4 = (dg30) jo80Var.a;
                c8o.l(dg30Var4);
                otu otuVar = new otu(dg30Var3, ((g0i) dg30Var4).i.h("com.spotify.profile.editprofile.permission.EditProfilePermissionsManager", new e1r0((byte) 3, false), new tww0((lzw0) ((jly0) obj2).get(), (byte) 2)), (byte) 10);
                dg30 dg30Var5 = (dg30) jo80Var.a;
                c8o.l(dg30Var5);
                qis qisVar = new qis(dg30Var, ma41Var, l0x0Var, lls0Var, nzw0Var, scheduler, scheduler2, lzw0Var, otuVar, ((g0i) dg30Var5).i.h("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", new e1r0((byte) 11), new tww0((lzw0) ((jly0) obj2).get(), (byte) 3)));
                wjq wjqVar = (wjq) ((jly0) bypVar.e).get();
                yww0 yww0Var = (yww0) k0x0Var.l.get();
                c8o.l(yww0Var);
                return new j0x0(qyjVar2, qisVar, wjqVar, yww0Var, (xjq) ((jly0) bypVar.f).get(), xqu.a((ywp) bypVar.g), xqu.a((ywp) bypVar.h), (los) ((jly0) bypVar.i).get());
            case 2:
                cmx0 cmx0Var = (cmx0) this.b.get();
                cmx0Var.getClass();
                ((rih1) obj).getClass();
                ix81 ix81VarA = cmx0Var.a();
                c8o.l(ix81VarA);
                gw70 gw70VarB = cmx0Var.b();
                c8o.l(gw70VarB);
                pe peVarH = cmx0Var.h();
                c8o.l(peVarH);
                c8o.l(cmx0Var.f());
                qyj qyjVar3 = new qyj(ix81VarA, new q3b1(gw70VarB, peVarH));
                luk lukVar = (luk) cmx0Var.a.get();
                c8o.l(lukVar);
                return new bmx0(qyjVar3, new dz4(false, lukVar));
            case 3:
                npx0 npx0Var = (npx0) this.b.get();
                npx0Var.getClass();
                ((rih1) obj).getClass();
                qyj qyjVar4 = (qyj) npx0Var.a.get();
                c8o.l(qyjVar4);
                a1r0 a1r0Var2 = (a1r0) npx0Var.b.get();
                c8o.l(a1r0Var2);
                r7q r7qVar = npx0Var.c;
                xrc0 xrc0Var = (xrc0) r7qVar.get();
                c8o.l(xrc0Var);
                r7q r7qVar2 = npx0Var.d;
                iyc0 iyc0Var = (iyc0) r7qVar2.get();
                c8o.l(iyc0Var);
                mzc0 mzc0Var = new mzc0(xrc0Var, iyc0Var, (byte) 0);
                xrc0 xrc0Var2 = (xrc0) r7qVar.get();
                c8o.l(xrc0Var2);
                iyc0 iyc0Var2 = (iyc0) r7qVar2.get();
                c8o.l(iyc0Var2);
                mzc0 mzc0Var2 = new mzc0(xrc0Var2, iyc0Var2, (byte) 1);
                i8h1 i8h1Var2 = (i8h1) npx0Var.e.get();
                c8o.l(i8h1Var2);
                return new mpx0(qyjVar4, (opx0) parcelable, a1r0Var2, mzc0Var, mzc0Var2, i8h1Var2);
            case 4:
                hux0 hux0Var = (hux0) parcelable;
                gux0 gux0Var = (gux0) this.b.get();
                gux0Var.getClass();
                ((rih1) obj).getClass();
                ezo ezoVar = new ezo(gux0Var, hux0Var, q7r0Var);
                Context context = (Context) gux0Var.b.a;
                c8o.l(context);
                h931 h931Var = (h931) gux0Var.v.get();
                c8o.l(h931Var);
                pkq pkqVar = (pkq) ezoVar.n.get();
                xkq xkqVar = (xkq) ezoVar.F.get();
                m4c m4cVar = new m4c((byte) 22);
                luk lukVar2 = (luk) gux0Var.s.get();
                c8o.l(lukVar2);
                bf4 bf4Var = new bf4(lukVar2);
                h2r0 h2r0Var = (h2r0) gux0Var.C.get();
                c8o.l(h2r0Var);
                return new fux0(context, hux0Var, h931Var, pkqVar, xkqVar, m4cVar, bf4Var, h2r0Var);
            case 5:
                u67 u67Var = (u67) parcelable;
                oct octVar = (oct) this.b.get();
                octVar.getClass();
                ((rih1) obj).getClass();
                cjp cjpVar = new cjp(octVar, u67Var, q7r0Var);
                Resources resources2 = (Resources) octVar.b.get();
                c8o.l(resources2);
                yuj yujVar = (yuj) octVar.a.get();
                c8o.l(yujVar);
                s67 s67Var = new s67((d0r) cjpVar.b.get());
                q8n q8nVar = (q8n) octVar.f.get();
                c8o.l(q8nVar);
                q8n q8nVar2 = (q8n) octVar.g.get();
                c8o.l(q8nVar2);
                w2y0 w2y0Var = new w2y0(q8nVar, q8nVar2, new s2y0());
                p40 p40Var = new p40((byte) 15);
                hz5 hz5Var = new hz5((byte) 14);
                i8h1 i8h1Var3 = (i8h1) octVar.h.get();
                c8o.l(i8h1Var3);
                xmu0 xmu0Var = new xmu0(i8h1Var3);
                kt91 kt91Var = (kt91) octVar.i.get();
                c8o.l(kt91Var);
                v67 v67Var = (v67) octVar.j.get();
                c8o.l(v67Var);
                LinkedHashMap linkedHashMapC0 = d0p1.c0(2);
                h3y0 h3y0Var = (h3y0) octVar.c.get();
                c8o.l(h3y0Var);
                linkedHashMapC0.put(chr0.a, new o9b(h3y0Var, (byte) 1));
                exc1 exc1Var = (exc1) octVar.d.get();
                c8o.l(exc1Var);
                linkedHashMapC0.put(chr0.b, new o9b(exc1Var, (byte) 0));
                n67 n67Var = new n67(linkedHashMapC0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapC0));
                chr0 chr0Var = u67Var.a;
                c8o.m(chr0Var);
                q8n q8nVar3 = (q8n) octVar.e.get();
                c8o.l(q8nVar3);
                return new m2y0(resources2, yujVar, s67Var, w2y0Var, p40Var, hz5Var, xmu0Var, kt91Var, v67Var, new e5b0(30, Collections.singletonList(new o67(n67Var, q8nVar3, chr0Var)), (List) null));
            case 6:
                rct rctVar = (rct) this.b.get();
                rctVar.getClass();
                ((rih1) obj).getClass();
                Resources resources3 = (Resources) rctVar.b.get();
                c8o.l(resources3);
                qyj qyjVar5 = (qyj) rctVar.a.get();
                c8o.l(qyjVar5);
                return new o4y0(resources3, qyjVar5, (p4y0) parcelable, new ngs0(new hz5((byte) 12)));
            case 7:
                qaz0 qaz0Var = (qaz0) parcelable;
                tbz0 tbz0Var = (tbz0) this.b.get();
                tbz0Var.getClass();
                ((rih1) obj).getClass();
                uw0 uw0Var = new uw0(tbz0Var, qaz0Var, q7r0Var);
                Context context2 = (Context) tbz0Var.a.get();
                c8o.l(context2);
                los losVar = (los) ((jly0) uw0Var.f).get();
                gx81 gx81Var = (gx81) tbz0Var.c.get();
                c8o.l(gx81Var);
                vbz0 vbz0Var = new vbz0((flq) ((jly0) uw0Var.N0).get(), (los) ((jly0) uw0Var.f).get());
                Flowable flowable = (Flowable) ((jly0) uw0Var.t).get();
                hj91 hj91VarM = uw0Var.M();
                bnj0 bnj0VarY = uw0Var.y();
                c9c c9cVar = new c9c((byte) 21);
                ouw ouwVar = (ouw) tbz0Var.O.get();
                c8o.l(ouwVar);
                kly0 kly0Var = tbz0Var.U;
                uu00 uu00Var = (uu00) kly0Var.get();
                c8o.l(uu00Var);
                tzr0 tzr0Var = new tzr0(flowable, hj91VarM, bnj0VarY, c9cVar, ouwVar, uu00Var);
                tuz tuzVarE = ((cyp) ((jly0) uw0Var.h).get()).e();
                kly0 kly0Var2 = tbz0Var.N;
                o241 o241Var = (o241) kly0Var2.get();
                c8o.l(o241Var);
                myq0 myq0Var = new myq0(tuzVarE, o241Var, (byte) 24);
                Scheduler scheduler3 = (Scheduler) tbz0Var.r.get();
                c8o.l(scheduler3);
                ruz ruzVarA = ((cyp) ((jly0) uw0Var.h).get()).a();
                tuz tuzVarE2 = ((cyp) ((jly0) uw0Var.h).get()).e();
                amx0 amx0Var = (amx0) tbz0Var.P.get();
                c8o.l(amx0Var);
                ylm ylmVar = (ylm) tbz0Var.Q.get();
                c8o.l(ylmVar);
                kdy0 kdy0VarG = uw0Var.G();
                rzo0 rzo0Var = new rzo0((ykq) uw0Var.b, (xrl0) ((jly0) uw0Var.c).get());
                kt91 kt91Var2 = (kt91) tbz0Var.S.get();
                c8o.l(kt91Var2);
                l0x0 l0x0Var2 = new l0x0(uw0Var.I(), kt91Var2);
                uu00 uu00Var2 = (uu00) kly0Var.get();
                c8o.l(uu00Var2);
                nna0 nna0Var = (nna0) tbz0Var.Z.get();
                c8o.l(nna0Var);
                qns0 qns0Var = (qns0) tbz0Var.b0.get();
                c8o.l(qns0Var);
                t6z0 t6z0Var = new t6z0(scheduler3, ruzVarA, tuzVarE2, amx0Var, ylmVar, kdy0VarG, rzo0Var, l0x0Var2, uu00Var2, nna0Var, qns0Var);
                cjs cjsVar = (cjs) tbz0Var.d.get();
                c8o.l(cjsVar);
                wb00 wb00Var = new wb00(cjsVar, (byte) 14);
                waz0 waz0Var = (waz0) tbz0Var.W.get();
                c8o.l(waz0Var);
                sks0 sks0Var = new sks0(waz0Var, (byte) 27);
                Flowable flowable2 = (Flowable) ((jly0) uw0Var.t).get();
                xrc0 xrc0Var3 = (xrc0) tbz0Var.G.get();
                c8o.l(xrc0Var3);
                jbk0 jbk0Var = (jbk0) tbz0Var.X.get();
                c8o.l(jbk0Var);
                z6k0 z6k0Var = (z6k0) tbz0Var.Y.get();
                c8o.l(z6k0Var);
                o241 o241Var2 = (o241) kly0Var2.get();
                c8o.l(o241Var2);
                zsc zscVar = new zsc(flowable2, xrc0Var3, jbk0Var, z6k0Var, o241Var2);
                eaz0 eaz0Var = new eaz0(new rzo0((ykq) uw0Var.b, (xrl0) ((jly0) uw0Var.c).get()), (byte) 0);
                eh4 eh4VarB = uw0Var.b();
                vbs vbsVar = (vbs) tbz0Var.V.get();
                c8o.l(vbsVar);
                Scheduler scheduler4 = (Scheduler) tbz0Var.R.get();
                c8o.l(scheduler4);
                f7f0 f7f0Var = new f7f0(tzr0Var, myq0Var, t6z0Var, wb00Var, sks0Var, zscVar, eaz0Var, eh4VarB, vbsVar, scheduler4);
                eh4 eh4VarB2 = uw0Var.b();
                pe peVar = (pe) tbz0Var.E.get();
                c8o.l(peVar);
                rzo0 rzo0Var2 = new rzo0((ykq) uw0Var.b, (xrl0) ((jly0) uw0Var.c).get());
                mwn0 mwn0Var = (mwn0) tbz0Var.y.get();
                c8o.l(mwn0Var);
                ynb0 ynb0VarA = xqu.a((ykq) uw0Var.O0);
                q8n q8nVar4 = (q8n) tbz0Var.L.get();
                c8o.l(q8nVar4);
                return new sbz0(context2, losVar, q7r0Var, gx81Var, vbz0Var, f7f0Var, qaz0Var, eh4VarB2, peVar, rzo0Var2, mwn0Var, ynb0VarA, q8nVar4);
            case 8:
                vcz0 vcz0Var = (vcz0) parcelable;
                ucz0 ucz0Var = (ucz0) this.b.get();
                ucz0Var.getClass();
                ((rih1) obj).getClass();
                wtp wtpVar = new wtp(ucz0Var, vcz0Var);
                qyj qyjVar6 = (qyj) ucz0Var.a.get();
                c8o.l(qyjVar6);
                return new tcz0(qyjVar6, vcz0Var, (jxp) wtpVar.c, (los) ((jly0) wtpVar.b).get());
            case 9:
                ryj ryjVar = (ryj) this.b.get();
                ryjVar.getClass();
                ((rih1) obj).getClass();
                mmq mmqVar = (mmq) iy81.a(new fyo((byte) 27)).get();
                ix81 ix81VarA2 = ryjVar.a();
                c8o.l(ix81VarA2);
                gw70 gw70VarB2 = ryjVar.b();
                pe peVarG = us71.g(gw70VarB2, ryjVar);
                c8o.l(ryjVar.f());
                return new drz0((grz0) parcelable, mmqVar, new qyj(ix81VarA2, new q3b1(gw70VarB2, peVarG)));
            case 10:
                muz0 muz0Var = (muz0) parcelable;
                ntz0 ntz0Var = (ntz0) this.b.get();
                ntz0Var.getClass();
                ((rih1) obj).getClass();
                p2o0 p2o0Var = new p2o0(ntz0Var, muz0Var, q7r0Var);
                ix81 ix81VarA3 = ntz0Var.a();
                c8o.l(ix81VarA3);
                ix81 ix81VarA4 = ntz0Var.a();
                c8o.l(ix81VarA4);
                gw70 gw70VarB3 = ntz0Var.b();
                c8o.l(gw70VarB3);
                pe peVarH2 = ntz0Var.h();
                c8o.l(peVarH2);
                c8o.l(ntz0Var.f());
                qyj qyjVar7 = new qyj(ix81VarA4, new q3b1(gw70VarB3, peVarH2));
                nmq nmqVar = (nmq) ((jly0) p2o0Var.g).get();
                kdy0 kdy0VarM = p2o0Var.M();
                t8r0 t8r0VarL = p2o0Var.L();
                lzn0 lzn0Var2 = (lzn0) ntz0Var.n.get();
                c8o.l(lzn0Var2);
                kt91 kt91Var3 = (kt91) ntz0Var.l.get();
                c8o.l(kt91Var3);
                Context context3 = (Context) ntz0Var.m.a;
                c8o.l(context3);
                uu00 uu00Var3 = (uu00) ntz0Var.b.get();
                c8o.l(uu00Var3);
                zwz0 zwz0Var = (zwz0) ntz0Var.c.get();
                c8o.l(zwz0Var);
                mzr0 mzr0Var = new mzr0(kdy0VarM, t8r0VarL, lzn0Var2, kt91Var3, context3, uu00Var3, zwz0Var);
                luk lukVar3 = (luk) ntz0Var.o.get();
                c8o.l(lukVar3);
                pz4 pz4Var = new pz4(false, lukVar3);
                if (muz0Var.c) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    p6r0VarG1 = yon1.G1("RATINGS_AND_REVIEWS_RATINGS_AUDIOBOOK", "ratings-and-reviews/ratings/audiobook", 1623, "ratings-and-reviews");
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    p6r0VarG1 = yon1.G1("RATINGS_AND_REVIEWS_RATINGS", "ratings-and-reviews/ratings", 1622, "ratings-and-reviews");
                }
                return new jtz0(ix81VarA3, qyjVar7, nmqVar, mzr0Var, muz0Var, pz4Var, p6r0VarG1, nik1.a0.b(muz0Var.b));
            case 11:
                w001 w001Var = (w001) parcelable;
                v001 v001Var = (v001) this.b.get();
                v001Var.getClass();
                ((rih1) obj).getClass();
                uw0 uw0Var2 = new uw0(v001Var, w001Var);
                qyj qyjVar8 = (qyj) v001Var.r.get();
                c8o.l(qyjVar8);
                return new u001(qyjVar8, w001Var, (dnq) ((jly0) uw0Var2.O0).get(), pzm.h((mos) v001Var.q.get()));
            case 12:
                p901 p901Var = (p901) parcelable;
                v801 v801Var = (v801) this.b.get();
                v801Var.getClass();
                ((rih1) obj).getClass();
                z9p z9pVar = new z9p(v801Var, p901Var, q7r0Var);
                cbr0 cbr0VarS = xcz0.s(p901Var, (e5b0) ((jly0) z9pVar.b).get());
                q7e0 q7e0Var = (q7e0) v801Var.a.get();
                c8o.l(q7e0Var);
                r801 r801Var = (r801) ((jly0) z9pVar.e).get();
                d0r d0rVar = (d0r) ((jly0) z9pVar.d).get();
                dg30 dg30Var6 = (dg30) v801Var.q.get();
                c8o.l(dg30Var6);
                lzn0 lzn0Var3 = (lzn0) v801Var.b.get();
                c8o.l(lzn0Var3);
                a1r0 a1r0Var3 = (a1r0) v801Var.c.get();
                c8o.l(a1r0Var3);
                return new u801(cbr0VarS, q7e0Var, r801Var, d0rVar, new l901(dg30Var6, lzn0Var3, a1r0Var3, (Scheduler) ((ykq) z9pVar.l).get(), (jly0) z9pVar.g, new uxy0((th30) ((ykq) z9pVar.n).get(), new uww0(xqu.a((ykq) z9pVar.q), (byte) 3), (byte) 5), (enq) ((jly0) z9pVar.h).get(), (fnq) ((jly0) z9pVar.i).get()), (gnq) ((jly0) z9pVar.A).get(), new t2b((byte) 28));
            case 13:
                d111 d111Var = (d111) this.b.get();
                d111Var.getClass();
                ((rih1) obj).getClass();
                wj3 wj3Var = new wj3(d111Var, q7r0Var);
                sjw0 sjw0Var = (sjw0) ((jly0) wj3Var.f).get();
                gx81 gx81Var2 = (gx81) d111Var.t.get();
                c8o.l(gx81Var2);
                i8h1 i8h1Var4 = (i8h1) d111Var.e.get();
                c8o.l(i8h1Var4);
                lik1 lik1Var = nik1.J4;
                c8o.m(lik1Var);
                ieb0 ieb0Var = new ieb0(new pux0(i8h1Var4, new uqk0(lik1Var.a, r6h1.c), (byte) 19), (onq) ((jly0) wj3Var.t).get(), (byte) 1);
                jo91 jo91Var = (jo91) d111Var.z.get();
                c8o.l(jo91Var);
                Scheduler scheduler5 = (Scheduler) d111Var.n.get();
                c8o.l(scheduler5);
                Scheduler scheduler6 = (Scheduler) d111Var.i.get();
                c8o.l(scheduler6);
                kly0 kly0Var3 = d111Var.d;
                Activity activity = (Activity) kly0Var3.get();
                c8o.l(activity);
                kly0 kly0Var4 = d111Var.f;
                lzn0 lzn0Var4 = (lzn0) kly0Var4.get();
                c8o.l(lzn0Var4);
                kly0 kly0Var5 = d111Var.v;
                a1r0 a1r0Var4 = (a1r0) kly0Var5.get();
                c8o.l(a1r0Var4);
                dsg dsgVar = new dsg(activity, lzn0Var4, a1r0Var4, (byte) 0);
                Activity activity2 = (Activity) kly0Var3.get();
                c8o.l(activity2);
                lzn0 lzn0Var5 = (lzn0) kly0Var4.get();
                c8o.l(lzn0Var5);
                a1r0 a1r0Var5 = (a1r0) kly0Var5.get();
                c8o.l(a1r0Var5);
                dsg dsgVar2 = new dsg(activity2, lzn0Var5, a1r0Var5, (byte) 1);
                bk1 bk1Var = new bk1((gx01) ((jly0) wj3Var.X).get(), (byte) 0);
                snq snqVar = (snq) ((jly0) wj3Var.Y).get();
                tnq tnqVar = (tnq) ((jly0) wj3Var.Z).get();
                bk1 bk1Var2 = new bk1(wj3Var.j(), (byte) 13);
                unq unqVar = (unq) ((jly0) wj3Var.N0).get();
                cfr cfrVar = (cfr) d111Var.A.get();
                c8o.l(cfrVar);
                qz01 qz01Var = new qz01(scheduler6, dsgVar, dsgVar2, bk1Var, snqVar, tnqVar, bk1Var2, unqVar, new yx11(cfrVar, (byte) 22), (vnq) ((jly0) wj3Var.O0).get());
                RxRouter rxRouter = (RxRouter) d111Var.c.get();
                c8o.l(rxRouter);
                yau0 yau0Var = new yau0(new ujm(new CosmosTransport(new opy0(rxRouter, (byte) 1))).callStream("spotify.player.esperanto.proto.ContextPlayer", "GetError", EsGetErrorRequest.GetErrorRequest.o()).map(fmv.T0));
                Scheduler scheduler7 = (Scheduler) d111Var.h.get();
                c8o.l(scheduler7);
                uu00 uu00Var4 = (uu00) d111Var.y.get();
                c8o.l(uu00Var4);
                return new c111(sjw0Var, gx81Var2, ieb0Var, new cz01(jo91Var, scheduler5, qz01Var, new l0x0(yau0Var, new ytp0(scheduler7, uu00Var4, new wgb((ykq) wj3Var.P0), (gx01) ((jly0) wj3Var.X).get(), new fza((byte) 22)), new jl00(wj3Var.j(), (byte) 18), (byte) 26)));
            case 14:
                kx11 kx11Var = (kx11) parcelable;
                dx11 dx11Var = (dx11) this.b.get();
                dx11Var.getClass();
                ((rih1) obj).getClass();
                h72 h72Var = new h72(dx11Var, kx11Var, q7r0Var);
                lik1 lik1VarU = h72Var.U();
                p6r0 p6r0VarJ = h72Var.J();
                cxn cxnVar = kx11Var.b;
                if (cxnVar instanceof wwn) {
                    yxe1Var = new yxe1(new jx21(2131961066));
                } else if (cxnVar instanceof ywn) {
                    yxe1Var = new yxe1(new jx21(2131963933));
                } else {
                    if (!(cxnVar instanceof xwn)) {
                        eg.o();
                        return null;
                    }
                    yxe1Var = new yxe1(new jx21(2131952652));
                }
                yxe1 yxe1Var2 = yxe1Var;
                z7e0 z7e0Var = (z7e0) dx11Var.d.get();
                c8o.l(z7e0Var);
                iac0 iac0Var = q7r0Var.d.c;
                c8o.m(iac0Var);
                g1w g1wVar = new g1w(iac0Var, (znq) ((jly0) h72Var.e).get(), new hoc(((Boolean) dx11Var.I.get()).booleanValue(), new goc(2131166919, 2131166919)), new khc((byte) 14), (byte) 4);
                vw11 vw11Var = (vw11) ((jly0) h72Var.Y).get();
                h2r0 h2r0Var2 = (h2r0) dx11Var.H.get();
                c8o.l(h2r0Var2);
                if (cxnVar instanceof xwn) {
                    zD = true;
                } else {
                    if (!(cxnVar instanceof ywn) && !(cxnVar instanceof wwn)) {
                        eg.o();
                        return null;
                    }
                    zD = h2r0Var2.a.d();
                }
                qua0 qua0Var = (ztw0) dx11Var.m.get();
                c8o.l(qua0Var);
                yko ykoVar = (yko) dx11Var.n.get();
                c8o.l(ykoVar);
                a9q a9qVar = (a9q) dx11Var.o.get();
                c8o.l(a9qVar);
                return new ax11(lik1VarU, p6r0VarJ, yxe1Var2, z7e0Var, g1wVar, vw11Var, zD, new e5b0(30, p7h.M(new qua0[]{qua0Var, ykoVar.a(cxnVar.getUri(), new ro8(kx11Var, (lnm) null, (byte) 21)), a9qVar.a("ReleasesPage")}), (List) null));
            case 15:
                o221 o221Var = (o221) parcelable;
                n221 n221Var = (n221) this.b.get();
                n221Var.getClass();
                ((rih1) obj).getClass();
                goq goqVar = new goq(n221Var, o221Var);
                Object obj3 = goqVar.b;
                los losVar2 = (los) ((jly0) obj3).get();
                yuj yujVar2 = (yuj) n221Var.a.get();
                c8o.l(yujVar2);
                mbq0 mbq0Var = (mbq0) ((jly0) goqVar.c).get();
                byp0 byp0VarA = n221Var.a();
                c8o.l(byp0VarA);
                nt21 nt21Var = new nt21(byp0VarA, o221Var, (byte) 0);
                byp0 byp0VarA2 = n221Var.a();
                c8o.l(byp0VarA2);
                uq8 uq8Var = new uq8(byp0VarA2, (byte) 12);
                byp0 byp0VarA3 = n221Var.a();
                c8o.l(byp0VarA3);
                yfc0 yfc0Var = new yfc0(byp0VarA3, (byte) 28);
                byp0 byp0VarA4 = n221Var.a();
                c8o.l(byp0VarA4);
                r5h r5hVar = (r5h) n221Var.f.get();
                c8o.l(r5hVar);
                op31 op31Var = (op31) n221Var.g.get();
                c8o.l(op31Var);
                g7h g7hVar = (g7h) n221Var.h.get();
                c8o.l(g7hVar);
                rd1 rd1Var = new rd1(byp0VarA4, r5hVar, op31Var, g7hVar);
                byp0 byp0VarA5 = n221Var.a();
                c8o.l(byp0VarA5);
                fna fnaVar = new fna(byp0VarA5, (byte) 7);
                byp0 byp0VarA6 = n221Var.a();
                c8o.l(byp0VarA6);
                n0v0 n0v0Var = new n0v0(byp0VarA6, (byte) 24);
                los losVar3 = (los) ((jly0) obj3).get();
                lzn0 lzn0Var6 = (lzn0) n221Var.j.get();
                c8o.l(lzn0Var6);
                kt91 kt91Var4 = (kt91) n221Var.k.get();
                c8o.l(kt91Var4);
                Context context4 = (Context) n221Var.l.get();
                c8o.l(context4);
                poj0 poj0Var = new poj0(losVar3, lzn0Var6, kt91Var4, context4, (byte) 23);
                kly0 kly0Var6 = n221Var.n;
                q8n q8nVar5 = (q8n) kly0Var6.get();
                c8o.l(q8nVar5);
                bdq0 bdq0Var = new bdq0(nt21Var, uq8Var, yfc0Var, rd1Var, fnaVar, n0v0Var, poj0Var, q8nVar5);
                mbq0 mbq0Var2 = (mbq0) ((jly0) goqVar.c).get();
                kly0 kly0Var7 = n221Var.o;
                q8n q8nVar6 = (q8n) kly0Var7.get();
                c8o.l(q8nVar6);
                eeq0 eeq0Var = new eeq0(mbq0Var2, q8nVar6);
                q8n q8nVar7 = (q8n) kly0Var7.get();
                c8o.l(q8nVar7);
                q8n q8nVar8 = (q8n) kly0Var6.get();
                c8o.l(q8nVar8);
                weq0 weq0Var = new weq0(bdq0Var, eeq0Var, q8nVar7, q8nVar8);
                poj0 poj0Var2 = new poj0((coq) ((jly0) goqVar.d).get(), (doq) ((jly0) goqVar.e).get(), (eoq) ((jly0) goqVar.f).get(), (foq) ((jly0) goqVar.h).get(), (byte) 22);
                String str = o221Var.a;
                if (str == null) {
                    str = "";
                }
                return new m221(losVar2, yujVar2, mbq0Var, weq0Var, poj0Var2, str);
            case 16:
                t221 t221Var = (t221) parcelable;
                r221 r221Var = (r221) this.b.get();
                r221Var.getClass();
                ((rih1) obj).getClass();
                kp5 kp5Var = new kp5(r221Var, t221Var, q7r0Var);
                los losVar4 = (los) ((jly0) kp5Var.d).get();
                yuj yujVar3 = (yuj) r221Var.a.get();
                c8o.l(yujVar3);
                p021 p021Var = (p021) ((jly0) kp5Var.e).get();
                kly0 kly0Var8 = r221Var.d;
                byp0 byp0Var = (byp0) kly0Var8.get();
                c8o.l(byp0Var);
                vqv0 vqv0Var = new vqv0(byp0Var, (byte) 20);
                byp0 byp0Var2 = (byp0) kly0Var8.get();
                c8o.l(byp0Var2);
                r5h r5hVar2 = (r5h) r221Var.e.get();
                c8o.l(r5hVar2);
                op31 op31Var2 = (op31) r221Var.l.get();
                c8o.l(op31Var2);
                g7h g7hVar2 = (g7h) r221Var.m.get();
                c8o.l(g7hVar2);
                rd1 rd1Var2 = new rd1(byp0Var2, r5hVar2, op31Var2, g7hVar2);
                Activity activity3 = (Activity) r221Var.b.get();
                c8o.l(activity3);
                qr91 qr91Var = (qr91) ((jly0) kp5Var.f).get();
                los losVar5 = (los) ((jly0) kp5Var.d).get();
                a1r0 a1r0Var6 = (a1r0) r221Var.h.get();
                c8o.l(a1r0Var6);
                lag lagVar = new lag(activity3, qr91Var, losVar5, a1r0Var6, (byte) 7);
                bn bnVar = new bn((ykq) kp5Var.g, (byte) 3);
                Context context5 = (Context) r221Var.k.get();
                c8o.l(context5);
                luk lukVar4 = (luk) r221Var.g.get();
                c8o.l(lukVar4);
                bnj0 bnj0Var = new bnj0(context5, new m05(false, lukVar4), (byte) 19);
                xrc0 xrc0Var4 = (xrc0) r221Var.f.get();
                c8o.l(xrc0Var4);
                al40 al40Var = new al40(xrc0Var4);
                q8n q8nVar9 = (q8n) r221Var.o.get();
                c8o.l(q8nVar9);
                g121 g121Var = new g121(vqv0Var, rd1Var2, lagVar, bnVar, bnj0Var, al40Var, q8nVar9);
                p021 p021Var2 = (p021) ((jly0) kp5Var.e).get();
                q8n q8nVar10 = (q8n) r221Var.f66p.get();
                c8o.l(q8nVar10);
                s121 s121Var = new s121(p021Var2, q8nVar10);
                Scheduler scheduler8 = (Scheduler) r221Var.q.get();
                c8o.l(scheduler8);
                j221 j221Var = new j221(g121Var, s121Var, scheduler8);
                hyy0 hyy0Var = new hyy0((hoq) ((jly0) kp5Var.h).get(), new laa1((byte) 4), (byte) 25);
                Resources resources4 = (Resources) r221Var.c.get();
                c8o.l(resources4);
                return new q221(losVar4, t221Var, yujVar3, p021Var, j221Var, hyy0Var, resources4);
            case 17:
                return c(parcelable, q7r0Var, obj);
            case 18:
                return d(parcelable, q7r0Var, obj);
            case 19:
                return f(parcelable, q7r0Var, obj);
            case 20:
                return e(parcelable, q7r0Var, obj);
            case 21:
                return g(parcelable, q7r0Var, obj);
            case 22:
                return h(parcelable, q7r0Var, obj);
            case 23:
                return i(parcelable, q7r0Var, obj);
            case 24:
                return j(parcelable, q7r0Var, obj);
            case 25:
                return k(parcelable, q7r0Var, obj);
            case 26:
                return l(parcelable, q7r0Var, obj);
            case 27:
                return m(parcelable, q7r0Var, obj);
            case 28:
                return n(parcelable, q7r0Var, obj);
            default:
                c061 c061Var = (c061) parcelable;
                nz51 nz51Var = (nz51) this.b.get();
                nz51Var.getClass();
                ((rih1) obj).getClass();
                yjq yjqVar = new yjq(nz51Var, c061Var, q7r0Var);
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                cbr0 cbr0VarM = ux51.m(yon1.G1("READALONG_SHARE", "readalong/share", 1629, "readalong"), c061Var, (e5b0) ((jly0) yjqVar.b).get());
                q7e0 q7e0VarG = nz51Var.g();
                c8o.l(q7e0VarG);
                d0r d0rVar2 = (d0r) ((jly0) yjqVar.e).get();
                tag1 tag1Var = (tag1) ((jly0) yjqVar.f).get();
                luk lukVarK = nz51Var.k();
                c8o.l(lukVarK);
                boolean zA = new l55(false, false, lukVarK).a();
                q8n q8nVarD = nz51Var.d();
                c8o.l(q8nVarD);
                ty51 ty51Var = new ty51(d0rVar2, tag1Var, c061Var, zA, q8nVarD);
                jz51 jz51VarJ = nz51Var.j();
                c8o.l(jz51VarJ);
                Scheduler schedulerO = nz51Var.o();
                c8o.l(schedulerO);
                xh71 xh71VarZ = nz51Var.z();
                c8o.l(xh71VarZ);
                vr51 vr51Var = new vr51(xh71VarZ, (byte) 29);
                uu00 uu00VarA = nz51Var.A();
                c8o.l(uu00VarA);
                a061 a061Var = new a061(jz51VarJ, schedulerO, vr51Var, uu00VarA);
                e7q e7qVarN = nz51Var.n();
                c8o.l(e7qVarN);
                gbg1 gbg1VarP = nz51Var.p();
                c8o.l(gbg1VarP);
                myq0 myq0Var2 = new myq0(q7r0Var);
                yon1.G1("READALONG_SHARE", "readalong/share", 1629, "readalong");
                iac0 iac0Var2 = q7r0Var.d.c;
                cbg1 cbg1VarCreate = gbg1VarP.a.create();
                wdm wdmVar = new wdm(cbg1VarCreate, myq0Var2, iac0Var2);
                dpq dpqVar = (dpq) ((jly0) wdmVar.Y).get();
                gpq gpqVar = (gpq) ((jly0) wdmVar.Z).get();
                Scheduler schedulerO2 = cbg1VarCreate.o();
                c8o.l(schedulerO2);
                ede1 ede1Var = (ede1) ((jly0) wdmVar.X).get();
                FlowableMap flowableMapQ = wdmVar.Q();
                Flowable flowableF = cbg1VarCreate.f();
                c8o.l(flowableF);
                by51 by51Var = new by51(schedulerO2, ede1Var, flowableMapQ, new FlowableOnBackpressureLatest(flowableF).j(mo9.Z).x(ok10.X0).J(sl10.b1));
                wce1 wce1Var = (wce1) ((jly0) wdmVar.t).get();
                q8n q8nVarR0 = cbg1VarCreate.r0();
                c8o.l(q8nVarR0);
                dx0 dx0Var = new dx0(dpqVar, gpqVar, by51Var, new yce1(wce1Var, q8nVarR0));
                i8h1 i8h1VarM = nz51Var.m();
                c8o.l(i8h1VarM);
                return new lz51(cbr0VarM, q7e0VarG, ty51Var, a061Var, new xuj(e7qVarN, dx0Var, new nt21(i8h1VarM, new brl0(c061Var.a, (byte) 15), (byte) 20), (byte) 3));
        }
    }
}
