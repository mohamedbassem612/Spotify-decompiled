package p;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ess extends eoa1 {
    public final css c;
    public AnimatorSet d;

    public ess(css cssVar) {
        this.c = cssVar;
    }

    @Override // p.eoa1
    public final void c(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        foa1 foa1Var = (foa1) this.c.b;
        if (animatorSet == null) {
            foa1Var.c(this);
            return;
        }
        if (!foa1Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            kw7.F(animatorSet);
        }
        if (th30.P(2)) {
            foa1Var.toString();
        }
    }

    @Override // p.eoa1
    public final void d(ViewGroup viewGroup) {
        foa1 foa1Var = (foa1) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            foa1Var.c(this);
            return;
        }
        animatorSet.start();
        if (th30.P(2)) {
            Objects.toString(foa1Var);
        }
    }

    @Override // p.eoa1
    public final void e(vt9 vt9Var) {
        foa1 foa1Var = (foa1) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            foa1Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !foa1Var.c.Z) {
            return;
        }
        if (th30.P(2)) {
            foa1Var.toString();
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (vt9Var.c * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        if (th30.P(2)) {
            animatorSet.toString();
            foa1Var.toString();
        }
        kw7.I(animatorSet, j);
    }

    @Override // p.eoa1
    public final void f(ViewGroup viewGroup) {
        ess essVar;
        css cssVar = this.c;
        if (cssVar.f1()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        t7y t7yVarV1 = cssVar.v1(context);
        this.d = t7yVarV1 != null ? (AnimatorSet) t7yVarV1.c : null;
        foa1 foa1Var = (foa1) cssVar.b;
        zf30 zf30Var = foa1Var.c;
        boolean z = foa1Var.a == 3;
        View view = zf30Var.j1;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            essVar = this;
            animatorSet.addListener(new dss(viewGroup, view, z, foa1Var, essVar));
        } else {
            essVar = this;
        }
        AnimatorSet animatorSet2 = essVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
