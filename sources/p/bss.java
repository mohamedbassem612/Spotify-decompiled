package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bss extends eoa1 {
    public final css c;

    public bss(css cssVar) {
        this.c = cssVar;
    }

    @Override // p.eoa1
    public final void c(ViewGroup viewGroup) {
        foa1 foa1Var = (foa1) this.c.b;
        View view = foa1Var.c.j1;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        foa1Var.c(this);
        if (th30.P(2)) {
            foa1Var.toString();
        }
    }

    @Override // p.eoa1
    public final void d(ViewGroup viewGroup) {
        css cssVar = this.c;
        foa1 foa1Var = (foa1) cssVar.b;
        if (cssVar.f1()) {
            foa1Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = foa1Var.c.j1;
        context.getClass();
        t7y t7yVarV1 = cssVar.v1(context);
        if (t7yVarV1 == null) {
            eg.m("Required value was null.");
            return;
        }
        Animation animation = (Animation) t7yVarV1.b;
        if (animation == null) {
            eg.m("Required value was null.");
            return;
        }
        if (foa1Var.a != 1) {
            view.startAnimation(animation);
            foa1Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        gg30 gg30Var = new gg30(animation, viewGroup, view);
        gg30Var.setAnimationListener(new ass(foa1Var, viewGroup, view, this));
        view.startAnimation(gg30Var);
        if (th30.P(2)) {
            foa1Var.toString();
        }
    }
}
