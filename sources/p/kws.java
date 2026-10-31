package p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kws implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public kws(ImageView imageView, Guideline guideline, fyy fyyVar) {
        this.a = (byte) 2;
        this.b = imageView;
        this.c = guideline;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                q881 q881Var = ((zda) ((oly) obj)).c;
                if (q881Var != null) {
                    ((fgi1) q881Var.b).a.onNext(cgi1.a);
                }
                break;
            case 2:
                break;
            default:
                ((ParagraphView) obj).setVisibility(8);
                ((ParagraphView) this.c).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                qws qwsVar = (qws) this.b;
                if (!qwsVar.X) {
                    ((ValueAnimator) this.c).cancel();
                    qwsVar.c.setSecondaryProgress(0);
                    ((Drawable) qwsVar.h.getValue()).setAlpha(0);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((ParagraphView) it.next()).setVisibility(0);
                }
                break;
            case 2:
                ImageView imageView = (ImageView) this.b;
                imageView.setTranslationY(fyy.i(imageView, (Guideline) obj));
                break;
        }
    }

    public /* synthetic */ kws(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
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
}
