package p;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.sharedcosmosrouterservice.NucleusSharedCosmosRouterServiceInstallerKt;
import com.spotify.mobius.Connection;
import com.spotify.wrapped.v1.proto.Action;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oo6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo6(Function0 function0, iu30 iu30Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 17;
        this.c = function0;
        this.b = iu30Var;
        this.d = ven0Var;
    }

    private final Object a(Object obj) {
        jvt jvtVar = (jvt) obj;
        oxb oxbVar = (oxb) this.b;
        bxt bxtVar = (bxt) this.c;
        w4l0 w4l0Var = (w4l0) this.d;
        Objects.toString(jvtVar);
        synchronized (oxbVar) {
            try {
                String strE = bxtVar.e();
                String strD = bxtVar.d();
                if (jvtVar.equals(gvt.a)) {
                    oxbVar.c.a(bxtVar.d(), bxtVar.getName(), oxbVar.g.l(new iut(strD), strE, w4l0Var), bxtVar.getType());
                    ccb1 ccb1Var = oxbVar.X;
                    if (ccb1Var != null) {
                        ccb1Var.invoke(new od21(new l7y("connect")));
                    }
                    oxbVar.f(kfu.a);
                } else if (jvtVar.equals(hvt.a)) {
                    String strL = oxbVar.g.l(hut.d, strE, w4l0Var);
                    Activity activityA = oxbVar.d.a();
                    if (activityA != null) {
                        ((ior) oxbVar.e.invoke(activityA)).a(strL, false);
                    }
                    ccb1 ccb1Var2 = oxbVar.X;
                    if (ccb1Var2 != null) {
                        ccb1Var2.invoke(new od21(new l7y("open_picker")));
                    }
                    oxbVar.f(kfu.a);
                } else if (jvtVar.equals(fvt.a)) {
                    oxbVar.g.l(hut.c, strE, w4l0Var);
                    oxbVar.f(kfu.a);
                } else {
                    if (!jvtVar.equals(ivt.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oxbVar.g.l(hut.e, strE, w4l0Var);
                    oxbVar.f(kfu.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rih1.a;
    }

    private final Object d(Object obj) {
        tv80 tv80Var = (tv80) obj;
        q59 q59Var = (q59) this.b;
        b98 b98Var = (b98) this.d;
        String str = (String) this.c;
        if (b98Var instanceof z88) {
            b840 b840Var = (b840) q59Var.b;
            b840Var.c.k(new er91((fs91) null, b840Var.a.getString(2131956112), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            Completable completableIgnoreElement = b840Var.d.a(new bxf(str, 0.0d)).ignoreElement();
            kv00 kv00Var = b840Var.e;
            completableIgnoreElement.c(kv00Var.a(c98.class, Collections.singletonList(str))).c(kv00Var.a(w281.class, Collections.singletonList(str))).n(b840Var.f).h(new od30(b840Var, (byte) 4)).o(Functions.h).subscribe();
        } else if (b98Var instanceof y88) {
            ((lzn0) q59Var.c).a("spotify:gatedcontent:bottomsheet:".concat(ihc1.V0(str, ':', str)).concat("?source=direct_sales"), tv80Var, (Bundle) null);
        } else if (!(b98Var instanceof a98)) {
            eg.o();
            return null;
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0363  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        rih1 rih1Var;
        float f;
        Long lA;
        byte b = this.a;
        Object[] objArr = 0;
        byte b2 = 1;
        rih1 rih1Var2 = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ((iu30) obj4).invoke(str);
                ((f65) obj2).a(str);
                return rih1Var2;
            case 1:
                zq6 zq6Var = (zq6) obj4;
                ow3 ow3Var = zq6Var.d;
                ((i8h1) ((ewo) ow3Var.b).get()).f(((dsk0) ow3Var.c).e(), (Set) null);
                zzo zzoVar = zq6Var.c;
                List list = zq6Var.b.b;
                wzn wznVar = (wzn) zzoVar.a.c;
                qs6 qs6Var = (qs6) ((ar6) wznVar.a).c.get();
                c8o.l(qs6Var);
                ar6 ar6Var = (ar6) wznVar.a;
                lzn0 lzn0Var = (lzn0) ar6Var.b.get();
                c8o.l(lzn0Var);
                ow3 ow3Var2 = new ow3((ewo) wznVar.c);
                Scheduler scheduler = (Scheduler) ar6Var.a.get();
                c8o.l(scheduler);
                Connection connectionL = new cr6(qs6Var, lzn0Var, ow3Var2, scheduler, list).L(new xq6((ven0) obj3, (byte) 0));
                ven0 ven0Var = (ven0) obj2;
                ven0Var.setValue(connectionL);
                return new wq6((zac0) obj, (rp) connectionL, ven0Var, objArr == true ? 1 : 0);
            case 2:
                e261 e261Var = (e261) obj;
                x4p1 x4p1Var = ((q08) obj4).e;
                b261.A(e261Var, ((x4p1Var instanceof qfu0) || (x4p1Var instanceof jfu0)) ? (String) obj3 : (String) obj2);
                return rih1Var2;
            case 3:
                Flowable flowable = (Flowable) obj4;
                m68 m68Var = (m68) obj3;
                Flowable flowableG = Flowable.g(flowable, yoi1.h(d3p1.H(m68Var.a, m68Var.e, (k68) obj), o6x.a), flowable.X(new e4b1((u961) obj2, (byte) 27)), m68Var.c.e.toFlowable(BackpressureStrategy.d), stf0.Z);
                vbm[] vbmVarArr = q601.a;
                return new kge(flowableG);
            case 4:
                ((bk90) ((h72) obj4).f).a(new yj90(((hwq) obj3).a, (zuc0) obj2, (rj90) null, (tv80) obj, 4));
                return rih1Var2;
            case 5:
                wc8 wc8Var = (wc8) obj3;
                ng20 ng20Var = new ng20(new kpg0(new w460(false, (kl9) null, (yc11) null, 61), new uc8(wc8Var, (byte) 1)));
                c37 c37Var = c37.e1;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(t761.class, new b7t0(new cdk1(ng20Var), c37Var));
                ve51 ve51Var = (ve51) obj4;
                y6h1 y6h1Var = (y6h1) obj2;
                linkedHashMap.put(u761.class, new r3r(new xzq(ve51Var, oc8.d), new vc8(y6h1Var, (byte) 0), 4));
                linkedHashMap.put(s761.class, new b7t0(new cdk1(new kpg0(new ldo(wc8Var.e, ve51Var), oc8.e)), new vc8(y6h1Var, (byte) 1)));
                return rih1Var2;
            case 6:
                c42 c42Var = (c42) obj4;
                nx9 nx9Var = (nx9) obj3;
                vuk vukVar = (vuk) obj2;
                klm klmVar = ((wn41) obj).a;
                io80 io80VarB = klmVar.b("AuthDataService", new nap0(new u6j0(c42Var, (byte) 10), (byte) 5));
                io80 io80VarB2 = klmVar.b("LogoutService", new kx70(new u6j0(vukVar, (byte) 11), new yap0(vukVar, (byte) 0), new tap0(0, c42Var.k, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), new uap0(c42Var, (byte) 1), new tap0(0, c42Var.l, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), new tap0(0, c42Var.m, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new tap0(0, c42Var.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), (byte) 4));
                io80 io80VarB3 = klmVar.b("NativeOAuthSetupService", new dbp0(new tap0(0, c42Var.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), new xap0(io80VarB, (byte) 3), new vap0(nx9Var, (byte) 1), new vap0(nx9Var, (byte) 2), new yap0(vukVar, (byte) 1), new tap0(0, c42Var.a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16), new vap0(nx9Var, (byte) 3), new vap0(nx9Var, (byte) 4), (byte) 2));
                tap0 tap0Var = new tap0(0, c42Var.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
                tap0 tap0Var2 = new tap0(0, c42Var.c, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13);
                kly0 kly0Var = c42Var.d;
                io80 io80VarB4 = klmVar.b("ManagedUserTransportService", new kx70(tap0Var, tap0Var2, new tap0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new xap0(io80VarB3, (byte) 1), new uap0(c42Var, (byte) 2), new xap0(io80VarB2, (byte) 2), new uap0(c42Var, (byte) 3), (byte) 5));
                return new fj8(io80VarB, io80VarB2, io80VarB4, klmVar.b("BootstrapService", new dbp0(new tap0(0, c42Var.f, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), new tap0(0, c42Var.a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), new tap0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new wap0(nx9Var, (byte) 0), new tap0(0, c42Var.g, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new tap0(0, c42Var.e, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new xap0(io80VarB4, (byte) 0), new tap0(0, c42Var.o, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), (byte) 0)), io80VarB3, vukVar);
            case 7:
                ((iu30) obj4).invoke(new t7v0((String) obj3, ((Boolean) obj).booleanValue(), ((c8v0) ((e8v0) obj2)).e));
                return rih1Var2;
            case 8:
                ar9 ar9Var = (ar9) obj3;
                xab1 xab1VarT = fn31.T((c9n) obj4, (o8n) null, 4, new k96(ar9Var, (ven0) obj2, (lnm) null, (byte) 22), 1);
                ar9Var.enable();
                return new wq6((zac0) obj, ar9Var, xab1VarT, b2);
            case 9:
                xt9 xt9Var = (xt9) obj2;
                ((r1q0) obj4).a((iac0) obj3, xt9Var);
                return new kz6(xt9Var, (byte) 1);
            case 10:
                px9 px9Var = (px9) obj4;
                l3n1 l3n1Var = (l3n1) obj2;
                klm klmVar2 = ((wn41) obj).a;
                kly0 kly0Var2 = px9Var.b;
                bbp0 bbp0Var = new bbp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8);
                nap0 nap0Var = new nap0((uv40) obj3, (byte) 8);
                kly0 kly0Var3 = px9Var.d0;
                io80 io80VarB5 = klmVar2.b("GlobalKeyValueStorageService", new iyo0(bbp0Var, nap0Var, new bbp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), (byte) 16));
                io80 io80VarB6 = klmVar2.b("CoreThreadingService", w0n0.g);
                io80 io80VarB7 = klmVar2.b("CoreThreadingRxService", new nap0(new xap0(io80VarB6, (byte) 16), (byte) 23));
                io80 io80VarB8 = klmVar2.b("ReachabilitySetupService", new ocp0(new ry9(px9Var, (byte) 14), new xap0(klmVar2.b("CoreThreadingCoroutinesService", new nap0(new xap0(io80VarB6, (byte) 15), (byte) 22)), (byte) 18), (byte) 7));
                io80 io80VarB9 = klmVar2.b("SharedReachabilityService", new ndp0(new ry9(px9Var, (byte) 15), new ry9(px9Var, (byte) 16), new ry9(px9Var, (byte) 17), new ry9(px9Var, (byte) 18), new ry9(px9Var, (byte) 19), new ry9(px9Var, (byte) 20), (byte) 0));
                io80 io80VarB10 = klmVar2.b("CorePreferencesService", w0n0.f);
                io80 io80VarB11 = klmVar2.b("TrafficAdapterService", new ocp0(new xap0(io80VarB6, (byte) 26), new bbp0(0, px9Var.l0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), (byte) 20));
                io80 io80VarInstallSharedCosmosRouterService = NucleusSharedCosmosRouterServiceInstallerKt.installSharedCosmosRouterService(klmVar2, new xap0(io80VarB6, (byte) 25));
                io80 io80VarB12 = klmVar2.b("FileIOService", w0n0.h);
                io80 io80VarB13 = klmVar2.b("ConnectivityService", new pap0(new bbp0(0, px9Var.i, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new xap0(io80VarB6, (byte) 6), new xap0(io80VarB7, (byte) 7), new xap0(io80VarB10, (byte) 8), new bbp0(0, px9Var.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), new xap0(io80VarB11, (byte) 9), new xap0(io80VarB8, (byte) 10), new bbp0(0, px9Var.m0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), new bbp0(0, px9Var.j, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new xap0(io80VarInstallSharedCosmosRouterService, (byte) 4), new abp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), new abp0(0, px9Var.q0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), new ry9(px9Var, (byte) 11), new abp0(0, px9Var.m, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), new abp0(0, px9Var.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), new abp0(0, px9Var.p0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), new bbp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new xap0(io80VarB12, (byte) 5), (byte) 1));
                bbp0 bbp0Var2 = new bbp0(0, px9Var.v, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15);
                xap0 xap0Var = new xap0(io80VarB13, (byte) 17);
                kly0 kly0Var4 = px9Var.x;
                io80 io80VarB14 = klmVar2.b("MusicClientTokenIntegrationService", new iyo0(bbp0Var2, xap0Var, new bbp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16), (byte) 25));
                io80 io80VarB15 = klmVar2.b("LoggedInStateService", new nbp0(new bbp0(0, px9Var.V, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), (byte) 19));
                io80 io80VarB16 = klmVar2.b("ManagedTransportService", new rap0(new bbp0(0, px9Var.J, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new ry9(px9Var, (byte) 12), (byte) 22));
                io80 io80VarB17 = klmVar2.b("CoreService", new mbp0(new ho80(io80VarB6, (byte) 1), new xap0(io80VarB7, (byte) 11), new xap0(io80VarB10, (byte) 12), new y52(0, px9Var.k, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new xap0(io80VarInstallSharedCosmosRouterService, (byte) 13), new bbp0(0, px9Var.l, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new xap0(io80VarB12, (byte) 14)));
                klmVar2.b("IdleShutdownTimeUpdateService", new iyo0(new bbp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new bbp0(0, px9Var.U, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), new bbp0(0, px9Var.T, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), (byte) 18));
                io80 io80VarB18 = klmVar2.b("EventSenderInstanceService", new rap0(new bbp0(0, px9Var.I, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new bbp0(0, px9Var.r, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), (byte) 15));
                io80 io80VarB19 = klmVar2.b("SettingsService", new dy7(new xap0(io80VarB6, (byte) 21), new xap0(io80VarInstallSharedCosmosRouterService, (byte) 22), new xap0(io80VarB10, (byte) 23), new xap0(io80VarB13, (byte) 24), new y52(0, px9Var.p, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new bbp0(0, px9Var.q, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), (byte) 29));
                klmVar2.b("RemoteConfigBackgroundScopeResolverService", new mcp0(new bbp0(0, px9Var.w, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), (byte) 7));
                return new ey9(io80VarB5, io80VarB6, io80VarB7, io80VarB9, io80VarB13, io80VarB14, io80VarB15, io80VarB16, io80VarB17, io80VarInstallSharedCosmosRouterService, io80VarB12, io80VarB18, io80VarB19, io80VarB10, klmVar2.b("RemoteConfigUnauthFetcherService", new dbp0(new bbp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new bbp0(0, px9Var.g, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20), new xap0(io80VarB16, (byte) 19), new xap0(io80VarB18, (byte) 20), new bbp0(0, px9Var.s, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21), new bbp0(0, px9Var.u, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), new bbp0(0, px9Var.t, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), new bbp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), (byte) 4)), klmVar2.b("StartupModeService", new mcp0(new bbp0(0, px9Var.t0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), (byte) 18)), klmVar2.b("OopsBackgroundScopeService", new rap0(new bbp0(0, px9Var.e0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), new ry9(px9Var, (byte) 13), (byte) 26)), l3n1Var);
            case 11:
                hsl1 hsl1Var = (hsl1) obj3;
                ven0 ven0Var2 = (ven0) obj2;
                View view = (View) ((Function0) obj4).invoke();
                rwq0.s(view, new j8a(view, (byte) 0));
                if (hsl1Var != null) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + hsl1Var.a.i(519).b, view.getPaddingRight(), view.getPaddingBottom());
                }
                view.addOnLayoutChangeListener(new x37(view, ven0Var2, (byte) 3));
                return view;
            case 12:
                ((Number) obj).longValue();
                p811 p811Var = (p811) obj3;
                tia tiaVar = (tia) obj4;
                sia siaVar = tiaVar.a;
                List list2 = siaVar.a;
                n2u0 n2u0Var = (n2u0) tiaVar.b.invoke();
                long jLongValue = (n2u0Var == null || (lA = n2u0Var.a()) == null) ? 0L : lA.longValue();
                ytw0 ytw0Var = jfv.b;
                tiaVar.c = fdg1.l0(jLongValue, ngv.d);
                float f2 = 0.0f;
                if (jLongValue > 0) {
                    long j = siaVar.b;
                    if (list2.isEmpty() || jfv.n(j) || jfv.c(j, 0L) <= 0) {
                        rih1Var = rih1Var2;
                    } else {
                        long j2 = tiaVar.c;
                        rih1Var = rih1Var2;
                        long jP = jfv.p(j2, jfv.r((int) jfv.d(j2, j), j));
                        int I = p7h.I(tiaVar.d, new jfv(jP));
                        if (I < 0) {
                            I = (-(I + 1)) - 1;
                        }
                        if (I >= 0) {
                            pia piaVar = (pia) list2.get(I);
                            long j3 = piaVar.a;
                            long j4 = piaVar.b;
                            long jP2 = jfv.p(jP, j3);
                            if (jfv.c(jP2, 0L) >= 0 && jfv.c(j4, 0L) > 0) {
                                long j5 = tia.e;
                                if (jfv.c(jP2, j5) < 0) {
                                    double d = jfv.d(jP2, j5);
                                    f = (float) ((3.0d - (d * 2.0d)) * d * d);
                                } else {
                                    f = 1.0f;
                                }
                                long j6 = pap1.y(new jfv(jfv.p(jP2, j5)), new jfv(0L)).a;
                                long jP3 = jfv.p(j4, j5);
                                double dMin = 1.0d - (jfv.c(jP3, 0L) > 0 ? Math.min(jfv.d(j6, jP3), 1.0d) : 1.0d);
                                f2 = piaVar.c * f * ((float) (dMin * dMin * dMin));
                            }
                        }
                    }
                } else {
                    rih1Var = rih1Var2;
                }
                if (!u890.f(f2, (Float) p811Var.a) && !(((jfe) obj2).l(new rj31("beatPulse", f2)) instanceof pge)) {
                    p811Var.a = Float.valueOf(f2);
                }
                return rih1Var;
            case 13:
                chz0 chz0Var = (chz0) obj;
                p811 p811Var2 = (p811) obj4;
                mjz0 mjz0Var = (mjz0) p811Var2.a;
                boolean z = chz0Var == ((chz0) obj3);
                mjz0Var.getClass();
                p811Var2.a = new mjz0(z);
                ((qla) obj2).g.a(new pgm1(new y0c1("listening-age-quiz-completed"), "true"));
                return rih1Var2;
            case 14:
                tv80 tv80Var = (tv80) obj;
                lzn0 lzn0Var2 = (lzn0) ((kba) obj4).b;
                String str2 = (String) obj3;
                if (str2 == null) {
                    str2 = "";
                }
                Bundle bundle = new Bundle();
                bundle.putString("key_edit_name", (String) obj2);
                lzn0Var2.a(str2, tv80Var, bundle);
                return rih1Var2;
            case 15:
                l6b l6bVar = (l6b) obj4;
                String str3 = (String) obj2;
                dg30 dg30Var = l6bVar.b;
                mw40 mw40VarT = yoi1.T(dg30Var, dg30Var.getString(2131952762, str3), dg30Var.getString(2131952759, str3));
                String string = dg30Var.getString(2131952758);
                ln5 ln5Var = new ln5(l6bVar, (String) obj3, (byte) 2);
                mw40VarT.a = string;
                mw40VarT.c = ln5Var;
                String string2 = dg30Var.getString(2131952761);
                k6b k6bVar = k6b.b;
                mw40VarT.b = string2;
                mw40VarT.d = k6bVar;
                mw40VarT.b().b();
                return rih1Var2;
            case 16:
                m0d m0dVar = (m0d) obj;
                ((iu30) obj4).invoke(adb.a);
                ((ven0) obj2).setValue(m0dVar.a + ":" + m0dVar.b);
                ((iu30) obj3).invoke(m0dVar);
                return rih1Var2;
            case 17:
                ((Function0) obj3).invoke();
                ((iu30) obj4).invoke((m0d) obj);
                ((ven0) obj2).setValue(Boolean.FALSE);
                return rih1Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((qtr) obj).b(new gw2((wr00) obj4, (lzn0) obj3, (mts) obj2, (lnm) null));
                return rih1Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                x50 x50Var = (x50) obj;
                ttb ttbVar = (ttb) obj4;
                mub mubVar = ttbVar.c;
                String str4 = (String) ((ven0) obj2).getValue();
                i8h1 i8h1Var = mubVar.c;
                opl0 opl0VarA = mubVar.a(str4, (hp80) obj3);
                if (nub.a[l1d.C(1)] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = opl0VarA.c.c();
                x6h1VarC.i.add(new a7h1("icon_button", "receipt", (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, opl0VarA.b, System.currentTimeMillis()), (xj61) null);
                Action action = x50Var.b;
                int iN = action.n();
                int i = iN == 0 ? -1 : stb.a[l1d.C(iN)];
                if (i != -1) {
                    if (i == 1) {
                        ttbVar.e.a(action.p().o(), tv80VarM, (Bundle) null);
                    } else if (i != 2 && i != 3 && i != 4) {
                        k220.f("Unexpected icon button action: ".concat(x0d.y(action.n())));
                        return null;
                    }
                }
                return rih1Var2;
            case 20:
                return a(obj);
            case 21:
                long j7 = ((Offset) obj).a;
                ven0 ven0Var3 = (ven0) obj3;
                lee1 lee1Var = g3c.a;
                faa0 faa0Var = (faa0) ven0Var3.getValue();
                ven0Var3.setValue((Object) null);
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ((ven0) obj2).setValue(az31.b);
                ((tui1) obj4).d();
                return rih1Var2;
            case 22:
                ((t2) obj4).a.f(new dwn0((String) obj3, (String) obj2, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)));
                return rih1Var2;
            case 23:
                ((i6c) obj4).a.f(new dwn0((String) obj3, (String) obj2, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)));
                return rih1Var2;
            case 24:
                ((z6c) obj4).a.f(new dwn0((String) obj3, (String) obj2, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)));
                return rih1Var2;
            case 25:
                ((in8) obj4).a.f(new dwn0((String) obj3, (String) obj2, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)));
                return rih1Var2;
            case 26:
                ((f3b) obj4).a.f(new dwn0((String) obj3, (String) obj2, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)));
                return rih1Var2;
            case 27:
                ((lzn0) ((dg8) obj4).b).f(new dwn0((String) obj3, (String) obj2, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)));
                return rih1Var2;
            case 28:
                return d(obj);
            default:
                dyc dycVar = (dyc) obj4;
                rtb0.b((rtb0) obj, dycVar.a.size(), (iu30) null, new j2i(1068398126, new gk0((j2a) obj3, (o0i) obj2, dycVar, (byte) 4), true), 6);
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo6(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo6(q59 q59Var, b98 b98Var, String str) {
        super(1);
        this.a = (byte) 28;
        this.b = q59Var;
        this.d = b98Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo6(jma jmaVar, px9 px9Var, uv40 uv40Var, l3n1 l3n1Var) {
        super(1);
        this.a = (byte) 10;
        this.b = px9Var;
        this.c = uv40Var;
        this.d = l3n1Var;
    }
}
