package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y0y implements m4p0, iac0 {
    public View A1;
    public View B1;
    public View C1;
    public g2z D1;
    public ConstraintLayout E1;
    public rok0 F1;
    public View G1;
    public EncoreTextView H1;
    public dtw I1;
    public xab1 J1;
    public final idd1 K1 = new idd1(new v7v(this, (byte) 23));
    public final tac0 L1 = new tac0(this, true);
    public final bjx M1 = new bjx(new u0y(this, (byte) 11), s8x.d1, s8x.e1, x0y.b, x0y.c, x0y.d, (byte) 18);
    public final z6k0 N0;
    public final m4c O0;
    public final rxj0 P0;
    public final k691 Q0;
    public final o671 R0;
    public final spq0 S0;
    public final ynb0 T0;
    public final ynb0 U0;
    public final dn4 V0;
    public final k2p0 W0;
    public final yl1 X;
    public final aor X0;
    public final s691 Y;
    public final ynb0 Y0;
    public final dpt0 Z;
    public final ynb0 Z0;
    public final xfx a;
    public final ynb0 a1;
    public final c21 b;
    public final rzo0 b1;
    public final cce c;
    public final FlowableDistinctUntilChanged c1;
    public final sp00 d;
    public final ynb0 d1;
    public final vi11 e;
    public final ynb0 e1;
    public final v1k f;
    public final ynb0 f1;
    public final tck g;
    public final ynb0 g1;
    public final dpf1 h;
    public final fbm h1;
    public final FlowableMap i;
    public final i8h1 i1;
    public final l6h1 j1;
    public final n7h1 k1;
    public final x4p0 l1;
    public final ynb0 m1;
    public final b1y n1;
    public final n6r0 o1;
    public final lik1 p1;
    public final mr20 q1;
    public ViewGroup r1;
    public PeekScrollView s1;
    public final mo51 t;
    public View t1;
    public OverlayHidingGradientBackgroundView u1;
    public h3p0 v1;
    public View w1;
    public ScrollCardsContainer x1;
    public View y1;
    public View z1;

    public y0y(xfx xfxVar, c21 c21Var, cce cceVar, sp00 sp00Var, vi11 vi11Var, v1k v1kVar, tck tckVar, dpf1 dpf1Var, FlowableMap flowableMap, mo51 mo51Var, yl1 yl1Var, s691 s691Var, dpt0 dpt0Var, z6k0 z6k0Var, m4c m4cVar, rxj0 rxj0Var, k691 k691Var, o671 o671Var, spq0 spq0Var, ynb0 ynb0Var, ynb0 ynb0Var2, dn4 dn4Var, k2p0 k2p0Var, aor aorVar, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, rzo0 rzo0Var, FlowableDistinctUntilChanged flowableDistinctUntilChanged, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, fbm fbmVar, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, lqc lqcVar, x4p0 x4p0Var, ynb0 ynb0Var10, b1y b1yVar, n6r0 n6r0Var, lik1 lik1Var, mr20 mr20Var) {
        this.a = xfxVar;
        this.b = c21Var;
        this.c = cceVar;
        this.d = sp00Var;
        this.e = vi11Var;
        this.f = v1kVar;
        this.g = tckVar;
        this.h = dpf1Var;
        this.i = flowableMap;
        this.t = mo51Var;
        this.X = yl1Var;
        this.Y = s691Var;
        this.Z = dpt0Var;
        this.N0 = z6k0Var;
        this.O0 = m4cVar;
        this.P0 = rxj0Var;
        this.Q0 = k691Var;
        this.R0 = o671Var;
        this.S0 = spq0Var;
        this.T0 = ynb0Var;
        this.U0 = ynb0Var2;
        this.V0 = dn4Var;
        this.W0 = k2p0Var;
        this.X0 = aorVar;
        this.Y0 = ynb0Var3;
        this.Z0 = ynb0Var4;
        this.a1 = ynb0Var5;
        this.b1 = rzo0Var;
        this.c1 = flowableDistinctUntilChanged;
        this.d1 = ynb0Var6;
        this.e1 = ynb0Var7;
        this.f1 = ynb0Var8;
        this.g1 = ynb0Var9;
        this.h1 = fbmVar;
        this.i1 = i8h1Var;
        this.j1 = l6h1Var;
        this.k1 = n7h1Var;
        this.l1 = x4p0Var;
        this.m1 = ynb0Var10;
        this.n1 = b1yVar;
        this.o1 = n6r0Var;
        this.p1 = lik1Var;
        this.q1 = mr20Var;
    }

    public static void b(EncoreTextView encoreTextView, int i) {
        String string = encoreTextView.getContext().getString(2131954989);
        String string2 = encoreTextView.getContext().getString(i, string);
        SpannableString spannableString = new SpannableString(string2);
        int iW0 = ihc1.w0(string2, string, 0, false, 6);
        if (iW0 >= 0) {
            spannableString.setSpan(new ntj(encoreTextView.getContext(), (byte) 1), iW0, string.length() + iW0, 33);
        }
        encoreTextView.setText(spannableString);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static dtw c(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public static View d(y0y y0yVar, View view, wpw wpwVar) {
        View view2 = c(wpwVar, (ViewGroup) view.getParent()).w;
        view2.setVisibility(0);
        k8p1.o(view, view2);
        return view2;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131624577, viewGroup, false);
        this.r1 = viewGroup2;
        x9p1.p(viewGroup2, this);
        ViewGroup viewGroup3 = this.r1;
        if (viewGroup3 == null) {
            u890.C("rootView");
            throw null;
        }
        op80 jp80Var = new jp80(viewGroup3);
        i8h1 i8h1Var = this.i1;
        op80 eq80Var = new eq80(new e3h1(this.j1, this.k1, i8h1Var));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(viewGroup3, jp80Var);
        this.L1.i(w8c0.b);
        ViewGroup viewGroup4 = this.r1;
        if (viewGroup4 == null) {
            u890.C("rootView");
            throw null;
        }
        PeekScrollView peekScrollView = (PeekScrollView) viewGroup4.findViewById(2131430778);
        this.s1 = peekScrollView;
        this.F1 = new rok0(peekScrollView);
        ViewGroup viewGroup5 = this.r1;
        if (viewGroup5 == null) {
            u890.C("rootView");
            throw null;
        }
        this.u1 = (OverlayHidingGradientBackgroundView) viewGroup5.findViewById(2131430262);
        ViewGroup viewGroup6 = this.r1;
        if (viewGroup6 == null) {
            u890.C("rootView");
            throw null;
        }
        this.x1 = viewGroup6.findViewById(2131431706);
        ViewGroup viewGroup7 = this.r1;
        if (viewGroup7 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById = viewGroup7.findViewById(2131428187);
        qtw qtwVarA = f6o1.A(this.X0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ViewGroup viewGroup8 = (ViewGroup) viewFindViewById.getParent();
        f3l f3lVar = new f3l(0.0f, 4095, false);
        tka0 tka0Var = dtw.C;
        View view = mhc.b(viewGroup8.getContext(), viewGroup8, qtwVarA, f3lVar, (ipb1) null, 112).w;
        view.setClickable(true);
        k8p1.o(viewFindViewById, view);
        this.w1 = view;
        ViewGroup viewGroup9 = this.r1;
        if (viewGroup9 == null) {
            u890.C("rootView");
            throw null;
        }
        this.E1 = viewGroup9.findViewById(2131430418);
        ViewGroup viewGroup10 = this.r1;
        if (viewGroup10 == null) {
            u890.C("rootView");
            throw null;
        }
        ConstraintLayout constraintLayoutFindViewById = viewGroup10.findViewById(2131430422);
        v1k v1kVar = this.f;
        xfx xfxVar = this.a;
        ug3 ug3VarE = v1kVar.e(voo1.l(xfxVar));
        constraintLayoutFindViewById.getClass();
        View view2 = c(ug3VarE, constraintLayoutFindViewById).w;
        qzh qzhVarM = voo1.m(xfxVar);
        tck tckVar = this.g;
        View view3 = c(new vzx((Flowable) tckVar.d, (lik1) tckVar.e, (ywc0) tckVar.f, (b1y) tckVar.g, (mta) tckVar.h, (i4q) tckVar.c, (yhm) tckVar.i, tckVar.b, (cmf1) tckVar.j, this.h1, (Scheduler) tckVar.k, qzhVarM, yoi1.h((mr20) tckVar.a, o6x.a), (lkd) tckVar.l), constraintLayoutFindViewById).w;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(c(f6o1.A(sp00.f(this.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById).w);
        smc0VarN.add(c(f6o1.A(cce.n(this.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), constraintLayoutFindViewById).w);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        smc0 smc0VarN2 = k4p1.n();
        smc0VarN2.add(view3);
        eth.O(constraintLayoutFindViewById, smc0VarK, view2, k4p1.k(smc0VarN2));
        this.y1 = view2;
        this.z1 = view3;
        dvs dvsVar = new dvs(xfxVar.c.b);
        lzd lzdVar = new lzd(lkf1.f, null);
        lkf1 lkf1Var = lkf1.b;
        mr20 mr20Var = this.q1;
        dvsVar.q(this.W0.a(p7h.M(new lzd[]{lzdVar, new lzd(lkf1Var, mr20Var), new lzd(lkf1.a, mr20Var), new lzd(lkf1.g, null)}), ((z4p0) this.K1.getValue()).f, pzo0.f));
        boolean zC = this.V0.c();
        ViewGroup viewGroup11 = this.r1;
        pkf1 pkf1Var = dvsVar.a;
        if (zC) {
            if (viewGroup11 == null) {
                u890.C("rootView");
                throw null;
            }
            View viewFindViewById2 = viewGroup11.findViewById(2131431465);
            im0 im0VarA = ekf1.a((ekf1) this.U0.get(), dvsVar);
            OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.u1;
            if (overlayHidingGradientBackgroundView == null) {
                u890.C("modeRootView");
                throw null;
            }
            k8p1.o(viewFindViewById2, c(im0VarA, overlayHidingGradientBackgroundView).w);
        } else {
            if (viewGroup11 == null) {
                u890.C("rootView");
                throw null;
            }
            k8p1.o(viewGroup11.findViewById(2131431465), pkf1Var);
            this.v1 = new h3p0(dvsVar, ktf1.a((ktf1) this.T0.get()));
        }
        ViewGroup viewGroup12 = this.r1;
        if (viewGroup12 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById3 = viewGroup12.findViewById(2131431475);
        ViewGroup viewGroup13 = (ViewGroup) viewFindViewById3.getParent();
        dtw dtwVarD = mhc.d(viewGroup13.getContext(), viewGroup13, this.h, (drw) null, 24);
        this.I1 = dtwVarD;
        k8p1.o(viewFindViewById3, dtwVarD.w);
        ViewGroup viewGroup14 = this.r1;
        if (viewGroup14 == null) {
            u890.C("rootView");
            throw null;
        }
        this.G1 = d(this, viewGroup14.findViewById(2131431490), new jpg0(this.t.a(voo1.t(xfxVar, (xzf1) null)), s8x.Z0));
        ViewGroup viewGroup15 = this.r1;
        if (viewGroup15 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById4 = viewGroup15.findViewById(2131427521);
        qzh qzhVarI = voo1.i(xfxVar);
        yl1 yl1Var = this.X;
        this.B1 = d(this, viewFindViewById4, new jpg0(yl1Var.a(qzhVarI), s8x.a1));
        ViewGroup viewGroup16 = this.r1;
        if (viewGroup16 == null) {
            u890.C("rootView");
            throw null;
        }
        d(this, viewGroup16.findViewById(2131430492), this.Y.a(voo1.s(xfxVar)));
        ViewGroup viewGroup17 = this.r1;
        if (viewGroup17 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById5 = viewGroup17.findViewById(2131430407);
        dpt0 dpt0Var = this.Z;
        mnk0 mnk0Var = dpt0Var.f;
        FlowableMap flowableMap = dpt0Var.b;
        w9u0 w9u0Var = dpt0Var.d;
        Flowable flowable = dpt0Var.a;
        d(this, viewFindViewById5, new jpg0(new dfm(w9u0Var, dpt0Var.e, flowableMap, dpt0Var.c, this.N0, mnk0Var, this.O0, flowable, dpt0Var.g, dpt0Var.h, dpt0Var.i), new u0y(this, (byte) 1)));
        ViewGroup viewGroup18 = this.r1;
        if (viewGroup18 == null) {
            u890.C("rootView");
            throw null;
        }
        d(this, viewGroup18.findViewById(2131430141), this.Q0.a(voo1.r(xfxVar)));
        ViewGroup viewGroup19 = this.r1;
        if (viewGroup19 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById6 = viewGroup19.findViewById(2131427956);
        plr plrVar = new plr(xfxVar.a.a);
        c21 c21Var = this.b;
        d(this, viewFindViewById6, new bfe((joe) c21Var.b, (xee) c21Var.c, (Flowable) c21Var.d, (FlowableMap) c21Var.e, (mr20) c21Var.f, plrVar, (vz80) c21Var.g, (q8n) c21Var.h, (mr4) c21Var.i, (a1r0) c21Var.t));
        ViewGroup viewGroup20 = this.r1;
        if (viewGroup20 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById7 = viewGroup20.findViewById(2131428658);
        ViewGroup viewGroup21 = this.r1;
        if (viewGroup21 == null) {
            u890.C("rootView");
            throw null;
        }
        this.C1 = d(this, viewGroup21.findViewById(2131430938), o671.a(this.R0, voo1.u(xfxVar)));
        ViewGroup viewGroup22 = this.r1;
        if (viewGroup22 == null) {
            u890.C("rootView");
            throw null;
        }
        this.A1 = viewGroup22.findViewById(2131431472);
        ViewGroup viewGroup23 = this.r1;
        if (viewGroup23 == null) {
            u890.C("rootView");
            throw null;
        }
        View viewFindViewById8 = viewGroup23.findViewById(2131428659);
        jpg0 jpg0Var = new jpg0(yl1Var.a(voo1.i(xfxVar)), s8x.b1);
        PeekScrollView peekScrollView2 = this.s1;
        if (peekScrollView2 == null) {
            u890.C("peekScrollView");
            throw null;
        }
        FlowableRefCount flowableRefCount = peekScrollView2.k1;
        v0y v0yVar = v0y.b;
        this.t1 = d(this, viewFindViewById8, new jpg0(this.e.n(jpg0Var, new bzb1(flowableRefCount.J(new jxa((byte) 9)), new y0u(0, this, y0y.class, "calculatePlayBackControlsTop", "calculatePlayBackControlsTop()I", 0, (byte) 10)), (qtw) null), new u0y(this, (byte) 0)));
        PeekScrollView peekScrollView3 = this.s1;
        if (peekScrollView3 == null) {
            u890.C("peekScrollView");
            throw null;
        }
        FlowableRefCount flowableRefCount2 = peekScrollView3.l1;
        rzo0 rzo0Var = this.b1;
        this.D1 = new g2z(this.c1, flowableRefCount2, (FlowableMap) rzo0Var.b, (Scheduler) rzo0Var.c, (tu4) rzo0Var.d);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.u1;
        if (overlayHidingGradientBackgroundView2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        ViewGroup viewGroup24 = this.r1;
        if (viewGroup24 == null) {
            u890.C("rootView");
            throw null;
        }
        overlayHidingGradientBackgroundView2.setOverlayView(viewGroup24.findViewById(2131430420));
        gs71 gs71Var = (gs71) this.S0.h();
        if (gs71Var != null) {
            ViewGroup viewGroup25 = this.r1;
            if (viewGroup25 == null) {
                u890.C("rootView");
                throw null;
            }
            ViewStub viewStub = (ViewStub) viewGroup25.findViewById(2131427943);
            ViewGroup viewGroup26 = (ViewGroup) viewStub.getParent();
            k8p1.o(viewStub, mhc.b(viewGroup26.getContext(), viewGroup26, f6o1.A(gs71Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new tr71(gr71.a), (ipb1) null, 112).w);
        }
        ViewGroup viewGroup27 = this.r1;
        if (viewGroup27 == null) {
            u890.C("rootView");
            throw null;
        }
        EncoreTextView encoreTextViewFindViewById = viewGroup27.findViewById(2131428485);
        this.H1 = encoreTextViewFindViewById;
        Context context = encoreTextViewFindViewById.getContext();
        int iC = l1d.C(this.n1.a());
        EncoreTextView encoreTextView = this.H1;
        if (iC != 0) {
            if (iC != 3) {
                if (encoreTextView == null) {
                    u890.C("disclaimer");
                    throw null;
                }
                encoreTextView.setText(context.getString(2131954991));
            } else {
                if (encoreTextView == null) {
                    u890.C("disclaimer");
                    throw null;
                }
                b(encoreTextView, 2131954992);
            }
        } else {
            if (encoreTextView == null) {
                u890.C("disclaimer");
                throw null;
            }
            b(encoreTextView, 2131954990);
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView3 = this.u1;
        if (overlayHidingGradientBackgroundView3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        View view4 = this.A1;
        if (view4 == null) {
            u890.C("trackInfoContainer");
            throw null;
        }
        ConstraintLayout constraintLayout = this.E1;
        if (constraintLayout == null) {
            u890.C("playbackControlsContainer");
            throw null;
        }
        viewFindViewById7.getClass();
        j7p1.x(overlayHidingGradientBackgroundView3, new u0y(this, (byte) 2));
        j7p1.x(constraintLayoutFindViewById, new u0y(this, (byte) 3));
        j7p1.x(pkf1Var, new u0y(this, (byte) 4));
        j7p1.x(view4, new u0y(this, (byte) 5));
        j7p1.x(constraintLayout, new u0y(this, (byte) 6));
        j7p1.x(viewFindViewById7, new u0y(this, (byte) 7));
        ViewGroup viewGroup28 = this.r1;
        if (viewGroup28 != null) {
            return viewGroup28;
        }
        u890.C("rootView");
        throw null;
    }

    public final void destroy() {
        this.L1.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.L1;
    }

    public final void start() {
        this.L1.i(w8c0.e);
        h3p0 h3p0Var = this.v1;
        if (h3p0Var != null) {
            h3p0Var.a();
        }
        ((tqq0) this.Z0.get()).a();
        ww9 ww9Var = (ww9) this.d1.get();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.u1;
        if (overlayHidingGradientBackgroundView == null) {
            u890.C("modeRootView");
            throw null;
        }
        ww9Var.a(new w0y(overlayHidingGradientBackgroundView, (byte) 0));
        skn0 skn0Var = (skn0) this.m1.get();
        NestedScrollView nestedScrollView = this.s1;
        if (nestedScrollView == null) {
            u890.C("peekScrollView");
            throw null;
        }
        Disposable disposable = skn0Var.b;
        if (disposable == null || disposable.isDisposed()) {
            Flowable flowableH = Flowable.h(skn0Var.d, skn0Var.e, sa20.Q0);
            flowableH.getClass();
            skn0Var.b = flowableH.t(Functions.a).L(skn0Var.a).subscribe(new rkn0(nestedScrollView, (byte) 0));
        }
        h280 h280Var = (h280) this.a1.get();
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView2 = this.u1;
        if (overlayHidingGradientBackgroundView2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        h280Var.b(overlayHidingGradientBackgroundView2.getOverlayState().J(pbo1.Z0));
        g2z g2zVar = this.D1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView3 = this.u1;
        if (overlayHidingGradientBackgroundView3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        g2zVar.J(overlayHidingGradientBackgroundView3);
        kou kouVar = (kou) this.e1.get();
        fn31.T(kouVar.b, (o8n) null, 0, new ymu(kouVar, new u0y(this, (byte) 8), (lnm) null, (byte) 3), 3);
        tbm tbmVar = (tbm) this.g1.get();
        tbmVar.c.b(tbmVar.a.J(uh21.T0).t(Functions.a).L(tbmVar.b).subscribe(new yrh(new u0y(this, (byte) 9), (byte) 5)));
        zmu zmuVar = (zmu) this.f1.get();
        fn31.T(zmuVar.b, (o8n) null, 0, new ymu(zmuVar, new u0y(this, (byte) 10), (lnm) null, (byte) 0), 3);
        xab1 xab1Var = this.J1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.J1 = fn31.T(cto1.q(this), (o8n) null, 0, new ett(this, (lnm) null, (byte) 15), 3);
        i6p0 i6p0Var = (i6p0) this.Y0.get();
        PeekScrollView peekScrollView = this.s1;
        if (peekScrollView == null) {
            u890.C("peekScrollView");
            throw null;
        }
        ScrollCardsContainer scrollCardsContainer = this.x1;
        if (scrollCardsContainer == null) {
            u890.C("scrollCardsContainer");
            throw null;
        }
        rok0 rok0Var = this.F1;
        if (rok0Var != null) {
            ((kyo0) i6p0Var).d(peekScrollView, scrollCardsContainer, (pgr) rok0Var.c, ((z4p0) this.K1.getValue()).f, true);
        } else {
            u890.C("attentionTrackerProvider");
            throw null;
        }
    }

    public final void stop() {
        this.L1.i(w8c0.c);
        h3p0 h3p0Var = this.v1;
        if (h3p0Var != null) {
            h3p0Var.b();
        }
        ((tqq0) this.Z0.get()).b();
        op71.q(((kou) this.e1.get()).b.a, (CancellationException) null);
        ww9 ww9Var = (ww9) this.d1.get();
        ww9Var.c.a();
        ww9Var.d = null;
        skn0 skn0Var = (skn0) this.m1.get();
        Disposable disposable = skn0Var.b;
        if (disposable != null) {
            disposable.dispose();
        }
        skn0Var.b = null;
        ((h280) this.a1.get()).c();
        g2z g2zVar = this.D1;
        if (g2zVar == null) {
            u890.C("overlayController");
            throw null;
        }
        g2zVar.K();
        ((tbm) this.g1.get()).c.a();
        op71.q(((zmu) this.f1.get()).b.a, (CancellationException) null);
        xab1 xab1Var = this.J1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        ((kyo0) ((i6p0) this.Y0.get())).e();
    }
}
