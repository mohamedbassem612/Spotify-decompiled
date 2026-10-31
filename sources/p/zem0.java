package p;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import androidx.navigation.fragment.NavHostFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zem0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zem0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        int i;
        Integer numValueOf;
        evz huzVar;
        ntn0 bundle = null;
        switch (this.a) {
            case 0:
                svh0 svh0Var = (svh0) this.b;
                if (!svh0Var.b) {
                    Window window = (Window) svh0Var.c;
                    if (window != null) {
                        Window.Callback callback = window.getCallback();
                        Dialog dialog = callback instanceof Dialog ? (Dialog) callback : null;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                    svh0Var.c = null;
                }
                svh0Var.b = false;
                return rih1.a;
            case 1:
                cpm0 cpm0Var = (cpm0) this.b;
                iu30 iu30Var = cpm0Var.O0;
                if (iu30Var != null) {
                    iu30Var.invoke(new apm0(cpm0Var.getNumSelectedItems()));
                }
                return rih1.a;
            case 2:
                lsm0 lsm0Var = ((z590) ((bpb1) ((cv7) this.b).b).getValue()).a;
                bundle = lsm0Var != null ? lsm0Var.k : null;
                return bundle == null ? z6x.a : bundle;
            case 3:
                return ((uwm0) this.b).a.c;
            case 4:
                return ((teo0) ((a680) this.b).f).create();
            case 5:
                try {
                    Activity activity = ((yym0) this.b).a;
                    ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0);
                    String str = activityInfo.targetActivity;
                    if (str != null && !ihc1.y0(str)) {
                        return new ComponentName(activity, activityInfo.targetActivity);
                    }
                    return null;
                } catch (PackageManager.NameNotFoundException e) {
                    n57.g("Activity not resolved", e);
                    return null;
                }
            case 6:
                wsx wsxVar = wsx.c;
                ytp0 ytp0Var = (ytp0) ((dxy) this.b).b;
                switch (((twv0) ytp0Var.c).a.d().ordinal()) {
                    case 0:
                        i = 2131960318;
                        numValueOf = Integer.valueOf(i);
                        break;
                    case 1:
                        i = 2131960322;
                        numValueOf = Integer.valueOf(i);
                        break;
                    case 2:
                        i = 2131960316;
                        numValueOf = Integer.valueOf(i);
                        break;
                    case 3:
                        i = 2131960321;
                        numValueOf = Integer.valueOf(i);
                        break;
                    case 4:
                        i = 2131960320;
                        numValueOf = Integer.valueOf(i);
                        break;
                    case 5:
                        i = 2131960317;
                        numValueOf = Integer.valueOf(i);
                        break;
                    case 6:
                        i = 2131960319;
                        numValueOf = Integer.valueOf(i);
                        break;
                    default:
                        eg.o();
                        numValueOf = null;
                        break;
                }
                return new u0n0(wsxVar, numValueOf.intValue(), nik1.b2, new mtn0(y0n0.a, czm0.e, dbm0.V0), gvn0.d, Collections.singleton(mno1.W), d5p1.t(h4p1.g(new ian0(ytp0Var, bundle, (byte) 15)), smo1.e(igu.b), new alb1(0L, Long.MAX_VALUE), Boolean.FALSE), 64);
            case 7:
                b1n0 b1n0Var = (b1n0) this.b;
                u0n0 u0n0Var = b1n0Var.b;
                ntn0 ntn0VarB = u0n0Var != null ? b1n0.b(u0n0Var) : null;
                u0n0 u0n0Var2 = b1n0Var.c;
                ntn0 ntn0VarB2 = u0n0Var2 != null ? b1n0.b(u0n0Var2) : null;
                u0n0 u0n0Var3 = b1n0Var.d;
                ntn0 ntn0VarB3 = u0n0Var3 != null ? b1n0.b(u0n0Var3) : null;
                u0n0 u0n0Var4 = b1n0Var.e;
                ntn0 ntn0VarB4 = u0n0Var4 != null ? b1n0.b(u0n0Var4) : null;
                u0n0 u0n0Var5 = b1n0Var.f;
                return new ptn0(ntn0VarB, ntn0VarB2, ntn0VarB3, ntn0VarB4, u0n0Var5 != null ? b1n0.b(u0n0Var5) : null);
            case 8:
                d1n0 d1n0Var = (d1n0) this.b;
                xe01 xe01Var = d1n0Var.b.b;
                ytp0 ytp0Var2 = d1n0Var.c;
                if (((isv0) ((jkp0) ytp0Var2.d).b).b()) {
                    p241 p241Var = (o241) ytp0Var2.b;
                    ezc ezcVarG = yoi1.g(p241Var.a.filter(bj20.d1).map(cj20.d1).distinctUntilChanged());
                    p241 p241Var2 = p241Var;
                    huzVar = h5p1.s(ezcVarG, yoi1.g(p241Var2.a("payment-state", "").map(gtv0.b)), yoi1.g(!((twv0) ytp0Var2.e).a.c() ? Observable.just(Boolean.FALSE) : p241Var2.a("tablet-free", "false").map(a2x0.S0).onErrorReturnItem(Boolean.FALSE).distinctUntilChanged()), new td1(4, (lnm) null, (byte) 9));
                } else {
                    huzVar = new huz(Boolean.FALSE, (byte) 10);
                }
                return new x010(xe01Var, huzVar, new cq2(d1n0Var, (lnm) null, (byte) 3), (byte) 1);
            case 9:
                t1n0 t1n0Var = (t1n0) this.b;
                return t1n0Var.Z1.l(t1n0Var);
            case 10:
                b2n0 b2n0Var = (b2n0) this.b;
                hma1 hma1VarEdit = b2n0Var.c.a.edit();
                hma1VarEdit.f(n2b1.c);
                hma1VarEdit.f(n2b1.d);
                hma1VarEdit.g();
                r2b1 r2b1Var = b2n0Var.b;
                op71.q(r2b1Var.i.a, (CancellationException) null);
                r2b1Var.k.c();
                r2b1Var.a.getClass();
                dn81 dn81VarA = u3c.a();
                if (dn81VarA != null) {
                    n3c n3cVar = (n3c) dn81VarA.b;
                    Context context = n3cVar.d;
                    oaz0 oaz0Var = new oaz0(context, 10);
                    oaz0Var.i = context;
                    n3cVar.f.i(oaz0Var);
                }
                return rih1.a;
            case 11:
                zg3 zg3Var = (zg3) this.b;
                jtp jtpVar = (jtp) zg3Var.d;
                lzn0 lzn0Var = (lzn0) zg3Var.e;
                jtpVar.getClass();
                return new kpg0(new na9(lzn0Var, (byte) 5), new xkm0(zg3Var, (byte) 9));
            case 12:
                q3n0 q3n0Var = (q3n0) this.b;
                luk lukVar = q3n0Var.c;
                if (lukVar != null) {
                    return lukVar.e(new d26(q3n0Var, (byte) 25));
                }
                return null;
            case 13:
                x3n0 x3n0Var = (x3n0) this.b;
                luk lukVar2 = x3n0Var.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new d26(x3n0Var, (byte) 26));
                }
                return null;
            case 14:
                y3n0 y3n0Var = (y3n0) this.b;
                luk lukVar3 = y3n0Var.b;
                if (lukVar3 != null) {
                    return lukVar3.e(new d26(y3n0Var, (byte) 27));
                }
                return null;
            case 15:
                z3n0 z3n0Var = (z3n0) this.b;
                luk lukVar4 = z3n0Var.t0;
                if (lukVar4 != null) {
                    return lukVar4.e(new d26(z3n0Var, (byte) 28));
                }
                return null;
            case 16:
                b4n0 b4n0Var = (b4n0) this.b;
                luk lukVar5 = b4n0Var.e;
                if (lukVar5 != null) {
                    return lukVar5.e(new d26(b4n0Var, (byte) 29));
                }
                return null;
            case 17:
                f4n0 f4n0Var = (f4n0) this.b;
                luk lukVar6 = f4n0Var.b;
                if (lukVar6 != null) {
                    return lukVar6.e(new e4n0(f4n0Var, (byte) 0));
                }
                return null;
            case 18:
                return (lce) ((RetrofitMaker) ((p410) this.b).b).createWebgateService(lce.class, "music-quiz-npv-share");
            case 19:
                return new kf10(((r7n0) this.b).a);
            case 20:
                qqp qqpVar = (qqp) ((e9n0) this.b).b.a.b;
                lik1 lik1VarG = ((qop) qqpVar.d).g();
                l3q l3qVar = (l3q) qqpVar.e;
                teq teqVar = l3qVar.b;
                ssf1 ssf1Var = (ssf1) teqVar.g6.get();
                c8o.l(ssf1Var);
                fl90 fl90Var = (fl90) qqpVar.c;
                yzc0 yzc0Var = fl90Var.a;
                daq daqVar = l3qVar.a;
                kt91 kt91Var = (kt91) daqVar.f8.get();
                c8o.l(kt91Var);
                e7p0 e7p0Var = (e7p0) teqVar.W4.get();
                c8o.l(e7p0Var);
                h5q h5qVar = (h5q) teqVar.db.get();
                c8o.l(h5qVar);
                ytp0 ytp0VarB = qqpVar.b();
                q8n q8nVar = (q8n) daqVar.V2.get();
                c8o.l(q8nVar);
                toj0 toj0Var = new toj0(yzc0Var, kt91Var, e7p0Var, h5qVar, ytp0VarB, q8nVar, (byte) 10);
                bk90 bk90Var = fl90Var.d;
                c8o.l(bk90Var);
                return new xqw(new jpg0(f6o1.A(new ng20(new dxy((Object) lik1VarG, (Object) ssf1Var, (Object) toj0Var, (Object) bk90Var, (Object) teqVar.B(), (Object) qqpVar.b(), (byte) 14), ((qop) qqpVar.d).g()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), d9n0.a));
            case 21:
                q9n0 q9n0Var = (q9n0) this.b;
                return new kpg0(q9n0Var.d.a(new p9n0(q9n0Var.a, q9n0Var), new bz0(3, (lnm) null, (byte) 20)), k4n0.c1);
            case 22:
                u9n0 u9n0Var = (u9n0) ((ynb0) ((phi0) this.b).c).get();
                u9n0Var.getClass();
                j3r j3rVar = rzq.y;
                rzq rzqVarF = l2p1.f(u9n0Var.b.a("android-music-video-prerelease-checker-impl", ywq.O0));
                u9n0Var.a.getLifecycle().a(new lt1(rzqVarF, (byte) 3));
                return rzqVarF;
            case 23:
                ((lgn0) this.b).c.invoke();
                return rih1.a;
            case 24:
                return (i8h1) ((bsp) ((poj0) this.b).d).get();
            case 25:
                ((kkn0) this.b).Z.setValue((Object) null);
                return rih1.a;
            case 26:
                return Integer.valueOf(((wkn0) this.b).U0.getContext().getColor(2131101285));
            case 27:
                hmn0 hmn0Var = (hmn0) this.b;
                ReentrantLock reentrantLock = hmn0Var.b;
                reentrantLock.lock();
                try {
                    hmn0Var.a = null;
                    return rih1.a;
                } finally {
                    reentrantLock.unlock();
                }
            case 28:
                gon0 gon0Var = (gon0) this.b;
                return new oon0(gon0Var.a, gon0Var.v);
            default:
                NavHostFragment navHostFragment = (NavHostFragment) this.b;
                Context contextH0 = navHostFragment.h0();
                if (contextH0 == null) {
                    eg.m("NavController cannot be created before the fragment is attached");
                    return null;
                }
                gon0 gon0Var2 = new gon0(contextH0);
                idd1 idd1Var = gon0Var2.C;
                gon0Var2.D(navHostFragment);
                gon0Var2.E(navHostFragment.o());
                rzn0 rzn0Var = gon0Var2.v;
                rzn0Var.a(new x2u(navHostFragment.P0(), navHostFragment.g0()));
                Context contextP0 = navHostFragment.P0();
                th30 th30VarG0 = navHostFragment.g0();
                int i2 = ((zf30) navHostFragment).Y0;
                if (i2 == 0 || i2 == -1) {
                    i2 = 2131430114;
                }
                rzn0Var.a(new ii30(contextP0, th30VarG0, i2));
                Bundle bundleA = ((oe41) ((zf30) navHostFragment).x1.c).a("android-support-nav:fragment:navControllerState");
                if (bundleA != null) {
                    gon0Var2.y(bundleA);
                }
                ((oe41) ((zf30) navHostFragment).x1.c).c("android-support-nav:fragment:navControllerState", new tku(gon0Var2, (byte) 2));
                Bundle bundleA2 = ((oe41) ((zf30) navHostFragment).x1.c).a("android-support-nav:fragment:graphId");
                if (bundleA2 != null) {
                    navHostFragment.H1 = bundleA2.getInt("android-support-nav:fragment:graphId");
                }
                ((oe41) ((zf30) navHostFragment).x1.c).c("android-support-nav:fragment:graphId", new tku(navHostFragment, (byte) 3));
                int i3 = navHostFragment.H1;
                if (i3 != 0) {
                    gon0Var2.C(((oon0) idd1Var.getValue()).b(i3), (Bundle) null);
                } else {
                    Bundle bundle2 = ((zf30) navHostFragment).f;
                    int i4 = bundle2 != null ? bundle2.getInt("android-support-nav:fragment:graphId") : 0;
                    bundle = bundle2 != null ? bundle2.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i4 != 0) {
                        gon0Var2.C(((oon0) idd1Var.getValue()).b(i4), bundle);
                    }
                }
                return gon0Var2;
        }
    }
}
