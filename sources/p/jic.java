package p;

import android.animation.Animator;
import android.widget.ImageView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jic implements Animator.AnimatorListener {
    public final /* synthetic */ ParagraphView a;
    public final /* synthetic */ EncoreButton b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ ImageView d;

    public jic(ParagraphView paragraphView, EncoreButton encoreButton, ImageView imageView, ImageView imageView2) {
        this.a = paragraphView;
        this.b = encoreButton;
        this.c = imageView;
        this.d = imageView2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
