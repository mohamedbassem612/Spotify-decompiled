package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oqr extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oqr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                ((qek1) this.b).a((View) this.c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((LinearLayout) ((lag) obj2).b).setVisibility(8);
                ((kqr) obj).invoke();
                break;
            case 1:
                ((DownloadButtonView) obj2).setDrawable((sru) obj);
                animator.removeAllListeners();
                break;
            case 2:
                ((hhx) obj2).setDrawable((sru) obj);
                animator.removeAllListeners();
                break;
            case 3:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                lottieAnimationView.h.b.removeAllListeners();
                tkt tktVar = (tkt) obj;
                if (tktVar.b >= ((List) ((yge0) tktVar.c).c).size() - 1) {
                    int iC = l1d.C(tktVar.a);
                    if (iC == 0) {
                        lottieAnimationView.setMinFrame((int) lottieAnimationView.getMaxFrame());
                        lottieAnimationView.setRepeatCount(0);
                        lottieAnimationView.setRepeatMode(1);
                    } else if (iC != 1) {
                        eg.o();
                    } else {
                        lottieAnimationView.c();
                        lottieAnimationView.setVisibility(8);
                    }
                    y1t0 y1t0Var = (y1t0) tktVar.f;
                    if (y1t0Var != null) {
                        ((uk41) y1t0Var.b).a();
                    }
                } else {
                    tktVar.b++;
                    tktVar.c(lottieAnimationView);
                }
                break;
            case 4:
                ((LinearLayout) obj2).setVisibility(8);
                ((kks0) obj).invoke();
                break;
            case 5:
                ((qek1) obj2).d((View) obj);
                break;
            case 6:
                View view = (View) obj2;
                view.setAlpha(1.0f);
                view.setVisibility(4);
                View view2 = (View) obj;
                view2.setVisibility(0);
                view2.setAlpha(0.0f);
                view2.animate().setListener(null).alpha(1.0f).start();
                break;
            default:
                mrl1 mrl1Var = (mrl1) obj2;
                mrl1Var.f(1.0f);
                irl1.f((View) obj, mrl1Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((qek1) this.b).e();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
