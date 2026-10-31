package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tcs implements iac0, m4p0 {
    public ConstraintLayout A1;
    public ScrollCardsContainer B1;
    public View C1;
    public dtw D1;
    public ArrayList E1;
    public dtw F1;
    public dtw G1;
    public xab1 H1;
    public g2z I1;
    public s880 J1;
    public rok0 K1;
    public final dfm L1;
    public final idd1 M1;
    public final Flowable N0;
    public final ReplayProcessor N1;
    public final u27 O0;
    public final tqq0 O1;
    public final mdn P0;
    public final tac0 P1;
    public final mmf0 Q0;
    public final idd1 Q1;
    public final dpf1 R0;
    public final aor S0;
    public final ynb0 T0;
    public final ynb0 U0;
    public final ynb0 V0;
    public final ynb0 W0;
    public final ynb0 X;
    public final rzo0 X0;
    public final ynb0 Y;
    public final fbm Y0;
    public final dn4 Z;
    public final kly0 Z0;
    public final xfx a;
    public final kly0 a1;
    public final vi11 b;
    public final kly0 b1;
    public final cce c;
    public final x4p0 c1;
    public final sp00 d;
    public final hnl d1;
    public final v1k e;
    public final rxj0 e1;
    public final v1k f;
    public final ynb0 f1;
    public final ynb0 g;
    public final spq0 g1;
    public final mr20 h;
    public final FlowableMap h1;
    public final iv4 i;
    public final Flowable i1;
    public final fzg0 j1;
    public final w9u0 k1;
    public final ye51 l1;
    public final ye51 m1;
    public final wpw n1;
    public final uo5 o1;
    public final eyh0 p1;
    public final List q1;
    public final xq60 r1;
    public final xpw s1;
    public final k2p0 t;
    public final bjx t1;
    public final a5p0 u1;
    public final Function0 v1;
    public final Function0 w1;
    public OverlayHidingGradientBackgroundView x1;
    public PeekScrollView y1;
    public h3p0 z1;

    public tcs(xfx xfxVar, vi11 vi11Var, cce cceVar, sp00 sp00Var, v1k v1kVar, v1k v1kVar2, ynb0 ynb0Var, mr20 mr20Var, iv4 iv4Var, k2p0 k2p0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, dn4 dn4Var, Flowable flowable, u27 u27Var, mdn mdnVar, mmf0 mmf0Var, dpf1 dpf1Var, dpt0 dpt0Var, aor aorVar, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, sqq0 sqq0Var, rzo0 rzo0Var, fbm fbmVar, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, lqc lqcVar, x4p0 x4p0Var, hnl hnlVar, rxj0 rxj0Var, ynb0 ynb0Var8, z6k0 z6k0Var, m4c m4cVar, spq0 spq0Var, FlowableMap flowableMap, Flowable flowable2, fzg0 fzg0Var, w9u0 w9u0Var, ye51 ye51Var, ye51 ye51Var2, wpw wpwVar, uo5 uo5Var, eyh0 eyh0Var, List list, xq60 xq60Var, xpw xpwVar, bjx bjxVar, a5p0 a5p0Var, Function0 function0, Function0 function1) {
        this.a = xfxVar;
        this.b = vi11Var;
        this.c = cceVar;
        this.d = sp00Var;
        this.e = v1kVar;
        this.f = v1kVar2;
        this.g = ynb0Var;
        this.h = mr20Var;
        this.i = iv4Var;
        this.t = k2p0Var;
        this.X = ynb0Var2;
        this.Y = ynb0Var3;
        this.Z = dn4Var;
        this.N0 = flowable;
        this.O0 = u27Var;
        this.P0 = mdnVar;
        this.Q0 = mmf0Var;
        this.R0 = dpf1Var;
        this.S0 = aorVar;
        this.T0 = ynb0Var4;
        this.U0 = ynb0Var5;
        this.V0 = ynb0Var6;
        this.W0 = ynb0Var7;
        this.X0 = rzo0Var;
        this.Y0 = fbmVar;
        this.Z0 = jly0Var;
        this.a1 = jly0Var2;
        this.b1 = jly0Var3;
        this.c1 = x4p0Var;
        this.d1 = hnlVar;
        this.e1 = rxj0Var;
        this.f1 = ynb0Var8;
        this.g1 = spq0Var;
        this.h1 = flowableMap;
        this.i1 = flowable2;
        this.j1 = fzg0Var;
        this.k1 = w9u0Var;
        this.l1 = ye51Var;
        this.m1 = ye51Var2;
        this.n1 = wpwVar;
        this.o1 = uo5Var;
        this.p1 = eyh0Var;
        this.q1 = list;
        this.r1 = xq60Var;
        this.s1 = xpwVar;
        this.t1 = bjxVar;
        this.u1 = a5p0Var;
        this.v1 = function0;
        this.w1 = function1;
        mnk0 mnk0Var = dpt0Var.f;
        FlowableMap flowableMap2 = dpt0Var.b;
        this.L1 = new dfm(dpt0Var.d, dpt0Var.e, flowableMap2, dpt0Var.c, z6k0Var, mnk0Var, m4cVar, dpt0Var.a, dpt0Var.g, dpt0Var.h, dpt0Var.i);
        this.M1 = new idd1(new ocs(this, (byte) 1));
        this.N1 = ReplayProcessor.e0();
        this.O1 = new tqq0(a5p0Var.a, sqq0Var.a, sqq0Var.b);
        this.P1 = new tac0(this, true);
        this.Q1 = new idd1(new ocs(this, (byte) 0));
    }

    public static dtw b(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public static dtw c(wpw wpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, obj, (ipb1) null, 112);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0371  */
    /* JADX WARN: Type inference failed for: r6v61, types: [android.view.ViewGroup$LayoutParams, com.spotify.nowplaying.scroll.ScrollCardType] */
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Throwable {
        Throwable th;
        View view;
        View view2;
        View view3;
        FrameLayout frameLayout;
        wpw wpwVar;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131625597, viewGroup, false);
        PeekScrollView peekScrollView = (PeekScrollView) coordinatorLayoutInflate.findViewById(2131430778);
        this.y1 = peekScrollView;
        this.K1 = new rok0(peekScrollView);
        this.x1 = (OverlayHidingGradientBackgroundView) coordinatorLayoutInflate.findViewById(2131430262);
        this.B1 = coordinatorLayoutInflate.findViewById(2131431706);
        this.C1 = coordinatorLayoutInflate.findViewById(2131429988);
        ConstraintLayout constraintLayoutFindViewById = coordinatorLayoutInflate.findViewById(2131430422);
        List listM = p7h.M(new View[]{b(f6o1.A(sp00.f(this.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById).w, b(f6o1.A(cce.n(this.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById).w});
        xfx xfxVar = this.a;
        View view4 = b(this.e.e(voo1.l(xfxVar)), constraintLayoutFindViewById).w;
        a5p0 a5p0Var = this.u1;
        eth.O(constraintLayoutFindViewById, listM, view4, Collections.singletonList(b(this.f.f(a5p0Var.c, this.Y0, voo1.m(xfxVar)), constraintLayoutFindViewById).w));
        dvs dvsVar = new dvs(xfxVar.c.b);
        dvsVar.q(this.t.a(this.q1, ((z4p0) this.M1.getValue()).f, new wsr(1, this.N1, ReplayProcessor.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 6)));
        boolean zC = this.Z.c();
        Flowable flowable = this.N0;
        pkf1 pkf1Var = dvsVar.a;
        if (zC) {
            View viewFindViewById = coordinatorLayoutInflate.findViewById(2131431465);
            ekf1 ekf1Var = (ekf1) this.Y.get();
            th = null;
            im0 im0Var = new im0(ekf1Var.a, ekf1Var.b, ekf1Var.c, ekf1Var.d, (Flowable) flowable.J(j561.X0), ekf1Var.e, ekf1Var.f, ekf1Var.g, dvsVar);
            OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.x1;
            if (overlayHidingGradientBackgroundView == null) {
                u890.C("modeRootView");
                throw null;
            }
            k8p1.o(viewFindViewById, b(im0Var, overlayHidingGradientBackgroundView).w);
        } else {
            th = null;
            k8p1.o(coordinatorLayoutInflate.findViewById(2131431465), pkf1Var);
            ktf1 ktf1Var = (ktf1) this.X.get();
            this.z1 = new h3p0(dvsVar, new mtf1(ktf1Var.a, ktf1Var.b, ktf1Var.c, ktf1Var.d, flowable.J(mpi1.W0), ktf1Var.e, ktf1Var.f, ktf1Var.g));
        }
        iv4 iv4Var = this.i;
        if (iv4Var.c()) {
            xpw xpwVar = (xpw) this.g.get();
            OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.x1;
            if (overlayHidingGradientBackgroundView2 == null) {
                Throwable th2 = th;
                u890.C("modeRootView");
                throw th2;
            }
            ?? r6 = th;
            dtw dtwVarC = c(f6o1.A(xpwVar, (ViewGroup.LayoutParams) r6, (ScrollCardType) r6, 3), overlayHidingGradientBackgroundView2, new emk0(0));
            this.D1 = dtwVarC;
            k8p1.o(coordinatorLayoutInflate.findViewById(2131429990), dtwVarC.w);
        }
        ConstraintLayout constraintLayoutFindViewById2 = coordinatorLayoutInflate.findViewById(2131431474);
        LinearLayout linearLayout = (LinearLayout) coordinatorLayoutInflate.findViewById(2131428854);
        if (iv4Var.b()) {
            view = null;
        } else {
            xpw xpwVar2 = (xpw) this.U0.get();
            constraintLayoutFindViewById2.getClass();
            view = c(f6o1.A(xpwVar2, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById2, new q491(6, new qcs(linearLayout, (byte) 0))).w;
        }
        constraintLayoutFindViewById2.getClass();
        f37 f37VarA = this.O0.a(this.N1.j(this.P0).J(uh21.X0));
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(constraintLayoutFindViewById2.getContext(), constraintLayoutFindViewById2, f37VarA, (drw) null, 24);
        this.G1 = dtwVarD;
        View view5 = dtwVarD.w;
        dtw dtwVarD2 = mhc.d(constraintLayoutFindViewById2.getContext(), constraintLayoutFindViewById2, this.R0, (drw) null, 24);
        this.F1 = dtwVarD2;
        View view6 = dtwVarD2.w;
        linearLayout.getClass();
        uo5 uo5Var = this.o1;
        jpg0 jpg0Var = (jpg0) uo5Var.b;
        View view7 = jpg0Var != null ? b(jpg0Var, constraintLayoutFindViewById2).w : null;
        wpw wpwVar2 = (wpw) uo5Var.d;
        eth.R(constraintLayoutFindViewById2, view5, view6, view, linearLayout, view7, wpwVar2 != null ? b(wpwVar2, constraintLayoutFindViewById2).w : null);
        qtw qtwVarA = f6o1.A(this.Q0.a(this, this.h), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        View viewFindViewById2 = coordinatorLayoutInflate.findViewById(2131429880);
        viewFindViewById2.getClass();
        k8p1.o(viewFindViewById2, b(qtwVarA, (ViewGroup) viewFindViewById2.getParent()).w);
        ConstraintLayout constraintLayoutFindViewById3 = coordinatorLayoutInflate.findViewById(2131429135);
        List<laa> list = this.r1.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (laa laaVar : list) {
            constraintLayoutFindViewById3.getClass();
            tka0 tka0Var2 = dtw.C;
            arrayList.add(mhc.d(constraintLayoutFindViewById3.getContext(), constraintLayoutFindViewById3, laaVar, (drw) null, 24));
        }
        this.E1 = arrayList;
        constraintLayoutFindViewById3.getClass();
        ArrayList arrayList2 = this.E1;
        if (arrayList2 == null) {
            u890.C("chipViewHolders");
            throw null;
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((dtw) it.next()).w);
        }
        eth.P(constraintLayoutFindViewById3, arrayList3);
        View viewFindViewById3 = coordinatorLayoutInflate.findViewById(2131431490);
        dtw dtwVarC2 = c(this.n1, (ViewGroup) viewFindViewById3.getParent(), Boolean.TRUE);
        k8p1.o(viewFindViewById3, dtwVarC2.w);
        ConstraintLayout constraintLayoutFindViewById4 = coordinatorLayoutInflate.findViewById(2131430418);
        this.A1 = constraintLayoutFindViewById4;
        ye51 ye51Var = this.m1;
        if (ye51Var == null || (view2 = b(ye51Var.a, constraintLayoutFindViewById4).w) == null) {
            view2 = new View(coordinatorLayoutInflate.getContext());
        }
        View view8 = view2;
        ye51 ye51Var2 = this.l1;
        wpw wpwVar3 = ye51Var2.a;
        ConstraintLayout constraintLayout = this.A1;
        if (constraintLayout == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view9 = b(wpwVar3, constraintLayout).w;
        ConstraintLayout constraintLayout2 = this.A1;
        if (constraintLayout2 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view10 = c(this.L1, constraintLayout2, new jpt0(this.e1.d ? gpt0.a : fpt0.a, true)).w;
        wpw wpwVar4 = ye51Var2.b;
        ConstraintLayout constraintLayout3 = this.A1;
        if (constraintLayout3 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View view11 = b(wpwVar4, constraintLayout3).w;
        if (ye51Var == null || (wpwVar = ye51Var.b) == null) {
            view3 = new View(coordinatorLayoutInflate.getContext());
        } else {
            ConstraintLayout constraintLayout4 = this.A1;
            if (constraintLayout4 == null) {
                u890.C("playbackControlsContainer");
                throw null;
            }
            view3 = b(wpwVar, constraintLayout4).w;
            if (view3 == null) {
                view3 = new View(coordinatorLayoutInflate.getContext());
            }
        }
        eth.Q(constraintLayoutFindViewById4, view8, view9, view10, view11, view3);
        View viewFindViewById4 = coordinatorLayoutInflate.findViewById(2131429699);
        viewFindViewById4.getClass();
        xpw xpwVar3 = this.s1;
        if (xpwVar3 == null) {
            frameLayout = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(viewFindViewById4.getContext());
            k8p1.o(viewFindViewById4, frameLayout2);
            tka0 tka0Var3 = dtw.C;
            View view12 = mhc.b(frameLayout2.getContext(), frameLayout2, f6o1.A(xpwVar3, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rih1.a, (ipb1) null, 112).w;
            view12.setClickable(true);
            frameLayout2.addView(view12);
            frameLayout = frameLayout2;
        }
        ViewStub viewStub = (ViewStub) coordinatorLayoutInflate.findViewById(2131428189);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewStub.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        View view13 = c(f6o1.A(this.S0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewStub.getParent(), new f3l(0.0f, 4089, false)).w;
        view13.setClickable(true);
        k8p1.o(viewStub, view13);
        gs71 gs71Var = (gs71) this.g1.h();
        if (gs71Var != null) {
            ViewStub viewStub2 = (ViewStub) coordinatorLayoutInflate.findViewById(2131427943);
            k8p1.o(viewStub2, c(f6o1.A(gs71Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewStub2.getParent(), new tr71(gr71.a)).w);
        }
        ConstraintLayout constraintLayoutFindViewById5 = coordinatorLayoutInflate.findViewById(2131427416);
        eyh0 eyh0Var = this.p1;
        wpw wpwVar5 = (wpw) eyh0Var.b;
        wpw wpwVar6 = (wpw) eyh0Var.c;
        fzg0 fzg0Var = this.j1;
        z72 z72VarA = fzg0Var.a.r() ? fzg0Var.b.a(this.k1) : null;
        qtw qtwVarA2 = z72VarA != null ? f6o1.A(z72VarA, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : null;
        if (qtwVarA2 == null) {
            qtwVarA2 = (wpw) eyh0Var.d;
        }
        constraintLayoutFindViewById5.getClass();
        eth.N(b(wpwVar5, constraintLayoutFindViewById5).w, wpwVar6 != null ? b(wpwVar6, constraintLayoutFindViewById5).w : null, qtwVarA2 != null ? b(qtwVarA2, constraintLayoutFindViewById5).w : null, constraintLayoutFindViewById5);
        View viewFindViewById5 = coordinatorLayoutInflate.findViewById(2131430694);
        jpg0 jpg0Var2 = (jpg0) uo5Var.c;
        PeekScrollView peekScrollView2 = this.y1;
        if (peekScrollView2 == null) {
            u890.C("peekScrollView");
            throw null;
        }
        FlowableRefCount flowableRefCount = peekScrollView2.k1;
        pcs pcsVar = pcs.b;
        w2s w2sVarN = this.b.n(jpg0Var2, new bzb1(flowableRefCount.J(new yla((byte) 7)), new l1k(0, this, tcs.class, "playBackControlsTop", "playBackControlsTop()I", 0, (byte) 25)), (qtw) null);
        PeekScrollView peekScrollView3 = this.y1;
        if (peekScrollView3 == null) {
            u890.C("peekScrollView");
            throw null;
        }
        k8p1.o(viewFindViewById5, c(w2sVarN, coordinatorLayoutInflate, new zyb1(new l1k(0, peekScrollView3, PeekScrollView.class, "scrollToTop", "scrollToTop()V", 0, (byte) 26), false)).w);
        Flowable flowable2 = a5p0Var.b;
        PeekScrollView peekScrollView4 = this.y1;
        if (peekScrollView4 == null) {
            u890.C("peekScrollView");
            throw null;
        }
        FlowableRefCount flowableRefCount2 = peekScrollView4.l1;
        rzo0 rzo0Var = this.X0;
        this.I1 = new g2z(flowable2, flowableRefCount2, (FlowableMap) rzo0Var.b, (Scheduler) rzo0Var.c, (tu4) rzo0Var.d);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView3 = this.x1;
        if (overlayHidingGradientBackgroundView3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        overlayHidingGradientBackgroundView3.setOverlayView(coordinatorLayoutInflate.findViewById(2131430692));
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView4 = this.x1;
        if (overlayHidingGradientBackgroundView4 == null) {
            u890.C("modeRootView");
            throw null;
        }
        Flowable<nwq0> overlayState = overlayHidingGradientBackgroundView4.getOverlayState();
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) coordinatorLayoutInflate.findViewById(2131427872);
        ConstraintLayout constraintLayout5 = this.A1;
        if (constraintLayout5 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        ScrollCardsContainer scrollCardsContainer = this.B1;
        if (scrollCardsContainer == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        this.J1 = new s880((Flowable) overlayState, horizontalScrollView, (View) constraintLayout5, (View) scrollCardsContainer, coordinatorLayoutInflate.findViewById(2131430693), frameLayout, dtwVarC2);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView5 = this.x1;
        if (overlayHidingGradientBackgroundView5 == null) {
            u890.C("modeRootView");
            throw null;
        }
        View viewFindViewById6 = coordinatorLayoutInflate.findViewById(2131430422);
        ConstraintLayout constraintLayout6 = this.A1;
        if (constraintLayout6 == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        View viewFindViewById7 = coordinatorLayoutInflate.findViewById(2131430693);
        j7p1.x(overlayHidingGradientBackgroundView5, new rcs(this, (byte) 0));
        j7p1.x(viewFindViewById6, new rcs(this, (byte) 1));
        j7p1.x(pkf1Var, new rcs(this, (byte) 2));
        j7p1.x(constraintLayoutFindViewById2, new rcs(this, (byte) 3));
        j7p1.x(constraintLayout6, new rcs(this, (byte) 4));
        if (viewFindViewById7 != null) {
            j7p1.x(viewFindViewById7, new rcs(this, (byte) 5));
        }
        x9p1.p(coordinatorLayoutInflate, this);
        op80 jp80Var = new jp80(coordinatorLayoutInflate);
        op80 eq80Var = new eq80(new e3h1((l6h1) this.a1.get(), (n7h1) this.b1.get(), (i8h1) this.Z0.get()));
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
        this.P1.i(w8c0.b);
        return coordinatorLayoutInflate;
    }

    public final void d() {
        i6p0 i6p0Var = (i6p0) this.T0.get();
        PeekScrollView peekScrollView = this.y1;
        if (peekScrollView == null) {
            u890.C("peekScrollView");
            throw null;
        }
        ScrollCardsContainer scrollCardsContainer = this.B1;
        if (scrollCardsContainer == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        rok0 rok0Var = this.K1;
        if (rok0Var != null) {
            ((kyo0) i6p0Var).d(peekScrollView, scrollCardsContainer, (pgr) rok0Var.c, ((z4p0) this.M1.getValue()).f, true);
        } else {
            u890.C("attentionTrackerProvider");
            throw null;
        }
    }

    public final void destroy() {
        this.P1.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.P1;
    }

    public final void start() {
        this.P1.i(w8c0.e);
        this.O1.a();
        ((ww9) this.Q1.getValue()).a(new scs(this));
        h280 h280Var = (h280) this.W0.get();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.x1;
        if (overlayHidingGradientBackgroundView == null) {
            u890.C("modeRootView");
            throw null;
        }
        h280Var.b(overlayHidingGradientBackgroundView.getOverlayState().J(vrg.W0));
        g2z g2zVar = this.I1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.x1;
        if (overlayHidingGradientBackgroundView2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        g2zVar.J(overlayHidingGradientBackgroundView2);
        k6k0 k6k0Var = (k6k0) this.f1.get();
        rcs rcsVar = new rcs(this, (byte) 6);
        if (k6k0Var.c.d) {
            rku rkuVar = k6k0Var.d;
            Flowable flowableH = Flowable.h(k6k0Var.a, yoi1.h(k6k0Var.b.a, o6x.a), new q3c(k6k0Var));
            flowableH.getClass();
            rkuVar.b(flowableH.t(Functions.a).subscribe(new lrj0(rcsVar, (byte) 5)));
        } else {
            rcsVar.invoke(Boolean.FALSE);
        }
        xab1 xab1Var = this.H1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        byte b = 4;
        this.H1 = fn31.T(cto1.q(this), (o8n) null, 0, new n5s(this, (lnm) null, (byte) 4), 3);
        h3p0 h3p0Var = this.z1;
        if (h3p0Var != null) {
            h3p0Var.a();
        }
        if (!this.i.a()) {
            d();
        }
        if (this.d1.c()) {
            s880 s880Var = this.J1;
            if (s880Var == null) {
                u890.C("minimizeLayoutController");
                throw null;
            }
            ((rku) s880Var.a).b(((Flowable) s880Var.b).subscribe(new lrj0(s880Var, b)));
        }
        this.v1.invoke();
    }

    public final void stop() {
        this.P1.i(w8c0.c);
        this.O1.b();
        ww9 ww9Var = (ww9) this.Q1.getValue();
        ww9Var.c.a();
        ww9Var.d = null;
        ((h280) this.W0.get()).c();
        g2z g2zVar = this.I1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        g2zVar.K();
        ((k6k0) this.f1.get()).d.a();
        xab1 xab1Var = this.H1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        h3p0 h3p0Var = this.z1;
        if (h3p0Var != null) {
            h3p0Var.b();
        }
        ((kyo0) ((i6p0) this.T0.get())).e();
        if (this.d1.c()) {
            s880 s880Var = this.J1;
            if (s880Var == null) {
                u890.C("minimizeLayoutController");
                throw null;
            }
            ((rku) s880Var.a).a();
        }
        this.w1.invoke();
    }
}
