package p;

import android.animation.Animator;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mic implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ mic(ImageView imageView, byte b) {
        this.a = b;
        this.b = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.b.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        ImageView imageView = this.b;
        switch (b) {
            case 0:
                imageView.setTranslationY(zno1.i(30, imageView));
                break;
            case 1:
                imageView.setTranslationY(jon1.j(30, imageView));
                break;
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
}
