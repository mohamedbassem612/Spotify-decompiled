package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.Button;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p3f1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public p3f1(kd40 kd40Var, Consumer consumer, hd40 hd40Var) {
        this.c = kd40Var;
        this.b = consumer;
        this.d = hd40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) ((e821) obj).e;
                toolbarSearchFieldView.c.setClickable(true);
                toolbarSearchFieldView.g.setClickable(true);
                ((View) obj2).setVisibility(4);
                toolbarSearchFieldView.d.getText().clear();
                break;
            case 1:
                ((Button) obj3).setVisibility(4);
                break;
            default:
                if (!((kd40) obj3).t.get()) {
                    ((Consumer) obj2).accept(new zc40((hd40) obj));
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) ((e821) obj).e;
                if (toolbarSearchFieldView.a == 0) {
                    toolbarSearchFieldView.a = toolbarSearchFieldView.c.getWidth() - toolbarSearchFieldView.b;
                    toolbarSearchFieldView.e.getX();
                }
                ((Button) this.c).setVisibility(0);
                break;
            case 1:
                ToolbarSearchFieldView toolbarSearchFieldView2 = (ToolbarSearchFieldView) ((e821) obj).e;
                if (toolbarSearchFieldView2.getWidth() != 0 && toolbarSearchFieldView2.a == 0) {
                    toolbarSearchFieldView2.a = toolbarSearchFieldView2.c.getWidth();
                    toolbarSearchFieldView2.e.getX();
                }
                toolbarSearchFieldView2.c.setClickable(false);
                toolbarSearchFieldView2.g.setClickable(false);
                ((View) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public p3f1(e821 e821Var, Button button, View view) {
        this.d = e821Var;
        this.c = button;
        this.b = view;
    }

    public p3f1(e821 e821Var, View view, Button button) {
        this.d = e821Var;
        this.b = view;
        this.c = button;
    }
}
