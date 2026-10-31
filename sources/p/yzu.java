package p;

import android.app.Activity;
import android.content.Intent;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yzu implements Function, sek1 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public yzu(aip0 aip0Var) {
        this.a = aip0Var;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = new ArrayList();
    }

    public static cwl E(yzu yzuVar, lby lbyVar, cu7 cu7Var, d8r0 d8r0Var, String str, int i, boolean z, boolean z2) {
        return yzuVar.u(lbyVar, cu7Var, d8r0Var, str, tb51.g((tb51) yzuVar.a, lbyVar), i, z, z2, null, null);
    }

    public static final /* synthetic */ otu a(yzu yzuVar) {
        return (otu) yzuVar.d;
    }

    public static final /* synthetic */ lys0 b(yzu yzuVar) {
        return (rx5) yzuVar.c;
    }

    public static int v(cu7 cu7Var) {
        if (cu7Var.f) {
            return 1;
        }
        return cu7Var.b ? 2 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object A(onm onmVar) {
        wtv wtvVar;
        boolean z;
        Boolean bool;
        nvv nvvVar = (nvv) this.b;
        if (onmVar instanceof wtv) {
            wtvVar = (wtv) onmVar;
            int i = wtvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wtvVar.c = i - Integer.MIN_VALUE;
            } else {
                wtvVar = new wtv(this, onmVar);
            }
        } else {
            wtvVar = new wtv(this, onmVar);
        }
        Object objF = wtvVar.a;
        int i2 = wtvVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.a;
            String str = nvvVar.b;
            trc0 trc0Var = (trc0) this.d;
            wtvVar.c = 1;
            objF = rsc0Var.f(str, trc0Var, wtvVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        kby kbyVar = ((wsc0) ((py21) objF).d()).f;
        List list = kbyVar.z;
        x7i1 x7i1Var = kbyVar.w;
        wls0 wls0Var = kbyVar.v;
        Map map = kbyVar.q;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ll81 ll81Var = (ll81) it.next();
                if (u890.j(ll81Var.a, "toggle-reactions") && ll81Var.b == 1) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        String str2 = (String) map.get("playlist-reactions");
        if (u890.j(str2, "on")) {
            bool = Boolean.TRUE;
        } else {
            bool = u890.j(str2, "off") ? Boolean.FALSE : null;
        }
        Object c99Var = (!z || bool == null) ? b99.a : new c99(bool.booleanValue());
        String str3 = kbyVar.b;
        boolean z2 = x7i1Var.a && kbyVar.g;
        boolean z3 = (!wls0Var.a() && x7i1Var.h.a.contains(wls0.c)) || (wls0Var.a() && x7i1Var.h.a.contains(wls0.d));
        boolean z4 = kbyVar.k;
        String str4 = nvvVar.b;
        boolean zA = wls0Var.a();
        opn opnVar = (opn) this.c;
        String strO = cy30.o("\\p{N}+", kbyVar.b, "");
        boolean z5 = !(strO.equals(opnVar.a) || strO.equals(opnVar.b));
        String strA = kbyVar.d.a(1);
        exc0 exc0Var = x7i1Var.g;
        boolean z6 = exc0Var.a;
        boolean z7 = exc0Var.c;
        boolean z8 = exc0Var.b;
        boolean z9 = c99Var instanceof c99;
        c99 c99Var2 = z9 ? (c99) c99Var : null;
        boolean z10 = c99Var2 != null ? c99Var2.a : false;
        String str5 = kbyVar.c;
        return new vtv(str4, z6, str3, z7, strA, z3, z10, zA, z2, z9, z4, Html.fromHtml(str5 != null ? str5 : "", 0).toString(), z8, z5);
    }

    public Single B(String str) {
        boolean zK = z1a1.k((gdx0) this.a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return zK ? ((cfi1) this.c).e(str, (Boolean) null).timeout(3000L, timeUnit, Single.error(new TimeoutException())).doOnError(dxu.f).map(new gmt(str, this, (byte) 16)) : ((v5n) this.b).b(str).timeout(3000L, timeUnit, Observable.error(new TimeoutException())).map(m9h.d1).doOnError(dxu.e).map(new akp1(str, (byte) 4)).firstOrError();
    }

    public void C(String str, String str2, Map map) {
        ((CopyOnWriteArrayList) this.b).add(new z600(str, str2, ((aip0) this.a).a(), map));
    }

    public void D() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        EGLSurface eGLSurface = (EGLSurface) this.c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.b)) {
            return;
        }
        eg.m("eglMakeCurrent failed");
    }

    public sny0 F(long j, long j2, Set set, List list) {
        aip0 aip0Var = (aip0) this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            z600 z600Var = (z600) obj;
            long j3 = z600Var.c;
            if (j3 >= j && j3 <= j2 && set.contains(z600Var.a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListN0 = o7h.N0(arrayList, list);
        if (arrayListN0.isEmpty()) {
            return null;
        }
        aip0Var.getClass();
        sny0 sny0Var = new sny0(UUID.randomUUID(), new CopyOnWriteArrayList(arrayListN0));
        aip0Var.b(sny0Var);
        return sny0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G(String str, Exception exc, onm onmVar) {
        muw muwVar;
        if (onmVar instanceof muw) {
            muwVar = (muw) onmVar;
            int i = muwVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                muwVar.e = i - Integer.MIN_VALUE;
            } else {
                muwVar = new muw(this, onmVar);
            }
        } else {
            muwVar = new muw(this, onmVar);
        }
        Object objS = muwVar.c;
        int i2 = muwVar.e;
        if (i2 == 0) {
            hm5.M(objS);
            muwVar.a = str;
            muwVar.b = exc;
            muwVar.e = 1;
            objS = s(muwVar);
            Object obj = d9n.a;
            if (objS == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            exc = muwVar.b;
            str = muwVar.a;
            hm5.M(objS);
        }
        if (u890.j(objS, str)) {
            n57.g("Failed to check Wrapped eligibility", exc);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object H(String str, onm onmVar) {
        bcz bczVar;
        if (onmVar instanceof bcz) {
            bczVar = (bcz) onmVar;
            int i = bczVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bczVar.d = i - Integer.MIN_VALUE;
            } else {
                bczVar = new bcz(this, onmVar);
            }
        } else {
            bczVar = new bcz(this, onmVar);
        }
        Object objL = bczVar.b;
        int i2 = bczVar.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFilter = ((uu00) this.b).b(new oi("episode-share", false, new kov(str, (byte) 28))).filter(t9w.b1);
            bczVar.a = str;
            bczVar.d = 1;
            objL = fc11.l(observableFilter, 1, (Object) null, bczVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = bczVar.a;
            hm5.M(objL);
        }
        uv00 uv00Var = (uv00) objL;
        jo70 jo70Var = uv00Var.a(jo70.class, str).b;
        if (jo70Var == null) {
            eg.m("IdentityTrait was null");
            return null;
        }
        jo70 jo70Var2 = jo70Var;
        hll hllVar = uv00Var.a(hll.class, str).b;
        if (hllVar == null) {
            eg.m("ConsumptionExperienceTrait was null");
            return null;
        }
        hll hllVar2 = hllVar;
        d7u0 d7u0Var = uv00Var.a(d7u0.class, str).b;
        xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
        return new zbz(jo70Var2, hllVar2, d7u0Var, xkk1Var != null ? ucp1.p(xkk1Var) : wkk1.i);
    }

    public void I(yob1 yob1Var) {
        synchronized (this.c) {
            r7h.a0((ArrayList) this.d, new nty(yob1Var, (byte) 28));
            ((ArrayList) this.d).add(yob1Var);
        }
        C(yob1Var.a, yob1Var.b, yob1Var.c);
    }

    public void J(l3b0 l3b0Var, Enum r5) {
        xla0 xla0Var = (xla0) this.a;
        go20 go20Var = (go20) ((ArrayList) this.d).get(r5.ordinal());
        int iIntValue = ((Number) xla0Var.get(l3b0Var)).intValue();
        int i = (1 << go20Var.b) - 1;
        int i2 = go20Var.a;
        xla0Var.X(l3b0Var, Integer.valueOf((iIntValue & (~(i << i2))) + (go20Var.c << i2)));
    }

    public void K() {
        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        intent.putExtra("android.media.extra.AUDIO_SESSION", ((g48) this.d).b.get());
        ((Activity) this.a).startActivityForResult(intent, 0);
    }

    public void L(h5z h5zVar) {
        rku rkuVar = (rku) this.b;
        pnw pnwVar = (pnw) this.a;
        rkuVar.b(Observable.defer(new nnw(pnwVar, (byte) 0)).flatMap(new onw(pnwVar, (byte) 0)).subscribeOn((Scheduler) this.c).observeOn((Scheduler) this.d).subscribe(new fv5(h5zVar, (byte) 4)));
    }

    public Object apply(Object obj) {
        return yoi1.i(new m441(new zn0((q6z) this.a, (u6z) obj, (String) this.b, (lik1) this.c, (r6z) this.d, (lnm) null)), o6x.a);
    }

    public void e(RecyclerView recyclerView, boolean z) {
        ur41 ur41Var = (ur41) this.a;
        this.b = new opg(ur41Var, (byte) 16);
        ur41Var.b = new cc00(recyclerView, (byte) 4);
        this.d = new g521(ur41Var, (byte) 26);
        ur41Var.a = new xt7(recyclerView, z, (byte) 4);
        this.c = new l5v0(ur41Var, (byte) 11);
    }

    public void f() {
        ((rku) this.b).a();
    }

    public View getView() {
        return (LinearLayout) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[Catch: Exception -> 0x0049, HttpException -> 0x004c, CancellationException -> 0x00d5, TryCatch #5 {CancellationException -> 0x00d5, blocks: (B:19:0x0044, B:54:0x00bd, B:56:0x00c3, B:59:0x00c8, B:26:0x0051, B:50:0x00a6, B:46:0x0094), top: B:78:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8 A[Catch: Exception -> 0x0049, HttpException -> 0x004c, CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x00d5, blocks: (B:19:0x0044, B:54:0x00bd, B:56:0x00c3, B:59:0x00c8, B:26:0x0051, B:50:0x00a6, B:46:0x0094), top: B:78:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        if (G(r5, r14, r1) == r10) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f0, code lost:
    
        if (G(r5, r14, r1) == r10) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(p.onm r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yzu.k(p.onm):java.lang.Object");
    }

    public void l(long j) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((z600) obj).c < j) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public wp20 n() {
        return yuj.b((yuj) this.b, (o6e0) this.c, new j2i(26684102, new k9s(this, (byte) 15), true), new n7e0(new qtv(this), new htu(this, (byte) 6), zp8.Z0, new qrk(this, (byte) 18)));
    }

    public xt61 r() {
        tmx tmxVar = tmx.c;
        eah1 eah1Var = (eah1) this.d;
        smc0 smc0VarN = k4p1.n();
        ((a0z0) this.a).a(smc0VarN, (cp31) this.b);
        r4h1 r4h1Var = (r4h1) this.c;
        huz huzVar = new huz(Boolean.valueOf(((t7f0) ((ps7) r4h1Var.a).b).a()), (byte) 10);
        bw20 bw20Var = (ov20) r4h1Var.b;
        mr20 mr20VarA = bw20Var.a("offline", false);
        bw20 bw20Var2 = bw20Var;
        evz evzVarR = h5p1.r(huzVar, mr20VarA, bw20Var2.a("has-podcasts-available", false), bw20Var2.a("has-audiobooks-available", false), new mp6(5, (lnm) null, (byte) 7));
        c0g.x.getClass();
        pbo1 pbo1Var = pbo1.N0;
        mr20 mr20VarH = ((lag) r4h1Var.d).h();
        dlg1 dlg1Var = (dlg1) r4h1Var.c;
        mr20 mr20VarA2 = ((b7n) dlg1Var.a).a(k6n.a);
        mr20 mr20VarU = rqt0.u(new ipr((Object) null, new x010(rqt0.u(new ph11(yoi1.g(((vpp0) dlg1Var.b).callStream("spotify.offline_esperanto.proto.Offline", "SubscribeBulkRedownloadProgress", Empty.n()).map(rh20.T0)), (byte) 17)), mr20VarA2, new k9o(3, (lnm) null, (byte) 2), (byte) 1), new bu51(3, (lnm) null, (byte) 17), (byte) 16));
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.C(1);
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.i);
        hvm1VarQ.t(jsm1VarR);
        gvm1VarO.n(hvm1VarQ);
        YourLibraryRequest yourLibraryRequestBuild = gvm1VarO.build();
        mwm1 mwm1Var = (mwm1) dlg1Var.c;
        yourLibraryRequestBuild.getClass();
        x010 x010Var = new x010(mr20VarH, rqt0.u(h5p1.s(mr20VarA2, mr20VarU, rqt0.u(new lt20(new ph11(yoi1.g(mwm1Var.b(yourLibraryRequestBuild)), (byte) 18), new w1e0(3, (lnm) null, (byte) 28), (byte) 0)), new sqh1(dlg1Var, (lnm) null))), new bu51(3, (lnm) null, (byte) 18), (byte) 1);
        m70 m70Var = new m70(2131962048, (gda0) null, new k70(), new lag0(r4h1Var, (lnm) null, (byte) 17), 6);
        rm5 rm5Var = (rm5) r4h1Var.f;
        alg1 alg1Var = (alg1) r4h1Var.e;
        smc0VarN.add(new jgb1("updateDownloads", 2131962050, (String) null, 2131962049, (sp00) null, (Integer) null, (a2i) null, evzVarR, pbo1Var, x010Var, m70Var, sqg0.J(new mmr0[]{new mmr0("bulkRedownloadStandard", new qqh1(rm5Var, alg1Var, (byte) 0)), new mmr0("bulkRedownloadCellularAllowed", new qqh1(rm5Var, alg1Var, (byte) 1)), new mmr0("bulkRedownloadCellularNotAllowed", new ymg1(rm5Var, (byte) 14)), new mmr0("bulkRedownloadLowStorage", new qqh1(rm5Var, alg1Var, (byte) 2)), new mmr0("bulkRedownloadCellularLowStorage", new qqh1(rm5Var, alg1Var, (byte) 3))}), 4026));
        return new xt61(tmxVar, 2131962153, 2131962152, eah1Var, mqo1.F(k4p1.k(smc0VarN)), 105);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(onm onmVar) {
        kuw kuwVar;
        String str;
        if (onmVar instanceof kuw) {
            kuwVar = (kuw) onmVar;
            int i = kuwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kuwVar.c = i - Integer.MIN_VALUE;
            } else {
                kuwVar = new kuw(this, onmVar);
            }
        } else {
            kuwVar = new kuw(this, onmVar);
        }
        Object objI = kuwVar.a;
        int i2 = kuwVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20Var = (mr20) this.c;
            kuwVar.c = 1;
            objI = b5p1.i(mr20Var, kuwVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        if (!((th61) objI).b) {
            objI = null;
        }
        th61 th61Var = (th61) objI;
        if (th61Var == null || (str = th61Var.a) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public void t() {
        if (((opg) this.b) == null) {
            u890.C("scrollToStartUnregisterHandle");
            throw null;
        }
        l5v0 l5v0Var = (l5v0) this.c;
        if (l5v0Var == null) {
            u890.C("scrollProviderUnregisterHandle");
            throw null;
        }
        l5v0Var.invoke();
        g521 g521Var = (g521) this.d;
        if (g521Var != null) {
            g521Var.invoke();
        } else {
            u890.C("resetScrollUnregisterHandle");
            throw null;
        }
    }

    public cwl u(lby lbyVar, cu7 cu7Var, d8r0 d8r0Var, String str, String str2, int i, boolean z, boolean z2, Integer num, String str3) {
        String strJ0;
        String strJ1;
        String strJ2;
        String strJ3;
        rle1 rle1VarF;
        o5r o5rVar = (o5r) this.b;
        tb51 tb51Var = (tb51) this.a;
        du7 du7Var = cu7Var.Y;
        boolean z3 = cu7Var.X;
        boolean z4 = cu7Var.h;
        wve1 wve1Var = cu7Var.e;
        kfv kfvVar = cu7Var.c;
        String str4 = "";
        if (du7Var == du7.c && ((di4) this.c).R()) {
            if (!z4) {
                String str5 = lbyVar.a;
                String str6 = lbyVar.b;
                String strJ4 = bmq0.j0(tb51Var.a.getResources().getString(2131961531), cu7Var.a);
                String str7 = lbyVar.c;
                int iV = v(cu7Var);
                z6x z6xVar = z6x.a;
                return new wvl(new plf1(str5, str5, lbyVar.d, str6, strJ4, str7, (String) null, iV, d8r0Var, str, false, false, (p7w) null, z6xVar, new q8b(z6xVar, false), false, false, ypl.a, i, false, z, false, false, false, false, z3 && z2, (ArrayList) null, lbyVar.a, (Integer) null, (String) null, (String) null, false, 1975517184, 1));
            }
            long j = kfvVar.a;
            boolean z5 = j > 0;
            String str8 = lbyVar.a;
            String str9 = lbyVar.b;
            String str10 = cu7Var.a;
            String str11 = lbyVar.c;
            int iV2 = v(cu7Var);
            String str12 = cu7Var.a;
            boolean z6 = z3 && z2;
            boolean z7 = cu7Var.h;
            String str13 = cu7Var.i;
            String strA = o5rVar.a(wve1Var.a);
            String str14 = (z5 || (rle1VarF = tb51Var.f(j)) == null) ? "" : rle1VarF.a;
            if (z5) {
                int i2 = (int) (j / 3600);
                int i3 = ((int) (j / 60)) - (i2 * 60);
                long j2 = j % 60;
                str4 = i2 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Long.valueOf(j2)}, 2));
            }
            return new pvl(new u2v0(str8, str9, str10, str12, str11, iV2, str, d8r0Var, 1, i, z, z6, z7, str13, strA, str14, str4, lbyVar.b, lle.c));
        }
        boolean z8 = z4 && kfvVar.a > 0;
        String str15 = lbyVar.a;
        String str16 = lbyVar.b;
        String str17 = lbyVar.c;
        int iV3 = v(cu7Var);
        String str18 = cu7Var.d;
        List list = cu7Var.g.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jp51 jp51Var = (jp51) it.next();
            arrayList.add(new gp51(jp51Var.a, jp51Var.b));
            it = it;
            z8 = z8;
        }
        boolean z9 = z8;
        rle1 rle1VarF2 = z9 ? null : tb51Var.f(kfvVar.a);
        String strA2 = o5rVar.a(wve1Var.a);
        if (rle1VarF2 == null || (strJ0 = bmq0.j0(strA2, rle1VarF2.a)) == null) {
            strJ0 = strA2;
        }
        if (rle1VarF2 != null && (strJ3 = bmq0.j0(strA2, rle1VarF2.b)) != null) {
            strA2 = strJ3;
        }
        d2k1 d2k1VarX = x(cu7Var);
        Activity activity = tb51Var.a;
        String strA3 = a2k1.a(activity, d2k1VarX);
        String strB = a2k1.b(activity, d2k1VarX);
        String strJ5 = bmq0.j0(strA3, strJ0);
        bmq0.j0(strB, strA2);
        rle1 rle1VarF3 = z9 ? null : tb51Var.f(kfvVar.a);
        String strA4 = o5rVar.a(wve1Var.a);
        if (rle1VarF3 == null || (strJ1 = bmq0.j0(strA4, rle1VarF3.a)) == null) {
            strJ1 = strA4;
        }
        if (rle1VarF3 != null && (strJ2 = bmq0.j0(strA4, rle1VarF3.b)) != null) {
            strA4 = strJ2;
        }
        d2k1 d2k1VarX2 = x(cu7Var);
        Activity activity2 = tb51Var.a;
        String strA5 = a2k1.a(activity2, d2k1VarX2);
        String strB2 = a2k1.b(activity2, d2k1VarX2);
        bmq0.j0(strA5, strJ1);
        String strJ6 = bmq0.j0(strB2, strA4);
        String str19 = cu7Var.a;
        boolean z10 = cu7Var.h;
        String str20 = cu7Var.i;
        boolean z11 = z3 && z2;
        if (z9) {
            long j3 = kfvVar.a;
            int i4 = (int) (j3 / 3600);
            int i5 = ((int) (j3 / 60)) - (i4 * 60);
            long j4 = j3 % 60;
            str4 = i4 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j4)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Long.valueOf(j4)}, 2));
        }
        return new yul(new o2z(str15, str16, str2, str19, str17, str20, strJ5, strJ6, iV3, str18, arrayList, str, d8r0Var, z10, i, z, z11, str4, num, str3));
    }

    public ArrayList w(Set set) {
        ArrayList arrayList;
        synchronized (this.c) {
            try {
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<yob1> arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (set.contains(((yob1) obj).a)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(q7h.U(arrayList3, 10));
                for (yob1 yob1Var : arrayList3) {
                    arrayList.add(new z600(yob1Var.a, yob1Var.b, ((aip0) this.a).a(), yob1Var.c));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public d2k1 x(cu7 cu7Var) {
        di4 di4Var = (di4) this.c;
        if (di4Var.b0() && di4Var.i0()) {
            return e6p1.j(cu7Var.t, Long.valueOf(cu7Var.e.a * 1000), ((yqg) this.d).b());
        }
        return null;
    }

    public Enum y(Object obj) {
        return (Enum) ((r0z) this.c).get(((w190) ((du1) this.b).d(((Number) ((xla0) this.a).get(obj)).intValue())).getNumber());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(onm onmVar) throws Throwable {
        luw luwVar;
        vgn0 vgn0Var;
        int i;
        Throwable th;
        vgn0 vgn0Var2;
        if (onmVar instanceof luw) {
            luwVar = (luw) onmVar;
            int i2 = luwVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                luwVar.e = i2 - Integer.MIN_VALUE;
            } else {
                luwVar = new luw(this, onmVar);
            }
        } else {
            luwVar = new luw(this, onmVar);
        }
        Object obj = luwVar.c;
        int i3 = luwVar.e;
        Object obj2 = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                vgn0Var = ((nuw) this.d).a;
                luwVar.a = vgn0Var;
                i = 0;
                luwVar.b = 0;
                luwVar.e = 1;
                if (vgn0Var.a(luwVar) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = luwVar.a;
                try {
                    hm5.M(obj);
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    vgn0Var2.c((Object) null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            i = luwVar.b;
            vgn0 vgn0Var3 = luwVar.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            luwVar.a = vgn0Var;
            luwVar.b = i;
            luwVar.e = 2;
            Object objK = k(luwVar);
            if (objK != obj2) {
                vgn0 vgn0Var4 = vgn0Var;
                obj = objK;
                vgn0Var2 = vgn0Var4;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                vgn0Var2.c((Object) null);
                return bool2;
            }
            return obj2;
        } catch (Throwable th3) {
            vgn0 vgn0Var5 = vgn0Var;
            th = th3;
            vgn0Var2 = vgn0Var5;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    public /* synthetic */ yzu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj5;
    }

    public /* synthetic */ yzu(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public yzu(ur41 ur41Var) {
        this.a = ur41Var;
    }
}
