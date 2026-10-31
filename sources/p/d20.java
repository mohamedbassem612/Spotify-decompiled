package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import com.spotify.messaging.messagingplatformimpl.slate.SlateView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d20 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public d20(LottieAnimationView lottieAnimationView, mpt0 mpt0Var) {
        this.a = (byte) 12;
        this.b = lottieAnimationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.c1 = null;
                actionBarOverlayLayout.t = false;
                break;
            case 12:
                ((LottieAnimationView) obj).setVisibility(8);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.c1 = null;
                actionBarOverlayLayout.t = false;
                return;
            case 1:
                ttd ttdVar = (ttd) obj;
                SlateView slateView = ttdVar.b;
                int i = ttdVar.i;
                if (i == 0) {
                    throw null;
                }
                slateView.e(i);
                return;
            case 2:
                ((syd) obj).b = false;
                return;
            case 3:
                ohd ohdVar = (ohd) obj;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(rih1.a);
                    return;
                }
                return;
            case 4:
                jav javVar = (jav) obj;
                ((mzx) javVar).c.setChecked(javVar.k);
                javVar.q.start();
                return;
            case 5:
                el00 el00Var = (el00) obj;
                el00Var.Y0 = false;
                el00Var.Z.d = true;
                return;
            case 6:
                ((HideBottomViewOnScrollBehavior) obj).c = null;
                return;
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                ((mwg0) obj).S1 = true;
                return;
            case 9:
                ((byg0) obj).o = true;
                return;
            case 10:
                ((rvq0) obj).b.i();
                return;
            case 11:
                ((View) obj).setVisibility(4);
                return;
            case 12:
                ((LottieAnimationView) obj).setVisibility(8);
                return;
            case 13:
                RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) obj;
                recyclerViewFastScroller.setVisibility(4);
                recyclerViewFastScroller.setTranslationX(0.0f);
                recyclerViewFastScroller.setAlpha(1.0f);
                recyclerViewFastScroller.S0 = null;
                return;
            case 14:
                ((ObjectAnimator) obj).start();
                return;
            case 15:
                a6f1 a6f1Var = (a6f1) obj;
                yrg0 yrg0Var = a6f1Var.b;
                if (yrg0Var != null) {
                    TooltipContainer tooltipContainer = (TooltipContainer) yrg0Var.b;
                    tooltipContainer.h = null;
                    a6f1 a6f1Var2 = tooltipContainer.a;
                    a6f1Var2.setHidden(true);
                    a6f1Var2.setAnimationListener((z5f1) null);
                }
                if (a6f1Var.Q0.c()) {
                    ((jj11) ((d4f1) a6f1Var.Q0.b())).f(a6f1Var.R0);
                    a6f1Var.Q0 = j5.a;
                    return;
                }
                return;
            case 16:
                ((e90) obj).invoke(animator);
                return;
            case 17:
                ((Function0) obj).invoke();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 7:
                super.onAnimationRepeat(animator);
                oic0 oic0Var = (oic0) this.b;
                oic0Var.h = (oic0Var.h + 1) % ((eca) oic0Var.g).c.length;
                oic0Var.i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ((syd) this.b).b = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ d20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
