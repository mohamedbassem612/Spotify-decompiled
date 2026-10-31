package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zkd1 implements m4p0, iac0 {
    public View A1;
    public View B1;
    public dtw C1;
    public h3p0 D1;
    public dtw E1;
    public dtw F1;
    public dtw G1;
    public xab1 H1;
    public ConstraintLayout I1;
    public g2z J1;
    public final tqq0 M1;
    public final u27 N0;
    public final mdn O0;
    public xab1 O1;
    public final dpf1 P0;
    public final dfm Q0;
    public final aor R0;
    public final ynb0 S0;
    public final ynb0 T0;
    public final rzo0 U0;
    public final ynb0 V0;
    public final fbm W0;
    public final ynb0 X;
    public final i8h1 X0;
    public final ynb0 Y;
    public final l6h1 Y0;
    public final dn4 Z;
    public final n7h1 Z0;
    public final xfx a;
    public final dxy a1;
    public final cce b;
    public final ynb0 b1;
    public final sp00 c;
    public final ynb0 c1;
    public final v1k d;
    public final ynb0 d1;
    public final v1k e;
    public final ynb0 e1;
    public final k2p0 f;
    public final ynb0 f1;
    public final e68 g;
    public final ynb0 g1;
    public final FlowableMap h;
    public final ynb0 h1;
    public final duy i;
    public final ynb0 i1;
    public final ynb0 j1;
    public final ynb0 k1;
    public final a4f0 l1;
    public final uk51 m1;
    public final FlowableObserveOn n1;
    public final FlowableDistinctUntilChanged o1;
    public final x4p0 p1;
    public final iv4 q1;
    public final un4 r1;
    public final q8n s1;
    public final vsy t;
    public final spq0 t1;
    public final jpg0 v1;
    public final eyh0 w1;
    public final List x1;
    public OverlayHidingGradientBackgroundView y1;
    public ConstraintLayout z1;
    public final bjx u1 = new bjx(vkd1.f, vkd1.g, vkd1.h, vkd1.i, vkd1.t, vkd1.X, (byte) 18);
    public final ReplayProcessor K1 = ReplayProcessor.e0();
    public final idd1 L1 = new idd1(new ukd1(this, 10));
    public final tac0 N1 = new tac0(this, true);

    public zkd1(xfx xfxVar, cce cceVar, sp00 sp00Var, v1k v1kVar, v1k v1kVar2, k2p0 k2p0Var, e68 e68Var, FlowableMap flowableMap, duy duyVar, vsy vsyVar, ynb0 ynb0Var, ynb0 ynb0Var2, dn4 dn4Var, u27 u27Var, mdn mdnVar, dpf1 dpf1Var, dfm dfmVar, aor aorVar, wr30 wr30Var, ynb0 ynb0Var3, ynb0 ynb0Var4, sqq0 sqq0Var, rzo0 rzo0Var, ynb0 ynb0Var5, fbm fbmVar, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, dxy dxyVar, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11, ynb0 ynb0Var12, ynb0 ynb0Var13, ynb0 ynb0Var14, ynb0 ynb0Var15, a4f0 a4f0Var, yl1 yl1Var, o671 o671Var, v6z0 v6z0Var, v3i0 v3i0Var, uk51 uk51Var, FlowableObserveOn flowableObserveOn, FlowableJust flowableJust, FlowableDistinctUntilChanged flowableDistinctUntilChanged, x4p0 x4p0Var, iv4 iv4Var, un4 un4Var, q8n q8nVar, spq0 spq0Var) {
        this.a = xfxVar;
        this.b = cceVar;
        this.c = sp00Var;
        this.d = v1kVar;
        this.e = v1kVar2;
        this.f = k2p0Var;
        this.g = e68Var;
        this.h = flowableMap;
        this.i = duyVar;
        this.t = vsyVar;
        this.X = ynb0Var;
        this.Y = ynb0Var2;
        this.Z = dn4Var;
        this.N0 = u27Var;
        this.O0 = mdnVar;
        this.P0 = dpf1Var;
        this.Q0 = dfmVar;
        this.R0 = aorVar;
        this.S0 = ynb0Var3;
        this.T0 = ynb0Var4;
        this.U0 = rzo0Var;
        this.V0 = ynb0Var5;
        this.W0 = fbmVar;
        this.X0 = i8h1Var;
        this.Y0 = l6h1Var;
        this.Z0 = n7h1Var;
        this.a1 = dxyVar;
        this.b1 = ynb0Var6;
        this.c1 = ynb0Var7;
        this.d1 = ynb0Var8;
        this.e1 = ynb0Var9;
        this.f1 = ynb0Var10;
        this.g1 = ynb0Var11;
        this.h1 = ynb0Var12;
        this.i1 = ynb0Var13;
        this.j1 = ynb0Var14;
        this.k1 = ynb0Var15;
        this.l1 = a4f0Var;
        this.m1 = uk51Var;
        this.n1 = flowableObserveOn;
        this.o1 = flowableDistinctUntilChanged;
        this.p1 = x4p0Var;
        this.q1 = iv4Var;
        this.r1 = un4Var;
        this.s1 = q8nVar;
        this.t1 = spq0Var;
        this.v1 = new jpg0(yl1Var.a(voo1.i(xfxVar)), vkd1.d);
        this.w1 = new eyh0(v6z0Var.a(voo1.o(xfxVar)), o671.a(o671Var, voo1.u(xfxVar)), f6o1.A(new z3i0(v3i0Var.a, v3i0Var.b, v3i0Var.c, v3i0Var.d, v3i0Var.e, true), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (byte) 6);
        this.x1 = p7h.M(new lzd[]{new lzd(lkf1.d, new rr60(wr30Var, 2)), new lzd(lkf1.g, null)});
        this.M1 = new tqq0(flowableJust, sqq0Var.a, sqq0Var.b);
    }

    public static dtw b(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public static dtw c(wpw wpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, obj, (ipb1) null, 112);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        View view2;
        View view3;
        byte b = 0;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131626226, viewGroup, false);
        this.y1 = (OverlayHidingGradientBackgroundView) coordinatorLayoutInflate.findViewById(2131430262);
        this.z1 = coordinatorLayoutInflate.findViewById(2131430422);
        this.A1 = coordinatorLayoutInflate.findViewById(2131429636);
        qtw qtwVarA = f6o1.A(this.m1, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ConstraintLayout constraintLayout = this.z1;
        if (constraintLayout == null) {
            u890.C("headerContainer");
            throw null;
        }
        View view4 = b(qtwVarA, constraintLayout).w;
        ConstraintLayout constraintLayout2 = this.z1;
        if (constraintLayout2 == null) {
            u890.C("headerContainer");
            throw null;
        }
        smc0 smc0VarN = k4p1.n();
        qtw qtwVarA2 = f6o1.A(sp00.f(this.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ConstraintLayout constraintLayout3 = this.z1;
        if (constraintLayout3 == null) {
            u890.C("headerContainer");
            throw null;
        }
        smc0VarN.add(b(qtwVarA2, constraintLayout3).w);
        qtw qtwVarA3 = f6o1.A(cce.n(this.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ConstraintLayout constraintLayout4 = this.z1;
        if (constraintLayout4 == null) {
            u890.C("headerContainer");
            throw null;
        }
        smc0VarN.add(b(qtwVarA3, constraintLayout4).w);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        v1k v1kVar = this.d;
        xfx xfxVar = this.a;
        ug3 ug3VarE = v1kVar.e(voo1.l(xfxVar));
        ConstraintLayout constraintLayout5 = this.z1;
        if (constraintLayout5 == null) {
            u890.C("headerContainer");
            throw null;
        }
        View view5 = b(ug3VarE, constraintLayout5).w;
        smc0 smc0VarN2 = k4p1.n();
        smc0VarN2.add(view4);
        dfm dfmVarF = this.e.f(this.n1, this.W0, voo1.m(xfxVar));
        ConstraintLayout constraintLayout6 = this.z1;
        if (constraintLayout6 == null) {
            u890.C("headerContainer");
            throw null;
        }
        smc0VarN2.add(b(dfmVarF, constraintLayout6).w);
        eth.O(constraintLayout2, smc0VarK, view5, k4p1.k(smc0VarN2));
        dvs dvsVar = new dvs(xfxVar.c.b);
        dvsVar.q(this.f.a(this.x1, ((z4p0) this.L1.getValue()).f, new k7b1(1, this.K1, ReplayProcessor.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 9)));
        if (this.Z.c()) {
            view = b(ekf1.a((ekf1) this.Y.get(), dvsVar), coordinatorLayoutInflate).w;
        } else {
            this.D1 = new h3p0(dvsVar, ktf1.a((ktf1) this.X.get()));
            view = dvsVar.a;
        }
        k8p1.o(coordinatorLayoutInflate.findViewById(2131431593), view);
        ConstraintLayout constraintLayoutFindViewById = coordinatorLayoutInflate.findViewById(2131431474);
        LinearLayout linearLayout = (LinearLayout) coordinatorLayoutInflate.findViewById(2131428854);
        iv4 iv4Var = this.q1;
        boolean zB = iv4Var.b();
        a4f0 a4f0Var = this.l1;
        if (zB) {
            view2 = null;
        } else {
            constraintLayoutFindViewById.getClass();
            view2 = c(f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById, new q491(6, new qcs(linearLayout, (byte) 1))).w;
        }
        constraintLayoutFindViewById.getClass();
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(constraintLayoutFindViewById.getContext(), constraintLayoutFindViewById, this.P0, (drw) null, 24);
        this.B1 = dtwVarD.w;
        this.C1 = dtwVarD;
        dtw dtwVarD2 = mhc.d(constraintLayoutFindViewById.getContext(), constraintLayoutFindViewById, this.N0.a(this.K1.j(this.O0).J(e2x0.S0)), (drw) null, 24);
        this.G1 = dtwVarD2;
        View view6 = dtwVarD2.w;
        View view7 = this.B1;
        if (view7 == null) {
            u890.C("trackInfoView");
            throw null;
        }
        linearLayout.getClass();
        eth.R(constraintLayoutFindViewById, view6, view7, view2, linearLayout, b(this.v1, constraintLayoutFindViewById).w, (View) null);
        View viewFindViewById = coordinatorLayoutInflate.findViewById(2131430907);
        viewFindViewById.getClass();
        ViewParent parent = viewFindViewById.getParent();
        ukd1 ukd1Var = new ukd1(this, b);
        ukd1 ukd1Var2 = new ukd1(this, (byte) 1);
        dxy dxyVar = this.a1;
        k8p1.o(viewFindViewById, b(dxyVar.t(ukd1Var, ukd1Var2, 1), (ViewGroup) parent).w);
        ConstraintLayout constraintLayoutFindViewById2 = coordinatorLayoutInflate.findViewById(2131429135);
        constraintLayoutFindViewById2.getClass();
        smc0 smc0VarN3 = k4p1.n();
        tka0 tka0Var2 = dtw.C;
        dtw dtwVarD3 = mhc.d(constraintLayoutFindViewById2.getContext(), constraintLayoutFindViewById2, this.g.a(), (drw) null, 24);
        this.E1 = dtwVarD3;
        smc0VarN3.add(dtwVarD3.w);
        byte b2 = 2;
        smc0VarN3.add(c(f6o1.A(duy.a(this.i, 2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById2, new euy(true)).w);
        dtw dtwVarD4 = mhc.d(constraintLayoutFindViewById2.getContext(), constraintLayoutFindViewById2, fdg1.m0(vsy.a(this.t), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        this.F1 = dtwVarD4;
        smc0VarN3.add(dtwVarD4.w);
        wpw wpwVarA = f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        if (!iv4Var.b()) {
            wpwVarA = null;
        }
        if (wpwVarA != null && (view3 = c(wpwVarA, constraintLayoutFindViewById2, new q491(3, null)).w) != null) {
            smc0VarN3.add(view3);
        }
        eth.P(constraintLayoutFindViewById2, k4p1.k(smc0VarN3));
        ConstraintLayout constraintLayoutFindViewById3 = coordinatorLayoutInflate.findViewById(2131430418);
        this.I1 = constraintLayoutFindViewById3;
        byte b3 = 3;
        wpw wpwVarT = dxyVar.t(new ukd1(this, (byte) 8), new ukd1(this, (byte) 9), 3);
        ConstraintLayout constraintLayout7 = this.I1;
        if (constraintLayout7 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view8 = b(wpwVarT, constraintLayout7).w;
        wpw wpwVarT2 = dxyVar.t(new ukd1(this, b2), new ukd1(this, b3), 3);
        ConstraintLayout constraintLayout8 = this.I1;
        if (constraintLayout8 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view9 = b(wpwVarT2, constraintLayout8).w;
        ConstraintLayout constraintLayout9 = this.I1;
        if (constraintLayout9 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view10 = c(this.Q0, constraintLayout9, new jpt0((ipt0) null, 1)).w;
        wpw wpwVarT3 = dxyVar.t(new ukd1(this, (byte) 4), new ukd1(this, (byte) 5), 3);
        ConstraintLayout constraintLayout10 = this.I1;
        if (constraintLayout10 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view11 = b(wpwVarT3, constraintLayout10).w;
        wpw wpwVarT4 = dxyVar.t(new ukd1(this, (byte) 6), new ukd1(this, (byte) 7), 3);
        ConstraintLayout constraintLayout11 = this.I1;
        if (constraintLayout11 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        eth.Q(constraintLayoutFindViewById3, view8, view9, view10, view11, b(wpwVarT4, constraintLayout11).w);
        ViewStub viewStub = (ViewStub) coordinatorLayoutInflate.findViewById(2131428189);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewStub.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        View view12 = c(f6o1.A(this.R0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewStub.getParent(), new f3l(0.0f, 4089, false)).w;
        view12.setClickable(true);
        k8p1.o(viewStub, view12);
        View viewFindViewById2 = coordinatorLayoutInflate.findViewById(2131430421);
        gs71 gs71Var = (gs71) this.t1.h();
        if (gs71Var != null) {
            ViewStub viewStub2 = (ViewStub) coordinatorLayoutInflate.findViewById(2131427943);
            k8p1.o(viewStub2, c(f6o1.A(gs71Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewStub2.getParent(), new tr71(gr71.a)).w);
        }
        ConstraintLayout constraintLayoutFindViewById4 = coordinatorLayoutInflate.findViewById(2131427416);
        constraintLayoutFindViewById4.getClass();
        eyh0 eyh0Var = this.w1;
        eth.N(b((bs0) eyh0Var.b, constraintLayoutFindViewById4).w, b((im0) eyh0Var.c, constraintLayoutFindViewById4).w, b((qtw) eyh0Var.d, constraintLayoutFindViewById4).w, constraintLayoutFindViewById4);
        this.J1 = rzo0.o(this.U0, this.o1);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.y1;
        if (overlayHidingGradientBackgroundView == null) {
            u890.C("modeRootView");
            throw null;
        }
        overlayHidingGradientBackgroundView.setOverlayView(coordinatorLayoutInflate.findViewById(2131431592));
        View viewFindViewById3 = coordinatorLayoutInflate.findViewById(2131430995);
        if (viewFindViewById3 != null) {
            k8p1.o(viewFindViewById3, c(f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById3.getParent(), new q491(5, null)).w);
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.y1;
        if (overlayHidingGradientBackgroundView2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        ConstraintLayout constraintLayout12 = this.z1;
        if (constraintLayout12 == null) {
            u890.C("headerContainer");
            throw null;
        }
        ConstraintLayout constraintLayout13 = this.I1;
        if (constraintLayout13 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        j7p1.x(overlayHidingGradientBackgroundView2, new wkd1(this, (byte) 0));
        j7p1.x(constraintLayout12, new wkd1(this, (byte) 1));
        j7p1.x(view, new wkd1(this, (byte) 2));
        j7p1.x(constraintLayoutFindViewById, new wkd1(this, (byte) 3));
        j7p1.x(constraintLayout13, new wkd1(this, (byte) 4));
        if (viewFindViewById2 != null) {
            j7p1.x(viewFindViewById2, new wkd1(this, (byte) 5));
        }
        x9p1.p(coordinatorLayoutInflate, this);
        op80 jp80Var = new jp80(coordinatorLayoutInflate);
        op80 eq80Var = new eq80(new e3h1(this.Y0, this.Z0, this.X0));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(coordinatorLayoutInflate, jp80Var);
        this.N1.i(w8c0.b);
        return coordinatorLayoutInflate;
    }

    public final void destroy() {
        this.N1.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.N1;
    }

    public final void start() {
        this.N1.i(w8c0.e);
        this.M1.a();
        ww9 ww9Var = (ww9) this.S0.get();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.y1;
        lnm lnmVar = null;
        if (overlayHidingGradientBackgroundView == null) {
            u890.C("modeRootView");
            throw null;
        }
        ww9Var.a(new w0y(overlayHidingGradientBackgroundView, (byte) 2));
        ((h280) this.T0.get()).b(Flowable.I(i280.c));
        g2z g2zVar = this.J1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.y1;
        if (overlayHidingGradientBackgroundView2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        g2zVar.J(overlayHidingGradientBackgroundView2);
        ((f3x) this.V0.get()).a();
        h3p0 h3p0Var = this.D1;
        if (h3p0Var != null) {
            h3p0Var.a();
        }
        xab1 xab1Var = this.H1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.H1 = fn31.T(cto1.q(this), (o8n) null, 0, new ykd1(this, lnmVar, (byte) 0), 3);
        xab1 xab1Var2 = this.O1;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.O1 = fn31.T(cto1.q(this), (o8n) null, 0, new ykd1(this, lnmVar, (byte) 1), 3);
    }

    public final void stop() {
        this.N1.i(w8c0.c);
        this.M1.b();
        ww9 ww9Var = (ww9) this.S0.get();
        ww9Var.c.a();
        ww9Var.d = null;
        ((h280) this.T0.get()).c();
        g2z g2zVar = this.J1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        g2zVar.K();
        ((f3x) this.V0.get()).f.c();
        xab1 xab1Var = this.H1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        h3p0 h3p0Var = this.D1;
        if (h3p0Var != null) {
            h3p0Var.b();
        }
        xab1 xab1Var2 = this.O1;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
    }
}
