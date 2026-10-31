package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import com.spotify.home.evopage.mobius.State;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t3x extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3x(ImageView imageView, Guideline guideline, fyy fyyVar) {
        super(0);
        this.a = (byte) 10;
        this.b = imageView;
        this.c = guideline;
    }

    public final Object invoke() {
        wls0 wls0Var;
        boolean zD;
        x7i1 x7i1Var;
        x7i1 x7i1Var2;
        Integer num;
        SparseArray<Parcelable> sparseParcelableArray;
        chm0 model;
        String str;
        switch (this.a) {
            case 0:
                ((CopyOnWriteArraySet) ((zeu) this.b).a).remove((m42) this.c);
                return rih1.a;
            case 1:
                mfx mfxVar = (mfx) ((q811) this.b).a;
                if (mfxVar == null || ((Boolean) mfxVar.invoke(xy71.a)).booleanValue()) {
                    ((scx) this.c).a();
                }
                return rih1.a;
            case 2:
                bhx bhxVar = (bhx) this.b;
                if (bhxVar.e) {
                    ((ygx) this.c).b.b.invoke();
                    bhxVar.a();
                }
                return rih1.a;
            case 3:
                vzx vzxVar = (vzx) this.b;
                return vzxVar.b.X(new wcr((lkd) this.c, (byte) 25)).J(new xap(vzxVar, (byte) 28));
            case 4:
                ((iu30) this.b).invoke(new j2y((rpu) this.c));
                return rih1.a;
            case 5:
                ((iu30) this.b).invoke((t3y) this.c);
                return rih1.a;
            case 6:
                ((vu30) this.b).invoke(((f5y) this.c).a, (Object) null);
                return rih1.a;
            case 7:
                ((iu30) this.b).invoke(new hoy(((loy) this.c).a));
                return rih1.a;
            case 8:
                kvy kvyVar = (kvy) this.b;
                mcn1 mcn1Var = kvyVar.h;
                i1r i1rVarN = x2p1.n((d0r) this.c, kvyVar.k, kvyVar.b);
                i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
                return mcn1Var.a(i1rVar != null ? (qxc0) i1rVar.a : null);
            case 9:
                return new kpg0((xpw) ((zwy) this.b).a.invoke((oud) this.c), auy.Z0);
            case 10:
                return Float.valueOf(fyy.i((ImageView) this.b, (Guideline) this.c));
            case 11:
                hur hurVar = (hur) this.b;
                return ((iir) ((dp5) hurVar.b).b).h((String) hurVar.c).distinctUntilChanged().flatMap(m9h.a1).distinctUntilChanged().onErrorReturn(uwg.e1).filter(m9h.f1).map(new l7c((c9c) this.c, (byte) 9));
            case 12:
                d9z d9zVar = (d9z) this.b;
                o860 o860Var = d9zVar.k;
                i1r i1rVarN2 = x2p1.n((d0r) this.c, d9zVar.p, d9zVar.c);
                i1r i1rVar2 = i1rVarN2 instanceof i1r ? i1rVarN2 : null;
                qxc0 qxc0Var = i1rVar2 != null ? (qxc0) i1rVar2.a : null;
                c8c0 c8c0Var = (c8c0) o860Var.c;
                boolean z = !(c8c0Var == c8c0.c || c8c0Var == c8c0.b || c8c0Var == c8c0.f);
                a821 a821Var = (qxc0Var == null || (x7i1Var2 = qxc0Var.t) == null || !x7i1Var2.b) ? b821.a : new a821((String) o860Var.b);
                Boolean bool = ((xi90) o860Var.e).b;
                if (bool != null) {
                    zD = bool.booleanValue();
                } else {
                    mp8 mp8Var = (mp8) o860Var.d;
                    String str2 = qxc0Var != null ? qxc0Var.e : null;
                    if (qxc0Var == null || (wls0Var = qxc0Var.i) == null) {
                        wls0Var = wls0.b;
                    }
                    zD = mp8Var.d(str2, wls0Var);
                }
                return new z8z(z, (qxc0Var == null || (x7i1Var = qxc0Var.t) == null || !x7i1Var.b) ? false : true, zD, a821Var, 82);
            case 13:
                ViewGroup viewGroup = (ViewGroup) this.b;
                ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131625355, viewGroup, false);
                int i = 2131428715;
                Space space = (Space) m5n1.t(constraintLayoutL, 2131428715);
                if (space != null) {
                    ConstraintLayout constraintLayout = constraintLayoutL;
                    int i2 = 2131429096;
                    View viewT = m5n1.t(constraintLayoutL, 2131429096);
                    if (viewT != null) {
                        i2 = 2131430614;
                        RecyclerView recyclerViewT = m5n1.t(constraintLayoutL, 2131430614);
                        if (recyclerViewT != null) {
                            c6r0 c6r0Var = new c6r0(constraintLayout, space, viewT, recyclerViewT);
                            yzu yzuVar = (yzu) this.c;
                            viewGroup.getContext();
                            recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                            recyclerViewT.setAdapter((mez) yzuVar.a);
                            recyclerViewT.j(new c711(viewGroup.getContext()));
                            rwq0.s(recyclerViewT, gft.X0);
                            return c6r0Var;
                        }
                    }
                    i = i2;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i)));
                return null;
            case 14:
                Space space2 = ((c6r0) ((idd1) ((yzu) this.b).b).getValue()).b;
                yxr yxrVar = new yxr(((xfx) this.c).i.a, (byte) 0);
                k8p1.o(space2, yxrVar.getView());
                yxrVar.getView().setPaddingRelative(space2.getPaddingStart(), space2.getPaddingTop(), space2.getPaddingEnd(), space2.getPaddingBottom());
                return yxrVar;
            case 15:
                View yy9Var = new yy9((Context) this.b);
                tlv tlvVar = (EqualizerView) this.c;
                yy9Var.setId(View.generateViewId());
                tlvVar.addView(yy9Var);
                return yy9Var;
            case 16:
                i7d i7dVar = (i7d) this.b;
                d0r d0rVarC = cwl1.C((q7r0) i7dVar.i);
                u9u0 u9u0Var = (u9u0) i7dVar.t;
                afp afpVar = (afp) this.c;
                afpVar.getClass();
                lzn0 lzn0VarC = ((vh00) ((h72) afpVar.a.c).b).c();
                c8o.l(lzn0VarC);
                return new l63(lzn0VarC, u9u0Var, d0rVarC);
            case 17:
                return ((mmr) this.b).a(cwl1.C((q7r0) ((i7d) this.c).i));
            case 18:
                return ((k7p) ((jly0) new b6p(((nmr) this.b).a).c).get()).a(cwl1.C((q7r0) ((i7d) this.c).i));
            case 19:
                return ((bnr) this.b).a(cwl1.C((q7r0) ((i7d) this.c).i));
            case 20:
                wo60 wo60Var = ((el00) this.b).c.h;
                Map map = (Map) this.c;
                synchronized (wo60Var) {
                    try {
                        wo60Var.d.putAll(map);
                        uo60 uo60Var = wo60Var.c;
                        if (uo60Var != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                String str3 = (String) entry.getKey();
                                int iIntValue = ((Number) entry.getValue()).intValue();
                                vo60 vo60Var = (vo60) uo60Var.i.get(str3);
                                if (vo60Var != null) {
                                    if (vo60Var.e == null || (num = vo60Var.f) == null || num.intValue() != iIntValue) {
                                        vo60Var = null;
                                    }
                                    if (vo60Var != null) {
                                        wma1 wma1Var = vo60Var.e;
                                        if (wma1Var != null) {
                                            wma1Var.a((Long) null);
                                        }
                                        vo60Var.e = null;
                                        vo60Var.f = null;
                                        vo60Var.p = true;
                                        if (uo60Var.j == null) {
                                            uo60Var.j = str3;
                                            uo60Var.c.setAttribute("first_presented_slot", str3);
                                            hhp0.a.t("page.home.slot_loading", "first_slot_presented", sqg0.J(new mmr0[]{new mmr0("load_id", uo60Var.a.toString()), new mmr0("slot_type", str3)}));
                                        }
                                    }
                                }
                            }
                            wo60Var.f(uo60Var.a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
            case 21:
                el00 el00Var = (el00) this.b;
                Bundle bundle = (Bundle) this.c;
                if (bundle != null && (sparseParcelableArray = bundle.getSparseParcelableArray("view_state")) != null) {
                    el00Var.T0.restoreHierarchyState(sparseParcelableArray);
                }
                el00Var.Q0.m((Object) null, Boolean.TRUE);
                return rih1.a;
            case 22:
                el00 el00Var2 = (el00) this.b;
                Map map2 = b7x.a;
                boolean z2 = el00Var2.P0;
                if (z2) {
                    qe91 qe91Var = (qe91) el00Var2.R0.f.getValue();
                    Map mapD = qe91Var != null ? qe91Var.d() : null;
                    if (mapD != null) {
                        map2 = mapD;
                    }
                }
                el00Var2.b(map2);
                rnc0 rnc0Var = (rnc0) this.c;
                rnc0Var.getClass();
                Runnable runnable = el00Var2.e1;
                tp60 tp60Var = el00Var2.g;
                RecyclerView recyclerView = el00Var2.T0;
                tj00 tj00Var = el00Var2.c;
                Object objE = tj00Var.Q0.e();
                State.Content content = objE instanceof State.Content ? (State.Content) objE : null;
                String str4 = (content == null || (model = content.getModel()) == null) ? null : model.f;
                boolean z3 = (str4 == null || str4.equals(el00Var2.b1)) ? false : true;
                el00Var2.b1 = str4;
                recyclerView.removeCallbacks(runnable);
                if (z3 || z2) {
                    recyclerView.setItemAnimator((e611) null);
                }
                dq60 dq60Var = tj00Var.Z0;
                boolean zF = tp60Var.f(dq60Var);
                try {
                    el00Var2.W0.b(rnc0Var);
                    if (zF) {
                        tp60Var.a(dq60Var);
                    }
                    if (recyclerView.getItemAnimator() == null) {
                        recyclerView.postDelayed(runnable, 500L);
                    }
                    u0p1.s(recyclerView, oxx.a1, new yk00(el00Var2, (byte) 2));
                    return rih1.a;
                } catch (Throwable th2) {
                    if (zF) {
                        tp60Var.a(dq60Var);
                    }
                    throw th2;
                }
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((iu30) this.b).invoke((vp00) this.c);
                return rih1.a;
            case 24:
                return Boolean.valueOf(((Boolean) ((ven0) this.c).getValue()).booleanValue() && (str = ((nq00) this.b).d) != null && str.length() > 0);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((iu30) this.b).invoke(new vw00(((tx00) this.c).b));
                return rih1.a;
            case 26:
                vy00 vy00Var = (vy00) this.b;
                xgp xgpVar = vy00Var.a;
                boolean z4 = vy00Var.f;
                uny unyVar = new uny(new y0u(0, vy00Var.b, buc1.class, "hide", "hide()V", 0, (byte) 22), new xh00(vy00Var, (bct) this.c, (byte) 3));
                c21 c21Var = (c21) xgpVar.a.c;
                bct bctVar = (bct) c21Var.c;
                ygp ygpVar = (ygp) ((jly0) c21Var.e).get();
                qop qopVar = (qop) c21Var.b;
                lik1 lik1VarG = qopVar.g();
                n6r0 n6r0Var = qopVar.c;
                c8o.l(n6r0Var);
                k0q k0qVar = (k0q) c21Var.d;
                daq daqVar = k0qVar.a;
                Flowable flowable = (Flowable) daqVar.D5.get();
                c8o.l(flowable);
                ag90 ag90Var = new ag90(flowable);
                teq teqVar = k0qVar.b;
                z6k0 z6k0Var = (z6k0) teqVar.Z5.get();
                c8o.l(z6k0Var);
                bct bctVar2 = (bct) c21Var.c;
                koc0 koc0Var = bctVar2.d;
                mnk0 mnk0Var = (mnk0) teqVar.b6.get();
                c8o.l(mnk0Var);
                yeu0 yeu0Var = new yeu0(z6k0Var, koc0Var, mnk0Var);
                dxz0 dxz0Var = (dxz0) daqVar.I4.get();
                c8o.l(dxz0Var);
                n4b n4bVar = new n4b(dxz0Var, (byte) 14);
                String strD = qopVar.d();
                mnk0 mnk0Var2 = (mnk0) teqVar.b6.get();
                c8o.l(mnk0Var2);
                fdc fdcVar = new fdc(strD, bctVar2, mnk0Var2, c21Var.b().c());
                b7n b7nVar = (b7n) daqVar.L4.get();
                c8o.l(b7nVar);
                o241 o241Var = (o241) daqVar.u4.get();
                c8o.l(o241Var);
                yh2 yh2Var = (yh2) teqVar.f3.get();
                c8o.l(yh2Var);
                v1k v1kVar = new v1k(b7nVar, o241Var, yh2Var, (byte) 11);
                xvo xvoVar = (xvo) daqVar.H8.get();
                c8o.l(xvoVar);
                bjx bjxVar = new bjx((Object) ag90Var, (Object) yeu0Var, (Object) n4bVar, (Object) fdcVar, (Object) v1kVar, (Object) new xap(xvoVar, (byte) 27), (byte) 2);
                zgp zgpVar = (zgp) ((jly0) c21Var.f).get();
                yqg yqgVar = (yqg) daqVar.J1.get();
                c8o.l(yqgVar);
                muz muzVarE = qopVar.e();
                rlu0 rlu0Var = new rlu0(qopVar.g(), u1n0.l((q7r0) ((uap) qopVar.a.b).H));
                b7r0 b7r0Var = (b7r0) daqVar.p7.get();
                c8o.l(b7r0Var);
                yon yonVar = new yon(yqgVar, muzVarE, rlu0Var, b7r0Var, (byte) 7);
                kt91 kt91Var = (kt91) daqVar.f8.get();
                c8o.l(kt91Var);
                l5x0 l5x0Var = new l5x0(kt91Var, (byte) 4);
                so soVar = new so(qopVar.e(), new rlu0(qopVar.g(), u1n0.l((q7r0) ((uap) qopVar.a.b).H)), (byte) 27);
                lik1 lik1VarG2 = qopVar.g();
                ssf1 ssf1Var = (ssf1) teqVar.g6.get();
                c8o.l(ssf1Var);
                z0u0 z0u0Var = new z0u0(lik1VarG2, ssf1Var, (byte) 14);
                lik1 lik1VarG3 = qopVar.g();
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                iyc0 iyc0Var = (iyc0) teqVar.g1.get();
                c8o.l(iyc0Var);
                zd1 zd1Var = new zd1(lik1VarG3, context, iyc0Var, (byte) 0);
                Scheduler scheduler = (Scheduler) daqVar.z1.get();
                c8o.l(scheduler);
                Flowable flowable2 = (Flowable) daqVar.D5.get();
                c8o.l(flowable2);
                r5h r5hVar = (r5h) daqVar.h7.get();
                c8o.l(r5hVar);
                t7y t7yVar = new t7y(r5hVar);
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                c8o.l(retrofitMaker);
                vlu0 vlu0Var = (vlu0) retrofitMaker.createWebgateService(vlu0.class, "android-list-ux-platform-consumers-standard-sections-extender");
                iyc0 iyc0Var2 = (iyc0) teqVar.g1.get();
                c8o.l(iyc0Var2);
                b020 b020Var = new b020(flowable2, t7yVar, vlu0Var, iyc0Var2, c21Var.b().c());
                x290 x290Var = (x290) teqVar.q8.get();
                c8o.l(x290Var);
                a381 a381Var = new a381(x290Var.a(), (byte) 1);
                y390 y390Var = (y390) teqVar.o3.get();
                c8o.l(y390Var);
                g1b g1bVar = new g1b(yonVar, l5x0Var, soVar, z0u0Var, zd1Var, scheduler, b020Var, a381Var, new o481(y390Var.a(qopVar.c(), bctVar2.e), (byte) 0));
                ahp ahpVar = (ahp) ((jly0) c21Var.g).get();
                Scheduler scheduler2 = (Scheduler) daqVar.z1.get();
                c8o.l(scheduler2);
                Scheduler scheduler3 = (Scheduler) daqVar.r3.get();
                c8o.l(scheduler3);
                op4 op4VarB = c21Var.b();
                bhp bhpVar = (bhp) ((jly0) c21Var.h).get();
                yqg yqgVar2 = (yqg) daqVar.J1.get();
                c8o.l(yqgVar2);
                return new az00(bctVar, ygpVar, lik1VarG, n6r0Var, bjxVar, zgpVar, g1bVar, ahpVar, scheduler2, scheduler3, op4VarB, bhpVar, yqgVar2, c21Var.b().b(), c21Var.b().c(), z4, unyVar);
            case 27:
                return Boolean.valueOf(u890.j((String) ((ven0) this.c).getValue(), ((ee21) this.b).a.getId()));
            case 28:
                ((Context) this.b).unregisterReceiver((jlb) this.c);
                return rih1.a;
            default:
                return (mr20) ((js20) this.b).a.invoke(((is20) this.c).d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3x(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
