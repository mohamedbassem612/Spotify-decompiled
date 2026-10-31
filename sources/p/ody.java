package p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ody implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ody(Object obj, TextView textView, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = textView;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        View view = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Iterator it = p7h.M(new View[]{(ParagraphView) obj4, (ParagraphView) view, (ParagraphView) obj3, (EncoreButton) obj2, (ImageView) obj}).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(8);
                }
                break;
            default:
                EditText editText = (EditText) view;
                if (((faa0) obj4).isActive()) {
                    editText.setHint(((Number) ((List) obj3).get(((n811) obj2).a)).intValue());
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.addUpdateListener(new h0j0(editText, (byte) 1));
                    ((p811) obj).a = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                }
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
