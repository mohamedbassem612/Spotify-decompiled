package p;

import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplayingqueue.bottomsheet.view.DropShadowContainer;
import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ccz0 implements Connectable {
    public final idd1 N0;
    public final idd1 O0;
    public final dtw P0;
    public final tfg Q0;
    public final vfg R0;
    public final ynv S0;
    public final krg T0;
    public final ggg U0;
    public final cpm0 V0;
    public final f621 W0;
    public final xrl0 X;
    public final dtw X0;
    public final bno Y;
    public final lx01 Y0;
    public final o860 Z;
    public gd61 Z0;
    public final mnb0 a;
    public ibn a1;
    public final h2y0 b;
    public final eg7 b1;
    public final iu30 c;
    public x9z0 c1;
    public final Function0 d;
    public ValueAnimator d1;
    public final obz0 e;
    public ValueAnimator e1;
    public final w9z0 f;
    public ValueAnimator f1;
    public final hur g;
    public int g1;
    public final eh4 h;
    public final eaz0 i;
    public final m980 t;

    public ccz0(mnb0 mnb0Var, CoordinatorLayout coordinatorLayout, h2y0 h2y0Var, iu30 iu30Var, Function0 function0, obz0 obz0Var, w9z0 w9z0Var, hur hurVar, eh4 eh4Var, dfm dfmVar, mzr0 mzr0Var, hyy0 hyy0Var, xfx xfxVar, eaz0 eaz0Var, m980 m980Var, ln91 ln91Var, kx21 kx21Var, l0x0 l0x0Var, xrl0 xrl0Var, bno bnoVar) {
        ConstraintLayout constraintLayout = mnb0Var.b;
        CoordinatorLayout coordinatorLayout2 = mnb0Var.a;
        this.a = mnb0Var;
        this.b = h2y0Var;
        this.c = iu30Var;
        this.d = function0;
        this.e = obz0Var;
        this.f = w9z0Var;
        this.g = hurVar;
        this.h = eh4Var;
        this.i = eaz0Var;
        this.t = m980Var;
        this.X = xrl0Var;
        this.Y = bnoVar;
        LayoutInflater.from(coordinatorLayout.getContext()).inflate(2131625120, (ViewGroup) coordinatorLayout);
        int i = 2131428533;
        if (((DropShadowContainer) m5n1.t(coordinatorLayout, 2131428533)) != null) {
            i = 2131428561;
            EditModeBarContainerView editModeBarContainerView = (EditModeBarContainerView) m5n1.t(coordinatorLayout, 2131428561);
            if (editModeBarContainerView != null) {
                i = 2131430564;
                View viewT = m5n1.t(coordinatorLayout, 2131430564);
                if (viewT != null) {
                    i = 2131430565;
                    QueueControlsLayout queueControlsLayout = (QueueControlsLayout) m5n1.t(coordinatorLayout, 2131430565);
                    if (queueControlsLayout != null) {
                        i = 2131430670;
                        FrameLayout frameLayout = (FrameLayout) m5n1.t(coordinatorLayout, 2131430670);
                        if (frameLayout != null) {
                            i = 2131430925;
                            SessionModifierContainerView sessionModifierContainerView = (SessionModifierContainerView) m5n1.t(coordinatorLayout, 2131430925);
                            if (sessionModifierContainerView != null) {
                                this.Z = new o860(coordinatorLayout, editModeBarContainerView, viewT, queueControlsLayout, frameLayout, sessionModifierContainerView);
                                idd1 idd1Var = new idd1(new g1x0(xfxVar, this, (byte) 25));
                                this.N0 = idd1Var;
                                idd1 idd1Var2 = new idd1(new acz0(this, (byte) 0));
                                this.O0 = idd1Var2;
                                tka0 tka0Var = dtw.C;
                                dtw dtwVarB = mhc.b(constraintLayout.getContext(), constraintLayout, f6o1.A(new q9z0((Flowable) mzr0Var.a, ((cjs) mzr0Var.b).a(), (xrn0) mzr0Var.c, (vqv0) mzr0Var.d, (unr) mzr0Var.f, (aor) mzr0Var.e, (jtl1) mzr0Var.g, new acz0(this, (byte) 1)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new m9z0(false, n9z0.d, false), (ipb1) null, 112);
                                this.P0 = dtwVarB;
                                tfg tfgVar = new tfg(coordinatorLayout2.getContext());
                                this.Q0 = tfgVar;
                                vfg vfgVar = new vfg(coordinatorLayout2.getContext());
                                this.R0 = vfgVar;
                                ynv ynvVar = new ynv(coordinatorLayout2.getContext());
                                this.S0 = ynvVar;
                                krg krgVar = new krg(coordinatorLayout2.getContext());
                                this.T0 = krgVar;
                                ggg gggVar = new ggg(coordinatorLayout2.getContext());
                                this.U0 = gggVar;
                                cpm0 cpm0Var = new cpm0(coordinatorLayout2.getContext());
                                this.V0 = cpm0Var;
                                f621 f621Var = new f621(coordinatorLayout2.getContext());
                                this.W0 = f621Var;
                                dtw dtwVarB2 = mhc.b(frameLayout.getContext(), frameLayout, f6o1.A(new yxb0((hj91) l0x0Var.b, (ruz) l0x0Var.c, (Flowable) l0x0Var.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), Boolean.FALSE, (ipb1) null, 112);
                                this.X0 = dtwVarB2;
                                lx01 lx01Var = new lx01(coordinatorLayout2.getContext());
                                lx01Var.setResources(kx21Var);
                                this.Y0 = lx01Var;
                                this.b1 = new eg7(this, (byte) 20);
                                j7p1.y(sessionModifierContainerView, new acz0(this, (byte) 7));
                                j7p1.y(frameLayout, new acz0(this, (byte) 8));
                                j7p1.y(constraintLayout, new acz0(this, (byte) 9));
                                RecyclerView recyclerView = mnb0Var.c;
                                recyclerView.setFocusable(false);
                                recyclerView.j(new g9f1(recyclerView.getContext()));
                                recyclerView.setAdapter(obz0Var);
                                z511 adapter = recyclerView.getAdapter();
                                if (adapter != null) {
                                    recyclerView.setLayoutManager(new StickyHeaderLinearLayoutManager(recyclerView.getContext(), adapter, new v3v0(1, obz0Var, mbz0.class, "isStickyHeaderAt", "isStickyHeaderAt(I)Z", 0, (byte) 12)));
                                }
                                View view = yoo1.w(eh4Var) ? ((dtw) idd1Var2.getValue()).w : ((qzh) idd1Var.getValue()).getView();
                                View view2 = u2o1.u(new jpg0(dfmVar, v9z0.R0), constraintLayout).w;
                                View view3 = dtwVarB.w;
                                View view4 = mhc.b(constraintLayout.getContext(), constraintLayout, f6o1.A((r060) hyy0Var.b, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new pqg1((pux0) hyy0Var.c, new acz0(this, (byte) 6)), (ipb1) null, 112).w;
                                View view5 = tfgVar.getView();
                                View view6 = vfgVar.getView();
                                View view7 = ynvVar.getView();
                                View view8 = krgVar.getView();
                                View view9 = lx01Var.getView();
                                int dimensionPixelSize = constraintLayout.getContext().getResources().getDimensionPixelSize(2131167029);
                                int dimensionPixelSize2 = constraintLayout.getContext().getResources().getDimensionPixelSize(2131167023);
                                View view10 = view;
                                int dimensionPixelSize3 = constraintLayout.getContext().getResources().getDimensionPixelSize(2131167033);
                                int dimensionPixelSize4 = constraintLayout.getContext().getResources().getDimensionPixelSize(2131167027);
                                View rootView = view3.getRootView();
                                View rootView2 = view4.getRootView();
                                View rootView3 = view10.getRootView();
                                View rootView4 = view2 != null ? view2.getRootView() : null;
                                View rootView5 = view5.getRootView();
                                View rootView6 = view6.getRootView();
                                View rootView7 = view7.getRootView();
                                View rootView8 = view8.getRootView();
                                View rootView9 = view9.getRootView();
                                rootView.setId(View.generateViewId());
                                rootView2.setId(View.generateViewId());
                                rootView3.setId(View.generateViewId());
                                if (rootView4 != null) {
                                    rootView4.setId(View.generateViewId());
                                }
                                rootView5.setId(View.generateViewId());
                                rootView6.setId(View.generateViewId());
                                rootView7.setId(View.generateViewId());
                                rootView8.setId(View.generateViewId());
                                rootView9.setId(View.generateViewId());
                                View view11 = rootView4;
                                constraintLayout.addView(rootView, new qhl(0, -2));
                                constraintLayout.addView(rootView2, new qhl(0, -2));
                                constraintLayout.addView(rootView5, new qhl(-2, -2));
                                constraintLayout.addView(rootView6, new qhl(-2, -2));
                                constraintLayout.addView(rootView7, new qhl(-2, -2));
                                constraintLayout.addView(rootView8, new qhl(-2, -2));
                                po60 po60Var = new po60(dimensionPixelSize4, (byte) 6);
                                qhl qhlVar = new qhl(0, -2);
                                po60Var.invoke(qhlVar);
                                constraintLayout.addView(rootView3, qhlVar);
                                mun munVar = new mun((byte) 4, dimensionPixelSize2, dimensionPixelSize4);
                                qhl qhlVar2 = new qhl(0, -2);
                                munVar.invoke(qhlVar2);
                                constraintLayout.addView(rootView9, qhlVar2);
                                if (view2 != null) {
                                    ym ymVar = new ym(dimensionPixelSize3, view2, (byte) 17);
                                    qhl qhlVar3 = new qhl(dimensionPixelSize, dimensionPixelSize);
                                    ymVar.invoke(qhlVar3);
                                    constraintLayout.addView(view2, qhlVar3);
                                }
                                rootView7.setPadding(dimensionPixelSize3, 0, dimensionPixelSize2, 0);
                                rootView8.setPadding(dimensionPixelSize3, 0, dimensionPixelSize2, 0);
                                l690 l690Var = new l690(rootView, constraintLayout, rootView5, rootView2, rootView9, rootView6, rootView7, rootView8, rootView3, view11, (byte) 1);
                                kil kilVar = new kil();
                                kilVar.f(constraintLayout);
                                l690Var.invoke(kilVar);
                                kilVar.b(constraintLayout);
                                if (eh4Var.h()) {
                                    frameLayout.addView(dtwVarB2.w);
                                    frameLayout.setOnHoverListener(ubz0.c);
                                }
                                smc0 smc0VarN = k4p1.n();
                                smc0VarN.add(gggVar.getView());
                                smc0VarN.add(cpm0Var.getView());
                                smc0VarN.add(f621Var.getView());
                                editModeBarContainerView.setEditModeBarButtons(k4p1.k(smc0VarN));
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(coordinatorLayout.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        ibn ibnVar = new ibn(this.i, consumer, new y6w0(this, (byte) 27), (byte) 8);
        Function0 function0 = this.d;
        obz0 obz0Var = this.e;
        obz0Var.i = function0;
        obz0Var.h = new fbz0(this, (byte) 1);
        this.Q0.O0 = new zbz0(ibnVar, (byte) 0);
        this.R0.O0 = new zbz0(ibnVar, (byte) 1);
        this.S0.O0 = new zbz0(ibnVar, (byte) 2);
        this.T0.O0 = new zbz0(ibnVar, (byte) 3);
        this.U0.O0 = new zbz0(ibnVar, (byte) 4);
        this.V0.O0 = new zbz0(ibnVar, (byte) 5);
        this.W0.O0 = new zbz0(ibnVar, (byte) 6);
        this.Y0.O0 = new zbz0(ibnVar, (byte) 7);
        n1b0 n1b0Var = new n1b0(this, (byte) 18);
        this.a1 = ibnVar;
        return n1b0Var;
    }

    public final void a(View view, View view2, View view3, Function0 function0, Function0 function1) {
        ValueAnimator valueAnimator = this.e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (view2.isAttachedToWindow()) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(view3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view2.getMeasuredHeight();
            view.setImportantForAccessibility(4);
            view2.setImportantForAccessibility(2);
            int height = view.getHeight();
            mws0 mws0Var = new mws0(view, new ybz0(this, function0, (byte) 0), (byte) 2);
            s5u s5uVar = s5u.d;
            this.e1 = p6p1.u(view, s5uVar, height, 0, 1.0f, 0.0f, mws0Var);
            this.f1 = p6p1.u(view2, s5uVar, 0, measuredHeight, 0.0f, 1.0f, new tpj1(new ybz0(this, function1, (byte) 1), (byte) 8));
            return;
        }
        view.setImportantForAccessibility(4);
        view2.setImportantForAccessibility(2);
        view.setVisibility(8);
        view2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = -2;
        view2.setLayoutParams(layoutParams);
        this.e1 = null;
        this.f1 = null;
        function0.invoke();
        function1.invoke();
    }
}
