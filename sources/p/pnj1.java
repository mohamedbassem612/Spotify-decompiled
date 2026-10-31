package p;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pnj1 implements m4p0, iac0 {
    public final FlowableObserveOn A1;
    public final FlowableDistinctUntilChanged B1;
    public final FlowableMap C1;
    public final Flowable D1;
    public final x4p0 E1;
    public final r0y F1;
    public final un4 G1;
    public final q8n H1;
    public final spq0 I1;
    public final ynb0 J1;
    public final Flowable K1;
    public final fzg0 L1;
    public final w9u0 M1;
    public final u27 N0;
    public final ynb0 N1;
    public final mdn O0;
    public final boolean O1;
    public final dpf1 P0;
    public final uo5 P1;
    public final dpt0 Q0;
    public final eyh0 Q1;
    public final aor R0;
    public final o671 S0;
    public NowPlayingScrollView S1;
    public final pnd T0;
    public OverlayHidingFrameLayout T1;
    public final ynb0 U0;
    public ConstraintLayout U1;
    public final wr30 V0;
    public ViewGroup V1;
    public final yjj1 W0;
    public ViewGroup W1;
    public final ktf1 X;
    public final izg X0;
    public View X1;
    public final ekf1 Y;
    public final jjv0 Y0;
    public View Y1;
    public final dn4 Z;
    public final ynb0 Z0;
    public View Z1;
    public final xfx a;
    public final rzo0 a1;
    public dtw a2;
    public final cce b;
    public final ynb0 b1;
    public h3p0 b2;
    public final sp00 c;
    public final ynb0 c1;
    public dtw c2;
    public final v1k d;
    public final fbm d1;
    public dtw d2;
    public final v1k e;
    public final i8h1 e1;
    public dtw e2;
    public final k2p0 f;
    public final l6h1 f1;
    public ConstraintLayout f2;
    public final e68 g;
    public final n7h1 g1;
    public ScrollCardsContainer g2;
    public final duy h;
    public final dxy h1;
    public g2z h2;
    public final vsy i;
    public final ynb0 i1;
    public dtw i2;
    public final ynb0 j1;
    public View j2;
    public final ynb0 k1;
    public View k2;
    public final ynb0 l1;
    public View l2;
    public final ynb0 m1;
    public final ynb0 n1;
    public final ynb0 o1;
    public dtw o2;
    public final ynb0 p1;
    public xab1 p2;
    public final a4f0 q1;
    public rok0 q2;
    public final et90 r1;
    public final hnl s1;
    public final tqq0 s2;
    public final iv4 t;
    public final ynb0 t1;
    public final ynb0 u1;
    public List u2;
    public final vi11 v1;
    public boolean v2;
    public final ikj1 w1;
    public xab1 w2;
    public final qpj1 x1;
    public ioj1 x2;
    public final cv4 y1;
    public boolean y2;
    public final uk51 z1;
    public final boolean z2;
    public final List R1 = p7h.M(new lzd[]{new lzd(lkf1.d, new rr60(null, 5)), new lzd(lkf1.g, null)});
    public final BehaviorProcessor m2 = BehaviorProcessor.e0(Boolean.FALSE);
    public final ReplayProcessor n2 = ReplayProcessor.e0();
    public final idd1 r2 = new idd1(new inj1(this, (byte) 28));
    public final tac0 t2 = new tac0(this, true);

    public pnj1(xfx xfxVar, cce cceVar, sp00 sp00Var, v1k v1kVar, v1k v1kVar2, k2p0 k2p0Var, e68 e68Var, duy duyVar, vsy vsyVar, iv4 iv4Var, ktf1 ktf1Var, ekf1 ekf1Var, dn4 dn4Var, u27 u27Var, mdn mdnVar, dpf1 dpf1Var, dpt0 dpt0Var, aor aorVar, o671 o671Var, pnd pndVar, ynb0 ynb0Var, wr30 wr30Var, yjj1 yjj1Var, izg izgVar, jjv0 jjv0Var, ynb0 ynb0Var2, sqq0 sqq0Var, rzo0 rzo0Var, ynb0 ynb0Var3, ynb0 ynb0Var4, fbm fbmVar, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, dxy dxyVar, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11, ynb0 ynb0Var12, a4f0 a4f0Var, et90 et90Var, hnl hnlVar, yl1 yl1Var, ynb0 ynb0Var13, ynb0 ynb0Var14, o671 o671Var2, v3i0 v3i0Var, v6z0 v6z0Var, vi11 vi11Var, ikj1 ikj1Var, qpj1 qpj1Var, cv4 cv4Var, uk51 uk51Var, FlowableObserveOn flowableObserveOn, FlowableJust flowableJust, FlowableDistinctUntilChanged flowableDistinctUntilChanged, FlowableMap flowableMap, Flowable flowable, lqc lqcVar, x4p0 x4p0Var, r0y r0yVar, pqq0 pqq0Var, un4 un4Var, q8n q8nVar, spq0 spq0Var, ynb0 ynb0Var15, Flowable flowable2, fzg0 fzg0Var, w9u0 w9u0Var, ynb0 ynb0Var16, boolean z) {
        this.a = xfxVar;
        this.b = cceVar;
        this.c = sp00Var;
        this.d = v1kVar;
        this.e = v1kVar2;
        this.f = k2p0Var;
        this.g = e68Var;
        this.h = duyVar;
        this.i = vsyVar;
        this.t = iv4Var;
        this.X = ktf1Var;
        this.Y = ekf1Var;
        this.Z = dn4Var;
        this.N0 = u27Var;
        this.O0 = mdnVar;
        this.P0 = dpf1Var;
        this.Q0 = dpt0Var;
        this.R0 = aorVar;
        this.S0 = o671Var;
        this.T0 = pndVar;
        this.U0 = ynb0Var;
        this.V0 = wr30Var;
        this.W0 = yjj1Var;
        this.X0 = izgVar;
        this.Y0 = jjv0Var;
        this.Z0 = ynb0Var2;
        this.a1 = rzo0Var;
        this.b1 = ynb0Var3;
        this.c1 = ynb0Var4;
        this.d1 = fbmVar;
        this.e1 = i8h1Var;
        this.f1 = l6h1Var;
        this.g1 = n7h1Var;
        this.h1 = dxyVar;
        this.i1 = ynb0Var5;
        this.j1 = ynb0Var6;
        this.k1 = ynb0Var7;
        this.l1 = ynb0Var8;
        this.m1 = ynb0Var9;
        this.n1 = ynb0Var10;
        this.o1 = ynb0Var11;
        this.p1 = ynb0Var12;
        this.q1 = a4f0Var;
        this.r1 = et90Var;
        this.s1 = hnlVar;
        this.t1 = ynb0Var13;
        this.u1 = ynb0Var14;
        this.v1 = vi11Var;
        this.w1 = ikj1Var;
        this.x1 = qpj1Var;
        this.y1 = cv4Var;
        this.z1 = uk51Var;
        this.A1 = flowableObserveOn;
        this.B1 = flowableDistinctUntilChanged;
        this.C1 = flowableMap;
        this.D1 = flowable;
        this.E1 = x4p0Var;
        this.F1 = r0yVar;
        this.G1 = un4Var;
        this.H1 = q8nVar;
        this.I1 = spq0Var;
        this.J1 = ynb0Var15;
        this.K1 = flowable2;
        this.L1 = fzg0Var;
        this.M1 = w9u0Var;
        this.N1 = ynb0Var16;
        this.O1 = z;
        this.P1 = new uo5(new jpg0(yl1Var.a(voo1.i(xfxVar)), jmj1.Z), new jpg0(yl1Var.a(voo1.i(xfxVar)), jmj1.N0), (Object) null, (byte) 17);
        this.Q1 = new eyh0(v6z0Var.a(voo1.o(xfxVar)), o671.a(o671Var2, voo1.u(xfxVar)), f6o1.A(new z3i0(v3i0Var.a, v3i0Var.b, v3i0Var.c, v3i0Var.d, v3i0Var.e, true), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (byte) 7);
        this.s2 = new tqq0(flowableJust, sqq0Var.a, sqq0Var.b);
        boolean z2 = true;
        if (!hnlVar.b() && pqq0Var != pqq0.b) {
            z2 = false;
        }
        this.z2 = z2;
    }

    public static dtw c(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public static dtw d(wpw wpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, obj, (ipb1) null, 112);
    }

    public static dtw e(laa laaVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.d(viewGroup.getContext(), viewGroup, laaVar, (drw) null, 24);
    }

    public static void f(View view, r6h1 r6h1Var) {
        xhk1.c(view, new h3h1(new yzi1(r6h1Var, (byte) 5)));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        v9d1 v9d1Var;
        joj1 vrv0Var;
        CoordinatorLayout coordinatorLayoutInflate;
        View view2;
        View view3;
        xfx xfxVar = this.a;
        wfx wfxVar = xfxVar.c;
        hnl hnlVar = this.s1;
        boolean zB = hnlVar.b();
        this.y2 = zB;
        idd1 idd1Var = this.r2;
        FlowableDistinctUntilChanged flowableDistinctUntilChanged = this.B1;
        rzo0 rzo0Var = this.a1;
        dpt0 dpt0Var = this.Q0;
        wr30 wr30Var = this.V0;
        dxy dxyVar = this.h1;
        ktf1 ktf1Var = this.X;
        ekf1 ekf1Var = this.Y;
        dn4 dn4Var = this.Z;
        List list = this.R1;
        k2p0 k2p0Var = this.f;
        fbm fbmVar = this.d1;
        FlowableObserveOn flowableObserveOn = this.A1;
        v1k v1kVar = this.e;
        uk51 uk51Var = this.z1;
        uo5 uo5Var = this.P1;
        pnd pndVar = this.T0;
        dpf1 dpf1Var = this.P0;
        r0y r0yVar = this.F1;
        a4f0 a4f0Var = this.q1;
        if (zB) {
            coordinatorLayoutInflate = layoutInflater.inflate(2131626306, viewGroup, false);
            this.T1 = (OverlayHidingFrameLayout) coordinatorLayoutInflate.findViewById(2131430262);
            ConstraintLayout constraintLayoutFindViewById = coordinatorLayoutInflate.findViewById(2131430418);
            ConstraintLayout constraintLayout = constraintLayoutFindViewById;
            constraintLayout.getClass();
            f(constraintLayout, r0yVar.i());
            this.f2 = constraintLayoutFindViewById;
            ConstraintLayout constraintLayoutFindViewById2 = coordinatorLayoutInflate.findViewById(2131429084);
            ConstraintLayout constraintLayout2 = constraintLayoutFindViewById2;
            constraintLayout2.getClass();
            f(constraintLayout2, r0yVar.g());
            this.U1 = constraintLayoutFindViewById2;
            this.k2 = coordinatorLayoutInflate.findViewById(2131429636);
            ConstraintLayout constraintLayout3 = this.U1;
            if (constraintLayout3 == null) {
                u890.C("headerContainer");
                throw null;
            }
            dtw dtwVarE = e(dpf1Var, constraintLayout3);
            View view4 = dtwVarE.w;
            this.Z1 = view4;
            this.a2 = dtwVarE;
            ConstraintLayout constraintLayout4 = this.U1;
            if (constraintLayout4 == null) {
                u890.C("headerContainer");
                throw null;
            }
            if (view4 == null) {
                u890.C("trackInfoView");
                throw null;
            }
            View view5 = d(f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayout4, new q491(7, null)).w;
            smc0 smc0VarN = k4p1.n();
            ConstraintLayout constraintLayout5 = this.U1;
            if (constraintLayout5 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN.add(c(pndVar, constraintLayout5).w);
            im0 im0VarA = o671.a(this.S0, voo1.u(xfxVar));
            ConstraintLayout constraintLayout6 = this.U1;
            if (constraintLayout6 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN.add(c(im0VarA, constraintLayout6).w);
            jpg0 jpg0Var = (jpg0) uo5Var.b;
            ConstraintLayout constraintLayout7 = this.U1;
            if (constraintLayout7 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN.add(c(jpg0Var, constraintLayout7).w);
            qtw qtwVarA = f6o1.A(uk51Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            ConstraintLayout constraintLayout8 = this.U1;
            if (constraintLayout8 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN.add(c(qtwVarA, constraintLayout8).w);
            dfm dfmVarF = v1kVar.f(flowableObserveOn, fbmVar, voo1.m(xfxVar));
            ConstraintLayout constraintLayout9 = this.U1;
            if (constraintLayout9 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN.add(c(dfmVarF, constraintLayout9).w);
            smc0 smc0VarK = k4p1.k(smc0VarN);
            int iP = eth.p(constraintLayout4.getContext(), 2131167119);
            int iP2 = eth.p(constraintLayout4.getContext(), 2131167033);
            WeakHashMap weakHashMap = b8k1.a;
            view4.setId(View.generateViewId());
            view5.setId(View.generateViewId());
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                }
                ((View) rmc0Var.next()).setId(View.generateViewId());
            }
            op71.l(constraintLayout4, view4, 0, -2, new po60(iP2, (byte) 4));
            op71.l(constraintLayout4, view5, -2, -2, new po60(iP2, (byte) 5));
            rmc0 rmc0VarListIterator2 = smc0VarK.listIterator(0);
            int i = 0;
            while (true) {
                rmc0 rmc0Var2 = rmc0VarListIterator2;
                if (!rmc0Var2.hasNext()) {
                    op71.H(constraintLayout4, new lhx(view4, view5, smc0VarK, constraintLayout4, (byte) 25));
                    rmc0 rmc0VarListIterator3 = smc0VarK.listIterator(0);
                    while (true) {
                        rmc0 rmc0Var3 = rmc0VarListIterator3;
                        if (!rmc0Var3.hasNext()) {
                            break;
                        }
                        ((View) rmc0Var3.next()).setClickable(true);
                    }
                    View viewFindViewById = coordinatorLayoutInflate.findViewById(2131430995);
                    if (viewFindViewById != null) {
                        k8p1.o(viewFindViewById, d(f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById.getParent(), new q491(5, null)).w);
                    }
                    dvs dvsVar = new dvs(wfxVar.b);
                    dvsVar.q(k2p0Var.a(list, ((z4p0) idd1Var.getValue()).f, new hcf1(1, this.n2, ReplayProcessor.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 19)));
                    View viewFindViewById2 = coordinatorLayoutInflate.findViewById(2131431593);
                    if (dn4Var.c()) {
                        view3 = c(ekf1.a(ekf1Var, dvsVar), coordinatorLayoutInflate).w;
                    } else {
                        this.b2 = new h3p0(dvsVar, ktf1.a(ktf1Var));
                        view3 = dvsVar.a;
                    }
                    k8p1.o(viewFindViewById2, view3);
                    View viewFindViewById3 = coordinatorLayoutInflate.findViewById(2131430907);
                    viewFindViewById3.getClass();
                    k8p1.o(viewFindViewById3, c(dxyVar.t(new inj1(this, (byte) 13), new inj1(this, (byte) 14), 1), (ViewGroup) viewFindViewById3.getParent()).w);
                    View viewFindViewById4 = coordinatorLayoutInflate.findViewById(2131428982);
                    viewFindViewById4.getClass();
                    k8p1.o(viewFindViewById4, d(f6o1.A(wr30Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById4.getParent(), new ur30(true)).w);
                    View viewFindViewById5 = coordinatorLayoutInflate.findViewById(2131430905);
                    View view6 = d(this.Y0, (ViewGroup) viewFindViewById5.getParent(), new un51(2)).w;
                    this.X1 = view6;
                    k8p1.o(viewFindViewById5, view6);
                    ConstraintLayout constraintLayout10 = this.f2;
                    if (constraintLayout10 == null) {
                        u890.C("playbackControlsContainer");
                        throw null;
                    }
                    View view7 = new View(coordinatorLayoutInflate.getContext());
                    wpw wpwVarT = dxyVar.t(new inj1(this, (byte) 9), new inj1(this, (byte) 10), 3);
                    ConstraintLayout constraintLayout11 = this.f2;
                    if (constraintLayout11 == null) {
                        u890.C("playbackControlsContainer");
                        throw null;
                    }
                    View view8 = c(wpwVarT, constraintLayout11).w;
                    dfm dfmVarA = dpt0Var.a();
                    ConstraintLayout constraintLayout12 = this.f2;
                    if (constraintLayout12 == null) {
                        u890.C("playbackControlsContainer");
                        throw null;
                    }
                    View view9 = d(dfmVarA, constraintLayout12, new jpt0((ipt0) null, 3)).w;
                    wpw wpwVarT2 = dxyVar.t(new inj1(this, (byte) 11), new inj1(this, (byte) 12), 3);
                    ConstraintLayout constraintLayout13 = this.f2;
                    if (constraintLayout13 == null) {
                        u890.C("playbackControlsContainer");
                        throw null;
                    }
                    eth.Q(constraintLayout10, view7, view8, view9, c(wpwVarT2, constraintLayout13).w, new View(coordinatorLayoutInflate.getContext()));
                    h(coordinatorLayoutInflate);
                    this.h2 = rzo0.o(rzo0Var, flowableDistinctUntilChanged);
                    OverlayHidingFrameLayout overlayHidingFrameLayout = this.T1;
                    if (overlayHidingFrameLayout != null) {
                        overlayHidingFrameLayout.setOverlayView(coordinatorLayoutInflate.findViewById(2131431592));
                        break;
                    }
                    u890.C("overlayControlsView");
                    throw null;
                }
                Object next = rmc0Var2.next();
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                op71.l(constraintLayout4, (View) next, iP, iP, new e90(i, smc0VarK, iP2));
                i = i2;
            }
        } else {
            CoordinatorLayout coordinatorLayoutInflate2 = layoutInflater.inflate(2131626305, viewGroup, false);
            NowPlayingScrollView nowPlayingScrollView = (NowPlayingScrollView) coordinatorLayoutInflate2.findViewById(2131430778);
            this.S1 = nowPlayingScrollView;
            this.q2 = new rok0(nowPlayingScrollView);
            this.T1 = (OverlayHidingFrameLayout) coordinatorLayoutInflate2.findViewById(2131430262);
            ConstraintLayout constraintLayoutFindViewById3 = coordinatorLayoutInflate2.findViewById(2131430418);
            ConstraintLayout constraintLayout14 = constraintLayoutFindViewById3;
            constraintLayout14.getClass();
            f(constraintLayout14, r0yVar.i());
            this.f2 = constraintLayoutFindViewById3;
            ScrollCardsContainer scrollCardsContainerFindViewById = coordinatorLayoutInflate2.findViewById(2131431706);
            ScrollCardsContainer scrollCardsContainer = scrollCardsContainerFindViewById;
            scrollCardsContainer.getClass();
            g5l0 g5l0VarF = r0yVar.f();
            x6h1 x6h1VarC = g5l0VarF.c.c();
            x6h1VarC.i.add(new a7h1("scroll_components", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            r6h1 r6h1Var = r6h1.c;
            r6h1 r6h1Var2 = g5l0VarF.b;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(r6h1Var2.a);
            arrayList.add(y6h1VarA);
            f(scrollCardsContainer, new r6h1(arrayList, r6h1Var2.b));
            this.g2 = scrollCardsContainerFindViewById;
            ConstraintLayout constraintLayoutFindViewById4 = coordinatorLayoutInflate2.findViewById(2131430422);
            ConstraintLayout constraintLayout15 = constraintLayoutFindViewById4;
            constraintLayout15.getClass();
            f(constraintLayout15, r0yVar.g());
            ConstraintLayout constraintLayout16 = constraintLayoutFindViewById4;
            this.U1 = constraintLayout16;
            smc0 smc0VarN2 = k4p1.n();
            qtw qtwVarA2 = f6o1.A(sp00.f(this.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            ConstraintLayout constraintLayout17 = this.U1;
            if (constraintLayout17 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN2.add(c(qtwVarA2, constraintLayout17).w);
            qtw qtwVarA3 = f6o1.A(cce.n(this.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            ConstraintLayout constraintLayout18 = this.U1;
            if (constraintLayout18 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN2.add(c(qtwVarA3, constraintLayout18).w);
            smc0 smc0VarK2 = k4p1.k(smc0VarN2);
            ug3 ug3VarE = this.d.e(voo1.l(xfxVar));
            ConstraintLayout constraintLayout19 = this.U1;
            if (constraintLayout19 == null) {
                u890.C("headerContainer");
                throw null;
            }
            View view10 = c(ug3VarE, constraintLayout19).w;
            smc0 smc0VarN3 = k4p1.n();
            dfm dfmVarF2 = v1kVar.f(flowableObserveOn, fbmVar, voo1.m(xfxVar));
            ConstraintLayout constraintLayout20 = this.U1;
            if (constraintLayout20 == null) {
                u890.C("headerContainer");
                throw null;
            }
            smc0VarN3.add(c(dfmVarF2, constraintLayout20).w);
            eth.O(constraintLayout16, smc0VarK2, view10, k4p1.k(smc0VarN3));
            dvs dvsVar2 = new dvs(wfxVar.b);
            dvsVar2.q(k2p0Var.a(list, ((z4p0) idd1Var.getValue()).f, new hcf1(1, this.n2, ReplayProcessor.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 20)));
            View viewFindViewById6 = coordinatorLayoutInflate2.findViewById(2131431593);
            if (dn4Var.c()) {
                view = c(ekf1.a(ekf1Var, dvsVar2), coordinatorLayoutInflate2).w;
            } else {
                this.b2 = new h3p0(dvsVar2, ktf1.a(ktf1Var));
                view = dvsVar2.a;
            }
            k8p1.o(viewFindViewById6, view);
            if (this.O1) {
                qtw qtwVarA4 = f6o1.A(((mmf0) this.N1.get()).a(this, new huz(Boolean.FALSE, (byte) 10)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                View viewFindViewById7 = coordinatorLayoutInflate2.findViewById(2131429880);
                viewFindViewById7.getClass();
                k8p1.o(viewFindViewById7, c(qtwVarA4, (ViewGroup) viewFindViewById7.getParent()).w);
            }
            ConstraintLayout constraintLayoutFindViewById5 = coordinatorLayoutInflate2.findViewById(2131431474);
            constraintLayoutFindViewById5.getClass();
            g5l0 g5l0VarF2 = r0yVar.f();
            x6h1 x6h1VarC2 = g5l0VarF2.c.c();
            x6h1VarC2.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            r6h1 r6h1Var3 = g5l0VarF2.b;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(r6h1Var3.a);
            arrayList2.add(y6h1VarA2);
            f(constraintLayoutFindViewById5, new r6h1(arrayList2, r6h1Var3.b));
            LinearLayout linearLayout = (LinearLayout) coordinatorLayoutInflate2.findViewById(2131428854);
            iv4 iv4Var = this.t;
            View view11 = iv4Var.b() ? null : d(f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById5, new q491(6, new qcs(linearLayout, (byte) 2))).w;
            dtw dtwVarE2 = e(dpf1Var, constraintLayoutFindViewById5);
            this.Z1 = dtwVarE2.w;
            this.a2 = dtwVarE2;
            dtw dtwVarE3 = e(this.N0.a(this.n2.j(this.O0).J(pdx0.W0).U(Boolean.TRUE)), constraintLayoutFindViewById5);
            this.c2 = dtwVarE3;
            View view12 = dtwVarE3.w;
            View view13 = this.Z1;
            if (view13 == null) {
                u890.C("trackInfoView");
                throw null;
            }
            linearLayout.getClass();
            eth.R(constraintLayoutFindViewById5, view12, view13, view11, linearLayout, c((jpg0) uo5Var.b, constraintLayoutFindViewById5).w, (View) null);
            k8p1.o(coordinatorLayoutInflate2.findViewById(2131430907), c(dxyVar.t(new inj1(this, (byte) 23), new inj1(this, (byte) 24), 1), coordinatorLayoutInflate2).w);
            ConstraintLayout constraintLayoutFindViewById6 = coordinatorLayoutInflate2.findViewById(2131429135);
            constraintLayoutFindViewById6.getClass();
            smc0 smc0VarN4 = k4p1.n();
            tka0 tka0Var = dtw.C;
            dtw dtwVarD = mhc.d(constraintLayoutFindViewById6.getContext(), constraintLayoutFindViewById6, this.g.a(), (drw) null, 24);
            this.d2 = dtwVarD;
            smc0VarN4.add(dtwVarD.w);
            smc0VarN4.add(d(f6o1.A(duy.a(this.h, 2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById6, new euy(true)).w);
            dtw dtwVarE4 = e(fdg1.m0(vsy.a(this.i), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById6);
            this.e2 = dtwVarE4;
            smc0VarN4.add(dtwVarE4.w);
            wpw wpwVarA = iv4Var.b() ? f6o1.A(a4f0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : null;
            if (wpwVarA != null && (view2 = d(wpwVarA, constraintLayoutFindViewById6, new q491(3, null)).w) != null) {
                smc0VarN4.add(view2);
            }
            eth.P(constraintLayoutFindViewById6, k4p1.k(smc0VarN4));
            ConstraintLayout constraintLayout21 = this.f2;
            if (constraintLayout21 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            wpw wpwVarT3 = dxyVar.t(new inj1(this, (byte) 15), new inj1(this, (byte) 16), 3);
            ConstraintLayout constraintLayout22 = this.f2;
            if (constraintLayout22 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            View view14 = c(wpwVarT3, constraintLayout22).w;
            wpw wpwVarT4 = dxyVar.t(new inj1(this, (byte) 17), new inj1(this, (byte) 18), 3);
            ConstraintLayout constraintLayout23 = this.f2;
            if (constraintLayout23 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            View view15 = c(wpwVarT4, constraintLayout23).w;
            dfm dfmVarA2 = dpt0Var.a();
            ConstraintLayout constraintLayout24 = this.f2;
            if (constraintLayout24 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            View view16 = d(dfmVarA2, constraintLayout24, new jpt0((ipt0) null, 1)).w;
            wpw wpwVarT5 = dxyVar.t(new inj1(this, (byte) 19), new inj1(this, (byte) 20), 3);
            ConstraintLayout constraintLayout25 = this.f2;
            if (constraintLayout25 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            View view17 = c(wpwVarT5, constraintLayout25).w;
            wpw wpwVarT6 = dxyVar.t(new inj1(this, (byte) 21), new inj1(this, (byte) 22), 3);
            ConstraintLayout constraintLayout26 = this.f2;
            if (constraintLayout26 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            eth.Q(constraintLayout21, view14, view15, view16, view17, c(wpwVarT6, constraintLayout26).w);
            ViewStub viewStub = (ViewStub) coordinatorLayoutInflate2.findViewById(2131428189);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewStub.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            View view18 = d(f6o1.A(this.R0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewStub.getParent(), new f3l(0.0f, 4089, false)).w;
            view18.setClickable(true);
            k8p1.o(viewStub, view18);
            View viewFindViewById8 = coordinatorLayoutInflate2.findViewById(2131428935);
            g5l0 g5l0VarF3 = r0yVar.f();
            x6h1 x6h1VarC3 = g5l0VarF3.c.c();
            x6h1VarC3.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            r6h1 r6h1Var4 = g5l0VarF3.b;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(r6h1Var4.a);
            arrayList3.add(y6h1VarA3);
            f(viewFindViewById8, new r6h1(arrayList3, r6h1Var4.b));
            gs71 gs71Var = (gs71) this.I1.h();
            if (gs71Var != null) {
                ViewStub viewStub2 = (ViewStub) coordinatorLayoutInflate2.findViewById(2131427943);
                k8p1.o(viewStub2, d(f6o1.A(gs71Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewStub2.getParent(), new tr71(gr71.a)).w);
            }
            ConstraintLayout constraintLayoutFindViewById7 = coordinatorLayoutInflate2.findViewById(2131427416);
            fzg0 fzg0Var = this.L1;
            z72 z72VarA = fzg0Var.a.r() ? fzg0Var.b.a(this.M1) : null;
            qtw qtwVarA5 = z72VarA != null ? f6o1.A(z72VarA, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : null;
            eyh0 eyh0Var = this.Q1;
            if (qtwVarA5 == null) {
                qtwVarA5 = (wpw) eyh0Var.d;
            }
            constraintLayoutFindViewById7.getClass();
            View view19 = c((wpw) eyh0Var.b, constraintLayoutFindViewById7).w;
            wpw wpwVar = (wpw) eyh0Var.c;
            eth.N(view19, wpwVar != null ? c(wpwVar, constraintLayoutFindViewById7).w : null, qtwVarA5 != null ? c(qtwVarA5, constraintLayoutFindViewById7).w : null, constraintLayoutFindViewById7);
            jpg0 jpg0Var2 = (jpg0) uo5Var.c;
            czb1 czb1Var = new czb1(this.m2);
            ikj1 ikj1Var = this.w1;
            w2k1 w2k1Var = (w2k1) ikj1Var.b;
            yjj1 yjj1Var = (yjj1) ikj1Var.c;
            c3s c3sVar = (c3s) ikj1Var.d;
            bv4 bv4Var = (bv4) ikj1Var.f;
            qtw qtwVarA6 = f6o1.A(new mkj1(w2k1Var, 1, 3, false, yjj1Var, c3sVar, bv4Var.a() ? (qlb) ikj1Var.e : null, (FlowableMap) ikj1Var.a, bv4Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            tn4 tn4Var = tn4.c;
            tn4 tn4Var2 = tn4.d;
            List listM = p7h.M(new tn4[]{tn4Var, tn4Var2});
            un4 un4Var = this.G1;
            if (!listM.contains(un4Var.g())) {
                qtwVarA6 = null;
            }
            this.l2 = d(this.v1.n(jpg0Var2, czb1Var, qtwVarA6), coordinatorLayoutInflate2, new zyb1(new knj1(this, (byte) 7), true)).w;
            View viewFindViewById9 = coordinatorLayoutInflate2.findViewById(2131429983);
            viewFindViewById9.getClass();
            View view20 = this.l2;
            if (view20 == null) {
                u890.C("stickyHeaderView");
                throw null;
            }
            view20.setElevation(viewFindViewById9.getElevation());
            k8p1.o(viewFindViewById9, view20);
            ConstraintLayout constraintLayoutFindViewById8 = coordinatorLayoutInflate2.findViewById(2131431601);
            constraintLayoutFindViewById8.getClass();
            f(constraintLayoutFindViewById8, r0yVar.h());
            View viewFindViewById10 = constraintLayoutFindViewById8.findViewById(2131430256);
            viewFindViewById10.getClass();
            k8p1.o(viewFindViewById10, c(dxyVar.t(new inj1(this, (byte) 29), new knj1(this, (byte) 0), 3), constraintLayoutFindViewById8).w);
            View viewFindViewById11 = constraintLayoutFindViewById8.findViewById(2131430255);
            viewFindViewById11.getClass();
            dfm dfmVarA3 = dpt0Var.a();
            ConstraintLayout constraintLayout27 = this.f2;
            if (constraintLayout27 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            k8p1.o(viewFindViewById11, d(dfmVarA3, constraintLayout27, new jpt0(hpt0.a, 2)).w);
            View viewFindViewById12 = constraintLayoutFindViewById8.findViewById(2131430257);
            viewFindViewById12.getClass();
            k8p1.o(viewFindViewById12, c(dxyVar.t(new knj1(this, (byte) 1), new knj1(this, (byte) 2), 3), constraintLayoutFindViewById8).w);
            if (hnlVar.f()) {
                View viewFindViewById13 = constraintLayoutFindViewById8.findViewById(2131430254);
                dtw dtwVarD2 = d(f6o1.A(wr30Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById8, new ur30(true));
                viewFindViewById13.getClass();
                k8p1.o(viewFindViewById13, dtwVarD2.w);
                this.i2 = dtwVarD2;
            }
            View viewFindViewById14 = constraintLayoutFindViewById8.findViewById(2131430253);
            viewFindViewById14.getClass();
            k8p1.o(viewFindViewById14, d(f6o1.A(this.X0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById8, new hzg(new knj1(this, (byte) 3))).w);
            k8p1.o(constraintLayoutFindViewById8.findViewById(2131430260), c(pndVar, constraintLayoutFindViewById8).w);
            View viewFindViewById15 = constraintLayoutFindViewById8.findViewById(2131431604);
            View view21 = c(f6o1.A(uk51Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById8).w;
            viewFindViewById15.getClass();
            k8p1.o(viewFindViewById15, view21);
            this.j2 = view21;
            View viewFindViewById16 = constraintLayoutFindViewById8.findViewById(2131430258);
            qpj1 qpj1Var = this.x1;
            View view22 = d(f6o1.A(new kls0((Flowable) qpj1Var.b, (cv4) qpj1Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById8, new spj1(new knj1(this, (byte) 4))).w;
            view22.setClickable(true);
            viewFindViewById16.getClass();
            k8p1.o(viewFindViewById16, view22);
            OverlayHidingFrameLayout overlayHidingFrameLayout2 = this.T1;
            if (overlayHidingFrameLayout2 == null) {
                u890.C("overlayControlsView");
                throw null;
            }
            h(overlayHidingFrameLayout2);
            this.h2 = rzo0.o(rzo0Var, flowableDistinctUntilChanged);
            OverlayHidingFrameLayout overlayHidingFrameLayout3 = this.T1;
            if (overlayHidingFrameLayout3 == null) {
                u890.C("overlayControlsView");
                throw null;
            }
            overlayHidingFrameLayout3.setOverlayView(constraintLayoutFindViewById8);
            if (un4Var.e()) {
                ViewGroup viewGroup2 = (ViewGroup) coordinatorLayoutInflate2.findViewById(2131431596);
                viewGroup2.getClass();
                viewGroup2.setVisibility(0);
                k8p1.o(coordinatorLayoutInflate2.findViewById(2131431597), d(f6o1.A((xpw) this.J1.get(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), viewGroup2, ypj1.a).w);
            }
            View viewFindViewById17 = coordinatorLayoutInflate2.findViewById(2131431602);
            View view23 = c(dxyVar.t(new inj1(this, (byte) 26), new inj1(this, (byte) 27), 1), (ViewGroup) viewFindViewById17.getParent()).w;
            f(view23, r0yVar.h());
            view23.setElevation(viewFindViewById17.getElevation());
            k8p1.o(viewFindViewById17, view23);
            this.u2 = p7h.M(new View[]{constraintLayoutFindViewById8.findViewById(2131430256), constraintLayoutFindViewById8.findViewById(2131430255), constraintLayoutFindViewById8.findViewById(2131430257), view23, constraintLayoutFindViewById8.findViewById(2131430253)});
            this.V1 = (ViewGroup) coordinatorLayoutInflate2.findViewById(2131431583);
            View viewFindViewById18 = coordinatorLayoutInflate2.findViewById(2131429078);
            ViewGroup viewGroup3 = (ViewGroup) viewFindViewById18;
            viewGroup3.getClass();
            if (viewGroup3.isAttachedToWindow()) {
                viewGroup3.requestApplyInsets();
            } else {
                viewGroup3.addOnAttachStateChangeListener(new c9s(viewGroup3, viewGroup3, (byte) 15));
            }
            i2i1 i2i1Var = new i2i1(viewGroup3, (byte) 4);
            WeakHashMap weakHashMap2 = b8k1.a;
            r7k1.c(viewGroup3, i2i1Var);
            this.W1 = (ViewGroup) viewFindViewById18;
            if (un4Var.d() && p7h.M(new tn4[]{tn4Var2, tn4Var}).contains(un4Var.g())) {
                OverlayHidingFrameLayout overlayHidingFrameLayout4 = this.T1;
                if (overlayHidingFrameLayout4 == null) {
                    u890.C("overlayControlsView");
                    throw null;
                }
                inj1 inj1Var = new inj1(this, (byte) 25);
                ViewGroup viewGroup4 = (ViewGroup) overlayHidingFrameLayout4.getParent();
                int iIndexOfChild = viewGroup4.indexOfChild(overlayHidingFrameLayout4);
                ViewGroup.LayoutParams layoutParams = overlayHidingFrameLayout4.getLayoutParams();
                viewGroup4.removeView(overlayHidingFrameLayout4);
                v9d1Var = new v9d1(viewGroup4.getContext());
                v9d1Var.setLayoutParams(layoutParams);
                v9d1Var.setOnSwipeUp(inj1Var);
                v9d1Var.addView(overlayHidingFrameLayout4, -1, -2);
                viewGroup4.addView(v9d1Var, iIndexOfChild);
            } else {
                v9d1Var = null;
            }
            NowPlayingScrollView nowPlayingScrollView2 = this.S1;
            if (nowPlayingScrollView2 == null) {
                u890.C("scrollCardsScrollView");
                throw null;
            }
            ViewGroup viewGroup5 = this.V1;
            if (viewGroup5 == null) {
                u890.C("videoAndHeaderContainer");
                throw null;
            }
            ViewGroup viewGroup6 = this.W1;
            if (viewGroup6 == null) {
                u890.C("headerAndVideoContent");
                throw null;
            }
            ConstraintLayout constraintLayout28 = this.f2;
            if (constraintLayout28 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            List list2 = this.u2;
            if (list2 == null) {
                u890.C("viewsShownWhenActionsCollapsed");
                throw null;
            }
            View view24 = this.j2;
            boolean zA = this.y1.a();
            OverlayHidingFrameLayout overlayHidingFrameLayout5 = this.T1;
            if (overlayHidingFrameLayout5 == null) {
                u890.C("overlayControlsView");
                throw null;
            }
            View viewFindViewById19 = constraintLayoutFindViewById8.findViewById(2131430261);
            View viewFindViewById20 = coordinatorLayoutInflate2.findViewById(2131431596);
            boolean zE = un4Var.e();
            FlowableDistinctUntilChanged flowableDistinctUntilChangedT = this.K1.J(rdx0.V0).t(Functions.a);
            dtw dtwVar = this.i2;
            u9c0 u9c0VarQ = cto1.q(this);
            int iOrdinal = un4Var.g().ordinal();
            if (iOrdinal == 0) {
                vrv0Var = new vrv0(new inj1(this, (byte) 3), new inj1(this, (byte) 4));
            } else if (iOrdinal == 1) {
                vrv0Var = new ht41(new boj1(2, false, false), new inj1(this, (byte) 8), new inj1(this, (byte) 0), new inj1(this, (byte) 1), new jnj1(this, (byte) 0));
            } else if (iOrdinal == 2) {
                vrv0Var = new y441(new inj1(this, (byte) 2), new jnj1(this, (byte) 1));
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                vrv0Var = new ht41(znj1.a, new inj1(this, (byte) 5), new inj1(this, (byte) 6), new inj1(this, (byte) 7), new jnj1(this, (byte) 2));
            }
            this.x2 = new ioj1(this.C1, this.W0, this.m2, nowPlayingScrollView2, viewGroup5, viewGroup6, view23, constraintLayout28, list2, view24, zA, overlayHidingFrameLayout5, v9d1Var, viewFindViewById19, viewFindViewById20, zE, flowableDistinctUntilChangedT, dtwVar, u9c0VarQ, this.H1, vrv0Var, r0yVar);
            coordinatorLayoutInflate = coordinatorLayoutInflate2;
        }
        x9p1.p(coordinatorLayoutInflate, this);
        xhk1.c(coordinatorLayoutInflate, j6p1.k(j6p1.k(new jp80(coordinatorLayoutInflate), new eq80(new e3h1(this.f1, this.g1, this.e1))), new h3h1(new jnj1(this, (byte) 3))));
        this.t2.i(w8c0.b);
        return coordinatorLayoutInflate;
    }

    public final jpg0 b(int i) {
        a7v0 a7v0Var = (a7v0) this.t1.get();
        return new jpg0(new rt01(a7v0Var.a, new n5u0(a7v0Var, (byte) 17), new z6v0(a7v0Var, (byte) 1)), new sl11(i, (byte) 20));
    }

    public final void destroy() {
        this.t2.i(w8c0.a);
    }

    public final void g() {
        i6p0 i6p0Var = (i6p0) this.U0.get();
        NowPlayingScrollView nowPlayingScrollView = this.S1;
        if (nowPlayingScrollView == null) {
            u890.C("scrollCardsScrollView");
            throw null;
        }
        ScrollCardsContainer scrollCardsContainer = this.g2;
        if (scrollCardsContainer == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        rok0 rok0Var = this.q2;
        if (rok0Var == null) {
            u890.C("attentionTrackerProvider");
            throw null;
        }
        ((kyo0) i6p0Var).d(nowPlayingScrollView, scrollCardsContainer, (pgr) rok0Var.c, ((z4p0) this.r2.getValue()).f, false);
    }

    public final x8c0 getLifecycle() {
        return this.t2;
    }

    public final void h(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(2131430549);
        this.o2 = d(f6o1.A(this.r1, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), viewGroup, new jpx0(null));
        viewFindViewById.getClass();
        dtw dtwVar = this.o2;
        if (dtwVar == null) {
            u890.C("promotionalIndicatorViewHolder");
            throw null;
        }
        View view = dtwVar.w;
        this.Y1 = view;
        if (this.y2) {
            aiq0.a(view, new sjj1(view, this, (byte) 1));
        }
        k8p1.o(viewFindViewById, view);
    }

    public final void i(boolean z) {
        View view;
        if (this.y2 && (view = this.Y1) != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167033);
            ConstraintLayout constraintLayout = this.U1;
            if (constraintLayout == null) {
                u890.C("headerContainer");
                throw null;
            }
            Rect rectO = i8p1.o(constraintLayout, viewGroup);
            int i = (!z ? rectO.top : rectO.bottom) + dimensionPixelSize;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                return;
            }
            h3n h3nVar = (h3n) layoutParams;
            int i2 = rectO.left;
            View view2 = this.Z1;
            if (view2 == null) {
                u890.C("trackInfoView");
                throw null;
            }
            ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin = view2.getLeft() + i2;
            ((ViewGroup.MarginLayoutParams) h3nVar).topMargin = i;
            view.setLayoutParams(h3nVar);
        }
    }

    public final void start() {
        kge huzVar;
        dtw dtwVar;
        this.t2.i(w8c0.e);
        this.s2.a();
        g2z g2zVar = this.h2;
        lnm lnmVar = null;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        OverlayHidingFrameLayout overlayHidingFrameLayout = this.T1;
        if (overlayHidingFrameLayout == null) {
            u890.C("overlayControlsView");
            throw null;
        }
        g2zVar.J(overlayHidingFrameLayout);
        ((f3x) this.c1.get()).a();
        h3p0 h3p0Var = this.b2;
        if (h3p0Var != null) {
            h3p0Var.a();
        }
        xab1 xab1Var = this.p2;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.p2 = fn31.T(cto1.q(this), (o8n) null, 0, new t6j1(this, (lnm) null, (byte) 3), 3);
        if (!this.z2 && !this.t.a()) {
            g();
        }
        boolean z = this.y2;
        byte b = 1;
        ynb0 ynb0Var = this.b1;
        if (z) {
            View view = this.X1;
            if (view != null) {
                ((av41) ynb0Var.get()).a(new onj1(view, this, (byte) 0), new onj1(view, this, (byte) 1));
            }
        } else {
            ((av41) ynb0Var.get()).a(new knj1(this, (byte) 5), new knj1(this, (byte) 6));
        }
        if (this.y2) {
            ((h280) this.Z0.get()).b(Flowable.I(i280.c));
            xab1 xab1Var2 = this.w2;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            this.w2 = fn31.T(cto1.q(this), (o8n) null, 0, new lnj1(this, lnmVar, b), 3);
            return;
        }
        ioj1 ioj1Var = this.x2;
        if (ioj1Var == null) {
            u890.C("pageStateController");
            throw null;
        }
        View view2 = ioj1Var.j;
        u9c0 u9c0Var = ioj1Var.s;
        if (ioj1Var.f34p) {
            Flowable flowableU = ioj1Var.q.U(Boolean.FALSE);
            vbm[] vbmVarArr = q601.a;
            huzVar = new kge(flowableU);
        } else {
            huzVar = new huz(Boolean.FALSE, (byte) 10);
        }
        ioj1Var.w = fn31.T(u9c0Var, (o8n) null, 0, new k6g1(ioj1Var, huzVar, (lnm) null, (byte) 27), 3);
        if (ioj1Var.k && ((dtwVar = ioj1Var.r) != null || view2 != null)) {
            if (dtwVar != null) {
                dtwVar.f(new ur30(false));
            }
            if (view2 != null) {
                view2.setVisibility(8);
            }
            xab1 xab1Var3 = ioj1Var.x;
            if (xab1Var3 != null) {
                xab1Var3.d((CancellationException) null);
            }
            ioj1Var.x = fn31.T(u9c0Var, (o8n) null, 0, new fkj1(ioj1Var, (lnm) null, (byte) 2), 3);
        }
        ioj1Var.y = ioj1Var.d.k1.J(new yc31(eoj1.b)).subscribe(new foj1(ioj1Var, (byte) 0));
        ioj1Var.B = ioj1Var.l.getOverlayState().x(wdx0.V0).subscribe(new foj1(ioj1Var, (byte) 1));
        ioj1Var.A = ioj1Var.a.t(Functions.a).X(new a1g1(ioj1Var, (byte) 9)).subscribe(new foj1(ioj1Var, (byte) 2));
    }

    public final void stop() {
        this.t2.i(w8c0.c);
        this.s2.b();
        g2z g2zVar = this.h2;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        g2zVar.K();
        ((f3x) this.c1.get()).f.c();
        h3p0 h3p0Var = this.b2;
        if (h3p0Var != null) {
            h3p0Var.b();
        }
        xab1 xab1Var = this.p2;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (!this.z2) {
            ((kyo0) ((i6p0) this.U0.get())).e();
        }
        if (this.y2) {
            ((h280) this.Z0.get()).c();
        } else {
            ioj1 ioj1Var = this.x2;
            if (ioj1Var == null) {
                u890.C("pageStateController");
                throw null;
            }
            xab1 xab1Var2 = ioj1Var.w;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            ioj1Var.w = null;
            xab1 xab1Var3 = ioj1Var.x;
            if (xab1Var3 != null) {
                xab1Var3.d((CancellationException) null);
            }
            ioj1Var.x = null;
            Disposable disposable = ioj1Var.y;
            if (disposable != null) {
                disposable.dispose();
            }
            ioj1Var.y = null;
            Disposable disposable2 = ioj1Var.z;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            ioj1Var.z = null;
            Disposable disposable3 = ioj1Var.A;
            if (disposable3 != null) {
                disposable3.dispose();
            }
            ioj1Var.A = null;
            Disposable disposable4 = ioj1Var.B;
            if (disposable4 != null) {
                disposable4.dispose();
            }
            ioj1Var.B = null;
        }
        ((av41) this.b1.get()).d.a();
        xab1 xab1Var4 = this.w2;
        if (xab1Var4 != null) {
            xab1Var4.d((CancellationException) null);
        }
    }
}
