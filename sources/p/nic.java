package p;

import android.animation.Animator;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nic implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EncoreButton b;

    public /* synthetic */ nic(EncoreButton encoreButton, byte b) {
        this.a = b;
        this.b = encoreButton;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        EncoreButton encoreButton = this.b;
        switch (b) {
            case 0:
                encoreButton.setVisibility(0);
                break;
            default:
                encoreButton.setVisibility(0);
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
}
