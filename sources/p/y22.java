package p;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y22 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        iac0 iac0Var;
        x8c0 lifecycle;
        ViewTreeObserver viewTreeObserver;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ok4 ok4Var = (ok4) obj;
                Context context = view.getContext();
                if (!ok4Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(ok4Var.f);
                    ok4Var.d = true;
                }
                break;
            case 4:
                Object parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ubd1 ubd1Var = new ubd1(new pgr(new rm5(new zun((ViewGroup) parent, (byte) 0), (byte) 13), true));
                    BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) ((avn) obj).U0.d;
                    behaviorRetainingAppBarLayout.a(new pun(behaviorRetainingAppBarLayout, ubd1Var, (byte) 0));
                    ((View) parent).setTag(2131431623, ubd1Var);
                }
                break;
            case 6:
                zmr zmrVar = (zmr) obj;
                j0d1 j0d1VarB = guo1.B();
                fns fnsVar = igu.a;
                zmrVar.W0 = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
                zmrVar.l();
                break;
            case 8:
                lvs lvsVar = (lvs) obj;
                if (lvsVar.X != null) {
                    lvsVar.Y.invoke();
                }
                break;
            case 9:
                h6t h6tVar = (h6t) obj;
                h6tVar.a = true;
                Iterator it = h6tVar.b.iterator();
                while (it.hasNext()) {
                    ((View.OnAttachStateChangeListener) it.next()).onViewAttachedToWindow(view);
                }
                break;
            case 10:
                dtw dtwVar = (dtw) obj;
                xcn0 xcn0Var = dtwVar.h;
                if (dtwVar.s) {
                    dtwVar.g(view);
                    dtwVar.s = false;
                }
                if (dtwVar.t) {
                    dtwVar.t = false;
                    dtwVar.h();
                }
                dtwVar.i(view);
                xcn0Var.b(true);
                iac0 iac0VarH = x9p1.h(dtwVar.w);
                if (iac0VarH != null && iac0VarH != (iac0Var = dtwVar.u)) {
                    if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
                        lifecycle.d(xcn0Var);
                    }
                    dtwVar.u = iac0VarH;
                    iac0VarH.getLifecycle().a(xcn0Var);
                }
                break;
            case 11:
                ((anc0) obj).n();
                break;
            case 13:
                View view2 = (PlayButtonView) obj;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                view.getParent().addView(view2);
                break;
            case 14:
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = ((n470) obj).d;
                ViewTreeObserver viewTreeObserver2 = ((l470) onScrollChangedListener).a;
                if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
                    ViewTreeObserver viewTreeObserver3 = ((l570) ((l470) onScrollChangedListener).b).a.getViewTreeObserver();
                    ((l470) onScrollChangedListener).a = viewTreeObserver3;
                    viewTreeObserver3.addOnScrollChangedListener(onScrollChangedListener);
                }
                break;
            case 17:
                ((uyb1) obj).setVisibility(0);
                break;
            case 21:
                ((k441) obj).b.set(true);
                break;
            case 25:
                uhk1 uhk1Var = (uhk1) obj;
                if (!uhk1Var.a) {
                    uhk1Var.a = true;
                    ((ComposeView) uhk1Var.b).post(new seg1(uhk1Var, (byte) 8));
                    break;
                }
                break;
            case 26:
                vik1 vik1Var = (vik1) obj;
                vik1Var.v = Boolean.TRUE;
                if (!vik1Var.w) {
                    View view3 = vik1Var.c;
                    if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                        viewTreeObserver.addOnScrollChangedListener(vik1Var.k);
                    }
                    vik1Var.w = true;
                }
                vik1Var.a();
                break;
            case 27:
                ((jkk1) obj).c();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        x8c0 lifecycle;
        ViewTreeObserver viewTreeObserver;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lt41) obj).invoke();
                break;
            case 1:
                ok4 ok4Var = (ok4) obj;
                Context context = view.getContext();
                if (ok4Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(ok4Var.f);
                    ok4Var.d = false;
                }
                em3 em3Var = ok4Var.e;
                if (em3Var != null) {
                    em3Var.i();
                }
                ok4Var.e = null;
                break;
            case 2:
                a2e a2eVar = (a2e) obj;
                ViewTreeObserver viewTreeObserver2 = a2eVar.X0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        a2eVar.X0 = view.getViewTreeObserver();
                    }
                    a2eVar.X0.removeGlobalOnLayoutListener(a2eVar.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(constraintLayout, (k1q0) null);
                constraintLayout.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                break;
            case 5:
                gmo gmoVar = (gmo) obj;
                if (gmoVar.g == view) {
                    gmoVar.g = null;
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                zmr zmrVar = (zmr) obj;
                zmrVar.r(true);
                llm llmVar = zmrVar.W0;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                }
                zmrVar.W0 = null;
                break;
            case 7:
                rjn rjnVar = (rjn) ((h98) obj).c;
                CountDownTimer countDownTimer = (CountDownTimer) rjnVar.b;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                rjnVar.b = null;
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                break;
            case 9:
                h6t h6tVar = (h6t) obj;
                h6tVar.a = false;
                Iterator it = h6tVar.b.iterator();
                while (it.hasNext()) {
                    ((View.OnAttachStateChangeListener) it.next()).onViewDetachedFromWindow(view);
                }
                break;
            case 10:
                dtw dtwVar = (dtw) obj;
                xcn0 xcn0Var = dtwVar.h;
                xcn0Var.b(false);
                iac0 iac0Var = dtwVar.u;
                if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
                    lifecycle.d(xcn0Var);
                }
                dtwVar.u = null;
                break;
            case 11:
                ((anc0) obj).q();
                break;
            case 12:
                ((iu30) obj).invoke(jp20.a);
                break;
            case 13:
                break;
            case 14:
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = ((n470) obj).d;
                ViewTreeObserver viewTreeObserver3 = ((l470) onScrollChangedListener).a;
                if (viewTreeObserver3 != null && viewTreeObserver3.isAlive()) {
                    ((l470) onScrollChangedListener).a.removeOnScrollChangedListener(onScrollChangedListener);
                }
                ((l470) onScrollChangedListener).a = null;
                break;
            case 15:
                ((au8) ((b14) obj).d).d.a();
                break;
            case 16:
                qfb1 qfb1Var = (qfb1) obj;
                ViewTreeObserver viewTreeObserver4 = qfb1Var.O0;
                if (viewTreeObserver4 != null) {
                    if (!viewTreeObserver4.isAlive()) {
                        qfb1Var.O0 = view.getViewTreeObserver();
                    }
                    qfb1Var.O0.removeGlobalOnLayoutListener(qfb1Var.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 17:
                ((uyb1) obj).setVisibility(8);
                break;
            case 18:
                ((ifd1) obj).h.c();
                break;
            case 19:
                TooltipContainer tooltipContainer = (TooltipContainer) obj;
                a6f1 a6f1Var = tooltipContainer.a;
                if (!a6f1Var.getConfiguration().c()) {
                    tooltipContainer.a();
                    tooltipContainer.d = true;
                    a6f1Var.setHidden(true);
                } else {
                    ((d4f1) a6f1Var.getConfiguration().b()).getClass();
                    tooltipContainer.b();
                }
                break;
            case 20:
                ((gaa0) obj).d((CancellationException) null);
                break;
            case 21:
                ((k441) obj).b.set(false);
                break;
            case 22:
                ((rku) ((i34) obj).b).a();
                break;
            case 23:
                if (!(view instanceof VideoSurfaceView)) {
                    hhg1.n("The view must be an instance of VideoSurfaceView");
                } else {
                    ((w2k1) obj).f((VideoSurfaceView) view);
                }
                break;
            case 24:
                o6 o6Var = (o6) obj;
                if (!p9p1.y(o6Var)) {
                    o6Var.l();
                }
                break;
            case 25:
                if (!p9p1.y(view)) {
                    uhk1 uhk1Var = (uhk1) obj;
                    llm llmVar2 = (llm) uhk1Var.d;
                    if (llmVar2 != null) {
                        smo1.q(llmVar2);
                    }
                    uhk1Var.d = null;
                    uhk1Var.e = null;
                }
                break;
            case 26:
                vik1 vik1Var = (vik1) obj;
                vik1Var.v = Boolean.FALSE;
                if (vik1Var.w) {
                    View view2 = vik1Var.c;
                    if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnScrollChangedListener(vik1Var.k);
                    }
                    vik1Var.w = false;
                }
                if (vik1Var.o) {
                    vik1Var.l.removeCallbacks(vik1Var.p);
                    vik1Var.o = false;
                }
                vik1Var.d((m511) null, 0);
                break;
            case 27:
                ((jkk1) obj).d();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((faa0) obj).d((CancellationException) null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    private final void n(View view) {
    }

    private final void o(View view) {
    }

    private final void p(View view) {
    }

    private final void q(View view) {
    }

    private final void r(View view) {
    }
}
