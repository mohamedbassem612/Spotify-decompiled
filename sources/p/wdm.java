package p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.servicebasedrouter.AndroidServicebasedrouterProperties;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.initialization.app.EarlyInitializationProvider;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wdm implements or60, dl4 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    public wdm(mab0 mab0Var, sab0 sab0Var) {
        this.a = (byte) 6;
        this.b = mab0Var;
        byte b = 1;
        this.c = iy81.a(new blp(this, b, b));
        this.d = iy81.a(new blp(this, 2, b));
        this.e = iy81.a(new blp(this, 3, b));
        this.f = iy81.a(new blp(this, 4, b));
        this.g = iy81.a(new blp(this, 5, b));
        this.h = iy81.a(new blp(this, 6, b));
        this.i = iy81.a(new blp(this, 7, b));
        this.t = iy81.a(new blp(this, 8, b));
        this.X = iy81.a(new blp(this, 9, b));
        this.Y = iy81.a(new blp(this, 0, b));
        this.Z = xqu.b(new blp(this, 10, b));
    }

    public c4n0 A() {
        return new c4n0((q7r0) this.d);
    }

    public void B(float f) {
        this.f = new k5(f);
        this.g = new k5(f);
        this.h = new k5(f);
        this.i = new k5(f);
    }

    public void C(dva1 dva1Var) {
        this.Y = dva1Var;
    }

    public void D(int i, j8n j8nVar) {
        this.e = ggo1.y(i);
        this.i = j8nVar;
    }

    public void E(j8n j8nVar) {
        this.i = j8nVar;
    }

    public void F(int i, j8n j8nVar) {
        this.d = ggo1.y(i);
        this.h = j8nVar;
    }

    public void G(j8n j8nVar) {
        this.h = j8nVar;
    }

    public void H(dva1 dva1Var) {
        this.Z = dva1Var;
    }

    public void I(dva1 dva1Var) {
        this.X = dva1Var;
    }

    public void J(dva1 dva1Var) {
        this.t = dva1Var;
    }

    public void K(int i, j8n j8nVar) {
        this.b = ggo1.y(i);
        this.f = j8nVar;
    }

    public void L(j8n j8nVar) {
        this.f = j8nVar;
    }

    public void M(int i, j8n j8nVar) {
        this.c = ggo1.y(i);
        this.g = j8nVar;
    }

    public void N(j8n j8nVar) {
        this.g = j8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if (r9 == r11) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        if (r9 == r11) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ee, code lost:
    
        if (r9 == r11) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
    
        if (r9 == r11) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0140, code lost:
    
        if (r9 == r11) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object O(java.lang.String r13, p.o840 r14, p.tv80 r15, p.onm r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wdm.O(java.lang.String, p.o840, p.tv80, p.onm):java.lang.Object");
    }

    public esa1 P() {
        rua1 rua1Var = (rua1) this.d;
        yqg yqgVar = (yqg) rua1Var.j.get();
        c8o.l(yqgVar);
        CallbackRouter callbackRouter = (CallbackRouter) rua1Var.i.get();
        c8o.l(callbackRouter);
        return new esa1(yqgVar, new jn7(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 8))), new sua((byte) 7));
    }

    public FlowableMap Q() {
        cbg1 cbg1Var = (cbg1) this.b;
        Flowable flowableF = cbg1Var.f();
        c8o.l(flowableF);
        Scheduler schedulerO = cbg1Var.o();
        c8o.l(schedulerO);
        yqg yqgVarA = cbg1Var.a();
        c8o.l(yqgVarA);
        return new FlowableOnBackpressureLatest(flowableF).j(new xeu0(32L, schedulerO, yqgVarA)).x(dj10.Y0).J(fj10.Y0);
    }

    public gj5 a() {
        gj5 gj5Var = (gj5) ((i3v0) this.b).a.get();
        c8o.l(gj5Var);
        return gj5Var;
    }

    public vu4 b() {
        return new vu4(false, false, false, (luk) ((nwp) this.c).g.get());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x036e  */
    public l5r0 c(iyl iylVar, d0r d0rVar) {
        jo70 jo70Var;
        zoy0 zoy0Var;
        pp5 pp5Var;
        List list;
        l5r0 lvnVar;
        List list2;
        bhr bhrVar = (bhr) this.e;
        zf30 zf30Var = (zf30) this.b;
        lik1 lik1Var = (lik1) this.f;
        rbo0 rbo0Var = (rbo0) this.t;
        l8h1 l8h1Var = (l8h1) this.X;
        PlayOrigin playOrigin = (PlayOrigin) this.Y;
        String str = iylVar.a;
        z98 z98Var = (str == null || (jo70Var = iylVar.b) == null || (zoy0Var = iylVar.e) == null) ? null : new z98(str, jo70Var, zoy0Var, iylVar.d, iylVar.g, iylVar.f);
        if (z98Var == null) {
            lvnVar = null;
        } else {
            htk htkVar = (htk) new uh0(z98Var, lik1Var, zf30Var, bhrVar, d0rVar, (byte) 21).invoke((gtk) bhrVar.b.b);
            t7p t7pVar = new t7p(htkVar);
            Context context = htkVar.a;
            c8o.l(context);
            z98 z98Var2 = htkVar.v;
            ycm ycmVar = htkVar.r;
            c8o.l(ycmVar);
            String str2 = htkVar.A;
            c8o.l(str2);
            uu00 uu00Var = htkVar.e;
            c8o.l(uu00Var);
            oi oiVar = new oi(uu00Var, str2, htkVar.B, (byte) 8);
            rk11 rk11Var = htkVar.s;
            c8o.l(rk11Var);
            q8x q8xVar = htkVar.t;
            d0r d0rVar2 = htkVar.u;
            c8o.l(d0rVar2);
            ocq ocqVar = htkVar.b;
            c8o.l(ocqVar);
            x4e x4eVar = htkVar.f;
            c8o.l(x4eVar);
            qcq qcqVar = htkVar.g;
            c8o.l(qcqVar);
            pob pobVar = htkVar.h;
            s7p s7pVar = (s7p) ((jly0) t7pVar.a).get();
            inb inbVar = htkVar.l;
            c8o.l(inbVar);
            ucq ucqVar = htkVar.q;
            c8o.l(ucqVar);
            uw0 uw0Var = new uw0(context, str2, oiVar, rk11Var, q8xVar, d0rVar2, ocqVar, x4eVar, qcqVar, pobVar, s7pVar, inbVar, ucqVar);
            d7p d7pVar = (d7p) t7pVar.c;
            d7p d7pVar2 = (d7p) t7pVar.d;
            r7q r7qVar = ((ddq) htkVar.y.b).a;
            teq teqVar = r7qVar.d;
            xfx xfxVar = (xfx) teqVar.q1.get();
            fl1 fl1VarD = teqVar.d();
            daq daqVar = r7qVar.b;
            uu00 uu00Var2 = (uu00) daqVar.a5.get();
            kv00 kv00Var = (kv00) daqVar.Ec.get();
            yqg yqgVar = (yqg) daqVar.J1.get();
            lzn0 lzn0Var = (lzn0) teqVar.i.get();
            kt91 kt91Var = (kt91) daqVar.f8.get();
            Scheduler scheduler = (Scheduler) daqVar.z1.get();
            dg30 dg30Var = (dg30) teqVar.f.a;
            dto0 dto0Var = (dto0) daqVar.eg.get();
            luk lukVar = (luk) daqVar.L1.get();
            c8o.l(xfxVar);
            yfx yfxVar = new yfx(xfxVar.a, (byte) 2);
            a1q a1qVarC = fl1VarD.c(str2);
            c8o.l(yqgVar);
            c8o.l(uu00Var2);
            c8o.l(scheduler);
            kdy0 kdy0Var = new kdy0(str2, yqgVar, uu00Var2, scheduler, (byte) 20);
            c8o.l(kv00Var);
            c8o.l(lzn0Var);
            pzn0 pzn0Var = new pzn0(str2, lzn0Var);
            c8o.l(kt91Var);
            c8o.l(dg30Var);
            c8o.l(dto0Var);
            d78 d78Var = new d78(kt91Var, dg30Var, dto0Var, brt.x());
            c8o.l(lukVar);
            jjv0 jjv0Var = new jjv0(str2, yfxVar, a1qVarC, kdy0Var, kv00Var, pzn0Var, d78Var, new ef4(false, false, false, lukVar));
            d771 d771Var = htkVar.k;
            c8o.l(d771Var);
            iac0 iac0Var = htkVar.x;
            c8o.l(iac0Var);
            lik1 lik1Var2 = htkVar.w;
            c8o.l(lik1Var2);
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0 p6r0VarG1 = yon1.G1("PRERELEASE_AUDIOBOOK", "prerelease/audiobook", 1560, "prerelease");
            adq adqVar = htkVar.i;
            c8o.l(adqVar);
            oy1 oy1Var = htkVar.m;
            f971 f971Var = htkVar.n;
            c8o.l(f971Var);
            jl21 jl21Var = htkVar.o;
            c8o.l(jl21Var);
            oh41 oh41Var = htkVar.p;
            c8o.l(oh41Var);
            xfw0 xfw0Var = new xfw0(z98Var2, oy1Var, f971Var, jl21Var, oh41Var, htkVar.z);
            r7q r7qVar2 = adqVar.a;
            daq daqVar2 = r7qVar2.b;
            ggv ggvVar = (ggv) daqVar2.as.get();
            gw70 gw70Var = (gw70) daqVar2.d8.get();
            teq teqVar2 = r7qVar2.d;
            daq daqVar3 = teqVar2.d;
            egw0 egw0Var = new egw0((q8n) daqVar3.V2.get(), (q8n) daqVar3.r2.get());
            daq daqVar4 = teqVar2.d;
            rt01 rt01Var = new rt01(ggvVar, gw70Var, egw0Var, new xgw0(new xmu0((Flowable) daqVar4.D5.get(), (yqg) daqVar4.J1.get(), (byte) 15), new uny((uu00) daqVar4.a5.get()), new ktt0((r5h) daqVar4.h7.get()), (q8n) daqVar4.r2.get()), (y390) teqVar2.o3.get(), (yh2) teqVar2.f3.get(), (t8u0) daqVar2.d9.get(), (q8n) daqVar2.V2.get(), (q8n) daqVar2.r2.get(), (bdq) teqVar2.sh.get(), (cdq) teqVar2.th.get(), iac0Var, lik1Var2, p6r0VarG1, xfw0Var);
            p6r0 p6r0VarG2 = yon1.G1("PRERELEASE_AUDIOBOOK", "prerelease/audiobook", 1560, "prerelease");
            boolean z = htkVar.B;
            uu0 uu0Var = new uu0(context, z98Var2, ycmVar, uw0Var, d7pVar, d7pVar2, jjv0Var, d771Var, rt01Var, p6r0VarG2, z, htkVar.C);
            my50 my50Var = new my50(xj20.e, (zx50) null, (Function0) null, new i26(uu0Var, (byte) 22), new rr6(uu0Var, (byte) 21), w08.W0, (yx50) null, (vx50) null, new y98(uu0Var, (byte) 4), (vu30) null, false, context.getString(2131952617), new jx50(new gx50(2), true, 1), new dy50(false, false, false, false, false, false, (String) null, false, 2011), (v3v0) null, (nx50) null, 509638);
            xlw0 xlw0Var = z98Var2.e;
            if (xlw0Var != null) {
                String str3 = xlw0Var.a;
                if (z) {
                    str3 = null;
                }
                if (str3 != null) {
                    pp5Var = new pp5(uu0Var, str3, (byte) 23);
                } else {
                    pp5Var = null;
                }
            } else {
                pp5Var = null;
            }
            vp11 vp11Var = new vp11(my50Var, (vu30) null, (ep11) null, pp5Var, (vu30) null, new vhd(3, new rld1(uw0Var, (byte) 7)), (up11) null, p6r0VarG2, (p04) null, 1, false, false, false, 7510);
            kvn kvnVar = bhrVar.a;
            String str4 = z98Var.a;
            jo70 jo70Var2 = z98Var.b;
            String str5 = jo70Var2.a;
            List<ho70> list3 = jo70Var2.d;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            for (ho70 ho70Var : list3) {
                arrayList.add(new ap11(ho70Var.a, ho70Var.b, (String) null));
            }
            Long lValueOf = Long.valueOf(z98Var.c.c);
            hll hllVar = z98Var.f;
            lvnVar = new lvn(kvnVar.a(new cp11(str4, str5, arrayList, lValueOf, z6x.a, (hllVar == null || (list2 = hllVar.b) == null || !list2.contains(ell.b)) ? (hllVar == null || (list = hllVar.b) == null || !list.contains(ell.d)) ? 1 : 3 : 2, (String) null), zf30Var, zf30Var, vp11Var, new fvn(false, false, rbo0Var, false, false, playOrigin, false, (mr20) null, (km90) null, (mr20) null, (guh0) null, false, 16248), l8h1Var, d0rVar).c());
        }
        return lvnVar == null ? new y7r0(2131962428, 2131962427) : lvnVar;
    }

    public iw61 d() {
        iw61 iw61Var = new iw61();
        iw61Var.a = (zko1) this.b;
        iw61Var.b = (zko1) this.c;
        iw61Var.c = (zko1) this.d;
        iw61Var.d = (zko1) this.e;
        iw61Var.e = (j8n) this.f;
        iw61Var.f = (j8n) this.g;
        iw61Var.g = (j8n) this.h;
        iw61Var.h = (j8n) this.i;
        iw61Var.i = (fmv) this.t;
        iw61Var.j = (fmv) this.X;
        iw61Var.k = (fmv) this.Y;
        iw61Var.l = (fmv) this.Z;
        return iw61Var;
    }

    public m021 e() {
        s880 s880Var = new s880((esw) this.b, (iu30) this.X, (di4) this.c, (y751) this.g);
        j3r j3rVar = rzq.y;
        w1k w1kVar = new w1k((l2r[]) Arrays.copyOf(new l2r[]{(dv00) this.h, ((a9q) this.d).a("search"), (ztw0) this.e, ((yko) this.Y).a((String) null, new ro8(this, null, (byte) 23))}, 4));
        ks31 ks31Var = new ks31();
        kno1.o(ks31Var);
        rzq rzqVarF = l2p1.f(new us31(w1kVar, o7h.l1(ks31Var.a)));
        dnc0 dnc0Var = new dnc0(rzqVarF, (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
        dnc0Var.b(new gj50(new mn41(this, (byte) 6), false), new mn41(s880Var, (byte) 7));
        jt41 jt41Var = new jt41(rzqVarF, this, (byte) 1);
        List listL1 = o7h.l1(dnc0Var.h);
        dt90 dt90Var = new dt90(jt41Var, dnc0Var, listL1, (byte) 6);
        return new m021(new cnc0(dt90Var, two1.D(listL1), two1.w(listL1)), dt90Var, (byte) 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public Object f(String str, onm onmVar) {
        a940 a940Var;
        if (onmVar instanceof a940) {
            a940Var = (a940) onmVar;
            int i = a940Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a940Var.c = i - Integer.MIN_VALUE;
            } else {
                a940Var = new a940(this, onmVar);
            }
        } else {
            a940Var = new a940(this, onmVar);
        }
        Object objC = a940Var.a;
        int i2 = a940Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            ywv0 ywv0VarA = ((h5q) this.g).a((muz) null);
            a940Var.c = 1;
            objC = ywv0VarA.c(str, a940Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        ndj1 ndj1Var = (ndj1) objC;
        if (u890.j(ndj1Var, ndj1.c)) {
            return new w840(true);
        }
        boolean zJ = u890.j(ndj1Var, ndj1.b);
        v840 v840Var = v840.a;
        if (!zJ) {
            if (u890.j(ndj1Var, ndj1.a)) {
                return v840Var;
            }
            eg.o();
            return null;
        }
        kt91 kt91Var = (kt91) this.f;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959379});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131959379, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return v840Var;
    }

    public hjc g() {
        xfx xfxVarC = ((vfo) this.b).c();
        c8o.l(xfxVarC);
        return new hjc(xfxVarC.b, (byte) 12);
    }

    public lr60 h() {
        sxo sxoVar = (sxo) ((jly0) this.Y).get();
        hnl hnlVar = (hnl) ((jly0) this.Z).get();
        nwp nwpVar = (nwp) this.c;
        return new lr60(sxoVar, hnlVar, nwpVar.e(), new dn4((luk) nwpVar.g.get()));
    }

    public vxc1 i() {
        yxc1 yxc1Var = (yxc1) this.b;
        hvj hvjVar = (hvj) yxc1Var.a.get();
        c8o.l(hvjVar);
        zxc1 zxc1Var = (zxc1) this.c;
        vi11 vi11Var = new vi11((lsq) ((jly0) this.e).get(), (msq) ((jly0) this.h).get(), (osq) ((jly0) this.i).get(), (psq) ((jly0) this.Y).get(), (ssq) ((jly0) this.Z).get(), (byte) 16);
        pf60 pf60Var = (pf60) yxc1Var.f.get();
        c8o.l(pf60Var);
        xb0 xb0Var = (xb0) ((jly0) this.f).get();
        fg60 fg60Var = (fg60) yxc1Var.h.get();
        c8o.l(fg60Var);
        of60 of60Var = (of60) yxc1Var.d.get();
        c8o.l(of60Var);
        return new vxc1(hvjVar, zxc1Var, vi11Var, new ua91(pf60Var, xb0Var, fg60Var, of60Var, (byte) 23));
    }

    public pbq j(String str, o5b0 o5b0Var, List list) {
        m27 m27Var = (m27) this.e;
        wmy wmyVar = (wmy) this.h;
        koc0 koc0Var = (koc0) this.i;
        r6h1 r6h1Var = (r6h1) this.t;
        List<ibt> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (ibt ibtVar : list2) {
            arrayList.add(new t1v0(ibtVar.a, (p260) ibtVar.b));
        }
        return new pbq(str, arrayList, koc0Var, m27Var.a, o5b0Var, wmyVar, r6h1Var, m27Var.b);
    }

    public lo9 k() {
        luk lukVar = (luk) ((rzm1) this.b).t.get();
        c8o.l(lukVar);
        return new lo9(lukVar);
    }

    public void l() {
        ((CompositeDisposable) this.Z).g();
    }

    public x7z m() {
        iac0 iac0VarV = v();
        da daVarU = u();
        vfo vfoVar = (vfo) this.b;
        Flowable flowableE = vfoVar.e();
        c8o.l(flowableE);
        ef90 ef90Var = new ef90(flowableE, (byte) 1);
        Flowable flowableE2 = vfoVar.e();
        c8o.l(flowableE2);
        FlowableMap flowableMapJ = flowableE2.j(mo9.Z).x(yi20.Z0).J(zi20.X0);
        Flowable flowableE3 = vfoVar.e();
        c8o.l(flowableE3);
        Scheduler schedulerD = vfoVar.d();
        c8o.l(schedulerD);
        yqg yqgVarB = vfoVar.b();
        c8o.l(yqgVarB);
        FlowableMap flowableMapJ2 = flowableE3.j(new xeu0(32L, schedulerD, yqgVarB)).x(ta20.a1).J(ua20.Z0);
        Flowable flowableE4 = vfoVar.e();
        c8o.l(flowableE4);
        Flowable flowableX = flowableE4.j(weu0.a).x(yz10.Y0).J(zz10.Z0).X(new myq0(flowableMapJ2, flowableMapJ, (byte) 26));
        flowableX.getClass();
        dn81 dn81Var = new dn81(new ObservableFromPublisher(flowableX), (byte) 22);
        zr00 zr00Var = (zr00) vfoVar.H.get();
        c8o.l(zr00Var);
        Scheduler schedulerD2 = vfoVar.d();
        c8o.l(schedulerD2);
        return new x7z(iac0VarV, daVarU, ef90Var, dn81Var, zr00Var, schedulerD2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0104 A[EXC_TOP_SPLITTER, PHI: r2
      0x0104: PHI (r2v20 ??) = (r2v30 ??), (r2v21 ??) binds: [B:60:0x0100, B:35:0x0074] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed A[Catch: all -> 0x011c, CancellationException -> 0x015e, Exception -> 0x0161, PHI: r2
      0x00ed: PHI (r2v18 ??) = (r2v31 ??), (r2v19 ??) binds: [B:57:0x00e9, B:43:0x0087] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x011c, blocks: (B:86:0x0161, B:83:0x015d, B:62:0x0104, B:59:0x00ed, B:56:0x00ce), top: B:100:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[Catch: all -> 0x0052, Exception -> 0x0056, CancellationException -> 0x0059, PHI: r2 r4
      0x0136: PHI (r2v27 java.lang.Object) = (r2v25 java.lang.Object), (r2v1 java.lang.Object) binds: [B:71:0x0133, B:26:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r4v7 ??) = (r4v11 ??), (r4v12 ??) binds: [B:71:0x0133, B:26:0x005f] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x0052, blocks: (B:18:0x004d, B:26:0x005f, B:73:0x0136, B:75:0x013a, B:80:0x0150, B:29:0x0066, B:70:0x0121), top: B:100:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013a A[Catch: all -> 0x0052, Exception -> 0x0056, CancellationException -> 0x0059, TryCatch #6 {all -> 0x0052, blocks: (B:18:0x004d, B:26:0x005f, B:73:0x0136, B:75:0x013a, B:80:0x0150, B:29:0x0066, B:70:0x0121), top: B:100:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:80:0x0150 A[Catch: all -> 0x0052, Exception -> 0x0056, CancellationException -> 0x0059, TRY_LEAVE, TryCatch #6 {all -> 0x0052, blocks: (B:18:0x004d, B:26:0x005f, B:73:0x0136, B:75:0x013a, B:80:0x0150, B:29:0x0066, B:70:0x0121), top: B:100:0x0038 }] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        if (p.fc11.i(r0, r6) == r12) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p.wdm] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.ll30] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(java.lang.String r17, p.j840 r18, p.onm r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wdm.n(java.lang.String, p.j840, p.onm):java.lang.Object");
    }

    public RemoteNativeRxRouter o() {
        SharedCosmosRouterApi sharedCosmosRouterApiU = ((nx9) this.c).u();
        c8o.l(sharedCosmosRouterApiU);
        RemoteNativeRouter remoteNativeRouter = sharedCosmosRouterApiU.getRemoteNativeRouter();
        c8o.m(remoteNativeRouter);
        luk lukVar = ((ra61) this.b).b;
        c8o.l(lukVar);
        return new RemoteNativeRxRouter(remoteNativeRouter, new AndroidServicebasedrouterProperties(lukVar).getUseComputationScheduler());
    }

    public ytw0 p() {
        return new ytw0((byte) 21);
    }

    public l670 q() {
        vfo vfoVar = (vfo) this.b;
        Activity activityA = vfoVar.a();
        c8o.l(activityA);
        c4n0 c4n0VarA = A();
        i8h1 i8h1VarF = vfoVar.f();
        c8o.l(i8h1VarF);
        lzn0 lzn0Var = (lzn0) vfoVar.f71p.get();
        c8o.l(lzn0Var);
        in8 in8Var = new in8(lzn0Var);
        kly0 kly0Var = vfoVar.m;
        r630 r630Var = (r630) kly0Var.get();
        c8o.l(r630Var);
        r630 r630Var2 = (r630) kly0Var.get();
        c8o.l(r630Var2);
        da70 da70Var = new da70(r630Var2);
        fe70 fe70Var = (fe70) ((jly0) this.e).get();
        kly0 kly0Var2 = vfoVar.n;
        gw70 gw70Var = (gw70) kly0Var2.get();
        c8o.l(gw70Var);
        q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), s()), new e570((byte) 0, s()), new z970((fe70) ((jly0) this.e).get()), new ea70((fe70) ((jly0) this.e).get(), (byte) 0), new ea70((fe70) ((jly0) this.e).get(), (byte) 2), new ea70((fe70) ((jly0) this.e).get(), (byte) 1), new fc70());
        s770 s770Var = new s770();
        yqg yqgVarB = vfoVar.b();
        c8o.l(yqgVarB);
        p670 p670Var = new p670(yqgVarB, (byte) 0);
        fe70 fe70Var2 = (fe70) ((jly0) this.e).get();
        kly0 kly0Var3 = vfoVar.h;
        j3a j3aVar = (j3a) kly0Var3.get();
        c8o.l(j3aVar);
        l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
        yqg yqgVarB2 = vfoVar.b();
        c8o.l(yqgVarB2);
        p670 p670Var2 = new p670(yqgVarB2, (byte) 1);
        fe70 fe70Var3 = (fe70) ((jly0) this.e).get();
        j3a j3aVar2 = (j3a) kly0Var3.get();
        c8o.l(j3aVar2);
        x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) this.e).get())), new q770(new e570((byte) 1, s()), new h770((byte) 0), new h770((byte) 1), new k770(s()), new i870((fe70) ((jly0) this.e).get())));
        c8o.l((u3f1) vfoVar.s.get());
        d4b1 d4b1Var = new d4b1((byte) 4);
        String str = (String) vfoVar.o.get();
        c8o.l(str);
        mxa1 mxa1Var = new mxa1(i8h1VarF, in8Var, r630Var, da70Var, x970Var, d4b1Var, str, (byte) 2);
        xh10 xh10Var = new xh10();
        vgm vgmVar = (vgm) vfoVar.k.get();
        c8o.l(vgmVar);
        i8h1 i8h1VarF2 = vfoVar.f();
        c8o.l(i8h1VarF2);
        lzn0 lzn0Var2 = (lzn0) vfoVar.f71p.get();
        c8o.l(lzn0Var2);
        h380 h380VarB = j380.b(33);
        pe peVar = (pe) vfoVar.R.get();
        c8o.l(peVar);
        xfx xfxVarC = vfoVar.c();
        c8o.l(xfxVarC);
        h380VarB.e("culturalmoments:photoCardMedium", new fbx(peVar, new hjc(xfxVarC.b, (byte) 11), r(), (byte) 0));
        Scheduler schedulerD = vfoVar.d();
        c8o.l(schedulerD);
        xfx xfxVarC2 = vfoVar.c();
        c8o.l(xfxVarC2);
        hjc hjcVar = new hjc(xfxVarC2.b, (byte) 1);
        Flowable flowableE = vfoVar.e();
        c8o.l(flowableE);
        h380VarB.e("culturalmoments:albumCardActionsMedium", new nbx(schedulerD, hjcVar, new ef90(flowableE, (byte) 0), u(), v(), r(), (byte) 0));
        Scheduler schedulerD2 = vfoVar.d();
        c8o.l(schedulerD2);
        xfx xfxVarC3 = vfoVar.c();
        c8o.l(xfxVarC3);
        hjc hjcVar2 = new hjc(xfxVarC3.b, (byte) 2);
        Flowable flowableE2 = vfoVar.e();
        c8o.l(flowableE2);
        h380VarB.e("culturalmoments:albumReleaseCard", new nbx(schedulerD2, hjcVar2, new ef90(flowableE2, (byte) 0), new p5(z(), (byte) 26), v(), r(), (byte) 1));
        Scheduler schedulerD3 = vfoVar.d();
        c8o.l(schedulerD3);
        xfx xfxVarC4 = vfoVar.c();
        c8o.l(xfxVarC4);
        h380VarB.e("culturalmoments:artistFollowCard", new az6(schedulerD3, new hjc(xfxVarC4.b, (byte) 3), u(), v(), r()));
        xfx xfxVarC5 = vfoVar.c();
        c8o.l(xfxVarC5);
        xfx xfxVarC6 = vfoVar.c();
        c8o.l(xfxVarC6);
        egx egxVar = new egx(xfxVarC6.b, (byte) 4);
        y9p y9pVar = (y9p) ((jly0) this.f).get();
        d7p d7pVar = (d7p) this.g;
        luk lukVar = (luk) vfoVar.i.get();
        c8o.l(lukVar);
        agx agxVar = new agx(xfxVarC5.c, egxVar, y9pVar, d7pVar, new i3b(new w75(lukVar), (byte) 8), (byte) 2);
        kly0 kly0Var4 = vfoVar.f71p;
        lzn0 lzn0Var3 = (lzn0) kly0Var4.get();
        c8o.l(lzn0Var3);
        hl00 hl00Var = new hl00(A(), (byte) 13);
        i8h1 i8h1VarF3 = vfoVar.f();
        c8o.l(i8h1VarF3);
        g23 g23Var = new g23(lzn0Var3, hl00Var, i8h1VarF3, (byte) 22);
        iac0 iac0VarV = v();
        vx40 vx40VarR = r();
        xfx xfxVarC7 = vfoVar.c();
        c8o.l(xfxVarC7);
        h380VarB.e("consumerMobile:videoCarouselArtist", new az6(agxVar, g23Var, iac0VarV, vx40VarR, new yfx(xfxVarC7.e, (byte) 1)));
        vx40 vx40VarR2 = r();
        xfx xfxVarC8 = vfoVar.c();
        c8o.l(xfxVarC8);
        h380VarB.e("culturalmoments:benefitRedemptionCard", new v8x(vx40VarR2, new hjc(xfxVarC8.b, (byte) 6), (byte) 1));
        i8h1 i8h1VarF4 = vfoVar.f();
        c8o.l(i8h1VarF4);
        h380VarB.e("culturalmoments:carousel", new rwd(new uzd(i8h1VarF4, A()), (byte) 0));
        xfx xfxVarC9 = vfoVar.c();
        c8o.l(xfxVarC9);
        h380VarB.e("culturalmoments:clipCardMedium", new v8x(new egx(xfxVarC9.b, (byte) 0), r(), (byte) 2));
        h380VarB.e("culturalmoments:achievementCollectibleHistoryCard", new ly(g(), r(), (byte) 0));
        h380VarB.e("culturalmoments:fanStampCollectibleHistoryCard", new ly(g(), r(), (byte) 1));
        h380VarB.e("culturalmoments:freeAchievementCollectibleHistoryCard", new ly(g(), r(), (byte) 2));
        h380VarB.e("culturalmoments:listeningPartyCollectibleHistoryCard", new ly(g(), r(), (byte) 3));
        xfx xfxVarC10 = vfoVar.c();
        c8o.l(xfxVarC10);
        pp ppVar = new pp(xfxVarC10.c, (byte) 23);
        yqg yqgVarB3 = vfoVar.b();
        c8o.l(yqgVarB3);
        h380VarB.e("culturalmoments:countdown", new fbx(ppVar, yqgVarB3, r(), (byte) 1));
        xfx xfxVarC11 = vfoVar.c();
        c8o.l(xfxVarC11);
        h380VarB.e("culturalmoments:placeholderCard", new v8x(new hjc(xfxVarC11.b, (byte) 23), r(), (byte) 0));
        kly0 kly0Var5 = vfoVar.x;
        ahr ahrVar = (ahr) kly0Var5.get();
        c8o.l(ahrVar);
        x7z x7zVarM = m();
        xfx xfxVarC12 = vfoVar.c();
        c8o.l(xfxVarC12);
        h380VarB.e("culturalmoments:episodeCardActionsMedium", new nhx(ahrVar, x7zVarM, new hjc(xfxVarC12.b, (byte) 15), r(), (byte) 0));
        xfx xfxVarC13 = vfoVar.c();
        c8o.l(xfxVarC13);
        h380VarB.e("culturalmoments:clip", new v8x(new hjc(xfxVarC13.b, (byte) 8), r(), (byte) 3));
        yqg yqgVarB4 = vfoVar.b();
        c8o.l(yqgVarB4);
        vx40 vx40VarR3 = r();
        xfx xfxVarC14 = vfoVar.c();
        c8o.l(xfxVarC14);
        h380VarB.e("culturalmoments:fanEventLargeCard", new uhx(yqgVarB4, vx40VarR3, new hjc(xfxVarC14.b, (byte) 18)));
        xfx xfxVarC15 = vfoVar.c();
        c8o.l(xfxVarC15);
        h380VarB.e("culturalmoments:giveawayCard", new v8x(new hjc(xfxVarC15.b, (byte) 7), r(), (byte) 4));
        xfx xfxVarC16 = vfoVar.c();
        c8o.l(xfxVarC16);
        pfx pfxVar = new pfx(xfxVarC16.d, (byte) 1);
        lzn0 lzn0Var4 = (lzn0) kly0Var4.get();
        c8o.l(lzn0Var4);
        rsn0 rsn0Var = (rsn0) vfoVar.v.get();
        c8o.l(rsn0Var);
        i8h1 i8h1VarF5 = vfoVar.f();
        c8o.l(i8h1VarF5);
        h380VarB.e("culturalmoments:header", new nhx(pfxVar, lzn0Var4, rsn0Var, new lc20(i8h1VarF5, r(), A(), (byte) 27), (byte) 1));
        xfx xfxVarC17 = vfoVar.c();
        c8o.l(xfxVarC17);
        h380VarB.e("culturalmoments:sectionHeaderWithAction", new v8x(new sfx(xfxVarC17.e, (byte) 0), r(), (byte) 5));
        xfx xfxVarC18 = vfoVar.c();
        c8o.l(xfxVarC18);
        h380VarB.e("culturalmoments:infoRow", new v8x(new zfx(xfxVarC18.c, (byte) 3), r(), (byte) 6));
        vx40 vx40VarR4 = r();
        xfx xfxVarC19 = vfoVar.c();
        c8o.l(xfxVarC19);
        h380VarB.e("culturalmoments:listeningPartyLargeCard", new v8x(vx40VarR4, new hjc(xfxVarC19.b, (byte) 20), (byte) 7));
        vx40 vx40VarR5 = r();
        xfx xfxVarC20 = vfoVar.c();
        c8o.l(xfxVarC20);
        h380VarB.e("culturalmoments:listeningPartySmallCard", new v8x(vx40VarR5, new hjc(xfxVarC20.b, (byte) 21), (byte) 8));
        xfx xfxVarC21 = vfoVar.c();
        c8o.l(xfxVarC21);
        h380VarB.e("culturalmoments:mediumEpisodeCard", new v8x(new hjc(xfxVarC21.b, (byte) 17), r(), (byte) 9));
        xfx xfxVarC22 = vfoVar.c();
        c8o.l(xfxVarC22);
        h380VarB.e("culturalmoments:mediumPlaylistCard", new v8x(new yfx(xfxVarC22.b, (byte) 0), r(), (byte) 10));
        Scheduler schedulerD4 = vfoVar.d();
        c8o.l(schedulerD4);
        xfx xfxVarC23 = vfoVar.c();
        c8o.l(xfxVarC23);
        hjc hjcVar3 = new hjc(xfxVarC23.b, (byte) 13);
        Flowable flowableE3 = vfoVar.e();
        c8o.l(flowableE3);
        ef90 ef90Var = new ef90(flowableE3, (byte) 0);
        xrc0 xrc0Var = (xrc0) vfoVar.C.get();
        c8o.l(xrc0Var);
        h380VarB.e("culturalmoments:playlistCardActionsMedium", new nbx(schedulerD4, hjcVar3, ef90Var, new vf90(xrc0Var), v(), r(), (byte) 2));
        xfx xfxVarC24 = vfoVar.c();
        c8o.l(xfxVarC24);
        h380VarB.e("culturalmoments:playlistCard", new v8x(new hjc(xfxVarC24.b, (byte) 14), r(), (byte) 11));
        h380VarB.e("culturalmoments:rowCardSection", new rwd(r(), (byte) 1));
        h380VarB.e("culturalmoments:tab", new xed1((wnd1) ((jly0) this.h).get(), (byte) 0));
        wnd1 wnd1Var = (wnd1) ((jly0) this.h).get();
        hl00 hl00Var2 = new hl00(A(), (byte) 13);
        i8h1 i8h1VarF6 = vfoVar.f();
        c8o.l(i8h1VarF6);
        esa1 esa1Var = new esa1(wnd1Var, new vnd1(hl00Var2, i8h1VarF6, (byte) 0), (byte) 21);
        pic picVar = (pic) ((jly0) this.i).get();
        wnd1 wnd1Var2 = (wnd1) ((jly0) this.h).get();
        gw70 gw70Var2 = (gw70) kly0Var2.get();
        c8o.l(gw70Var2);
        h380VarB.e("culturalmoments:tabContainer", new ifd1(esa1Var, picVar, wnd1Var2, gw70Var2));
        xfx xfxVarC25 = vfoVar.c();
        c8o.l(xfxVarC25);
        zfx zfxVar = new zfx(xfxVarC25.c, (byte) 27);
        Flowable flowableE4 = vfoVar.e();
        c8o.l(flowableE4);
        ag90 ag90Var = new ag90(flowableE4);
        Scheduler schedulerD5 = vfoVar.d();
        c8o.l(schedulerD5);
        iac0 iac0VarV2 = v();
        vx40 vx40VarR6 = r();
        kly0 kly0Var6 = vfoVar.H;
        zr00 zr00Var = (zr00) kly0Var6.get();
        c8o.l(zr00Var);
        h380VarB.e("culturalmoments:trackRowChart", new nbx(zfxVar, ag90Var, schedulerD5, iac0VarV2, vx40VarR6, zr00Var));
        ahr ahrVar2 = (ahr) kly0Var5.get();
        c8o.l(ahrVar2);
        x7z x7zVarM2 = m();
        xfx xfxVarC26 = vfoVar.c();
        c8o.l(xfxVarC26);
        h380VarB.e("culturalmoments:trendingVideoCard", new nhx(ahrVar2, x7zVarM2, new egx(xfxVarC26.b, (byte) 2), r(), (byte) 2));
        x7z x7zVarM3 = m();
        xfx xfxVarC27 = vfoVar.c();
        c8o.l(xfxVarC27);
        h380VarB.e("culturalmoments:videoCardBig", new fbx(x7zVarM3, new egx(xfxVarC27.b, (byte) 3), r(), (byte) 2));
        c670 t570Var = new t570(h380VarB.b(true));
        h380 h380VarB2 = j380.b(8);
        Activity activityA2 = vfoVar.a();
        c8o.l(activityA2);
        swv0 swv0Var = (swv0) vfoVar.L.get();
        c8o.l(swv0Var);
        hl00 hl00Var3 = new hl00(A(), (byte) 13);
        i8h1 i8h1VarF7 = vfoVar.f();
        c8o.l(i8h1VarF7);
        h380VarB2.e("launchPremiumSignup", new ndm(activityA2, swv0Var, hl00Var3, i8h1VarF7, (byte) 1));
        Activity activityA3 = vfoVar.a();
        c8o.l(activityA3);
        i8h1 i8h1VarF8 = vfoVar.f();
        c8o.l(i8h1VarF8);
        ezh1 ezh1Var = (ezh1) vfoVar.F.get();
        c8o.l(ezh1Var);
        h380VarB2.e("showUpsell", new ndm(activityA3, i8h1VarF8, ezh1Var, A()));
        iac0 iac0VarV3 = v();
        lzn0 lzn0Var5 = (lzn0) kly0Var4.get();
        c8o.l(lzn0Var5);
        i8h1 i8h1VarF9 = vfoVar.f();
        c8o.l(i8h1VarF9);
        g341 g341Var = (g341) vfoVar.G.get();
        c8o.l(g341Var);
        c4n0 c4n0VarA2 = A();
        Scheduler schedulerD6 = vfoVar.d();
        c8o.l(schedulerD6);
        h380VarB2.e("openAuthorizedURL", new lkb0(iac0VarV3, lzn0Var5, i8h1VarF9, g341Var, c4n0VarA2, schedulerD6));
        iac0 iac0VarV4 = v();
        i8h1 i8h1VarF10 = vfoVar.f();
        c8o.l(i8h1VarF10);
        uzd uzdVar = new uzd(i8h1VarF10, A());
        iyc0 iyc0Var = (iyc0) vfoVar.O.get();
        c8o.l(iyc0Var);
        Flowable flowableE5 = vfoVar.e();
        c8o.l(flowableE5);
        fqr fqrVar = new fqr(((cyp) ((jly0) this.t).get()).d(), new tgt0(x()), ((cyp) ((jly0) this.t).get()).a());
        h6v0 h6v0Var = (h6v0) ((i6v0) ((jly0) this.X).get()).a.b.get();
        c8o.m(h6v0Var);
        ham hamVar = new ham(fqrVar, new p3v0(h6v0Var), (byte) 3);
        e7p0 e7p0Var = (e7p0) vfoVar.P.get();
        c8o.l(e7p0Var);
        zr00 zr00Var2 = (zr00) kly0Var6.get();
        c8o.l(zr00Var2);
        x3v0 x3v0Var = (x3v0) vfoVar.Q.get();
        c8o.l(x3v0Var);
        h380VarB2.e("togglePlayFromContext", new get0(iac0VarV4, uzdVar, iyc0Var, flowableE5, hamVar, e7p0Var, zr00Var2, new gqb0(x3v0Var, (byte) 14)));
        muz muzVarD = ((cyp) ((jly0) this.t).get()).d();
        y390 y390Var = (y390) vfoVar.I.get();
        c8o.l(y390Var);
        wr00 wr00VarA = y390Var.a(v(), r6h1.c);
        zr00 zr00Var3 = (zr00) kly0Var6.get();
        c8o.l(zr00Var3);
        oi oiVar = new oi(wr00VarA, zr00Var3, v());
        hl00 hl00Var4 = new hl00(A(), (byte) 13);
        i8h1 i8h1VarF11 = vfoVar.f();
        c8o.l(i8h1VarF11);
        iac0 iac0VarV5 = v();
        b7r0 b7r0Var = (b7r0) vfoVar.J.get();
        c8o.l(b7r0Var);
        h380VarB2.e("playFromContext", new pjt0(muzVarD, oiVar, hl00Var4, i8h1VarF11, iac0VarV5, b7r0Var, x()));
        xh71 xh71Var = (xh71) vfoVar.K.get();
        c8o.l(xh71Var);
        i8h1 i8h1VarF12 = vfoVar.f();
        c8o.l(i8h1VarF12);
        h380VarB2.e("shareCulturalMoment", new n371(xh71Var, new lc20(i8h1VarF12, r(), A(), (byte) 27)));
        iac0 iac0VarV6 = v();
        i8h1 i8h1VarF13 = vfoVar.f();
        c8o.l(i8h1VarF13);
        upa0 upa0Var = new upa0(i8h1VarF13, (byte) 4);
        ccc0 ccc0Var = (ccc0) vfoVar.N.get();
        c8o.l(ccc0Var);
        rpm1 rpm1Var = (rpm1) vfoVar.z.get();
        c8o.l(rpm1Var);
        kly0 kly0Var7 = vfoVar.E;
        kt91 kt91Var = (kt91) kly0Var7.get();
        c8o.l(kt91Var);
        Scheduler scheduler = (Scheduler) vfoVar.a.get();
        c8o.l(scheduler);
        uny unyVar = new uny(rpm1Var, kt91Var, scheduler, (byte) 9);
        op31 op31Var = (op31) vfoVar.D.get();
        c8o.l(op31Var);
        kt91 kt91Var2 = (kt91) kly0Var7.get();
        c8o.l(kt91Var2);
        ek1 ek1Var = new ek1(op31Var, kt91Var2, (byte) 0);
        q8n q8nVar = (q8n) vfoVar.M.get();
        c8o.l(q8nVar);
        h380VarB2.e("toggleLikeState", new fze1(iac0VarV6, upa0Var, ccc0Var, unyVar, ek1Var, q8nVar));
        iac0 iac0VarV7 = v();
        s4w0 s4w0VarZ = z();
        i8h1 i8h1VarF14 = vfoVar.f();
        c8o.l(i8h1VarF14);
        h380VarB2.e("togglePrereleaseSave", new gze1(iac0VarV7, s4w0VarZ, new yeu0(i8h1VarF14, A(), (byte) 17)));
        gg11 gg11VarB = h380VarB2.b(true);
        mxa1 mxa1VarB = mxa1Var.b(activityA, c4n0VarA);
        h380 h380VarA = j380.a();
        HashMap map = new HashMap(2);
        map.put("navigate", new xn1(lzn0Var2, new hl00(c4n0VarA, (byte) 13), i8h1VarF2));
        map.put("contextMenu", new ndm(vgmVar, c4n0VarA, new hl00(c4n0VarA, (byte) 13), i8h1VarF2, (byte) 0));
        h380VarA.f(map.entrySet());
        h380VarA.f(gg11VarB.g());
        k670 k670Var = (k670) mxa1VarB.r(h380VarA.b(true)).b;
        k670Var.c(new c670[]{t570Var});
        k670Var.d(t570Var);
        k670Var.f = bj20.f;
        k670Var.g = xh10Var;
        return k670Var.a();
    }

    public vx40 r() {
        i8h1 i8h1VarF = ((vfo) this.b).f();
        c8o.l(i8h1VarF);
        return new vx40(i8h1VarF, A(), (byte) 14);
    }

    public boolean s() {
        switch (this.a) {
            case 5:
                vfo vfoVar = (vfo) this.b;
                luk lukVar = (luk) vfoVar.i.get();
                c8o.l(lukVar);
                return td70.b(new qm4(false, lukVar), ((Boolean) vfoVar.e.get()).booleanValue());
            default:
                i3v0 i3v0Var = (i3v0) this.b;
                luk lukVar2 = (luk) i3v0Var.k.get();
                c8o.l(lukVar2);
                return td70.b(new qm4(false, lukVar2), ((Boolean) i3v0Var.r.get()).booleanValue());
        }
    }

    public boolean t() {
        Context context = (Context) ((yxc1) this.b).i.get();
        c8o.l(context);
        return new bf(context).a().compareTo(af.c) >= 0;
    }

    public da u() {
        vfo vfoVar = (vfo) this.b;
        g7h g7hVar = (g7h) vfoVar.y.get();
        c8o.l(g7hVar);
        Scheduler scheduler = (Scheduler) vfoVar.a.get();
        c8o.l(scheduler);
        return new da(g7hVar, scheduler, (byte) 26);
    }

    public iac0 v() {
        iac0 iac0Var = ((q7r0) this.d).d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public void w(Object obj) {
        switch (this.a) {
            case 11:
                EarlyInitializationProvider earlyInitializationProvider = (EarlyInitializationProvider) obj;
                daq daqVar = (daq) this.b;
                earlyInitializationProvider.d = (q8n) daqVar.r2.get();
                earlyInitializationProvider.f = (p2p) this.c;
                earlyInitializationProvider.e = (p2p) this.f;
                earlyInitializationProvider.a = (p2p) this.Z;
                earlyInitializationProvider.c = xqu.a(daqVar.dh);
                break;
            default:
                IPLDialogsHostActivity iPLDialogsHostActivity = (IPLDialogsHostActivity) obj;
                ((t3b1) iPLDialogsHostActivity).b1 = (jgu) ((s2q) this.f).get();
                ((t3b1) iPLDialogsHostActivity).c1 = new tuk(xqu.a((s2q) this.i));
                iPLDialogsHostActivity.f1 = (x1s) ((jly0) this.Y).get();
                daq daqVar2 = (daq) this.c;
                iPLDialogsHostActivity.g1 = (z1s) daqVar2.bo.get();
                iPLDialogsHostActivity.h1 = vp90.k((mkp) daqVar2.a.a.ie.get());
                break;
        }
    }

    public PlayOrigin x() {
        String str = (String) ((vfo) this.b).u.get();
        c8o.l(str);
        String str2 = ((wfo) this.c).a;
        c8o.m(str2);
        return PlayOrigin.builder("cultural-moments-hub").featureVersion(str).viewUri(str2).build();
    }

    public mcu0 y() {
        cbg1 cbg1Var = (cbg1) this.b;
        Flowable flowableF = cbg1Var.f();
        c8o.l(flowableF);
        myq0 myq0Var = (myq0) this.c;
        t8u0 t8u0VarV = cbg1Var.v();
        c8o.l(t8u0VarV);
        iac0 iac0Var = (iac0) this.d;
        muz muzVarD = t8u0VarV.a(iac0Var.getLifecycle()).d();
        t8u0 t8u0VarV2 = cbg1Var.v();
        c8o.l(t8u0VarV2);
        return new mcu0(flowableF, myq0Var, muzVarD, t8u0VarV2.a(iac0Var.getLifecycle()).a());
    }

    public s4w0 z() {
        vfo vfoVar = (vfo) this.b;
        RxRouter rxRouter = (RxRouter) vfoVar.f.get();
        c8o.l(rxRouter);
        w4h w4hVar = new w4h(new CosmosTransport(new sn0(rxRouter, (byte) 8)));
        ccc0 ccc0Var = (ccc0) vfoVar.N.get();
        c8o.l(ccc0Var);
        g7h g7hVar = (g7h) vfoVar.y.get();
        c8o.l(g7hVar);
        return new s4w0(w4hVar, ccc0Var, g7hVar);
    }

    public wdm(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.a = (byte) 24;
        String str13 = Build.MANUFACTURER;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = str9;
        this.X = str10;
        this.Y = str11;
        this.Z = str12;
    }

    public wdm(vqb0 vqb0Var, d3s d3sVar, xhp xhpVar, gfr gfrVar, gfr gfrVar2, gfr gfrVar3, jqb0 jqb0Var, jqb0 jqb0Var2, zgz0 zgz0Var, wen0 wen0Var, lqr lqrVar) {
        this.a = (byte) 25;
        this.b = vqb0Var;
        this.c = d3sVar;
        this.d = xhpVar;
        this.e = gfrVar;
        this.f = gfrVar2;
        this.g = gfrVar3;
        this.h = jqb0Var;
        this.i = jqb0Var2;
        this.t = zgz0Var;
        this.X = wen0Var;
        this.Y = lqrVar;
        this.Z = new idd1(new g521(this, (byte) 13));
    }

    public wdm(b9l1 b9l1Var, q9l1 q9l1Var, t75 t75Var, fal1 fal1Var, m0t m0tVar, uwm0 uwm0Var) {
        this.a = (byte) 23;
        this.b = b9l1Var;
        this.c = q9l1Var;
        this.d = t75Var;
        this.e = fal1Var;
        this.f = m0tVar;
        this.g = uwm0Var;
        this.Y = UUID.randomUUID().toString();
    }

    public wdm(rvy0 rvy0Var, rpv0 rpv0Var, m141 m141Var, op31 op31Var, l0x0 l0x0Var, r630 r630Var, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, q8n q8nVar2, rb00 rb00Var) {
        this.a = (byte) 26;
        this.b = rvy0Var;
        this.c = rpv0Var;
        this.d = m141Var;
        this.e = op31Var;
        this.f = l0x0Var;
        this.g = r630Var;
        this.h = scheduler;
        this.i = scheduler2;
        this.t = q8nVar;
        this.X = q8nVar2;
        this.Y = rb00Var;
        this.Z = new CompositeDisposable();
    }

    public wdm(zf30 zf30Var, ctr ctrVar, btr btrVar, bhr bhrVar, f4v0 f4v0Var, lik1 lik1Var, fdc fdcVar, String str, String str2, rbo0 rbo0Var, l8h1 l8h1Var, PlayOrigin playOrigin, rzq rzqVar) {
        this.a = (byte) 29;
        this.b = zf30Var;
        this.c = ctrVar;
        this.d = btrVar;
        this.e = bhrVar;
        this.f = lik1Var;
        this.g = fdcVar;
        this.h = str;
        this.i = str2;
        this.t = rbo0Var;
        this.X = l8h1Var;
        this.Y = playOrigin;
        this.Z = rzqVar;
    }

    public wdm(esw eswVar, di4 di4Var, dv00 dv00Var, a9q a9qVar, ztw0 ztw0Var, yko ykoVar, String str, y751 y751Var, hc51 hc51Var, q8n q8nVar, iu30 iu30Var, wen0 wen0Var) {
        this.a = (byte) 27;
        this.b = eswVar;
        this.c = di4Var;
        this.h = dv00Var;
        this.d = a9qVar;
        this.e = ztw0Var;
        this.Y = ykoVar;
        this.f = str;
        this.g = y751Var;
        this.i = hc51Var;
        this.t = q8nVar;
        this.X = iu30Var;
        this.Z = wen0Var;
    }

    public wdm() {
        this.a = (byte) 28;
        this.b = new gr31();
        this.c = new gr31();
        this.d = new gr31();
        this.e = new gr31();
        this.f = new k5(0.0f);
        this.g = new k5(0.0f);
        this.h = new k5(0.0f);
        this.i = new k5(0.0f);
        this.t = new fmv((byte) 0);
        this.X = new fmv((byte) 0);
        this.Y = new fmv((byte) 0);
        this.Z = new fmv((byte) 0);
    }

    public wdm(iw61 iw61Var) {
        this.a = (byte) 28;
        this.b = new gr31();
        this.c = new gr31();
        this.d = new gr31();
        this.e = new gr31();
        this.f = new k5(0.0f);
        this.g = new k5(0.0f);
        this.h = new k5(0.0f);
        this.i = new k5(0.0f);
        this.t = new fmv((byte) 0);
        this.X = new fmv((byte) 0);
        this.Y = new fmv((byte) 0);
        this.Z = new fmv((byte) 0);
        this.b = iw61Var.a;
        this.c = iw61Var.b;
        this.d = iw61Var.c;
        this.e = iw61Var.d;
        this.f = iw61Var.e;
        this.g = iw61Var.f;
        this.h = iw61Var.g;
        this.i = iw61Var.h;
        this.t = iw61Var.i;
        this.X = iw61Var.j;
        this.Y = iw61Var.k;
        this.Z = iw61Var.l;
    }

    public wdm(d21 d21Var) {
        this.a = (byte) 2;
        this.b = d21Var;
        this.c = xqu.b(new fwo(this, 1, (byte) 2));
        this.d = xqu.b(new fwo(this, 0, (byte) 2));
        this.e = new fwo(this, 3, (byte) 2);
        this.f = iy81.a(new fwo(this, 2, (byte) 2));
        this.g = xqu.b(new fwo(this, 4, (byte) 2));
        this.h = xqu.b(new fwo(this, 5, (byte) 2));
        this.i = xqu.b(new fwo(this, 6, (byte) 2));
        this.t = xqu.b(new fwo(this, 7, (byte) 2));
        this.X = xqu.b(new fwo(this, 8, (byte) 2));
        this.Y = xqu.b(new fwo(this, 9, (byte) 2));
        this.Z = xqu.b(new fwo(this, 10, (byte) 2));
    }

    public /* synthetic */ wdm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
        this.Y = obj11;
        this.Z = obj12;
    }

    public wdm(c56 c56Var, z86 z86Var, q7r0 q7r0Var) {
        this.a = (byte) 3;
        this.b = c56Var;
        this.c = z86Var;
        this.d = q7r0Var;
        this.e = xqu.b(new fwo(this, 0, (byte) 20));
        this.f = xqu.b(new fwo(this, 1, (byte) 20));
        this.g = xqu.b(new fwo(this, 2, (byte) 20));
        this.h = xqu.b(new fwo(this, 3, (byte) 20));
        this.i = xqu.b(new fwo(this, 6, (byte) 20));
        this.t = xqu.b(new fwo(this, 7, (byte) 20));
        this.X = xqu.b(new fwo(this, 8, (byte) 20));
        this.Y = xqu.b(new fwo(this, 5, (byte) 20));
        this.Z = iy81.a(new fwo(this, 4, (byte) 20));
    }

    public wdm(yxc1 yxc1Var, ivj ivjVar, zxc1 zxc1Var) {
        this.a = (byte) 17;
        this.b = yxc1Var;
        this.c = zxc1Var;
        this.d = ivjVar;
        this.e = iy81.a(new tsq(this, 0, (byte) 0));
        this.f = xqu.b(new tsq(this, 3, (byte) 0));
        this.g = iy81.a(new tsq(this, 2, (byte) 0));
        this.h = iy81.a(new tsq(this, 1, (byte) 0));
        this.i = iy81.a(new tsq(this, 4, (byte) 0));
        this.t = iy81.a(new tsq(this, 6, (byte) 0));
        this.X = iy81.a(new tsq(this, 7, (byte) 0));
        this.Y = iy81.a(new tsq(this, 5, (byte) 0));
        this.Z = iy81.a(new tsq(this, 8, (byte) 0));
    }

    public wdm(gib0 gib0Var, zuj zujVar, iib0 iib0Var, q7r0 q7r0Var) {
        this.a = (byte) 7;
        this.b = iib0Var;
        this.c = gib0Var;
        this.d = q7r0Var;
        byte b = 2;
        this.e = xqu.b(new blp(this, 1, b));
        this.f = xqu.b(new blp(this, 4, b));
        this.g = xqu.b(new blp(this, 3, b));
        this.h = iy81.a(new blp(this, b, b));
        this.i = new blp(this, 5, b);
        this.t = new blp(this, 0, b);
        this.X = xqu.b(new blp(this, 6, b));
        this.Y = xqu.b(new blp(this, 7, b));
        this.Z = xqu.b(new blp(this, 8, b));
    }

    public wdm(r4p r4pVar) {
        this.a = (byte) 15;
        this.b = r4pVar;
        byte b = 6;
        this.c = new ipq(this, 0, b);
        this.d = new ipq(this, 1, b);
        this.e = new ipq(this, 2, b);
        this.f = new ipq(this, 3, b);
        this.g = new ipq(this, 4, b);
        this.h = new ipq(this, 5, b);
        this.i = new ipq(this, b, b);
        this.t = new ipq(this, 7, b);
        this.X = new ipq(this, 8, b);
        this.Y = new ipq(this, 9, b);
        this.Z = new ipq(this, 10, b);
    }

    public wdm(rua1 rua1Var, ryj ryjVar, xua1 xua1Var, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.b = xua1Var;
        this.c = q7r0Var;
        this.d = rua1Var;
        byte b = 25;
        this.e = xqu.b(new ipq(this, 0, b));
        this.f = xqu.b(new ipq(this, 1, b));
        this.g = xqu.b(new ipq(this, 2, b));
        this.h = iy81.a(new ipq(this, 3, b));
        this.i = iy81.a(new ipq(this, 4, b));
        this.t = iy81.a(new ipq(this, 5, b));
        this.X = iy81.a(new ipq(this, 6, b));
        this.Y = iy81.a(new ipq(this, 7, b));
        this.Z = iy81.a(new ipq(this, 8, b));
    }

    public wdm(nx9 nx9Var, ra61 ra61Var, ec4 ec4Var) {
        this.a = (byte) 14;
        this.b = ra61Var;
        this.c = nx9Var;
        this.d = ec4Var;
        byte b = 0;
        this.e = new ipq(this, b, b);
        this.f = xqu.b(new ipq(this, 1, b));
        this.g = xqu.b(new ipq(this, 2, b));
        this.h = xqu.b(new ipq(this, 3, b));
        this.i = new ipq(this, 4, b);
        this.t = new ipq(this, 5, b);
        this.X = new ipq(this, 6, b);
        this.Y = new ipq(this, 7, b);
        this.Z = new ipq(this, 8, b);
    }

    public wdm(rc8 rc8Var, sc8 sc8Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.b = rc8Var;
        this.c = sc8Var;
        this.d = q7r0Var;
        byte b = 0;
        this.e = xqu.b(new b2p(this, b, b));
        this.f = xqu.b(new b2p(this, 2, b));
        this.g = iy81.a(new b2p(this, 3, b));
        this.h = iy81.a(new b2p(this, 4, b));
        this.i = iy81.a(new b2p(this, 5, b));
        this.t = new b2p(this, 7, b);
        this.X = iy81.a(new b2p(this, 6, b));
        this.Y = xqu.b(new b2p(this, 8, b));
        this.Z = new b2p(this, 1, b);
    }

    public wdm(rzm1 rzm1Var, zuj zujVar, szm1 szm1Var, q7r0 q7r0Var) {
        this.a = (byte) 18;
        this.b = rzm1Var;
        this.c = zujVar;
        this.d = q7r0Var;
        this.e = new tsq(this, 0, (byte) 29);
        this.f = iy81.a(new tsq(this, 1, (byte) 29));
        this.g = iy81.a(new tsq(this, 2, (byte) 29));
        this.h = iy81.a(new tsq(this, 3, (byte) 29));
        this.i = new tsq(this, 5, (byte) 29);
        this.t = iy81.a(new tsq(this, 4, (byte) 29));
        this.X = xqu.b(new tsq(this, 6, (byte) 29));
        this.Y = iy81.a(new tsq(this, 7, (byte) 29));
        this.Z = xqu.b(new tsq(this, 8, (byte) 29));
    }

    public wdm(cbg1 cbg1Var, myq0 myq0Var, iac0 iac0Var) {
        this.a = (byte) 13;
        this.b = cbg1Var;
        this.c = myq0Var;
        this.d = iac0Var;
        byte b = 28;
        this.e = xqu.b(new ykq(this, 1, b));
        this.f = xqu.b(new ykq(this, 3, b));
        this.g = iy81.a(new ykq(this, 2, b));
        this.h = xqu.b(new ykq(this, 4, b));
        this.i = iy81.a(new ykq(this, 5, b));
        this.t = xqu.b(new ykq(this, 6, b));
        this.X = xqu.b(new ykq(this, 7, b));
        this.Y = iy81.a(new ykq(this, 0, b));
        this.Z = iy81.a(new ykq(this, 8, b));
    }

    public wdm(i3v0 i3v0Var, j3v0 j3v0Var) {
        this.a = (byte) 10;
        this.b = i3v0Var;
        this.c = j3v0Var;
        this.d = xqu.b(new ywp(this, 3, (byte) 15));
        this.e = xqu.b(new ywp(this, 5, (byte) 15));
        this.f = xqu.b(new ywp(this, 4, (byte) 15));
        this.g = xqu.b(new ywp(this, 6, (byte) 15));
        this.h = xqu.b(new ywp(this, 2, (byte) 15));
        this.i = xqu.b(new ywp(this, 7, (byte) 15));
        this.t = xqu.b(new ywp(this, 1, (byte) 15));
        this.X = xqu.b(new ywp(this, 0, (byte) 15));
        this.Y = xqu.b(new ywp(this, 9, (byte) 15));
        this.Z = xqu.b(new ywp(this, 8, (byte) 15));
    }

    public wdm(vfo vfoVar, wfo wfoVar, q7r0 q7r0Var) {
        this.a = (byte) 5;
        this.b = vfoVar;
        this.c = wfoVar;
        this.d = q7r0Var;
        this.e = xqu.b(new d7p(this, 1, (byte) 20));
        this.f = iy81.a(new d7p(this, 2, (byte) 20));
        this.g = new d7p(this, 3, (byte) 20);
        this.h = xqu.b(new d7p(this, 4, (byte) 20));
        this.i = xqu.b(new d7p(this, 5, (byte) 20));
        this.t = xqu.b(new d7p(this, 6, (byte) 20));
        this.X = xqu.b(new d7p(this, 7, (byte) 20));
        this.Y = xqu.b(new d7p(this, 0, (byte) 20));
        this.Z = xqu.b(new d7p(this, 8, (byte) 20));
    }

    public wdm(r2p0 r2p0Var, v4p0 v4p0Var, q7r0 q7r0Var) {
        this.a = (byte) 9;
        this.b = v4p0Var;
        this.c = r2p0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new bsp(this, 1, (byte) 26));
        this.f = xqu.b(new bsp(this, 2, (byte) 26));
        this.g = iy81.a(new bsp(this, 3, (byte) 26));
        this.h = new bsp(this, 5, (byte) 26);
        this.i = new bsp(this, 4, (byte) 26);
        this.t = new bsp(this, 6, (byte) 26);
        this.X = new bsp(this, 7, (byte) 26);
        this.Y = new bsp(this, 0, (byte) 26);
        this.Z = xqu.b(new bsp(this, 8, (byte) 26));
    }

    public wdm(nwp nwpVar, q2p0 q2p0Var) {
        this.a = (byte) 8;
        this.c = nwpVar;
        this.b = q2p0Var;
        byte b = 4;
        this.d = iy81.a(new p2p(nwpVar, this, 1, b));
        this.e = iy81.a(new p2p(nwpVar, this, 3, b));
        this.f = iy81.a(new p2p(nwpVar, this, b, b));
        this.g = iy81.a(new p2p(nwpVar, this, 2, b));
        this.h = iy81.a(new p2p(nwpVar, this, 5, b));
        this.i = iy81.a(new p2p(nwpVar, this, 6, b));
        this.t = iy81.a(new p2p(nwpVar, this, 7, b));
        this.X = iy81.a(new p2p(nwpVar, this, 8, b));
        this.Y = iy81.a(new p2p(nwpVar, this, 0, b));
        this.Z = iy81.a(new p2p(nwpVar, this, 9, b));
    }

    public wdm(daq daqVar) {
        this.a = (byte) 11;
        this.b = daqVar;
        byte b = 29;
        this.c = new p2p(daqVar, this, 0, b);
        this.d = new p2p(daqVar, this, 2, b);
        this.e = new p2p(daqVar, this, 3, b);
        this.f = new p2p(daqVar, this, 1, b);
        this.g = new p2p(daqVar, this, 5, b);
        this.h = iy81.a(new p2p(daqVar, this, 7, b));
        this.i = new p2p(daqVar, this, 10, b);
        this.t = iy81.a(new p2p(daqVar, this, 9, b));
        this.X = iy81.a(new p2p(daqVar, this, 8, b));
        this.Y = new p2p(daqVar, this, 6, b);
        this.Z = new p2p(daqVar, this, 4, b);
    }

    public wdm(daq daqVar, IPLDialogsHostActivity iPLDialogsHostActivity) {
        this.a = (byte) 12;
        this.c = daqVar;
        this.b = iPLDialogsHostActivity;
        this.d = new s2q(daqVar, this, 1, (byte) 6);
        this.e = new s2q(daqVar, this, 2, (byte) 6);
        this.f = new s2q(daqVar, this, 0, (byte) 6);
        this.g = xqu.b(new s2q(daqVar, this, 5, (byte) 6));
        this.h = xqu.b(new s2q(daqVar, this, 4, (byte) 6));
        this.i = new s2q(daqVar, this, 3, (byte) 6);
        this.t = xqu.b(new s2q(daqVar, this, 7, (byte) 6));
        this.X = new s2q(daqVar, this, 8, (byte) 6);
        this.Y = xqu.b(new s2q(daqVar, this, 6, (byte) 6));
        this.Z = new s2q(daqVar, this, 9, (byte) 6);
    }
}
