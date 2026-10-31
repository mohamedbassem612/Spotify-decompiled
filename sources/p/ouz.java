package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.spotify.base.java.logging.Logger;
import com.spotify.kidsgraduation.v1.AcceptTermsRequest;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.offline.offlineplugin_proto.g;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ouz implements yu30, qiw, Function, jrn0, Predicate, InstallReferrerStateListener, Producer, luo, fyv0, BiFunction {
    public final /* synthetic */ byte a;
    public Object b;

    public ouz(Handler handler) {
        this.a = (byte) 2;
        this.b = new vi7(handler, (byte) 1);
    }

    public static void t(ouz ouzVar, String str) {
        ((kt91) ouzVar.b).k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public cbr0 a() {
        return (cbr0) ((kop) this.b).h1.get();
    }

    public Object apply(Object obj) {
        upw0 upw0Var;
        boolean z = true;
        Integer num = null;
        switch (this.a) {
            case 0:
                return ((ruz) this.b).d(((h9u0) obj).a);
            case 3:
                uqk0 uqk0Var = ((g510) this.b).h;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", (String) obj)), uqk0Var.c, uqk0Var.b, System.currentTimeMillis());
            case 4:
                if81 if81Var = if81.b;
                Set setW0 = dm61.w0(new if81[]{if81Var});
                if (!((Boolean) obj).booleanValue()) {
                    yrc0 yrc0Var = (yrc0) this.b;
                    if ((yrc0Var != null ? yrc0Var.f : 0) != 5) {
                        z = false;
                    }
                }
                if81 if81Var2 = if81.a;
                if (z) {
                    setW0.add(if81Var2);
                }
                if (z) {
                    if81Var = if81Var2;
                }
                return new kf81(setW0, if81Var, z);
            case 5:
                return new j1n1(new cvo0(((m0n1) this.b).c, (wro0) obj));
            case 8:
                int iC = l1d.C(((b691) obj).a());
                if (iC == 1) {
                    num = 2131956141;
                } else if (iC == 2) {
                    num = 2131956142;
                }
                return num != null ? new CompletableFromAction(new bm0((kp00) this.b, num, (byte) 26)) : CompletableEmpty.a;
            case 9:
                hgo hgoVar = (hgo) this.b;
                if (((Boolean) obj).booleanValue()) {
                    Observable observableFlatMap = ((Observable) ((gfr) hgoVar.d).invoke()).flatMap(new bm00(hgoVar, (byte) 10));
                    observableFlatMap.getClass();
                    return observableFlatMap;
                }
                Observable observableJust = Observable.just(new zb20(2));
                observableJust.getClass();
                return observableJust;
            case 11:
                f0b0 f0b0Var = (f0b0) this.b;
                p950 p950Var = ((d9w) obj).a;
                if (p950Var.equals(o950.a)) {
                    upw0Var = upw0.PRIVACY_POLICY_TYPE_UNSPECIFIED;
                } else if (p950Var.equals(l950.a)) {
                    upw0Var = upw0.PRIVACY_POLICY_TYPE_EXPLICIT;
                } else if (p950Var.equals(m950.a)) {
                    upw0Var = upw0.PRIVACY_POLICY_TYPE_IMPLICIT;
                } else {
                    if (!p950Var.equals(n950.a)) {
                        eg.o();
                        return null;
                    }
                    upw0Var = upw0.PRIVACY_POLICY_TYPE_NON;
                }
                qb qbVarN = AcceptTermsRequest.n();
                qbVarN.q();
                qbVarN.n(upw0Var);
                AcceptTermsRequest acceptTermsRequest = (AcceptTermsRequest) qbVarN.build();
                g0b0 g0b0Var = f0b0Var.a;
                acceptTermsRequest.getClass();
                return g0b0Var.b(acceptTermsRequest).d(Observable.just(o000.f)).onErrorReturn(sl10.h);
            case 13:
                rmf1 rmf1Var = (rmf1) obj;
                pmf0 pmf0Var = (pmf0) this.b;
                boolean z2 = rmf1Var.c;
                String str = rmf1Var.a;
                g gVar = g.NOT_APPLICABLE;
                if (z2) {
                    Observable observable = m5n1.p(pmf0Var.a.a, new z9b0(rmf1Var.b, (byte) 14)).subscribeOn(pmf0Var.b).map(hn70.a).map(new in70(rmf1Var)).onErrorReturnItem(pn70.a(str, gVar)).toObservable();
                    observable.getClass();
                    return observable;
                }
                Observable observableJust2 = Observable.just(pn70.a(str, gVar));
                observableJust2.getClass();
                return observableJust2;
            case 14:
                return u890.j(Looper.myLooper(), Looper.getMainLooper()) ? Single.just(obj) : Single.just(obj).observeOn((Scheduler) this.b);
            case 15:
                zsx0 zsx0Var = (ktx0) obj;
                return zsx0Var instanceof zsx0 ? zsx0.a(zsx0Var, ((xj7) this.b).a, (List) null, 254) : zsx0Var;
            case 22:
                wza0 wza0Var = (wza0) this.b;
                return wza0Var.g.firstOrError().onErrorResumeNext(rza0.a).flatMap(new tza0(wza0Var, (String) obj));
            default:
                return Single.create(new zc80((hgd0) this.b, (byte) 10));
        }
    }

    public void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1013159780);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, dug.f(u291.h(uyn1.x(qim0VarF, 16.0f), 0.5f), u7h.b(cbx.a(x340Var).d.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(this, qim0Var, i, (byte) 8);
        }
    }

    public void c(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-132385320);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131962323);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, anm1.N("JamInviteSheetTitle", uyn1.z(32.0f, 0.0f, 2, u291.f(nim0Var, 1.0f))), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            j(function0, x340Var, i3 & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt90(this, function0, i, (byte) 0);
        }
    }

    public void d(qt90 qt90Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(917505892);
        int i2 = (x340Var.i(qt90Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(u291.z(nim0Var, (fra) null, 3), 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarB = uyn1.B(x0d.p(lhc.g(x340Var).g, 32, qim0VarF), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = i2 >> 3;
            int i4 = (i2 >> 6) & 112;
            c(function0, x340Var, (i3 & 14) | i4);
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            b(null, x340Var, i4);
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            g(qt90Var, x340Var, (i2 & 14) | i4);
            yah0.e(qt90Var.b, function1, (qim0) null, (xu30) null, x340Var, i3 & 112);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a8m(i, this, qt90Var, function0, function1, (byte) 1);
        }
    }

    public Iterable e(Object obj) {
        oia0 oia0Var = (oia0) this.b;
        Collection collectionD = ((beg) obj).g().d();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            jfg jfgVarS = ((a8b0) it.next()).t0().s();
            beg begVarD = null;
            jfg jfgVarA = jfgVarS != null ? jfgVarS.a() : null;
            beg begVar = jfgVarA instanceof beg ? (beg) jfgVarA : null;
            if (begVar != null && (begVarD = oia0Var.d(begVar)) == null) {
                begVarD = begVar;
            }
            if (begVarD != null) {
                arrayList.add(begVarD);
            }
        }
        return arrayList;
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(239767323);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(u291.z(nim0Var, (fra) null, 3), 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x0d.s(nim0Var, 100.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50((Object) this, i, (byte) 2);
        }
    }

    public void g(qt90 qt90Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2107119494);
        int i2 = (x340Var.i(qt90Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("NearbyRow", uyn1.B(u291.f(nim0.a, 1.0f), 16.0f, 0.0f, 16.0f, 24.0f, 2));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            otw.c((ts90) this.b, new ls90(qt90Var.d, qt90Var.c), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(this, qt90Var, i, (byte) 10);
        }
    }

    public Object get() {
        return new DispatcherWorker(((k2a0) this.b).c);
    }

    public h0r0 h() {
        kop kopVar = (kop) this.b;
        h931 h931VarQ = kopVar.a.Q();
        c8o.l(h931VarQ);
        return new o1c0(h931VarQ, (amp) kopVar.w.get(), (wmp) kopVar.n1.get(), (cbr0) kopVar.h1.get());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void i(tt90 tt90Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1016679963);
        int i2 = (x340Var.g(tt90Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else if (tt90Var instanceof st90) {
            x340Var.i0(-196420987);
            f(x340Var, (i2 >> 12) & 14);
            x340Var.r(false);
        } else if (tt90Var instanceof qt90) {
            x340Var.i0(-196356228);
            d((qt90) tt90Var, function0, function1, x340Var, (i2 & 1022) | ((i2 >> 3) & 7168));
            x340Var.r(false);
        } else {
            if (!(tt90Var instanceof rt90)) {
                throw p3d1.k(x340Var, 2071872831, false);
            }
            x340Var.i0(-196165485);
            boolean z = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new to1(function2, (lnm) null, (byte) 11);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 15, i, this, tt90Var, function0, function1, function2);
        }
    }

    public void j(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1270383509);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.b(13, apo.r(-695902890, new vgz(function0, (byte) 24), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt90(this, function0, i, (byte) 1);
        }
    }

    public void k() {
        rm5 rm5Var = (rm5) this.b;
        rm5Var.getClass();
        if (dhn.a.contains(rm5Var)) {
            return;
        }
        try {
            gm5.c(1);
        } catch (Throwable th) {
            dhn.a(rm5Var, th);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        if (s4b1VarX.c != blc0.Wg) {
            bhn0.k("SpotifyLink ", s4b1VarX, " should be LinkType.SHOW_FIND");
            return null;
        }
        String strJ = s4b1VarX.j();
        String strM = u890.j(strJ, "find") ? "" : l1d.m("spotify:show:", strJ);
        return ((gy4) ((wf2) this.b).b).a() ? new hrn0(sh20.class, new uh20(strM), a6w0.a) : new frn0(cy30.g("uri", strM), mh20.class);
    }

    public void m(Bundle bundle) {
        if (!((bundle.getInt("previous") & 2) != 0)) {
            wf10 wf10Var = wf10.a;
            if (!wgi1.c()) {
                return;
            }
        }
        ((rm5) this.b).B(bundle, "fb_sdk_settings_changed");
    }

    public void n(Bundle bundle, String str) {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            ((rm5) this.b).y(bundle, str);
        }
    }

    public void o(String str, double d, Bundle bundle) {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            rm5 rm5Var = (rm5) this.b;
            rm5Var.getClass();
            if (dhn.a.contains(rm5Var)) {
                return;
            }
            try {
                rm5.A(rm5Var, str, Double.valueOf(d), bundle, false, og0.b());
            } catch (Throwable th) {
                dhn.a(rm5Var, th);
            }
        }
    }

    public void onInstallReferrerServiceDisconnected() {
        Logger.d("Install referrer service disconnected", new Object[0]);
    }

    public void onInstallReferrerSetupFinished(int i) {
        Object next;
        rn80 rn80Var = (rn80) this.b;
        pn80 pn80Var = rn80Var.b;
        Logger.g("InstallReferrerClient connected %d", new Object[]{Integer.valueOf(i)});
        if (i != 0) {
            if (i == 2 || i == 3) {
                Logger.d("Install referrer permanently unavailable: %d", new Object[]{Integer.valueOf(i)});
                if (pn80Var.i.h(pn80.k, false)) {
                    return;
                }
                pn80Var.e(false);
                return;
            }
            Logger.d("Transient error connecting to install referrer: %d", new Object[]{Integer.valueOf(i)});
            if (!pn80Var.i.h(pn80.k, false) && pn80Var.d("install referrer setup")) {
                pn80Var.e(false);
                return;
            }
            return;
        }
        String str = pn80Var.b;
        dma1 dma1Var = pn80Var.i;
        InstallReferrerClient installReferrerClient = rn80Var.a;
        if (installReferrerClient.isReady()) {
            try {
                String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                if (TextUtils.isEmpty(installReferrer)) {
                    Logger.g("Install referrer is empty", new Object[0]);
                    if (!dma1Var.h(pn80.k, false)) {
                        pn80Var.e(true);
                    }
                } else {
                    Logger.g("Install referrer is : %s ", new Object[]{installReferrer});
                    installReferrer.getClass();
                    Context context = pn80Var.a;
                    zwg zwgVar = pn80Var.c;
                    onv0 onv0Var = (onv0) zwgVar.a;
                    idd1 idd1Var = onv0Var.d;
                    Iterator it = ((Set) zwgVar.e).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((kn80) next).b(installReferrer));
                    kn80 kn80Var = (kn80) next;
                    String strA = kn80Var != null ? kn80Var.a(installReferrer) : null;
                    boolean z = ((onv0) zwgVar.c).a().length() == 0;
                    if (strA != null) {
                        if (z) {
                            long jB = onv0Var.c.b();
                            hma1 hma1VarEdit = ((dma1) idd1Var.getValue()).edit();
                            hma1VarEdit.d(onv0.f, strA);
                            hma1VarEdit.c(onv0.g, jB);
                            hma1VarEdit.g();
                        }
                        hma1 hma1VarEdit2 = ((dma1) idd1Var.getValue()).edit();
                        hma1VarEdit2.d(onv0.h, strA);
                        hma1VarEdit2.g();
                    }
                    pn80Var.e.p(pn80Var.d.b(), "", "open_logged_out");
                    String strB = pn80.b(installReferrer);
                    if (strB != null) {
                        hma1 hma1VarEdit3 = dma1Var.edit();
                        hma1VarEdit3.d(pn80.l, strB);
                        hma1VarEdit3.h();
                    }
                    pn80Var.a(installReferrer);
                    String strM = l1d.m("https://r.spotify.com/", Uri.decode(installReferrer));
                    Set set = s4b1.f;
                    String str2 = uic.x(strM).b;
                    if (str2 == null || str2.length() == 0) {
                        int iV0 = ihc1.v0(installReferrer, '?', 0, 6);
                        if (iV0 >= 0) {
                            installReferrer = installReferrer.substring(0, iV0);
                        }
                        if (uic.x(installReferrer).c != blc0.o6) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(installReferrer));
                            intent.setFlags(67108864);
                            intent.setClassName(context, str);
                            context.startActivity(intent);
                        }
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strM));
                        intent2.setFlags(67108864);
                        intent2.setClassName(context, str);
                        context.startActivity(intent2);
                    }
                    hma1 hma1VarEdit4 = dma1Var.edit();
                    hma1VarEdit4.a(pn80.j, true);
                    hma1VarEdit4.h();
                    Logger.g("Install referrer read", new Object[0]);
                }
                rn80Var.a();
            } catch (RemoteException unused) {
                Logger.d("Remote exception while retrieving Install referrer.", new Object[0]);
            } catch (RuntimeException e) {
                Logger.d("Install referrer unavailable: %s", new Object[]{e.getMessage()});
                if (!dma1Var.h(pn80.k, false)) {
                    pn80Var.e(false);
                }
                rn80Var.a();
            }
        }
    }

    public void p(Bundle bundle, String str) {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            ((rm5) this.b).B(bundle, str);
        }
    }

    public void q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, ylq0 ylq0Var) {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            rm5 rm5Var = (rm5) this.b;
            rm5Var.getClass();
            if (dhn.a.contains(rm5Var) || bigDecimal == null || currency == null) {
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    dhn.a(rm5Var, th);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            rm5Var.z(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, og0.b(), ylq0Var);
        }
    }

    public void r(BigDecimal bigDecimal, Currency currency, Bundle bundle, ylq0 ylq0Var) {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            rm5 rm5Var = (rm5) this.b;
            rm5Var.getClass();
            if (dhn.a.contains(rm5Var)) {
                return;
            }
            try {
                rm5Var.E(bigDecimal, currency, bundle, ylq0Var);
            } catch (Throwable th) {
                dhn.a(rm5Var, th);
            }
        }
    }

    public void s(mn21 mn21Var, ty21 ty21Var, xwn1 xwn1Var) {
        mn21Var.markDelivered();
        mn21Var.addMarker("post-response");
        ((vi7) this.b).execute(new uu1(mn21Var, ty21Var, xwn1Var, (byte) 13));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                Throwable th = (Throwable) obj;
                td30 td30Var = (td30) this.b;
                td30Var.k.d(oc00.c);
                td30Var.f.e("EventSender queue restarted after an error: " + th.getMessage(), th);
                return true;
            default:
                return ((Boolean) ((PlayerState) obj).track().i(new n110((hod0) this.b, (byte) 1)).e(Boolean.FALSE)).booleanValue();
        }
    }

    public void v(Object obj) {
        switch (this.a) {
            case 1:
                z800 z800Var = (z800) obj;
                zpr zprVar = (zpr) this.b;
                z800Var.getClass();
                String str = z800Var.c;
                String str2 = z800Var.f;
                g2z g2zVar = (g2z) zprVar.f;
                Context context = (Context) zprVar.c;
                if (zprVar.b) {
                    ((TextView) g2zVar.f).setText(String.format(context.getResources().getString(2131955774), Arrays.copyOf(new Object[]{str2, z800Var.g}, 2)));
                } else if (!u890.j((x800) zprVar.d, w800.a)) {
                    ((TextView) g2zVar.f).setText(String.format(context.getResources().getString(2131955778), Arrays.copyOf(new Object[]{str2, ""}, 2)));
                } else {
                    ((TextView) g2zVar.f).setText(String.format(context.getResources().getString(2131955778), Arrays.copyOf(new Object[]{str, ""}, 2)));
                }
                break;
            default:
                ((kqd0) this.b).Q0.setProgress(((Boolean) obj).booleanValue() ? 10 : 0);
                break;
        }
    }

    public /* synthetic */ ouz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ouz(Context context) {
        this(new rm5(context, (String) null), (byte) 17);
        this.a = (byte) 17;
    }

    public Object apply(Object obj, Object obj2) {
        List list = (List) obj2;
        ssp0 ssp0Var = (ssp0) this.b;
        return new ssp0(ssp0Var.a, ssp0Var.b, list, ssp0Var.d, ssp0Var.e, (String) obj, ssp0Var.g, ssp0Var.h, ssp0Var.i, ssp0Var.j, ssp0Var.k, true);
    }
}
