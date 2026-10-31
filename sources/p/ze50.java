package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ze50 implements m4p0, iac0 {
    public final yl1 N0;
    public final ppd0 O0;
    public final s691 P0;
    public final dfm Q0;
    public final k691 R0;
    public final o671 S0;
    public final aor T0;
    public final ynb0 U0;
    public final ynb0 V0;
    public final ynb0 W0;
    public final FlowableJust X;
    public final ynb0 X0;
    public final fbm Y;
    public final ynb0 Y0;
    public final r5z Z;
    public final rzo0 Z0;
    public final xfx a;
    public final FlowableJust a1;
    public final cce b;
    public final i8h1 b1;
    public final sp00 c;
    public final l6h1 c1;
    public final ynb0 d;
    public final n7h1 d1;
    public final ynb0 e;
    public final x4p0 e1;
    public final dn4 f;
    public final lik1 f1;
    public final upd0 g;
    public CoordinatorLayout g1;
    public final k2p0 h;
    public PeekScrollView h1;
    public final v1k i;
    public OverlayHidingGradientBackgroundView i1;
    public ScrollCardsContainer j1;
    public g2z k1;
    public rok0 l1;
    public final ArrayList m1 = new ArrayList();
    public final tac0 n1 = new tac0(this, true);
    public final idd1 o1 = new idd1(new g050(this, (byte) 7));
    public final bjx p1 = new bjx(new ye50(this, (byte) 6), r850.Q0, r850.R0, r850.S0, r850.T0, r850.U0, (byte) 18);
    public final v1k t;

    public ze50(xfx xfxVar, cce cceVar, sp00 sp00Var, ynb0 ynb0Var, ynb0 ynb0Var2, dn4 dn4Var, upd0 upd0Var, k2p0 k2p0Var, v1k v1kVar, v1k v1kVar2, FlowableJust flowableJust, fbm fbmVar, r5z r5zVar, yl1 yl1Var, ppd0 ppd0Var, s691 s691Var, dfm dfmVar, k691 k691Var, o671 o671Var, v6z0 v6z0Var, aor aorVar, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, rzo0 rzo0Var, FlowableJust flowableJust2, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, lqc lqcVar, x4p0 x4p0Var, lik1 lik1Var) {
        this.a = xfxVar;
        this.b = cceVar;
        this.c = sp00Var;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = dn4Var;
        this.g = upd0Var;
        this.h = k2p0Var;
        this.i = v1kVar;
        this.t = v1kVar2;
        this.X = flowableJust;
        this.Y = fbmVar;
        this.Z = r5zVar;
        this.N0 = yl1Var;
        this.O0 = ppd0Var;
        this.P0 = s691Var;
        this.Q0 = dfmVar;
        this.R0 = k691Var;
        this.S0 = o671Var;
        this.T0 = aorVar;
        this.U0 = ynb0Var3;
        this.V0 = ynb0Var4;
        this.W0 = ynb0Var5;
        this.X0 = ynb0Var6;
        this.Y0 = ynb0Var7;
        this.Z0 = rzo0Var;
        this.a1 = flowableJust2;
        this.b1 = i8h1Var;
        this.c1 = l6h1Var;
        this.d1 = n7h1Var;
        this.e1 = x4p0Var;
        this.f1 = lik1Var;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        xfx xfxVar = this.a;
        wfx wfxVar = xfxVar.c;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131625062, viewGroup, false);
        this.g1 = coordinatorLayoutInflate;
        x9p1.p(coordinatorLayoutInflate, this);
        CoordinatorLayout coordinatorLayout = this.g1;
        if (coordinatorLayout == null) {
            u890.C("rootView");
            throw null;
        }
        op80 jp80Var = new jp80(coordinatorLayout);
        i8h1 i8h1Var = this.b1;
        op80 eq80Var = new eq80(new e3h1(this.c1, this.d1, i8h1Var));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(coordinatorLayout, jp80Var);
        this.n1.i(w8c0.b);
        CoordinatorLayout coordinatorLayout2 = this.g1;
        if (coordinatorLayout2 == null) {
            u890.C("rootView");
            throw null;
        }
        PeekScrollView peekScrollView = (PeekScrollView) coordinatorLayout2.findViewById(2131430778);
        this.h1 = peekScrollView;
        this.l1 = new rok0(peekScrollView);
        CoordinatorLayout coordinatorLayout3 = this.g1;
        if (coordinatorLayout3 == null) {
            u890.C("rootView");
            throw null;
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) coordinatorLayout3.findViewById(2131430262);
        this.i1 = overlayHidingGradientBackgroundView;
        overlayHidingGradientBackgroundView.setOverlayDisplayMode(ivq0.b);
        CoordinatorLayout coordinatorLayout4 = this.g1;
        if (coordinatorLayout4 == null) {
            u890.C("rootView");
            throw null;
        }
        CoordinatorLayout coordinatorLayout5 = this.g1;
        if (coordinatorLayout5 == null) {
            u890.C("rootView");
            throw null;
        }
        this.j1 = coordinatorLayout5.findViewById(2131431706);
        CoordinatorLayout coordinatorLayout6 = this.g1;
        if (coordinatorLayout6 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById = coordinatorLayout6.findViewById(2131428187);
        viewFindViewById.getClass();
        View view = c(f6o1.A(this.T0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById.getParent(), new f3l(0.0f, 4095, false)).w;
        view.setClickable(true);
        k8p1.o(viewFindViewById, view);
        CoordinatorLayout coordinatorLayout7 = this.g1;
        if (coordinatorLayout7 == null) {
            u890.C("rootView");
            throw null;
        }
        ConstraintLayout constraintLayoutFindViewById = coordinatorLayout7.findViewById(2131430422);
        constraintLayoutFindViewById.getClass();
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(b(f6o1.A(sp00.f(this.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById).w);
        smc0VarN.add(b(f6o1.A(cce.n(this.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById).w);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        View view2 = b(this.i.e(voo1.l(xfxVar)), constraintLayoutFindViewById).w;
        smc0 smc0VarN2 = k4p1.n();
        smc0VarN2.add(b(this.t.f(this.X, this.Y, voo1.m(xfxVar)), constraintLayoutFindViewById).w);
        eth.O(constraintLayoutFindViewById, smc0VarK, view2, k4p1.k(smc0VarN2));
        dvs dvsVar = new dvs(wfxVar.b);
        dvsVar.q(this.h.a(p7h.M(new lzd[]{new lzd(lkf1.e, null), new lzd(lkf1.g, null)}), ((z4p0) this.o1.getValue()).f, pzo0.f));
        dn4 dn4Var = this.f;
        boolean zC = dn4Var.c();
        CoordinatorLayout coordinatorLayout8 = this.g1;
        pkf1 pkf1Var = dvsVar.a;
        if (zC) {
            if (coordinatorLayout8 == null) {
                u890.C("rootView");
                throw null;
            }
            View viewFindViewById2 = coordinatorLayout8.findViewById(2131431465);
            im0 im0VarA = ekf1.a((ekf1) this.e.get(), dvsVar);
            OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.i1;
            if (overlayHidingGradientBackgroundView2 == null) {
                u890.C("modeRootView");
                throw null;
            }
            k8p1.o(viewFindViewById2, b(im0VarA, overlayHidingGradientBackgroundView2).w);
        } else {
            if (coordinatorLayout8 == null) {
                u890.C("rootView");
                throw null;
            }
            k8p1.o(coordinatorLayout8.findViewById(2131431465), pkf1Var);
        }
        p0s p0sVar = new p0s(wfxVar.b, (byte) 0);
        CoordinatorLayout coordinatorLayout9 = this.g1;
        if (coordinatorLayout9 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewN = b8k1.n(coordinatorLayout9, 2131431475);
        View view3 = p0sVar.b;
        k8p1.o(viewN, view3);
        CoordinatorLayout coordinatorLayout10 = this.g1;
        if (coordinatorLayout10 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewN2 = b8k1.n(coordinatorLayout10, 2131427521);
        viewN2.getClass();
        k8p1.o(viewN2, c(this.N0.a(voo1.i(xfxVar)), (ViewGroup) viewN2.getParent(), new sl1(true)).w);
        CoordinatorLayout coordinatorLayout11 = this.g1;
        if (coordinatorLayout11 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewN3 = b8k1.n(coordinatorLayout11, 2131431488);
        viewN3.getClass();
        k8p1.o(viewN3, b(this.g, (ViewGroup) viewN3.getParent()).w);
        b6s b6sVar = new b6s(wfxVar.b, (byte) 0);
        CoordinatorLayout coordinatorLayout12 = this.g1;
        if (coordinatorLayout12 == null) {
            u890.C("rootView");
            throw null;
        }
        k8p1.o(b8k1.n(coordinatorLayout12, 2131429814), b6sVar.b);
        CoordinatorLayout coordinatorLayout13 = this.g1;
        if (coordinatorLayout13 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById3 = coordinatorLayout13.findViewById(2131430418);
        CoordinatorLayout coordinatorLayout14 = this.g1;
        if (coordinatorLayout14 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById4 = coordinatorLayout14.findViewById(2131430492);
        viewFindViewById4.getClass();
        k8p1.o(viewFindViewById4, b(this.P0.a(voo1.s(xfxVar)), (ViewGroup) viewFindViewById4.getParent()).w);
        CoordinatorLayout coordinatorLayout15 = this.g1;
        if (coordinatorLayout15 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById5 = coordinatorLayout15.findViewById(2131430407);
        viewFindViewById5.getClass();
        k8p1.o(viewFindViewById5, c(this.Q0, (ViewGroup) viewFindViewById5.getParent(), new jpt0((ipt0) null, 3)).w);
        CoordinatorLayout coordinatorLayout16 = this.g1;
        if (coordinatorLayout16 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById6 = coordinatorLayout16.findViewById(2131430141);
        viewFindViewById6.getClass();
        k8p1.o(viewFindViewById6, b(this.R0.a(voo1.r(xfxVar)), (ViewGroup) viewFindViewById6.getParent()).w);
        CoordinatorLayout coordinatorLayout17 = this.g1;
        if (coordinatorLayout17 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById7 = coordinatorLayout17.findViewById(2131429039);
        CoordinatorLayout coordinatorLayout18 = this.g1;
        if (coordinatorLayout18 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById8 = coordinatorLayout18.findViewById(2131430938);
        viewFindViewById8.getClass();
        k8p1.o(viewFindViewById8, b(o671.a(this.S0, voo1.u(xfxVar)), (ViewGroup) viewFindViewById8.getParent()).w);
        CoordinatorLayout coordinatorLayout19 = this.g1;
        if (coordinatorLayout19 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById9 = coordinatorLayout19.findViewById(2131430563);
        viewFindViewById9.getClass();
        k8p1.o(viewFindViewById9, b(new bs0((c9c0) null, qco0.a, i6u.a, voo1.o(xfxVar)), (ViewGroup) viewFindViewById9.getParent()).w);
        smc0 smc0VarN3 = k4p1.n();
        if (!dn4Var.c()) {
            smc0VarN3.add(new h3p0(dvsVar, ktf1.a((ktf1) this.d.get())));
        }
        smc0VarN3.add(new h3p0(p0sVar, this.Z));
        smc0VarN3.add(new h3p0(b6sVar, this.O0));
        this.m1.addAll(k4p1.k(smc0VarN3));
        PeekScrollView peekScrollView2 = this.h1;
        if (peekScrollView2 == null) {
            u890.C("peekScrollView");
            throw null;
        }
        FlowableRefCount flowableRefCount = peekScrollView2.l1;
        rzo0 rzo0Var = this.Z0;
        this.k1 = new g2z(this.a1, flowableRefCount, (FlowableMap) rzo0Var.b, (Scheduler) rzo0Var.c, (tu4) rzo0Var.d);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView3 = this.i1;
        if (overlayHidingGradientBackgroundView3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        viewFindViewById3.getClass();
        j7p1.x(overlayHidingGradientBackgroundView3, new ye50(this, (byte) 0));
        j7p1.x(constraintLayoutFindViewById, new ye50(this, (byte) 1));
        j7p1.x(pkf1Var, new ye50(this, (byte) 2));
        j7p1.x(view3, new ye50(this, (byte) 3));
        j7p1.x(viewFindViewById3, new ye50(this, (byte) 4));
        if (viewFindViewById7 != null) {
            j7p1.x(viewFindViewById7, new ye50(this, (byte) 5));
        }
        CoordinatorLayout coordinatorLayout20 = this.g1;
        if (coordinatorLayout20 != null) {
            return coordinatorLayout20;
        }
        u890.C("rootView");
        throw null;
    }

    public final dtw b(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        CoordinatorLayout coordinatorLayout = this.g1;
        if (coordinatorLayout != null) {
            return mhc.b(coordinatorLayout.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
        }
        u890.C("rootView");
        throw null;
    }

    public final dtw c(wpw wpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        CoordinatorLayout coordinatorLayout = this.g1;
        if (coordinatorLayout != null) {
            return mhc.b(coordinatorLayout.getContext(), viewGroup, wpwVar, obj, (ipb1) null, 112);
        }
        u890.C("rootView");
        throw null;
    }

    public final void destroy() {
        this.n1.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.n1;
    }

    public final void start() {
        this.n1.i(w8c0.e);
        ((tqq0) this.X0.get()).a();
        te50 te50Var = (te50) this.U0.get();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.i1;
        if (overlayHidingGradientBackgroundView == null) {
            u890.C("modeRootView");
            throw null;
        }
        te50Var.d = new w0y(overlayHidingGradientBackgroundView, (byte) 1);
        te50Var.c.b(te50Var.a.c0(Flowable.O(0, Integer.MAX_VALUE), a020.e).subscribe(new od30(te50Var, (byte) 12)));
        h280 h280Var = (h280) this.Y0.get();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.i1;
        if (overlayHidingGradientBackgroundView2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        h280Var.b(overlayHidingGradientBackgroundView2.getOverlayState().J(sa20.e));
        g2z g2zVar = this.k1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView3 = this.i1;
        if (overlayHidingGradientBackgroundView3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        g2zVar.J(overlayHidingGradientBackgroundView3);
        ((ns10) this.V0.get()).a();
        Iterator it = this.m1.iterator();
        while (it.hasNext()) {
            ((h3p0) it.next()).a();
        }
        i6p0 i6p0Var = (i6p0) this.W0.get();
        PeekScrollView peekScrollView = this.h1;
        if (peekScrollView == null) {
            u890.C("peekScrollView");
            throw null;
        }
        ScrollCardsContainer scrollCardsContainer = this.j1;
        if (scrollCardsContainer == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        rok0 rok0Var = this.l1;
        if (rok0Var != null) {
            ((kyo0) i6p0Var).d(peekScrollView, scrollCardsContainer, (pgr) rok0Var.c, ((z4p0) this.o1.getValue()).f, true);
        } else {
            u890.C("attentionTrackerProvider");
            throw null;
        }
    }

    public final void stop() {
        this.n1.i(w8c0.c);
        ((tqq0) this.X0.get()).b();
        te50 te50Var = (te50) this.U0.get();
        te50Var.c.a();
        te50Var.d = null;
        ((h280) this.Y0.get()).c();
        g2z g2zVar = this.k1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        g2zVar.K();
        ((ns10) this.V0.get()).d.c();
        Iterator it = this.m1.iterator();
        while (it.hasNext()) {
            ((h3p0) it.next()).b();
        }
        ((kyo0) ((i6p0) this.W0.get())).e();
    }
}
