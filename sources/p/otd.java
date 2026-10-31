package p;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class otd implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ otd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) this.b;
                int i = PreviewOverlayView.Y0;
                previewOverlayView.z();
                ppv0 ppv0Var = previewOverlayView.W0;
                if (ppv0Var != null) {
                    ppv0Var.invoke(wiw0.e);
                }
                previewOverlayView.U0 = new ajw0(null);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rl1 rl1Var = (rl1) obj;
                ((View) rl1Var.c).setVisibility(4);
                ((View) rl1Var.d).setVisibility(0);
                return;
            case 1:
                odr odrVar = (odr) obj;
                nad1 nad1Var = (nad1) odrVar.e;
                if (nad1Var == null) {
                    u890.C("model");
                    throw null;
                }
                if (nad1Var.f) {
                    odrVar.d = null;
                    odrVar.k(nad1Var.c);
                    return;
                }
                return;
            case 2:
                oly olyVar = (oly) obj;
                ParagraphView paragraphView = olyVar.m;
                if (paragraphView == null) {
                    u890.C("headerView");
                    throw null;
                }
                paragraphView.setVisibility(4);
                ParagraphView paragraphView2 = olyVar.n;
                if (paragraphView2 == null) {
                    u890.C("subtitleView");
                    throw null;
                }
                paragraphView2.setVisibility(4);
                ArrayList<biy> arrayList = (ArrayList) olyVar.f26p;
                if (arrayList == null) {
                    u890.C("itemViews");
                    throw null;
                }
                for (biy biyVar : arrayList) {
                    biyVar.a.setVisibility(8);
                    biyVar.b.setVisibility(8);
                }
                uk41 uk41Var = ((zda) olyVar).d;
                if (uk41Var != null) {
                    uk41Var.a();
                    return;
                }
                return;
            case 3:
                zk10 zk10Var = (zk10) obj;
                ParagraphView paragraphView3 = zk10Var.z;
                if (paragraphView3 == null) {
                    u890.C("storyTitleView");
                    throw null;
                }
                paragraphView3.setAlpha(0.0f);
                ParagraphView paragraphView4 = zk10Var.z;
                if (paragraphView4 != null) {
                    paragraphView4.setVisibility(0);
                    return;
                } else {
                    u890.C("storyTitleView");
                    throw null;
                }
            case 4:
                sq20 sq20Var = (sq20) obj;
                ParagraphView paragraphView5 = sq20Var.J;
                if (paragraphView5 == null) {
                    u890.C("achievementLabelView");
                    throw null;
                }
                paragraphView5.setAlpha(0.0f);
                ParagraphView paragraphView6 = sq20Var.J;
                if (paragraphView6 != null) {
                    paragraphView6.setVisibility(0);
                    return;
                } else {
                    u890.C("achievementLabelView");
                    throw null;
                }
            case 5:
                return;
            case 6:
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) obj;
                int i = PreviewOverlayView.Y0;
                previewOverlayView.z();
                ppv0 ppv0Var = previewOverlayView.W0;
                if (ppv0Var != null) {
                    ppv0Var.invoke(wiw0.c);
                }
                previewOverlayView.U0 = new ajw0(null);
                return;
            case 7:
                ((ConstraintLayout) obj).setVisibility(8);
                return;
            default:
                uk41 uk41Var2 = ((zda) ((dy81) obj)).d;
                if (uk41Var2 != null) {
                    uk41Var2.a();
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                EncoreButton encoreButton = ((nn30) obj).C;
                if (encoreButton != null) {
                    encoreButton.setVisibility(0);
                    return;
                } else {
                    u890.C("sceneButton");
                    throw null;
                }
            case 6:
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) obj;
                int i = PreviewOverlayView.Y0;
                aru0 aru0Var = previewOverlayView.T0;
                ((ImageView) aru0Var.d).setVisibility(8);
                ((LottieAnimationView) aru0Var.c).setVisibility(0);
                previewOverlayView.setContentDescription(((PreviewOverlayView) aru0Var.b).getContext().getString(2131960404));
                ppv0 ppv0Var = previewOverlayView.W0;
                if (ppv0Var != null) {
                    ppv0Var.invoke(wiw0.d);
                    return;
                }
                return;
            case 7:
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }
}
