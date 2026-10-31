package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl;
import com.spotify.home.evopage.mobius.e;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lbp implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lbp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object A() {
        byte b = 1;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new zep(this);
            case 1:
                return u1n0.z((q7r0) ((h72) this.c).c);
            case 2:
                return new n7p(this, (byte) 1);
            case 3:
                return new afp(this);
            case 4:
                return new bfp(this);
            case 5:
                return new k7p(this, (byte) 1);
            case 6:
                return new q7p(this, b);
            case 7:
                return new cfp(this, (byte) 0);
            default:
                jah.e(b2);
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ wgp a(lbp lbpVar) {
        return (wgp) lbpVar.c;
    }

    private final Object b() {
        t7p t7pVar = (t7p) this.c;
        p2v p2vVar = (p2v) t7pVar.b;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return pzm.h((mos) p2vVar.b.get());
            }
            if (b != 2) {
                jah.e(b);
                return null;
            }
            i8h1 i8h1Var = (i8h1) p2vVar.f.get();
            c8o.l(i8h1Var);
            return i8h1Var;
        }
        Context context = (Context) p2vVar.g.get();
        c8o.l(context);
        yzh1 yzh1Var = (yzh1) p2vVar.d.get();
        c8o.l(yzh1Var);
        yo31 yo31Var = new yo31(yzh1Var, (byte) 28);
        los losVar = (los) ((jly0) t7pVar.a).get();
        lzn0 lzn0Var = (lzn0) p2vVar.c.get();
        c8o.l(lzn0Var);
        return new m2v(context, yo31Var, losVar, lzn0Var);
    }

    private final Object c() {
        e93 e93Var = (e93) this.c;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new zbp(this);
            case 1:
                return new ydv(((acp) ((jly0) e93Var.g).get()).a((ak3) ((jly0) e93Var.i).get()), (bev) ((jly0) e93Var.h).get());
            case 2:
                return new acp(this, b);
            case 3:
                return new bcp((byte) 0);
            case 4:
                cev cevVar = (cev) ((jly0) e93Var.e).get();
                zwm1 zwm1Var = (zwm1) ((udv) e93Var.c).l.get();
                c8o.l(zwm1Var);
                return new hbv(cevVar, zwm1Var);
            case 5:
                e93Var.getClass();
                el3 el3Var = (el3) ((udv) e93Var.c).h.get();
                c8o.l(el3Var);
                return new cev(el3Var.a());
            case 6:
                return new bev();
            case 7:
                ak3 ak3Var = ((vdv) e93Var.b).a;
                c8o.m(ak3Var);
                return ak3Var;
            case 8:
                return new ccp(this, b);
            case 9:
                return new dcp(this, (byte) 0);
            case 10:
                return new ecp((byte) 0);
            case 11:
                return new fcp(this, (byte) 0);
            case 12:
                return new gcp((byte) 0);
            case 13:
                return new hcp(this, (byte) 0);
            case 14:
                return new vbp((byte) 0);
            case 15:
                return new wbp(this, (byte) 0);
            case 16:
                return new xbp(this);
            case 17:
                return new ybp((byte) 0);
            case 18:
                dbr0 yxe1Var = new yxe1(new jx21(2131955161));
                dbr0 t1r0Var = new t1r0(true);
                dbr0 s9h1Var = new s9h1(7, false, false, false);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new cbr0(new dbr0[]{yxe1Var, t1r0Var, s9h1Var, new bn70(yon1.G1("YOURLIBRARY_DEFAULT_SAVE_LOCATION_SELECTION", "yourlibrary/default-save-location-selection", 2260, "yourlibrary"), nik1.G1, (nar0) null)}, false);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object d() {
        icp icpVar = (icp) this.c;
        tjq tjqVar = icpVar.a;
        byte b = this.b;
        if (b == 0) {
            Flowable flowableP = tjqVar.p();
            c8o.l(flowableP);
            kge kgeVarV = bjv.v(flowableP);
            uvy uvyVar = (uvy) tjqVar.a;
            c8o.l(uvyVar);
            return new xd0(kgeVarV, uvyVar, (ggv0) icpVar.e.get(), (c9n) icpVar.c.get());
        }
        if (b == 1) {
            return new ggv0((gn0) icpVar.b.get(), (wei1) icpVar.d.get(), (c9n) icpVar.c.get());
        }
        if (b == 2) {
            RxRouter rxRouter = (RxRouter) tjqVar.b;
            c8o.l(rxRouter);
            return new gn0(new CosmosTransport(new sn0(rxRouter, (byte) 16)));
        }
        if (b == 3) {
            Flowable flowableP2 = tjqVar.p();
            c8o.l(flowableP2);
            kge kgeVarV2 = bjv.v(flowableP2);
            yqg yqgVar = (yqg) tjqVar.d;
            c8o.l(yqgVar);
            return new wei1(kgeVarV2, yqgVar, (c9n) icpVar.c.get());
        }
        if (b == 4) {
            q8n q8nVar = (q8n) tjqVar.e;
            c8o.l(q8nVar);
            return smo1.e(flo1.l(guo1.B(), q8nVar));
        }
        if (b != 5) {
            jah.e(b);
            return null;
        }
        gn0 gn0Var = (gn0) icpVar.b.get();
        Flowable flowable = (Flowable) tjqVar.c;
        c8o.l(flowable);
        return new hre1(gn0Var, flowable);
    }

    private final Object e() {
        tnm tnmVar = (tnm) this.c;
        ypv ypvVar = (ypv) tnmVar.b;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new kcp(this);
            }
            if (b == 2) {
                return new lcp(this);
            }
            if (b == 3) {
                return new mcp(this);
            }
            jah.e(b);
            return null;
        }
        f1n0 f1n0Var = (f1n0) ypvVar.h.get();
        c8o.l(f1n0Var);
        z6k0 z6k0Var = (z6k0) ypvVar.f.get();
        c8o.l(z6k0Var);
        gmt gmtVar = new gmt(u1n0.z((q7r0) tnmVar.d), new ksk0((byte) 4), (byte) 14);
        luk lukVar = (luk) ypvVar.i.get();
        c8o.l(lukVar);
        px4 px4Var = new px4(true, lukVar);
        mnk0 mnk0Var = (mnk0) ypvVar.j.get();
        c8o.l(mnk0Var);
        aqv aqvVar = (aqv) ypvVar.l.get();
        c8o.l(aqvVar);
        zpv zpvVar = (zpv) tnmVar.c;
        r6h1 r6h1Var = r6h1.c;
        u8h1 u8h1Var = ksk0.i;
        ArrayList arrayList = new ArrayList();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-edit-playlist-cover-art";
        x6h1VarI.f = "2.2.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("playlist/edit-coverart");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(y6h1VarA);
        return new vpv(f1n0Var, z6k0Var, gmtVar, px4Var, mnk0Var, aqvVar, zpvVar, new r6h1(arrayList2, u8h1Var), (kcp) ((jly0) tnmVar.g).get(), new c9c((byte) 8));
    }

    private final Object f() {
        ks6 ks6Var = (ks6) this.c;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                ntv ntvVar = (ntv) ks6Var.a;
                ntv ntvVar2 = (ntv) ks6Var.a;
                xrc0 xrc0Var = (xrc0) ntvVar.k.get();
                c8o.l(xrc0Var);
                String strI = ks6Var.i();
                iz00 iz00Var = (iz00) ntvVar2.r.get();
                c8o.l(iz00Var);
                mnk0 mnk0Var = (mnk0) ntvVar2.u.get();
                c8o.l(mnk0Var);
                ptv ptvVar = (ptv) ks6Var.b;
                q8n q8nVar = (q8n) ntvVar2.a.get();
                c8o.l(q8nVar);
                zr00 zr00Var = (zr00) ntvVar2.x.get();
                c8o.l(zr00Var);
                c9n c9nVar = (c9n) ((jly0) ks6Var.d).get();
                thk0 thk0Var = (thk0) ntvVar2.z.get();
                c8o.l(thk0Var);
                return new yqv(xrc0Var, strI, iz00Var, mnk0Var, ptvVar, q8nVar, zr00Var, c9nVar, thk0Var);
            case 1:
                return cto1.q(((q7r0) ks6Var.c).d.c);
            case 2:
                return ((ncp) ((jly0) ks6Var.f).get()).a((c9n) ((jly0) ks6Var.d).get(), new x3s(((xqv) ((jly0) ks6Var.e).get()).b, (byte) 16));
            case 3:
                return new ncp(this, (byte) 0);
            case 4:
                String strI2 = ks6Var.i();
                ntv ntvVar3 = (ntv) ks6Var.a;
                s061 s061Var = (s061) ((jly0) ks6Var.g).get();
                i8h1 i8h1Var = (i8h1) ntvVar3.g.get();
                c8o.l(i8h1Var);
                String strI3 = ks6Var.i();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                yon1.G1("PLAYLIST_EDIT_ITEMS", "playlist/edit-items", 1458, "playlist");
                jut jutVar = new jut(i8h1Var, (t9h1) new txk0(strI3, (byte) 10), (byte) 12);
                ocp ocpVar = (ocp) ((jly0) ks6Var.t).get();
                ttm0 ttm0Var = (ttm0) ((jly0) ks6Var.X).get();
                String strI4 = ks6Var.i();
                yon1.G1("PLAYLIST_EDIT_ITEMS", "playlist/edit-items", 1458, "playlist");
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-edit-playlist-items-page";
                x6h1VarI.f = "7.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = strI4;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("playlist/edit-items");
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                ifq ifqVar = (ifq) ntvVar3.B.get();
                c8o.l(ifqVar);
                pfq pfqVar = (pfq) ntvVar3.D.get();
                c8o.l(pfqVar);
                qfq qfqVar = (qfq) ntvVar3.H.get();
                c8o.l(qfqVar);
                lfq lfqVar = (lfq) ntvVar3.G.get();
                c8o.l(lfqVar);
                tjq tjqVar = new tjq(r6h1Var2, ifqVar, pfqVar, qfqVar, lfqVar);
                String strI5 = ks6Var.i();
                yon1.G1("PLAYLIST_EDIT_ITEMS", "playlist/edit-items", 1458, "playlist");
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-edit-playlist-items-page";
                x6h1VarI2.f = "7.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = strI5;
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                Collections.singletonList("playlist/edit-items");
                ArrayList arrayList = new ArrayList();
                arrayList.add(y6h1VarA2);
                return new vqv(strI2, s061Var, jutVar, ocpVar, ttm0Var, tjqVar, new r6h1(arrayList, (u8h1) null), (qcp) ((jly0) ks6Var.Y).get());
            case 5:
                return new ocp(this);
            case 6:
                return cwl1.C((q7r0) ks6Var.c);
            case 7:
                return new pcp(this);
            case 8:
                ttm0 ttm0VarE = cwl1.E((q7r0) ks6Var.c);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 9:
                return new qcp((byte) 0);
            case 10:
                c8o.l((v9q) ((ntv) ks6Var.a).o.get());
                return new aek1(20, 50);
            case 11:
                qua0 qua0Var = (c6b0) ((jly0) ks6Var.P0).get();
                qua0 qua0Var2 = (q0d0) ((ntv) ks6Var.a).y.get();
                c8o.l(qua0Var2);
                return new e5b0(30, p7h.M(new qua0[]{qua0Var, qua0Var2, (e6b0) ((jly0) ks6Var.R0).get()}), (List) null);
            case 12:
                return ((rcp) ((jly0) ks6Var.O0).get()).a((s061) ((jly0) ks6Var.g).get());
            case 13:
                return new rcp(this, b);
            case 14:
                return ((scp) ((jly0) ks6Var.Q0).get()).a((s061) ((jly0) ks6Var.g).get());
            case 15:
                return new scp(this, (byte) 0);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object g() {
        qq qqVar = (qq) this.c;
        byte b = 1;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new vuf0(new lik1(((xwv) qqVar.a).a));
            case 1:
                q8n q8nVar = (q8n) ((vwv) qqVar.b).a.get();
                c8o.l(q8nVar);
                c9n c9nVar = (c9n) ((jly0) qqVar.e).get();
                vwm1 vwm1Var = (vwm1) ((vwv) qqVar.b).r.get();
                c8o.l(vwm1Var);
                return new svv(q8nVar, c9nVar, vwm1Var);
            case 2:
                return cto1.q(((q7r0) qqVar.c).d.c);
            case 3:
                return ((ncp) ((jly0) qqVar.g).get()).a((c9n) ((jly0) qqVar.e).get(), new dwv(((svv) ((jly0) qqVar.f).get()).a, (byte) 2));
            case 4:
                return new ncp(this, (byte) 1);
            case 5:
                i8h1 i8h1Var = (i8h1) ((vwv) qqVar.b).f.get();
                c8o.l(i8h1Var);
                return new qvv(new gmt(i8h1Var, new txk0((byte) 12), (byte) 15), (lwv) ((jly0) qqVar.m).get(), (vcp) ((jly0) qqVar.n).get());
            case 6:
                Context context = (Context) ((vwv) qqVar.b).d.get();
                c8o.l(context);
                return new lwv(context, (svv) ((jly0) qqVar.f).get(), new hvp0((q7r0) qqVar.c, (byte) 4), (lbp) qqVar.i, (lbp) qqVar.k, (lbp) qqVar.l);
            case 7:
                return new ngs0((s061) ((jly0) qqVar.h).get());
            case 8:
                vwv vwvVar = (vwv) qqVar.b;
                vwv vwvVar2 = (vwv) qqVar.b;
                iyc0 iyc0Var = (iyc0) vwvVar.h.get();
                c8o.l(iyc0Var);
                kt91 kt91Var = (kt91) vwvVar2.i.get();
                c8o.l(kt91Var);
                jik1 jik1Var = (jik1) ((jly0) qqVar.d).get();
                op31 op31Var = (op31) vwvVar2.j.get();
                c8o.l(op31Var);
                ywc0 ywc0Var = (ywc0) vwvVar2.l.get();
                c8o.l(ywc0Var);
                i4q i4qVar = (i4q) vwvVar2.q.get();
                c8o.l(i4qVar);
                yhm yhmVar = (yhm) vwvVar2.n.get();
                c8o.l(yhmVar);
                return new rsu0(iyc0Var, kt91Var, jik1Var, op31Var, ywc0Var, i4qVar, yhmVar, ((Boolean) vwvVar2.m.get()).booleanValue(), (wcp) ((jly0) qqVar.j).get());
            case 9:
                return new wcp((byte) 0);
            case 10:
                f1n0 f1n0Var = (f1n0) ((vwv) qqVar.b).e.get();
                c8o.l(f1n0Var);
                return new ngs0(f1n0Var);
            case 11:
                return new vcp(b);
            case 12:
                return new e5b0(30, Collections.singletonList((c6b0) ((jly0) qqVar.q).get()), (List) null);
            case 13:
                return ((rcp) ((jly0) qqVar.f32p).get()).a((s061) ((jly0) qqVar.h).get());
            case 14:
                return new rcp(this, b);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object h() {
        qq qqVar = (qq) this.c;
        byte b = 2;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new vuf0(new lik1(((lyv) qqVar.a).a));
            case 1:
                return ((ncp) ((jly0) qqVar.e).get()).a((c9n) ((jly0) qqVar.f).get(), new dwv(((cxv) ((jly0) qqVar.g).get()).a, (byte) 8));
            case 2:
                return new ncp(this, (byte) 2);
            case 3:
                q8n q8nVar = (q8n) ((jyv) qqVar.b).a.get();
                c8o.l(q8nVar);
                c9n c9nVar = (c9n) ((jly0) qqVar.f).get();
                vwm1 vwm1Var = (vwm1) ((jyv) qqVar.b).s.get();
                c8o.l(vwm1Var);
                return new cxv(q8nVar, c9nVar, vwm1Var);
            case 4:
                return cto1.q(((q7r0) qqVar.c).d.c);
            case 5:
                i8h1 i8h1Var = (i8h1) ((jyv) qqVar.b).f.get();
                c8o.l(i8h1Var);
                return new bxv(new otu(i8h1Var, new txk0((byte) 13), (byte) 8), (zxv) ((jly0) qqVar.n).get());
            case 6:
                Context context = (Context) ((jyv) qqVar.b).d.get();
                c8o.l(context);
                return new zxv(context, new hvp0((q7r0) qqVar.c, (byte) 4), (cxv) ((jly0) qqVar.g).get(), (lbp) qqVar.i, (lbp) qqVar.k, (lbp) qqVar.l, new txk0((byte) 13), (lbp) qqVar.m);
            case 7:
                return new ngs0((s061) ((jly0) qqVar.h).get());
            case 8:
                jyv jyvVar = (jyv) qqVar.b;
                jyv jyvVar2 = (jyv) qqVar.b;
                iyc0 iyc0Var = (iyc0) jyvVar.h.get();
                c8o.l(iyc0Var);
                kt91 kt91Var = (kt91) jyvVar2.i.get();
                c8o.l(kt91Var);
                jik1 jik1Var = (jik1) ((jly0) qqVar.d).get();
                op31 op31Var = (op31) jyvVar2.k.get();
                c8o.l(op31Var);
                ywc0 ywc0Var = (ywc0) jyvVar2.m.get();
                c8o.l(ywc0Var);
                i4q i4qVar = (i4q) jyvVar2.r.get();
                c8o.l(i4qVar);
                yhm yhmVar = (yhm) jyvVar2.o.get();
                c8o.l(yhmVar);
                return new rsu0(iyc0Var, kt91Var, jik1Var, op31Var, ywc0Var, i4qVar, yhmVar, ((Boolean) jyvVar2.n.get()).booleanValue(), (wcp) ((jly0) qqVar.j).get());
            case 9:
                return new wcp((byte) 1);
            case 10:
                f1n0 f1n0Var = (f1n0) ((jyv) qqVar.b).e.get();
                c8o.l(f1n0Var);
                return new ngs0(f1n0Var);
            case 11:
                jyv jyvVar3 = (jyv) qqVar.b;
                jyv jyvVar4 = (jyv) qqVar.b;
                iyc0 iyc0Var2 = (iyc0) jyvVar3.h.get();
                c8o.l(iyc0Var2);
                kt91 kt91Var2 = (kt91) jyvVar4.i.get();
                c8o.l(kt91Var2);
                op31 op31Var2 = (op31) jyvVar4.k.get();
                c8o.l(op31Var2);
                return new res(iyc0Var2, kt91Var2, op31Var2, (cxv) ((jly0) qqVar.g).get(), (wcp) ((jly0) qqVar.j).get());
            case 12:
                return new e5b0(30, Collections.singletonList((c6b0) ((jly0) qqVar.q).get()), (List) null);
            case 13:
                return ((rcp) ((jly0) qqVar.f32p).get()).a((s061) ((jly0) qqVar.h).get());
            case 14:
                return new rcp(this, b);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object i() {
        g1i g1iVar = (g1i) this.c;
        nyv nyvVar = (nyv) g1iVar.b;
        byte b = this.b;
        if (b == 0) {
            dg30 dg30VarA = nyvVar.a();
            c8o.l(dg30VarA);
            return ((g0i) dg30VarA).i.h("com.spotify.profile.editprofile.permission.EditProfilePermissionsManager", new e1r0((byte) 3, false), new u0w((m0w) ((jly0) g1iVar.d).get(), (byte) 0));
        }
        if (b != 1) {
            if (b != 2) {
                jah.e(b);
                return null;
            }
            dg30 dg30VarA2 = nyvVar.a();
            c8o.l(dg30VarA2);
            return ((g0i) dg30VarA2).i.h("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", new e1r0((byte) 11), new u0w((m0w) ((jly0) g1iVar.d).get(), (byte) 1));
        }
        Scheduler scheduler = (Scheduler) nyvVar.a.get();
        c8o.l(scheduler);
        y0w y0wVar = (y0w) nyvVar.s.get();
        c8o.l(y0wVar);
        p1b0 p1b0Var = (p1b0) nyvVar.t.get();
        c8o.l(p1b0Var);
        q7r0 q7r0Var = (q7r0) g1iVar.c;
        m0w m0wVar = new m0w(scheduler);
        y0wVar.a.set(new t0w(m0wVar, (byte) 0));
        p1b0Var.a = new t0w(m0wVar, (byte) 1);
        q7r0Var.d.c.getLifecycle().a(new i83(p1b0Var, (byte) 4));
        return m0wVar;
    }

    private final Object j() {
        tnm tnmVar = (tnm) this.c;
        evw evwVar = (evw) tnmVar.c;
        byte b = this.b;
        if (b == 0) {
            return new mir0(((b2r0) ((jly0) tnmVar.d).get()).a());
        }
        if (b == 1) {
            c2r0 c2r0Var = (c2r0) ((xvw) tnmVar.b).e.get();
            c8o.l(c2r0Var);
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return c2r0Var.e(evwVar, yon1.G1("EMAILAUTHENTICATION_VALIDATEOTP", "emailauthentication/validateotp", 510, "emailauthentication"), (qir0) null);
        }
        if (b == 2) {
            lqr lqrVar = new lqr((xcp) ((jly0) tnmVar.g).get(), (byte) 23);
            Bundle bundleO0 = evwVar.O0();
            return Collections.singletonMap(wvw.class, new lww(lqrVar, bundleO0.getLong("expires_at_millis"), bundleO0.getLong("resend_cooldown_until_millis")));
        }
        if (b == 3) {
            return new xcp(this);
        }
        if (b == 4) {
            return (b2r0) ((jly0) tnmVar.d).get();
        }
        jah.e(b);
        return null;
    }

    private final Object k() {
        byte b = this.b;
        if (b == 0) {
            return new adp(this, (byte) 0);
        }
        if (b == 1) {
            return new bdp(this, (byte) 0);
        }
        if (b == 2) {
            return new cdp(this, (byte) 0);
        }
        jah.e(b);
        return null;
    }

    private final Object l() {
        byte b = this.b;
        if (b == 0) {
            return new adp(this, (byte) 1);
        }
        if (b == 1) {
            return new bdp(this, (byte) 1);
        }
        if (b == 2) {
            return new cdp(this, (byte) 1);
        }
        jah.e(b);
        return null;
    }

    private final Object m() {
        gdp gdpVar = (gdp) this.c;
        i691 i691Var = i691.a;
        byte b = this.b;
        switch (b) {
            case 0:
                n0y n0yVar = gdpVar.a;
                n0y n0yVar2 = gdpVar.a;
                xfx xfxVarA0 = n0yVar.a0();
                c8o.l(xfxVarA0);
                joe joeVarR0 = n0yVar2.R0();
                c8o.l(joeVarR0);
                sas sasVarB = gdpVar.b();
                Flowable flowableF = n0yVar2.f();
                c8o.l(flowableF);
                FlowableMap flowableMapC = gdpVar.c();
                mr20 mr20VarZ0 = n0yVar2.Z0();
                c8o.l(mr20VarZ0);
                mr20 mr20Var = mr20VarZ0;
                vz80 vz80Var = new vz80((a1r0) gdpVar.h.get());
                q8n q8nVarE = n0yVar2.e();
                c8o.l(q8nVarE);
                luk lukVarW = n0yVar2.w();
                c8o.l(lukVarW);
                c21 c21Var = new c21(joeVarR0, sasVarB, flowableF, flowableMapC, mr20Var, vz80Var, q8nVarE, new mr4(lukVarW), (a1r0) gdpVar.h.get(), (byte) 6);
                a62 a62Var = (a62) gdpVar.j.get();
                mwn0 mwn0VarX = n0yVar2.x();
                c8o.l(mwn0VarX);
                cce cceVar = new cce(a62Var, mwn0VarX, (hnl) gdpVar.k.get(), (byte) 16);
                l0y l0yVar = (l0y) gdpVar.l.get();
                k0y k0yVar = (k0y) gdpVar.m.get();
                mwn0 mwn0VarX2 = n0yVar2.x();
                c8o.l(mwn0VarX2);
                sp00 sp00Var = new sp00(l0yVar, k0yVar, mwn0VarX2, (hnl) gdpVar.k.get(), (byte) 1);
                FlowableMap flowableMapC2 = gdpVar.c();
                unr unrVarC0 = n0yVar2.C0();
                c8o.l(unrVarC0);
                aor aorVarE = n0yVar2.E();
                c8o.l(aorVarE);
                mo9 mo9Var = mo9.d;
                mo9 mo9Var2 = mo9.e;
                e821 e821Var = new e821(flowableMapC2, unrVarC0, aorVarE, mo9Var, mo9Var2);
                dpt0 dpt0VarE = gdpVar.e();
                w9u0 w9u0Var = (w9u0) gdpVar.n.get();
                gn10 gn10Var = (gn10) gdpVar.o.get();
                FlowableMap flowableMapC3 = gdpVar.c();
                Flowable flowable = (Flowable) gdpVar.g.get();
                mo9 mo9Var3 = mo9.O0;
                Flowable flowableJ = flowable.j(mo9Var3);
                Flowable flowableJ2 = ((Flowable) gdpVar.g.get()).j(mo9.N0);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) gdpVar.g.get());
                pe peVarH1 = n0yVar2.h1();
                c8o.l(peVarH1);
                luk lukVarW2 = n0yVar2.w();
                c8o.l(lukVarW2);
                new dfm(w9u0Var, gn10Var, flowableMapC3, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVarH1, new qmr(new in4(lukVarW2)));
                vi11 vi11Var = new vi11(e821Var, dpt0VarE, new upd0((Flowable) gdpVar.r.get(), (byte) 2), gdpVar.d(), new a0b((byte) 26));
                v1k v1kVar = new v1k(((Flowable) gdpVar.g.get()).j((FlowableTransformer) gdpVar.s.get()), (d0r) gdpVar.t.get(), (xrn0) gdpVar.u.get(), (byte) 15);
                Flowable flowable2 = (Flowable) gdpVar.g.get();
                lik1 lik1Var = (lik1) gdpVar.f.get();
                ywc0 ywc0VarU0 = n0yVar2.u0();
                c8o.l(ywc0VarU0);
                luk lukVarW3 = n0yVar2.w();
                c8o.l(lukVarW3);
                b1y b1yVar = new b1y(new lm4(lukVarW3));
                mta mtaVar = new mta((byte) 8, false);
                i4q i4qVarZ0 = n0yVar2.z0();
                c8o.l(i4qVarZ0);
                yhm yhmVarA0 = n0yVar2.A0();
                c8o.l(yhmVarA0);
                boolean zH0 = n0yVar2.h0();
                cmf1 cmf1Var = (cmf1) gdpVar.v.get();
                Scheduler schedulerU = n0yVar2.U();
                c8o.l(schedulerU);
                mr20 mr20VarZ1 = n0yVar2.Z0();
                c8o.l(mr20VarZ1);
                mr20 mr20Var2 = mr20VarZ1;
                lid lidVarL0 = n0yVar2.L0();
                c8o.l(lidVarL0);
                tck tckVar = new tck(flowable2, lik1Var, ywc0VarU0, b1yVar, mtaVar, i4qVarZ0, yhmVarA0, zH0, cmf1Var, schedulerU, mr20Var2, mid.v(lidVarL0));
                d0r d0rVar = (d0r) gdpVar.t.get();
                FlowableMap flowableMapC4 = gdpVar.c();
                mo9 mo9Var4 = mo9.f;
                Resources resourcesR = n0yVar2.r();
                c8o.l(resourcesR);
                yna0 yna0Var = new yna0(resourcesR);
                ynb0 ynb0VarA = xqu.a(gdpVar.w);
                ynb0 ynb0VarA2 = xqu.a(gdpVar.u);
                ynb0 ynb0VarA3 = xqu.a(gdpVar.h);
                Resources resourcesR2 = n0yVar2.r();
                c8o.l(resourcesR2);
                luk lukVarW4 = n0yVar2.w();
                c8o.l(lukVarW4);
                ln4 ln4Var = new ln4(false, lukVarW4);
                vbs vbsVarN = n0yVar2.n();
                c8o.l(vbsVarN);
                dpf1 dpf1Var = new dpf1(d0rVar, flowableMapC4, mo9Var2, mo9Var, mo9Var4, yna0Var, ynb0VarA, ynb0VarA2, ynb0VarA3, resourcesR2, ln4Var, vbsVarN);
                FlowableMap flowableMapC5 = gdpVar.c();
                Flowable flowable3 = (Flowable) gdpVar.g.get();
                Flowable flowable4 = (Flowable) gdpVar.y.get();
                w9u0 w9u0Var2 = (w9u0) gdpVar.n.get();
                Consumer consumer = (Consumer) gdpVar.z.get();
                luk lukVarW5 = n0yVar2.w();
                c8o.l(lukVarW5);
                jn4 jn4Var = new jn4(lukVarW5);
                dma1 dma1VarL0 = n0yVar2.l0();
                c8o.l(dma1VarL0);
                mo51 mo51Var = new mo51(flowable3, flowable4, w9u0Var2, consumer, jn4Var, dma1VarL0);
                Flowable flowable5 = (Flowable) gdpVar.g.get();
                fl3 fl3VarK = n0yVar2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable5, fl3VarK, (lik1) gdpVar.f.get());
                s691 s691Var = new s691(gdpVar.f(), (Flowable) gdpVar.r.get(), ((Flowable) gdpVar.g.get()).j(mo9Var3), (w9u0) gdpVar.n.get());
                dpt0 dpt0VarE2 = gdpVar.e();
                z6k0 z6k0VarM0 = n0yVar2.M0();
                c8o.l(z6k0VarM0);
                m4c m4cVarK0 = n0yVar2.K0();
                rxj0 rxj0VarG0 = n0yVar2.G0();
                c8o.l(rxj0VarG0);
                k691 k691Var = new k691((Flowable) gdpVar.g.get(), (Flowable) gdpVar.r.get(), (w9u0) gdpVar.n.get(), nrq0.a, i691Var);
                Flowable flowable6 = (Flowable) gdpVar.g.get();
                xh71 xh71VarZ = n0yVar2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL = n0yVar2.L();
                c8o.l(fbmVarL);
                u601 u601VarT = n0yVar2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = n0yVar2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = n0yVar2.k();
                c8o.l(me30VarK);
                Flowable flowableF2 = n0yVar2.f();
                c8o.l(flowableF2);
                f771 f771VarO = n0yVar2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0(hq41VarD, me30VarK, flowableF2, f771VarO, (byte) 15);
                f771 f771VarO2 = n0yVar2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = n0yVar2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) gdpVar.A.get();
                luk lukVarW6 = n0yVar2.w();
                c8o.l(lukVarW6);
                o671 o671Var = new o671(flowable6, xh71VarZ, fbmVarL, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW6);
                hs71 hs71VarX = n0yVar2.X();
                c8o.l(hs71VarX);
                gs71 gs71VarA = hs71VarX.a(new j3v((Object) gdpVar.f(), (byte) 6));
                i5w0 i5w0Var = gs71VarA != null ? new i5w0(gs71VarA) : j5.a;
                ynb0 ynb0VarA4 = xqu.a(gdpVar.B);
                ynb0 ynb0VarA5 = xqu.a(gdpVar.C);
                luk lukVarW7 = n0yVar2.w();
                c8o.l(lukVarW7);
                dn4 dn4Var = new dn4(lukVarW7);
                gg11 gg11VarN = n0yVar2.N();
                q2p0 q2p0Var = gdpVar.b;
                luk lukVarW8 = n0yVar2.w();
                c8o.l(lukVarW8);
                k2p0 k2p0Var = new k2p0(gg11VarN, q2p0Var, new dn4(lukVarW8));
                aor aorVarE2 = n0yVar2.E();
                c8o.l(aorVarE2);
                ynb0 ynb0VarA6 = xqu.a(gdpVar.D);
                ynb0 ynb0VarA7 = xqu.a(gdpVar.E);
                ynb0 ynb0VarA8 = xqu.a(gdpVar.F);
                FlowableMap flowableMapF = gdpVar.f();
                Scheduler schedulerU2 = n0yVar2.U();
                c8o.l(schedulerU2);
                luk lukVarW9 = n0yVar2.w();
                c8o.l(lukVarW9);
                rzo0 rzo0Var = new rzo0(flowableMapF, schedulerU2, new tu4(false, lukVarW9), (byte) 20);
                FlowableMap flowableMapC6 = gdpVar.c();
                lid lidVarL1 = n0yVar2.L0();
                c8o.l(lidVarL1);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableMapC6.X(new t0y(mid.v(lidVarL1), (byte) 0)).J(uml1.a1).t(Functions.a);
                ynb0 ynb0VarA9 = xqu.a(gdpVar.G);
                ynb0 ynb0VarA10 = xqu.a(gdpVar.H);
                ynb0 ynb0VarA11 = xqu.a(gdpVar.I);
                ynb0 ynb0VarA12 = xqu.a(gdpVar.J);
                fbm fbmVarL2 = n0yVar2.L();
                c8o.l(fbmVarL2);
                i8h1 i8h1Var = (i8h1) gdpVar.c.get();
                s4p0 s4p0VarM1 = n0yVar2.m1();
                c8o.l(s4p0VarM1);
                l6h1 l6h1VarE = s4p0VarM1.e();
                c8o.m(l6h1VarE);
                s4p0 s4p0VarM2 = n0yVar2.m1();
                c8o.l(s4p0VarM2);
                n7h1 n7h1VarF = s4p0VarM2.f();
                c8o.m(n7h1VarF);
                lqc lqcVar = new lqc((byte) 17);
                msm0 msm0VarV = n0yVar2.v();
                c8o.l(msm0VarV);
                x4p0 x4p0Var = new x4p0(msm0VarV, (n6r0) gdpVar.e.get());
                ynb0 ynb0VarA13 = xqu.a(gdpVar.K);
                luk lukVarW10 = n0yVar2.w();
                c8o.l(lukVarW10);
                return new y0y(xfxVarA0, c21Var, cceVar, sp00Var, vi11Var, v1kVar, tckVar, dpf1Var, flowableMapC5, mo51Var, yl1Var, s691Var, dpt0VarE2, z6k0VarM0, m4cVarK0, rxj0VarG0, k691Var, o671Var, i5w0Var, ynb0VarA4, ynb0VarA5, dn4Var, k2p0Var, aorVarE2, ynb0VarA6, ynb0VarA7, ynb0VarA8, rzo0Var, flowableDistinctUntilChangedT, ynb0VarA9, ynb0VarA10, ynb0VarA11, ynb0VarA12, fbmVarL2, i8h1Var, l6h1VarE, n7h1VarF, lqcVar, x4p0Var, ynb0VarA13, new b1y(new lm4(lukVarW10)), (n6r0) gdpVar.e.get(), (lik1) gdpVar.f.get(), rqt0.u(new x3s(((jnk0) gdpVar.L.get()).a, (byte) 25)));
            case 1:
                s4p0 s4p0VarM3 = gdpVar.a.m1();
                c8o.l(s4p0VarM3);
                i8h1 i8h1VarD = s4p0VarM3.d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 2:
                return gdpVar.b.h();
            case 3:
                return gdpVar.b.i();
            case 4:
                return gdpVar.b.e();
            case 5:
                return k9o0.B(gdpVar.b);
            case 6:
                a1r0 a1r0VarC = gdpVar.a.C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 7:
                return new a62((p2p0) gdpVar.i.get(), (byte) 1);
            case 8:
                return gdpVar.b.j();
            case 9:
                return k9o0.r(gdpVar.b);
            case 10:
                return new l0y((p2p0) gdpVar.i.get(), (byte) 0);
            case 11:
                return new k0y((p2p0) gdpVar.i.get(), (byte) 0);
            case 12:
                return k9o0.z(gdpVar.b);
            case 13:
                return gdpVar.b.f();
            case 14:
                return f2u0.B(gdpVar.f(), (Flowable) gdpVar.f5p.get(), (Flowable) gdpVar.q.get(), gdpVar.a());
            case 15:
                jly0 jly0Var = gdpVar.g;
                n0y n0yVar3 = gdpVar.a;
                Flowable flowable7 = (Flowable) jly0Var.get();
                Scheduler schedulerU3 = n0yVar3.U();
                c8o.l(schedulerU3);
                yqg yqgVarA = n0yVar3.a();
                c8o.l(yqgVarA);
                return f2u0.z(flowable7, schedulerU3, yqgVarA, gdpVar.a());
            case 16:
                return f2u0.y((Flowable) gdpVar.g.get(), gdpVar.a());
            case 17:
                return gdpVar.b.g();
            case 18:
                return k9o0.t(gdpVar.b);
            case 19:
                lzn0 lzn0VarC = gdpVar.a.c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 20:
                jly0 jly0Var2 = gdpVar.f;
                n0y n0yVar4 = gdpVar.a;
                lik1 lik1Var2 = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = n0yVar4.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB = n0yVar4.B();
                c8o.l(c3sVarB);
                luk lukVarW11 = n0yVar4.w();
                c8o.l(lukVarW11);
                an4 an4Var = new an4(false, lukVarW11);
                luk lukVarW12 = n0yVar4.w();
                c8o.l(lukVarW12);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB, an4Var, new uu4(false, lukVarW12), n0yVar4.q());
            case 21:
                return gdpVar.a.b0();
            case 22:
                return f2u0.C(gdpVar.f(), (Flowable) gdpVar.x.get(), (Flowable) gdpVar.q.get(), gdpVar.a());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                jly0 jly0Var3 = gdpVar.g;
                n0y n0yVar5 = gdpVar.a;
                Flowable flowable8 = (Flowable) jly0Var3.get();
                Scheduler schedulerU4 = n0yVar5.U();
                c8o.l(schedulerU4);
                yqg yqgVarA2 = n0yVar5.a();
                c8o.l(yqgVarA2);
                return f2u0.A(flowable8, schedulerU4, yqgVarA2, gdpVar.a());
            case 24:
                return new lrj0(gdpVar.b, (byte) 21);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return k9o0.v(gdpVar.b);
            case 26:
                Flowable flowable9 = (Flowable) gdpVar.g.get();
                Flowable flowable10 = (Flowable) gdpVar.r.get();
                w9u0 w9u0Var3 = (w9u0) gdpVar.n.get();
                o241 o241VarI = gdpVar.a.i();
                c8o.l(o241VarI);
                return new ktf1(flowable9, flowable10, w9u0Var3, i691Var, o241VarI, gdpVar.c, gdpVar.b());
            case 27:
                Flowable flowable11 = (Flowable) gdpVar.g.get();
                Flowable flowable12 = (Flowable) gdpVar.r.get();
                w9u0 w9u0Var4 = (w9u0) gdpVar.n.get();
                o241 o241VarI2 = gdpVar.a.i();
                c8o.l(o241VarI2);
                return new ekf1(flowable11, flowable12, w9u0Var4, i691Var, o241VarI2, gdpVar.c, gdpVar.b());
            case 28:
                return w3p0.w(gdpVar.a.H(), gdpVar.b, (o2p0) gdpVar.d.get());
            case 29:
                FlowableJust flowableJustY = k9o0.y((hnl) gdpVar.k.get());
                p2p0 p2p0Var = (p2p0) gdpVar.i.get();
                Scheduler schedulerU5 = gdpVar.a.U();
                c8o.l(schedulerU5);
                return new tqq0(flowableJustY, p2p0Var, schedulerU5);
            case 30:
                a1g1 a1g1Var = new a1g1(gdpVar.a.F(), (byte) 11);
                Scheduler schedulerU6 = gdpVar.a.U();
                c8o.l(schedulerU6);
                return new h280(a1g1Var, schedulerU6);
            case 31:
                return new ww9(gdpVar.d());
            case 32:
                Flowable flowable13 = (Flowable) gdpVar.g.get();
                q8n q8nVarE2 = gdpVar.a.e();
                c8o.l(q8nVarE2);
                return new kou(flowable13, q8nVarE2);
            case 33:
                Flowable flowable14 = (Flowable) gdpVar.g.get();
                q8n q8nVarE3 = gdpVar.a.e();
                c8o.l(q8nVarE3);
                return new zmu(flowable14, q8nVarE3);
            case 34:
                Flowable flowable15 = (Flowable) gdpVar.g.get();
                Scheduler schedulerU7 = gdpVar.a.U();
                c8o.l(schedulerU7);
                return new tbm(flowable15, schedulerU7);
            case 35:
                n0y n0yVar6 = gdpVar.a;
                n0y n0yVar7 = gdpVar.a;
                Flowable flowableF3 = n0yVar6.f();
                c8o.l(flowableF3);
                Context context = n0yVar7.context();
                c8o.l(context);
                Scheduler schedulerU8 = n0yVar7.U();
                c8o.l(schedulerU8);
                return new skn0(flowableF3, context, schedulerU8);
            case 36:
                Flowable flowable16 = (Flowable) gdpVar.g.get();
                Flowable flowable17 = (Flowable) gdpVar.f5p.get();
                c3s c3sVarB2 = gdpVar.a.B();
                c8o.l(c3sVarB2);
                return new jnk0(flowable16, flowable17, c3sVarB2);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object n() {
        byte b = this.b;
        if (b == 0) {
            return new idp(this);
        }
        if (b == 1) {
            return new jdp();
        }
        if (b == 2) {
            return new kdp();
        }
        if (b == 3) {
            return new ldp();
        }
        if (b == 4) {
            return new mdp();
        }
        jah.e(b);
        return null;
    }

    private final Object o() {
        lgy lgyVar = (lgy) ((k9k) this.c).b;
        byte b = this.b;
        if (b == 0) {
            return new ndp(this);
        }
        if (b == 1) {
            return new bzo(this, (byte) 4);
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        woa woaVar = (woa) lgyVar.c;
        c8o.l(woaVar);
        kma kmaVar = (kma) lgyVar.d;
        c8o.l(kmaVar);
        fpa fpaVar = (fpa) lgyVar.e;
        c8o.l(fpaVar);
        pe peVar = (pe) lgyVar.f;
        c8o.l(peVar);
        boolean z = lgyVar.a;
        zle1 zle1Var = (zle1) lgyVar.b;
        c8o.l(zle1Var);
        return new k0t(woaVar, kmaVar, fpaVar, peVar, z, zle1Var);
    }

    private final Object p() {
        byte b = this.b;
        if (b == 0) {
            return new odp(this, (byte) 0);
        }
        if (b == 1) {
            return new gap(this, (byte) 1);
        }
        if (b == 2) {
            return new pdp(this);
        }
        if (b == 3) {
            return new qdp(this, (byte) 0);
        }
        if (b == 4) {
            return new rdp(this, (byte) 0);
        }
        jah.e(b);
        return null;
    }

    private final Object q() {
        c21 c21Var = (c21) this.c;
        nsy nsyVar = (nsy) c21Var.c;
        byte b = this.b;
        if (b == 0) {
            ruy ruyVar = (ruy) c21Var.b;
            ynb0 ynb0VarA = xqu.a((jly0) c21Var.e);
            q8n q8nVar = (q8n) nsyVar.d.get();
            c8o.l(q8nVar);
            return new buy(ruyVar.a, new y0u(0, ynb0VarA, ynb0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), q8nVar);
        }
        byte b2 = 1;
        if (b == 1) {
            return cwl1.C((q7r0) c21Var.d);
        }
        if (b == 2) {
            d0r d0rVar = (d0r) ((jly0) c21Var.e).get();
            xd0 xd0Var = (xd0) nsyVar.A.get();
            c8o.l(xd0Var);
            Flowable flowable = (Flowable) nsyVar.f.get();
            c8o.l(flowable);
            Scheduler scheduler = (Scheduler) nsyVar.e.get();
            c8o.l(scheduler);
            yqg yqgVar = (yqg) nsyVar.b.get();
            c8o.l(yqgVar);
            kl1 kl1Var = new kl1(xd0Var, flowable, scheduler, yqgVar, ((Boolean) nsyVar.B.get()).booleanValue());
            k9q k9qVar = (k9q) nsyVar.z.get();
            c8o.l(k9qVar);
            return new wty(d0rVar, kl1Var, k9qVar, new rmr((sdp) ((jly0) c21Var.g).get(), (byte) 25), (rdp) ((jly0) c21Var.h).get());
        }
        if (b == 3) {
            return new sdp(this, (byte) 0);
        }
        if (b == 4) {
            return new rdp(this, b2);
        }
        if (b != 5) {
            jah.e(b);
            return null;
        }
        Flowable flowable2 = (Flowable) nsyVar.g.get();
        c8o.l(flowable2);
        yko ykoVar = (yko) nsyVar.h.get();
        c8o.l(ykoVar);
        a9q a9qVar = (a9q) nsyVar.u.get();
        c8o.l(a9qVar);
        csy csyVar = (csy) nsyVar.v.get();
        c8o.l(csyVar);
        qua0 qua0Var = (iry) nsyVar.w.get();
        c8o.l(qua0Var);
        qua0 qua0Var2 = (gd0) nsyVar.x.get();
        c8o.l(qua0Var2);
        six0 six0Var = (six0) nsyVar.F.get();
        c8o.l(six0Var);
        qua0 qua0Var3 = (nlj1) nsyVar.y.get();
        c8o.l(qua0Var3);
        qua0 qua0Var4 = (ztw0) nsyVar.c.get();
        c8o.l(qua0Var4);
        qua0 qua0VarA = a9qVar.a("EntitySegments");
        qua0 qua0VarA2 = ykoVar.a(null, new ko9(flowable2, (lnm) null, (byte) 1));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new e5b0(30, p7h.M(new qua0[]{qua0Var3, qua0Var4, qua0VarA, qua0VarA2, csyVar, qua0Var, qua0Var2, six0.b(six0Var, yon1.u1(), 4)}), (List) null);
    }

    private final Object r() {
        byte b = this.b;
        if (b == 0) {
            return new tdp(this);
        }
        if (b == 1) {
            return new udp(this, (byte) 0);
        }
        if (b == 2) {
            return new qdp(this, (byte) 1);
        }
        jah.e(b);
        return null;
    }

    private final Object s() {
        c21 c21Var = (c21) this.c;
        puy puyVar = (puy) c21Var.d;
        byte b = this.b;
        if (b == 0) {
            ruy ruyVar = (ruy) c21Var.b;
            ynb0 ynb0VarA = xqu.a((jly0) c21Var.e);
            q8n q8nVar = (q8n) puyVar.e.get();
            c8o.l(q8nVar);
            return new buy(ruyVar.a, new y0u(0, ynb0VarA, ynb0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), q8nVar);
        }
        if (b == 1) {
            return cwl1.C((q7r0) c21Var.c);
        }
        if (b == 2) {
            d0r d0rVar = (d0r) ((jly0) c21Var.e).get();
            xd0 xd0Var = (xd0) puyVar.C.get();
            c8o.l(xd0Var);
            Flowable flowable = (Flowable) puyVar.f.get();
            c8o.l(flowable);
            Scheduler scheduler = (Scheduler) puyVar.d.get();
            c8o.l(scheduler);
            yqg yqgVar = (yqg) puyVar.b.get();
            c8o.l(yqgVar);
            kl1 kl1Var = new kl1(xd0Var, flowable, scheduler, yqgVar, ((Boolean) puyVar.D.get()).booleanValue());
            k9q k9qVar = (k9q) puyVar.B.get();
            c8o.l(k9qVar);
            return new wty(d0rVar, kl1Var, k9qVar, new rmr((sdp) ((jly0) c21Var.g).get(), (byte) 25), (rdp) ((jly0) c21Var.h).get());
        }
        byte b2 = 3;
        if (b == 3) {
            return new sdp(this, (byte) 2);
        }
        if (b == 4) {
            return new rdp(this, b2);
        }
        if (b != 5) {
            jah.e(b);
            return null;
        }
        Flowable flowable2 = (Flowable) puyVar.g.get();
        c8o.l(flowable2);
        yko ykoVar = (yko) puyVar.h.get();
        c8o.l(ykoVar);
        a9q a9qVar = (a9q) puyVar.u.get();
        c8o.l(a9qVar);
        csy csyVar = (csy) puyVar.v.get();
        c8o.l(csyVar);
        qua0 qua0Var = (iry) puyVar.w.get();
        c8o.l(qua0Var);
        qua0 qua0Var2 = (gd0) puyVar.x.get();
        c8o.l(qua0Var2);
        six0 six0Var = (six0) puyVar.F.get();
        c8o.l(six0Var);
        qua0 qua0Var3 = (nlj1) puyVar.y.get();
        c8o.l(qua0Var3);
        qua0 qua0Var4 = (ztw0) puyVar.c.get();
        c8o.l(qua0Var4);
        qua0 qua0VarA = a9qVar.a("EntitySegments");
        qua0 qua0VarA2 = ykoVar.a(null, new ko9(flowable2, (lnm) null, (byte) 2));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new e5b0(30, p7h.M(new qua0[]{qua0Var3, qua0Var4, qua0VarA, qua0VarA2, csyVar, qua0Var, qua0Var2, six0.b(six0Var, yon1.u1(), 4)}), (List) null);
    }

    private final Object t() {
        byte b = this.b;
        if (b == 0) {
            return new wdp(this);
        }
        if (b == 1) {
            return new xdp(this);
        }
        if (b == 2) {
            return new ydp(this);
        }
        jah.e(b);
        return null;
    }

    private final Object u() {
        uw0 uw0Var = (uw0) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new q5z((v6r0) ((jly0) uw0Var.g).get(), (aep) ((jly0) uw0Var.h).get(), (bep) ((jly0) uw0Var.b).get(), (dep) ((jly0) uw0Var.N0).get());
            case 1:
                return new n5z((nt8) ((jly0) uw0Var.f).get());
            case 2:
                mt8 mt8Var = (mt8) ((k5z) uw0Var.e).d.get();
                c8o.l(mt8Var);
                uu00 uu00Var = (uu00) ((k5z) uw0Var.e).e.get();
                c8o.l(uu00Var);
                return new nt8(mt8Var, uu00Var);
            case 3:
                return new aep((byte) 0);
            case 4:
                return new bep(this);
            case 5:
                return new i5z((f5z) ((jly0) uw0Var.i).get(), (cep) ((jly0) uw0Var.c).get(), (v9b0) ((jly0) uw0Var.Y).get());
            case 6:
                return new f5z();
            case 7:
                return new cep(this);
            case 8:
                xfx xfxVar = (xfx) ((k5z) uw0Var.e).a.get();
                c8o.l(xfxVar);
                return new igx(xfxVar.c, (byte) 1);
            case 9:
                o5z o5zVar = (o5z) uw0Var.d;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new r4m0(yon1.J0().c, o5zVar.a);
            case 10:
                return new v9b0();
            case 11:
                return new dep();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object v() {
        f9p f9pVar = (f9p) this.c;
        byte b = 0;
        byte b2 = 2;
        byte b3 = this.b;
        switch (b3) {
            case 0:
                return new bzo(this, (byte) 5);
            case 1:
                e7z e7zVar = (e7z) f9pVar.X;
                e7z e7zVar2 = (e7z) f9pVar.X;
                woa woaVar = (woa) e7zVar.Q.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) e7zVar2.R.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) e7zVar2.T.get();
                c8o.l(fpaVar);
                pe peVar = (pe) e7zVar2.O.get();
                c8o.l(peVar);
                boolean zBooleanValue = ((Boolean) e7zVar2.S.get()).booleanValue();
                zle1 zle1Var = (zle1) e7zVar2.g.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var);
            case 2:
                return new t1p(this, (byte) 2);
            case 3:
                return new s1p(this, (byte) 3);
            case 4:
                return new iep(this);
            case 5:
                return new jep(this, (byte) 0);
            case 6:
                return new kep(this, b);
            case 7:
                return new lep(this);
            case 8:
                y1z y1zVar = (y1z) ((e7z) f9pVar.X).K.get();
                c8o.l(y1zVar);
                c8o.l(((e7z) f9pVar.X).a());
                return new jl11(y1zVar, xqu.a((jly0) f9pVar.h), xqu.a((jly0) f9pVar.h), xqu.a((jly0) f9pVar.h));
            case 9:
                e7z e7zVar3 = (e7z) f9pVar.X;
                e7z e7zVar4 = (e7z) f9pVar.X;
                t1z t1zVar = (t1z) e7zVar3.E.get();
                c8o.l(t1zVar);
                Scheduler scheduler = Schedulers.c;
                c8o.m(scheduler);
                Scheduler scheduler2 = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler2);
                jl11 jl11Var = (jl11) ((g5t) f9pVar.N0).get();
                lzn0 lzn0VarC = e7zVar4.c();
                c8o.l(lzn0VarC);
                r1z r1zVar = (r1z) e7zVar4.H.get();
                c8o.l(r1zVar);
                lbp lbpVar = (lbp) f9pVar.O0;
                muz muzVarU = f9pVar.u();
                tfq tfqVar = (tfq) e7zVar4.G.get();
                c8o.l(tfqVar);
                yh2 yh2Var = (yh2) e7zVar4.F.get();
                c8o.l(yh2Var);
                zr00 zr00Var = (zr00) e7zVar4.J.get();
                c8o.l(zr00Var);
                return new uk11(t1zVar, scheduler, scheduler2, jl11Var, lzn0VarC, r1zVar, lbpVar, muzVarU, tfqVar, yh2Var, zr00Var, f9pVar.l());
            case 10:
                return new tgt0(new myq0((q7r0) f9pVar.Y).get());
            case 11:
                y1z y1zVar2 = (y1z) ((e7z) f9pVar.X).K.get();
                c8o.l(y1zVar2);
                Activity activityA = ((e7z) f9pVar.X).a();
                c8o.l(activityA);
                return new llc0(y1zVar2, activityA, xqu.a((jly0) f9pVar.i), xqu.a((jly0) f9pVar.i), xqu.a((jly0) f9pVar.i));
            case 12:
                e7z e7zVar5 = (e7z) f9pVar.X;
                e7z e7zVar6 = (e7z) f9pVar.X;
                t1z t1zVar2 = (t1z) e7zVar5.E.get();
                c8o.l(t1zVar2);
                Scheduler scheduler3 = Schedulers.c;
                c8o.m(scheduler3);
                Scheduler scheduler4 = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler4);
                llc0 llc0Var = (llc0) ((g5t) f9pVar.P0).get();
                lzn0 lzn0VarC2 = e7zVar6.c();
                c8o.l(lzn0VarC2);
                r1z r1zVar2 = (r1z) e7zVar6.H.get();
                c8o.l(r1zVar2);
                lbp lbpVar2 = (lbp) f9pVar.O0;
                muz muzVarU2 = f9pVar.u();
                ufq ufqVar = (ufq) e7zVar6.L.get();
                c8o.l(ufqVar);
                yh2 yh2Var2 = (yh2) e7zVar6.F.get();
                c8o.l(yh2Var2);
                zr00 zr00Var2 = (zr00) e7zVar6.J.get();
                c8o.l(zr00Var2);
                return new klc0(t1zVar2, scheduler3, scheduler4, llc0Var, lzn0VarC2, r1zVar2, lbpVar2, muzVarU2, ufqVar, yh2Var2, zr00Var2, f9pVar.l());
            case 13:
                return new mep(this);
            case 14:
                return new nep(this);
            case 15:
                return new gap(this, b2);
            case 16:
                return new eep();
            case 17:
                return new fep(this);
            case 18:
                return new jar0((g7z) f9pVar.t, (gw8) ((jly0) f9pVar.W0).get());
            case 19:
                return new gw8((g7z) f9pVar.t);
            case 20:
                return new gep(this);
            case 21:
                return new hep(this);
            default:
                jah.e(b3);
                return null;
        }
    }

    private final Object w() {
        nzp nzpVar = (nzp) ((c21) this.c).d;
        byte b = this.b;
        if (b == 0) {
            return new s1p(this, (byte) 4);
        }
        if (b == 1) {
            return new t1p(this, (byte) 3);
        }
        if (b == 2) {
            return new pep(this, (byte) 0);
        }
        if (b == 3) {
            return new v1p(this, (byte) 4);
        }
        if (b != 4) {
            if (b == 5) {
                return new qep(this);
            }
            jah.e(b);
            return null;
        }
        lzn0 lzn0Var = (lzn0) nzpVar.b.i.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) nzpVar.b.V0.get();
        c8o.l(a1r0Var);
        Activity activityB = nzpVar.b();
        c8o.l(activityB);
        return new et90(activityB, lzn0Var, a1r0Var);
    }

    private final Object x() {
        kp5 kp5Var = (kp5) this.c;
        sez sezVar = (sez) kp5Var.a;
        byte b = this.b;
        switch (b) {
            case 0:
                bqz bqzVar = (bqz) sezVar.b.get();
                c8o.l(bqzVar);
                return new nez(bqzVar);
            case 1:
                Context context = (Context) sezVar.a.a;
                c8o.l(context);
                return new c7w0(context.getApplicationContext());
            case 2:
                return new afz((tez) ((jly0) kp5Var.e).get(), (rep) ((jly0) kp5Var.f).get(), (sep) ((jly0) kp5Var.g).get());
            case 3:
                return new wez((oez) ((jly0) kp5Var.d).get());
            case 4:
                return new qez((nez) ((jly0) kp5Var.b).get());
            case 5:
                return new rep(this);
            case 6:
                return new sep();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object y() {
        byte b = this.b;
        if (b == 0) {
            return new tep(this);
        }
        if (b == 1) {
            return new uep((byte) 0);
        }
        if (b == 2) {
            return new vep((byte) 0);
        }
        jah.e(b);
        return null;
    }

    private final Object z() {
        yep yepVar = (yep) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new c3n0((dma1) yepVar.a.f.get());
            case 1:
                vob0 vob0Var = ((xb00) yepVar.j.get()).H;
                c8o.m(vob0Var);
                return vob0Var;
            case 2:
                yc00 yc00Var = yepVar.a;
                yc00 yc00Var2 = yepVar.a;
                return new lc00((Context) yc00Var.a.get(), yepVar.d, yepVar.e, yepVar.b, spq0.d((Observable) yepVar.g.get()), spq0.d((Observable) yepVar.h.get()), spq0.d((uc00) yepVar.i.get()), (q8n) yc00Var2.g.get(), (nfa0) yc00Var2.h.get());
            case 3:
                return (ezm0) yepVar.c.get();
            case 4:
                return new ezm0();
            case 5:
                wig wigVar = new wig();
                return new cv41(Collections.singletonList(wigVar), new zq4(new zq4()));
            case 6:
                return Observable.defer(new yj1(xqu.a(yepVar.f), (byte) 8));
            case 7:
                return (zwz0) yepVar.a.c.get();
            case 8:
                return (Observable) yepVar.a.d.get();
            case 9:
                return uc00.a;
            case 10:
                return new t2j0((nb00) yepVar.k.get());
            case 11:
                return new EventSenderCoreBridgeImpl((xb00) yepVar.j.get());
            case 12:
                return new vfs0(new CosmosTransport(new sn0((RxRouter) yepVar.a.b.get(), (byte) 22)));
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        mmr tj00Var;
        d460 lujVar;
        byte b = this.a;
        Object obj = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                if (b2 == 0) {
                    CallbackRouter callbackRouter = (CallbackRouter) ((jtu) ((t7p) obj).b).b.get();
                    c8o.l(callbackRouter);
                    return new oqp0(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 9)));
                }
                if (b2 == 1) {
                    return new kbp();
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                dbr0 yxe1Var = new yxe1(new jx21(2131955070));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("YOURLIBRARY_DOWNLOAD_CENTER", "yourlibrary/download-center", 2261, "yourlibrary"), new lik1("spotify:internal:download-center"), (nar0) null)}, false);
            case 1:
                switch (b2) {
                    case 0:
                        return new fap(this, (byte) 1);
                    case 1:
                        return new qbp(this);
                    case 2:
                        return new yyo(this, (byte) 2);
                    case 3:
                        return new rbp(this);
                    case 4:
                        return new sbp(this);
                    case 5:
                        return new xyo(this, (byte) 2);
                    case 6:
                        return new tbp(this);
                    case 7:
                        return new ubp(this);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            case 6:
                return f();
            case 7:
                if (b2 == 0) {
                    return pzm.h((mos) ((mvv) ((tnm) obj).c).p.get());
                }
                if (b2 == 1) {
                    return new qcp((byte) 1);
                }
                if (b2 == 2) {
                    return new tcp();
                }
                if (b2 == 3) {
                    return new ucp();
                }
                if (b2 == 4) {
                    return new vcp((byte) 0);
                }
                jah.e(b2);
                return null;
            case 8:
                return g();
            case 9:
                return h();
            case 10:
                return i();
            case 11:
                return j();
            case 12:
                return k();
            case 13:
                return l();
            case 14:
                return m();
            case 15:
                return n();
            case 16:
                return o();
            case 17:
                return p();
            case 18:
                return q();
            case 19:
                return r();
            case 20:
                return s();
            case 21:
                return t();
            case 22:
                return u();
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return v();
            case 24:
                return w();
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return x();
            case 26:
                return y();
            case 27:
                return z();
            case 28:
                return A();
            default:
                wgp wgpVar = (wgp) obj;
                int i = b2 / 100;
                if (i == 0) {
                    switch (b2) {
                        case 0:
                            return new mfp(this);
                        case 1:
                            return new vz20();
                        case 2:
                            wk00 wk00Var = new wk00();
                            wk00Var.a = avw0.d;
                            return wk00Var;
                        case 3:
                            qk00 qk00Var = wgpVar.a;
                            vk00 vk00Var = wgpVar.c;
                            qk00 qk00Var2 = wgpVar.a;
                            RetrofitMaker retrofitMaker = (RetrofitMaker) qk00Var.e.get();
                            c8o.l(retrofitMaker);
                            se91 se91VarY = j991.y(retrofitMaker);
                            uny unyVarY = tk00.y(wgpVar.n(), f7z.i(vk00Var), wgpVar.c());
                            yqg yqgVar = (yqg) wgpVar.f.get();
                            yjq yjqVarI = wgpVar.i();
                            gj5 gj5Var = (gj5) qk00Var2.W.get();
                            c8o.l(gj5Var);
                            ne neVar = new ne(se91VarY, unyVarY, yqgVar, yjqVarI, f7z.h(gj5Var));
                            RetrofitMaker retrofitMaker2 = (RetrofitMaker) qk00Var2.e.get();
                            c8o.l(retrofitMaker2);
                            se91 se91VarY2 = j991.y(retrofitMaker2);
                            uny unyVarY2 = tk00.y(wgpVar.n(), f7z.i(vk00Var), wgpVar.c());
                            yqg yqgVar2 = (yqg) wgpVar.f.get();
                            w25 w25VarC = wgpVar.c();
                            yjq yjqVarI2 = wgpVar.i();
                            gj5 gj5Var2 = (gj5) qk00Var2.W.get();
                            c8o.l(gj5Var2);
                            kd91 kd91Var = new kd91(se91VarY2, unyVarY2, yqgVar2, w25VarC, yjqVarI2, f7z.h(gj5Var2));
                            RetrofitMaker retrofitMaker3 = (RetrofitMaker) qk00Var2.e.get();
                            c8o.l(retrofitMaker3);
                            d2e d2eVarQ = f7z.q(retrofitMaker3);
                            yqg yqgVar3 = (yqg) wgpVar.f.get();
                            dp60 dp60Var = (dp60) qk00Var2.S.get();
                            c8o.l(dp60Var);
                            zsc zscVarJ = wgpVar.j();
                            tp60 tp60VarJ = qk00Var2.j();
                            c8o.l(tp60VarJ);
                            emm emmVar = (emm) qk00Var2.q1.get();
                            c8o.l(emmVar);
                            gj5 gj5Var3 = (gj5) qk00Var2.W.get();
                            c8o.l(gj5Var3);
                            u9c0 u9c0VarH = f7z.h(gj5Var3);
                            w25 w25VarC2 = wgpVar.c();
                            Activity activityA = qk00Var2.a();
                            c8o.l(activityA);
                            wmy wmyVar = new wmy(new k2e(d2eVarQ, yqgVar3, dp60Var, zscVarJ, tp60VarJ, emmVar, u9c0VarH, w25VarC2, activityA, new zov0((byte) 20), wgpVar.i()), wgpVar.g(), wgpVar.i(), (yqg) wgpVar.f.get(), wgpVar.n(), wgpVar.c());
                            dp60 dp60Var2 = (dp60) qk00Var2.S.get();
                            c8o.l(dp60Var2);
                            ks21 ks21Var = new ks21(dp60Var2, (byte) 23);
                            k3q0 k3q0Var = (k3q0) qk00Var2.L0.get();
                            c8o.l(k3q0Var);
                            t2j0 t2j0VarF = qk00Var2.f();
                            c8o.l(t2j0VarF);
                            dxz0 dxz0VarC = qk00Var2.c();
                            c8o.l(dxz0VarC);
                            gx5 gx5Var = (gx5) qk00Var2.a0.get();
                            c8o.l(gx5Var);
                            r961 r961Var = new r961(t2j0VarF, dxz0VarC, gx5Var, (byte) 24);
                            zle1 zle1Var = (zle1) qk00Var2.q0.get();
                            c8o.l(zle1Var);
                            tp60 tp60VarJ2 = qk00Var2.j();
                            c8o.l(tp60VarJ2);
                            wo60 wo60Var = (wo60) qk00Var2.G1.get();
                            c8o.l(wo60Var);
                            ua91 ua91Var = new ua91(neVar, kd91Var, wmyVar, r961Var, (byte) 1);
                            pb00 pb00Var = new pb00(zle1Var, tp60VarJ2, wo60Var);
                            return new cd91(new w2z(ua91Var, pb00Var, (byte) 17), new fad0(ua91Var, new ua91(zle1Var, tp60VarJ2, wo60Var, pb00Var, (byte) 2), (byte) 7), ks21Var, k3q0Var);
                        case 4:
                            yqg yqgVar4 = (yqg) wgpVar.a.u.get();
                            c8o.l(yqgVar4);
                            return yqgVar4;
                        case 5:
                            s8q s8qVar = (s8q) wgpVar.a.J1.get();
                            c8o.l(s8qVar);
                            return s8qVar.a("android-home-evo-page", false);
                        case 6:
                            qk00 qk00Var3 = wgpVar.a;
                            vk00 vk00Var2 = wgpVar.c;
                            q7r0 q7r0Var = wgpVar.b;
                            Activity activityA2 = qk00Var3.a();
                            c8o.l(activityA2);
                            pj00 pj00Var = new pj00(activityA2, (byte) 0);
                            Activity activityA3 = qk00Var3.a();
                            c8o.l(activityA3);
                            np60 np60VarT = f7z.t(wgpVar.r(), wgpVar.j, wgpVar.k, wgpVar.l, wgpVar.m, wgpVar.n, wgpVar.o, vk00Var2, wgpVar.c());
                            cd91 cd91Var = (cd91) wgpVar.h.get();
                            kba kbaVarF = wgpVar.f();
                            hs00 hs00VarG = qk00Var3.g();
                            c8o.l(hs00VarG);
                            dw01 dw01Var = (dw01) qk00Var3.D.get();
                            c8o.l(dw01Var);
                            lmo lmoVarI = f7z.i(vk00Var2);
                            gqr gqrVarQ = wgpVar.q();
                            xvo xvoVar = (xvo) qk00Var3.M0.get();
                            c8o.l(xvoVar);
                            yxd1 yxd1Var = (yxd1) wgpVar.p.get();
                            Activity activityA4 = qk00Var3.a();
                            c8o.l(activityA4);
                            tp60 tp60VarJ3 = qk00Var3.j();
                            c8o.l(tp60VarJ3);
                            x0r x0rVar = (x0r) qk00Var3.D1.get();
                            c8o.l(x0rVar);
                            y2e0 y2e0Var = new y2e0(np60VarT, cd91Var, kbaVarF, hs00VarG, dw01Var, lmoVarI, gqrVarQ, xvoVar, yxd1Var, activityA4, tp60VarJ3, new rk00(x0rVar));
                            ynb0 ynb0VarA = xqu.a(wgpVar.q);
                            ynb0 ynb0VarA2 = xqu.a(wgpVar.r);
                            ynb0 ynb0VarA3 = xqu.a(wgpVar.s);
                            w25 w25VarC3 = wgpVar.c();
                            tp60 tp60VarJ4 = qk00Var3.j();
                            c8o.l(tp60VarJ4);
                            ynb0 ynb0VarA4 = xqu.a(wgpVar.x);
                            k3q0 k3q0Var2 = (k3q0) qk00Var3.L0.get();
                            c8o.l(k3q0Var2);
                            tth1 tth1Var = new tth1(k3q0Var2);
                            ynb0 ynb0VarA5 = xqu.a(wgpVar.y);
                            dp60 dp60Var3 = (dp60) qk00Var3.s1.get();
                            c8o.l(dp60Var3);
                            ptf ptfVar = new ptf(dp60Var3, new v6a0(wgpVar.c(), wgpVar.f(), (byte) 28));
                            ynb0 ynb0VarA6 = xqu.a(wgpVar.z);
                            tzr0 tzr0Var = new tzr0(xqu.a(wgpVar.A), f7z.i(vk00Var2), wgpVar.c());
                            iac0 iac0VarQ = tk00.q(q7r0Var);
                            v6a0 v6a0Var = new v6a0(wgpVar.c(), wgpVar.f(), (byte) 28);
                            gqr gqrVarQ2 = wgpVar.q();
                            hs00 hs00VarG2 = qk00Var3.g();
                            c8o.l(hs00VarG2);
                            e eVar = new e(y2e0Var, ynb0VarA, ynb0VarA2, ynb0VarA3, w25VarC3, tp60VarJ4, ynb0VarA4, tth1Var, ynb0VarA5, ptfVar, ynb0VarA6, tzr0Var, iac0VarQ, v6a0Var, gqrVarQ2, hs00VarG2);
                            rm3 rm3Var = (rm3) qk00Var3.R.get();
                            c8o.l(rm3Var);
                            x5j1 x5j1Var = new x5j1(rm3Var, (byte) 13);
                            dxz0 dxz0VarC2 = qk00Var3.c();
                            c8o.l(dxz0VarC2);
                            zr00 zr00Var = (zr00) qk00Var3.g0.get();
                            c8o.l(zr00Var);
                            g7h g7hVar = (g7h) qk00Var3.G.get();
                            c8o.l(g7hVar);
                            yh2 yh2Var = (yh2) qk00Var3.P.get();
                            c8o.l(yh2Var);
                            pk00 pk00Var = (pk00) wgpVar.E.get();
                            w25 w25VarC4 = wgpVar.c();
                            boolean z = bro1.p(w25VarC4.d0(), w25VarC4.f0(), w25VarC4.g0()) == 2;
                            oj00 oj00Var = (rx20) wgpVar.C.get();
                            if (!z) {
                                oj00Var = new oj00();
                            }
                            oj00 oj00Var2 = oj00Var;
                            hs80 hs80Var = (hs80) wgpVar.F.get();
                            hs80 hs80Var2 = (hs80) wgpVar.G.get();
                            hs80 hs80Var3 = (hs80) wgpVar.H.get();
                            hs80 hs80Var4 = (hs80) wgpVar.I.get();
                            hs80 hs80Var5 = (hs80) wgpVar.J.get();
                            hs80 hs80Var6 = (hs80) wgpVar.K.get();
                            hs80 hs80Var7 = (hs80) wgpVar.M.get();
                            hs80 hs80Var8 = (hs80) wgpVar.N.get();
                            hs80 hs80Var9 = (hs80) wgpVar.E.get();
                            s4w0 s4w0Var = (s4w0) qk00Var3.b1.get();
                            c8o.l(s4w0Var);
                            fns fnsVar = igu.a;
                            c8o.m(fnsVar);
                            ml00 ml00Var = new ml00(x5j1Var, dxz0VarC2, zr00Var, g7hVar, yh2Var, pk00Var, t380.w(oj00Var2, hs80Var, hs80Var2, hs80Var3, hs80Var4, hs80Var5, new hs80[]{hs80Var6, hs80Var7, hs80Var8, hs80Var9, new flv0(new rkv0(s4w0Var, fnsVar)), (hs80) wgpVar.O.get(), (hs80) wgpVar.R.get()}), (ku71) wgpVar.T.get(), (dv00) wgpVar.g.get());
                            tp60 tp60VarJ5 = qk00Var3.j();
                            c8o.l(tp60VarJ5);
                            wo60 wo60Var2 = (wo60) qk00Var3.G1.get();
                            c8o.l(wo60Var2);
                            bn70 bn70VarN = tk00.n(vk00Var2);
                            iac0 iac0VarQ2 = tk00.q(q7r0Var);
                            kn60 kn60Var = (kn60) wgpVar.m1.get();
                            dv00 dv00Var = (dv00) wgpVar.g.get();
                            tk00.q(q7r0Var);
                            t380 t380VarP = wgpVar.p();
                            RxRouter rxRouter = (RxRouter) qk00Var3.m.get();
                            c8o.l(rxRouter);
                            be beVarY = j9g0.y(rxRouter);
                            i5w0 i5w0VarD = spq0.d(wgpVar.m0);
                            luk lukVarB = qk00Var3.b();
                            c8o.l(lukVarB);
                            huh0 huh0Var = new huh0(beVarY, i5w0VarD, new sb4(false, lukVarB));
                            w25 w25VarC5 = wgpVar.c();
                            yko ykoVar = (yko) qk00Var3.j2.get();
                            c8o.l(ykoVar);
                            t2j0 t2j0VarF2 = qk00Var3.f();
                            c8o.l(t2j0VarF2);
                            dxz0 dxz0VarC3 = qk00Var3.c();
                            c8o.l(dxz0VarC3);
                            lmo lmoVarI2 = f7z.i(vk00Var2);
                            String str = vk00Var2.b;
                            c8o.m(str);
                            qj00 qj00Var = new qj00(kn60Var, dv00Var, t380VarP, huh0Var, w25VarC5, q7r0Var, ykoVar, t2j0VarF2, dxz0VarC3, lmoVarI2, str, new khc((byte) 14));
                            ynb0 ynb0VarA7 = xqu.a(wgpVar.p);
                            v6a0 v6a0Var2 = new v6a0(wgpVar.c(), wgpVar.f(), (byte) 28);
                            v4r0 v4r0Var = (v4r0) qk00Var3.r1.get();
                            c8o.l(v4r0Var);
                            tj00Var = new tj00(pj00Var, activityA3, eVar, ml00Var, tp60VarJ5, wo60Var2, bn70VarN, iac0VarQ2, qj00Var, ynb0VarA7, v6a0Var2, v4r0Var, wgpVar.c());
                            return tj00Var;
                        case 7:
                            return new ep60(wgpVar.r(), (byte) 3);
                        case 8:
                            return new ep60(wgpVar.r(), (byte) 2);
                        case 9:
                            return new ep60(wgpVar.r(), (byte) 0);
                        case 10:
                            return new ep60(wgpVar.r(), (byte) 1);
                        case 11:
                            return new ep60(wgpVar.r(), (byte) 4);
                        case 12:
                            dp60 dp60Var4 = (dp60) wgpVar.a.S.get();
                            c8o.l(dp60Var4);
                            uyd1 uyd1Var = (uyd1) wgpVar.a.y1.get();
                            c8o.l(uyd1Var);
                            return new op60(dp60Var4, uyd1Var, (dv00) wgpVar.g.get());
                        case 13:
                            yxd1 yxd1Var2 = (yxd1) wgpVar.a.T0.get();
                            c8o.l(yxd1Var2);
                            return yxd1Var2;
                        case 14:
                            fn60 fn60Var = (fn60) wgpVar.a.a1.get();
                            c8o.l(fn60Var);
                            return new d4c(fn60Var);
                        case 15:
                            return new qxd1((yxd1) wgpVar.p.get());
                        case 16:
                            o241 o241Var = (o241) wgpVar.a.Y.get();
                            c8o.l(o241Var);
                            return new e0k1(o241Var, wgpVar.c());
                        case 17:
                            ynb0 ynb0VarA8 = xqu.a(wgpVar.u);
                            ynb0 ynb0VarA9 = xqu.a(wgpVar.w);
                            Resources resources = (Resources) wgpVar.a.H0.get();
                            c8o.l(resources);
                            return new nsp0(ynb0VarA8, ynb0VarA9, resources, f7z.i(wgpVar.c));
                        case 18:
                            RxRouter rxRouter2 = (RxRouter) wgpVar.a.m.get();
                            c8o.l(rxRouter2);
                            mwm1 mwm1VarC = npp0.C(rxRouter2);
                            xrc0 xrc0Var = (xrc0) wgpVar.t.get();
                            qk00 qk00Var4 = wgpVar.a;
                            Scheduler scheduler = (Scheduler) qk00Var4.b.get();
                            c8o.l(scheduler);
                            v5n v5nVar = (v5n) qk00Var4.I.get();
                            c8o.l(v5nVar);
                            String str2 = wgpVar.c.b;
                            c8o.m(str2);
                            agc0 agc0VarL = qk00Var4.l();
                            c8o.l(agc0VarL);
                            luk lukVarB2 = qk00Var4.b();
                            c8o.l(lukVarB2);
                            g1i g1iVar = new g1i(new p410(mwm1VarC, xrc0Var, scheduler, v5nVar, str2, agc0VarL, new g35(true, lukVarB2)));
                            return new ivp0(xqu.a((jly0) g1iVar.d), xqu.a((jly0) g1iVar.e), new zbg((byte) 4), xqu.a((ywp) g1iVar.f));
                        case 19:
                            xrc0 xrc0Var2 = (xrc0) wgpVar.a.H.get();
                            c8o.l(xrc0Var2);
                            return xrc0Var2;
                        case 20:
                            Activity activityA5 = wgpVar.a.a();
                            c8o.l(activityA5);
                            ynb0 ynb0VarA10 = xqu.a(wgpVar.v);
                            upp0 upp0Var = (upp0) wgpVar.a.K0.get();
                            c8o.l(upp0Var);
                            return new xo60(activityA5, ynb0VarA10, upp0Var);
                        case 21:
                            tut0 tut0Var = (tut0) wgpVar.a.I0.get();
                            c8o.l(tut0Var);
                            return tut0Var;
                        case 22:
                            return new gsp0();
                        case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                            mp60 mp60VarR = wgpVar.r();
                            vk00 vk00Var3 = wgpVar.c;
                            return new z3e0(f7z.t(mp60VarR, wgpVar.j, wgpVar.k, wgpVar.l, wgpVar.m, wgpVar.n, wgpVar.o, vk00Var3, wgpVar.c()), f7z.i(vk00Var3), wgpVar.q());
                        case 24:
                            yo2 yo2Var = (yo2) wgpVar.a.b2.get();
                            c8o.l(yo2Var);
                            return yo2Var;
                        case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                            Function0 function0 = (Function0) wgpVar.B.get();
                            q7r0 q7r0Var2 = wgpVar.b;
                            vz20 vz20Var = (vz20) wgpVar.d.get();
                            q8n q8nVarX = brt.x();
                            w25 w25VarC6 = wgpVar.c();
                            return new pk00(function0, new qa2(q7r0Var2, (byte) 17), vz20Var, q8nVarX, bro1.p(w25VarC6.d0(), w25VarC6.f0(), w25VarC6.g0()) != 3);
                        case 26:
                            return new qa2(wgpVar.b, (byte) 16);
                        case 27:
                            w25 w25VarC7 = wgpVar.c();
                            return new wv1(bro1.p(w25VarC7.d0(), w25VarC7.f0(), w25VarC7.g0()), wgpVar.b, (rx20) wgpVar.C.get(), (byte) 10);
                        case 28:
                            return new rx20((vz20) wgpVar.d.get(), brt.x());
                        case 29:
                            qk00 qk00Var5 = wgpVar.a;
                            kly0 kly0Var = qk00Var5.A;
                            kly0 kly0Var2 = qk00Var5.G0;
                            kly0 kly0Var3 = qk00Var5.F0;
                            oj3 oj3Var = (oj3) kly0Var.get();
                            c8o.l(oj3Var);
                            qut0 qut0Var = (qut0) kly0Var2.get();
                            c8o.l(qut0Var);
                            hku0 hku0Var = new hku0((xrc0) wgpVar.t.get());
                            g7h g7hVar2 = (g7h) qk00Var5.G.get();
                            c8o.l(g7hVar2);
                            dp5 dp5Var = new dp5(g7hVar2, (byte) 10);
                            RxRouter rxRouter3 = (RxRouter) wgpVar.a.m.get();
                            c8o.l(rxRouter3);
                            mwm1 mwm1VarC2 = npp0.C(rxRouter3);
                            w4h w4hVar = (w4h) kly0Var3.get();
                            c8o.l(w4hVar);
                            qpj1 qpj1Var = new qpj1(mwm1VarC2, w4hVar, (byte) 26);
                            w4h w4hVar2 = (w4h) kly0Var3.get();
                            c8o.l(w4hVar2);
                            il00 il00Var = new il00(w4hVar2, (byte) 25);
                            qut0 qut0Var2 = (qut0) kly0Var2.get();
                            c8o.l(qut0Var2);
                            y1t0 y1t0Var = new y1t0(qut0Var2, (byte) 1);
                            cig1 cig1Var = (cig1) qk00Var5.C.get();
                            c8o.l(cig1Var);
                            el3 el3Var = (el3) qk00Var5.B.get();
                            c8o.l(el3Var);
                            ffe1 ffe1Var = new ffe1(cig1Var, el3Var, (byte) 13);
                            w4h w4hVar3 = (w4h) kly0Var3.get();
                            c8o.l(w4hVar3);
                            cp70 cp70Var = new cp70(w4hVar3);
                            fns fnsVar2 = igu.a;
                            c8o.m(fnsVar2);
                            qlw qlwVar = new qlw(oj3Var, qut0Var, hku0Var, dp5Var, qpj1Var, il00Var, y1t0Var, ffe1Var, cp70Var, fnsVar2);
                            String str3 = wgpVar.c.b;
                            c8o.m(str3);
                            return new nlo(qlwVar, str3);
                        case 30:
                            qk00 qk00Var6 = wgpVar.a;
                            vpp0 vpp0Var = (vpp0) qk00Var6.T.get();
                            c8o.l(vpp0Var);
                            xde0 xde0Var = (xde0) qk00Var6.P1.get();
                            c8o.l(xde0Var);
                            xpp0 xpp0Var = new xpp0(vpp0Var, xde0Var);
                            ayl aylVar = (ayl) qk00Var6.U.get();
                            c8o.l(aylVar);
                            return new z1v(new j2v(xpp0Var, aylVar));
                        case 31:
                            qk00 qk00Var7 = wgpVar.a;
                            dxz0 dxz0VarC4 = qk00Var7.c();
                            c8o.l(dxz0VarC4);
                            b7n b7nVar = (b7n) qk00Var7.X.get();
                            c8o.l(b7nVar);
                            cfd cfdVar = new cfd(dxz0VarC4, b7nVar, (byte) 7);
                            bhh1 bhh1Var = igu.b;
                            c8o.m(bhh1Var);
                            return new rae(new pae(cfdVar, bhh1Var));
                        case 32:
                            hx7 hx7Var = (hx7) wgpVar.a.b0.get();
                            c8o.l(hx7Var);
                            ku1 ku1Var = new ku1(hx7Var);
                            hx7 hx7Var2 = (hx7) wgpVar.a.b0.get();
                            c8o.l(hx7Var2);
                            return new h2v0(ku1Var, new ku1(hx7Var2, (byte) 27));
                        case 33:
                            uu00 uu00VarH = wgpVar.a.h();
                            c8o.l(uu00VarH);
                            return new k9v0(new f9v0(uu00VarH));
                        case 34:
                            qk00 qk00Var8 = wgpVar.a;
                            byp0 byp0Var = (byp0) qk00Var8.N1.get();
                            c8o.l(byp0Var);
                            xrc0 xrc0Var3 = (xrc0) wgpVar.t.get();
                            fns fnsVar3 = igu.a;
                            b3s b3sVar = b3s.c;
                            ayl aylVar2 = (ayl) qk00Var8.U.get();
                            c8o.l(aylVar2);
                            return new h521(new u421(byp0Var, xrc0Var3, b3sVar, aylVar2));
                        case 35:
                            pp11 pp11Var = (pp11) wgpVar.a.B0.get();
                            c8o.l(pp11Var);
                            iac0 iac0VarQ3 = tk00.q(wgpVar.b);
                            b7r0 b7r0Var = (b7r0) wgpVar.a.l.get();
                            c8o.l(b7r0Var);
                            fns fnsVar4 = igu.a;
                            c8o.m(fnsVar4);
                            tj00Var = new mwn(pp11Var, iac0VarQ3, b7r0Var, fnsVar4, (xrc0) wgpVar.t.get(), xqu.a(wgpVar.L));
                            return tj00Var;
                        case 36:
                            return new myq0(wgpVar.b).get().toBuilder().referrerIdentifier("home").build();
                        case 37:
                            yix0 yix0Var = (yix0) wgpVar.a.r.get();
                            c8o.l(yix0Var);
                            bn70 bn70VarN2 = tk00.n(wgpVar.c);
                            fns fnsVar5 = igu.a;
                            c8o.m(fnsVar5);
                            return new kj00(new jj00(yix0Var, bn70VarN2, fnsVar5));
                        case 38:
                            qeq qeqVar = (qeq) wgpVar.a.m1.get();
                            c8o.l(qeqVar);
                            return new nvn(qeqVar);
                        case 39:
                            return new ll00((a731) wgpVar.Q.get(), tk00.n(wgpVar.c));
                        case 40:
                            return new xfp(this);
                        case 41:
                            return new hgp(this);
                        case 42:
                            return (ku71) xqu.a(wgpVar.S).get();
                        case 43:
                            dma1 dma1Var = (dma1) wgpVar.a.o1.get();
                            c8o.l(dma1Var);
                            nfa0 nfa0Var = (nfa0) wgpVar.a.t.get();
                            c8o.l(nfa0Var);
                            return new ku71(dma1Var, nfa0Var, new du71());
                        case 44:
                            return new kn60(wgpVar.F());
                        case 45:
                            mr20 mr20Var = (mr20) wgpVar.a.k.get();
                            c8o.l(mr20Var);
                            c3s c3sVar = (c3s) wgpVar.a.M.get();
                            c8o.l(c3sVar);
                            return new clm(mr20Var, c3sVar);
                        case 46:
                            lbp lbpVar = wgpVar.W;
                            vk00 vk00Var4 = wgpVar.c;
                            qk00 qk00Var9 = wgpVar.a;
                            ynb0 ynb0VarA11 = xqu.a(lbpVar);
                            lbp lbpVar2 = wgpVar.L;
                            ynb0 ynb0VarA12 = xqu.a(wgpVar.X);
                            h5q h5qVar = (h5q) qk00Var9.i1.get();
                            c8o.l(h5qVar);
                            b7r0 b7r0Var2 = (b7r0) qk00Var9.l.get();
                            c8o.l(b7r0Var2);
                            ynb0 ynb0VarA13 = xqu.a(wgpVar.t);
                            ynb0 ynb0VarA14 = xqu.a(wgpVar.Y);
                            ov20 ov20Var = (ov20) qk00Var9.l0.get();
                            c8o.l(ov20Var);
                            yqg yqgVar5 = (yqg) wgpVar.f.get();
                            iac0 iac0VarQ4 = tk00.q(wgpVar.b);
                            n3d0 n3d0Var = (n3d0) qk00Var9.p1.get();
                            c8o.l(n3d0Var);
                            String str4 = vk00Var4.b;
                            c8o.m(str4);
                            bn70 bn70VarN3 = tk00.n(vk00Var4);
                            g3q0 g3q0Var = (g3q0) qk00Var9.t1.get();
                            c8o.l(g3q0Var);
                            upp0 upp0Var2 = (upp0) qk00Var9.K0.get();
                            c8o.l(upp0Var2);
                            uu00 uu00VarH2 = qk00Var9.h();
                            c8o.l(uu00VarH2);
                            Optional optionalOf = Optional.of(new ra81(uu00VarH2));
                            uvy uvyVar = (uvy) qk00Var9.h2.get();
                            c8o.l(uvyVar);
                            return bhb.o(ynb0VarA11, lbpVar2, ynb0VarA12, h5qVar, b7r0Var2, ynb0VarA13, ynb0VarA14, ov20Var, yqgVar5, iac0VarQ4, n3d0Var, str4, bn70VarN3, g3q0Var, upp0Var2, optionalOf, Optional.of(uvyVar));
                        case 47:
                            return ((cyp) wgpVar.V.get()).d();
                        case 48:
                            t8u0 t8u0Var = (t8u0) wgpVar.a.z.get();
                            c8o.l(t8u0Var);
                            return t8u0Var.a(tk00.q(wgpVar.b).getLifecycle());
                        case 49:
                            return ((cyp) wgpVar.V.get()).a();
                        case 50:
                            zut0 zut0Var = (zut0) wgpVar.a.J0.get();
                            c8o.l(zut0Var);
                            return zut0Var.a(new lb3(xqu.a(wgpVar.V), (byte) 5), xqu.a(wgpVar.L));
                        case 51:
                            qk00 qk00Var10 = wgpVar.a;
                            xfx xfxVarE = qk00Var10.e();
                            c8o.l(xfxVarE);
                            lo60 lo60VarU = wgpVar.u();
                            agc0 agc0VarL2 = qk00Var10.l();
                            c8o.l(agc0VarL2);
                            gw70 gw70VarK = qk00Var10.k();
                            c8o.l(gw70VarK);
                            lujVar = new luj(xfxVarE, gw70VarK, agc0VarL2, lo60VarU, false);
                            return lujVar;
                        case 52:
                            qk00 qk00Var11 = wgpVar.a;
                            xfx xfxVarE2 = qk00Var11.e();
                            c8o.l(xfxVarE2);
                            lo60 lo60VarU2 = wgpVar.u();
                            agc0 agc0VarL3 = qk00Var11.l();
                            c8o.l(agc0VarL3);
                            gw70 gw70VarK2 = qk00Var11.k();
                            c8o.l(gw70VarK2);
                            lujVar = new d460(xfxVarE2, gw70VarK2, agc0VarL3, lo60VarU2, false);
                            return lujVar;
                        case 53:
                            nwt nwtVar = (nwt) wgpVar.a.n1.get();
                            c8o.l(nwtVar);
                            return nwtVar;
                        case 54:
                            return new rgp(this);
                        case 55:
                            return new sgp();
                        case 56:
                            qk00 qk00Var12 = wgpVar.a;
                            d2q d2qVar = (d2q) qk00Var12.y0.get();
                            c8o.l(d2qVar);
                            ynb0 ynb0VarA15 = xqu.a(wgpVar.f0);
                            azo azoVar = (azo) wgpVar.g0.get();
                            ynb0 ynb0VarA16 = xqu.a(wgpVar.i0);
                            ynb0 ynb0VarA17 = xqu.a(wgpVar.j0);
                            rtw0 rtw0Var = new rtw0((byte) 12);
                            w25 w25VarC8 = wgpVar.c();
                            yqg yqgVar6 = (yqg) wgpVar.f.get();
                            gw70 gw70VarK3 = qk00Var12.k();
                            kly0 kly0Var4 = qk00Var12.f0;
                            c8o.l(gw70VarK3);
                            f6g1 f6g1Var = (f6g1) kly0Var4.get();
                            c8o.l(f6g1Var);
                            zs11 zs11Var = new zs11(yqgVar6, gw70VarK3, f6g1Var);
                            jma jmaVar = new jma((byte) 28);
                            luk lukVarB3 = qk00Var12.b();
                            c8o.l(lukVarB3);
                            zvf1 zvf1Var = new zvf1(jmaVar, new oi4(false, lukVarB3));
                            yqg yqgVar7 = (yqg) wgpVar.f.get();
                            gw70 gw70VarK4 = qk00Var12.k();
                            c8o.l(gw70VarK4);
                            ggv ggvVar = (ggv) qk00Var12.N.get();
                            c8o.l(ggvVar);
                            f6g1 f6g1Var2 = (f6g1) kly0Var4.get();
                            c8o.l(f6g1Var2);
                            tj00Var = new nt11(d2qVar, ynb0VarA15, azoVar, ynb0VarA16, ynb0VarA17, rtw0Var, w25VarC8, zs11Var, zvf1Var, new zsc(yqgVar7, gw70VarK4, ggvVar, f6g1Var2, (byte) 19), ((Boolean) qk00Var12.e0.get()).booleanValue());
                            return tj00Var;
                        case 57:
                            ycm ycmVar = (ycm) wgpVar.a.x0.get();
                            c8o.l(ycmVar);
                            return ycmVar;
                        case 58:
                            return new azo(this, (byte) 2);
                        case 59:
                            return new tgp(this);
                        case 60:
                            y390 y390Var = (y390) wgpVar.a.Q.get();
                            c8o.l(y390Var);
                            return y390Var.a(tk00.q(wgpVar.b), r6h1.c);
                        case 61:
                            uvf1 uvf1Var = (uvf1) wgpVar.a.e1.get();
                            c8o.l(uvf1Var);
                            return uvf1Var;
                        case 62:
                            ynb0 ynb0VarA18 = xqu.a(wgpVar.f0);
                            azo azoVar2 = (azo) wgpVar.g0.get();
                            ynb0 ynb0VarA19 = xqu.a(wgpVar.i0);
                            ynb0 ynb0VarA20 = xqu.a(wgpVar.j0);
                            rtw0 rtw0Var2 = new rtw0((byte) 12);
                            w25 w25VarC9 = wgpVar.c();
                            gw70 gw70VarK5 = wgpVar.a.k();
                            c8o.l(gw70VarK5);
                            tj00Var = new pbc0(ynb0VarA18, azoVar2, ynb0VarA19, ynb0VarA20, rtw0Var2, w25VarC9, gw70VarK5);
                            return tj00Var;
                        case 63:
                            return new ugp(this);
                        case 64:
                            return new vgp(this);
                        case 65:
                            qk00 qk00Var13 = wgpVar.a;
                            woa woaVar = (woa) qk00Var13.x.get();
                            c8o.l(woaVar);
                            kma kmaVar = (kma) qk00Var13.v0.get();
                            c8o.l(kmaVar);
                            fpa fpaVar = (fpa) qk00Var13.y.get();
                            c8o.l(fpaVar);
                            pe peVar = (pe) qk00Var13.h0.get();
                            c8o.l(peVar);
                            boolean zBooleanValue = ((Boolean) wgpVar.m0.get()).booleanValue();
                            zle1 zle1Var2 = (zle1) qk00Var13.q0.get();
                            c8o.l(zle1Var2);
                            tj00Var = new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var2);
                            return tj00Var;
                        case 66:
                            Boolean bool = (Boolean) wgpVar.a.d0.get();
                            bool.getClass();
                            return bool;
                        case 67:
                            return new dfp(this);
                        case 68:
                            return new efp(this);
                        case 69:
                            return new ffp(this);
                        case 70:
                            return new gfp(this);
                        case 71:
                            return new hfp(this, (byte) 0);
                        case 72:
                            return new ifp((byte) 0);
                        case 73:
                            ipk1 ipk1Var = (ipk1) wgpVar.a.c2.get();
                            c8o.l(ipk1Var);
                            return ipk1Var;
                        case 74:
                            return new jfp(this);
                        case 75:
                            return new kfp(this);
                        case 76:
                            ugn0 ugn0Var = (ugn0) wgpVar.a.L.get();
                            c8o.l(ugn0Var);
                            return ugn0Var;
                        case 77:
                            ggl gglVar = (ggl) wgpVar.a.p0.get();
                            c8o.l(gglVar);
                            return gglVar;
                        case 78:
                            return new oyo(this, (byte) 5);
                        case 79:
                            return new hfw0(u1n0.z(wgpVar.b));
                        case 80:
                            tj00Var = new nfw0(brt.x(), wgpVar.f, wgpVar.x0, wgpVar.c0, wgpVar.U, wgpVar.y0, wgpVar.X, wgpVar.A0, wgpVar.z0);
                            return tj00Var;
                        case 81:
                            return new lfp(this);
                        case 82:
                            return new nfp(this);
                        case 83:
                            return new ofp(this);
                        case 84:
                            return new pfp(this);
                        case 85:
                            return new qfp(this);
                        case 86:
                            return new rfp(this);
                        case 87:
                            return new sfp(this);
                        case 88:
                            lbp lbpVar3 = wgpVar.b0;
                            qk00 qk00Var14 = wgpVar.a;
                            xfx xfxVarE3 = qk00Var14.e();
                            c8o.l(xfxVarE3);
                            o860 o860Var = new o860(lbpVar3, tk00.o(xfxVarE3), (zu70) wgpVar.L0.get(), wgpVar.u(), (byte) 6);
                            q7r0 q7r0Var3 = wgpVar.b;
                            dma1 dma1Var2 = (dma1) qk00Var14.o1.get();
                            c8o.l(dma1Var2);
                            return new m0y0(o860Var, q7r0Var3, new yqu0(dma1Var2));
                        case 89:
                            return new tfp(this);
                        case 90:
                            return new ufp(this);
                        case 91:
                            return new vfp(this);
                        case 92:
                            return new wfp(this);
                        case 93:
                            qk00 qk00Var15 = wgpVar.a;
                            Flowable flowable = (Flowable) qk00Var15.j.get();
                            c8o.l(flowable);
                            gw70 gw70VarK6 = qk00Var15.k();
                            c8o.l(gw70VarK6);
                            lo60 lo60VarU3 = wgpVar.u();
                            vgm vgmVarD = qk00Var15.d();
                            c8o.l(vgmVarD);
                            return new i081(flowable, gw70VarK6, lo60VarU3, vgmVarD);
                        case 94:
                            return new yfp(this);
                        case 95:
                            return new zfp(this);
                        case 96:
                            return new rzo(this, (byte) 3);
                        case 97:
                            return new agp(this);
                        case 98:
                            qk00 qk00Var16 = wgpVar.a;
                            gw70 gw70VarK7 = qk00Var16.k();
                            c8o.l(gw70VarK7);
                            lo60 lo60VarU4 = wgpVar.u();
                            kly0 kly0Var5 = qk00Var16.F0;
                            kly0 kly0Var6 = qk00Var16.W1;
                            w4h w4hVar4 = (w4h) kly0Var5.get();
                            c8o.l(w4hVar4);
                            dg8 dg8Var = new dg8(w4hVar4, (byte) 24);
                            RetrofitMaker retrofitMaker4 = (RetrofitMaker) qk00Var16.e.get();
                            c8o.l(retrofitMaker4);
                            ybk ybkVarO = wyj.o(retrofitMaker4);
                            xrk xrkVar = (xrk) kly0Var6.get();
                            c8o.l(xrkVar);
                            rm5 rm5Var = new rm5(ybkVarO, xrkVar);
                            kt91 kt91Var = (kt91) qk00Var16.n0.get();
                            c8o.l(kt91Var);
                            yqg yqgVar8 = (yqg) wgpVar.f.get();
                            i4q i4qVar = (i4q) qk00Var16.p.get();
                            c8o.l(i4qVar);
                            Activity activityA6 = qk00Var16.a();
                            c8o.l(activityA6);
                            f971 f971Var = (f971) qk00Var16.S1.get();
                            c8o.l(f971Var);
                            jl21 jl21Var = (jl21) qk00Var16.T1.get();
                            c8o.l(jl21Var);
                            l6d l6dVar = (l6d) qk00Var16.U1.get();
                            c8o.l(l6dVar);
                            j6d j6dVar = (j6d) qk00Var16.V1.get();
                            c8o.l(j6dVar);
                            c8o.l(qk00Var16.a());
                            c8o.l((gj5) qk00Var16.W.get());
                            xh71 xh71Var = (xh71) qk00Var16.O.get();
                            c8o.l(xh71Var);
                            y1t0 y1t0Var2 = new y1t0(xh71Var, (byte) 12);
                            q3c q3cVar = new q3c(new ubc((byte) 2, false));
                            xrk xrkVar2 = (xrk) kly0Var6.get();
                            c8o.l(xrkVar2);
                            dma1 dma1Var3 = (dma1) qk00Var16.o1.get();
                            c8o.l(dma1Var3);
                            tj00Var = new mmr(gw70VarK7, lo60VarU4, dg8Var, rm5Var, kt91Var, yqgVar8, i4qVar, activityA6, f971Var, jl21Var, l6dVar, j6dVar, y1t0Var2, q3cVar, xrkVar2, dma1Var3);
                            return tj00Var;
                        case 99:
                            return new bgp(this);
                        default:
                            jah.e(b2);
                            break;
                    }
                } else if (i == 1) {
                    switch (b2) {
                        case 100:
                            return new cgp(this);
                        case 101:
                            return new dgp(this);
                        case 102:
                            return new egp(this);
                        case 103:
                            return new fgp(this);
                        case 104:
                            return new ggp(this);
                        case 105:
                            return new igp(this);
                        case 106:
                            return new u3p(this, (byte) 1);
                        case 107:
                            return new jgp(this);
                        case 108:
                            return new kgp(this);
                        case 109:
                            return new lgp(this);
                        case 110:
                            return new mgp(this);
                        case 111:
                            return new ngp(this);
                        case 112:
                            return new ogp(this);
                        case 113:
                            return new pgp(this);
                        case 114:
                            return new qgp(this);
                        case 115:
                            q0d0 q0d0Var = (q0d0) wgpVar.a.z0.get();
                            c8o.l(q0d0Var);
                            return q0d0Var;
                        case 116:
                            mtt0 mtt0Var = (mtt0) wgpVar.a.A0.get();
                            c8o.l(mtt0Var);
                            return mtt0Var;
                        default:
                            jah.e(b2);
                            break;
                    }
                } else {
                    jah.e(b2);
                }
                return null;
        }
    }
}
