package p;

import android.animation.StateListAnimator;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z251 implements q3f1 {
    public final /* synthetic */ u961 a;

    public z251(u961 u961Var) {
        this.a = u961Var;
    }

    public final void a() {
        u961 u961Var = this.a;
        u961Var.p();
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) u961Var.d;
        toolbarSearchFieldView.getSearchPlaceHolder().setPressed(false);
        StateListAnimator stateListAnimator = toolbarSearchFieldView.getSearchPlaceHolder().getStateListAnimator();
        if (stateListAnimator != null) {
            stateListAnimator.jumpToCurrentState();
        }
    }

    public final void b() {
        u961 u961Var = this.a;
        t151 t151Var = (t151) u961Var.b;
        if (t151Var == null || !t151Var.c()) {
            u961Var.r();
            ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) u961Var.d;
            if (toolbarSearchFieldView.getQueryEditText().hasFocus()) {
                toolbarSearchFieldView.getQueryEditText().getText().clear();
            } else {
                toolbarSearchFieldView.O0.w();
            }
        }
    }

    public final void c() {
        this.a.r();
    }
}
