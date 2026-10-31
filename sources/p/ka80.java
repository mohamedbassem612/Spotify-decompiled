package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ka80 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ la80 e;

    /* JADX WARN: Multi-variable type inference failed */
    public ka80(la80 la80Var, int i, TextView textView, int i2, TextView textView2) {
        this.e = la80Var;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        byte b = this.a;
        la80 la80Var = this.e;
        la80Var.h = b;
        la80Var.f = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (appCompatTextView = la80Var.l) != null) {
                appCompatTextView.setText(null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
