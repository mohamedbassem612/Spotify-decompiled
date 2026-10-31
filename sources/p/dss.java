package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dss extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ foa1 d;
    public final /* synthetic */ ess e;

    public dss(ViewGroup viewGroup, View view, boolean z, foa1 foa1Var, ess essVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = foa1Var;
        this.e = essVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        foa1 foa1Var = this.d;
        if (z || foa1Var.a == 3) {
            int i = foa1Var.a;
            view.getClass();
            cy30.a(i, view, viewGroup);
        }
        ess essVar = this.e;
        ((foa1) essVar.c.b).c(essVar);
        if (th30.P(2)) {
            Objects.toString(foa1Var);
        }
    }
}
