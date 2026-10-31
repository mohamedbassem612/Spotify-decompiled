package p;

import android.animation.Animator;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mro implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ParagraphView b;

    public /* synthetic */ mro(ParagraphView paragraphView, byte b) {
        this.a = b;
        this.b = paragraphView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ParagraphView paragraphView = this.b;
        switch (b) {
            case 0:
                paragraphView.setVisibility(8);
                break;
            default:
                paragraphView.setVisibility(8);
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
}
