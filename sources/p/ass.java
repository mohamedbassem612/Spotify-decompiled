package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ass implements Animation.AnimationListener {
    public final /* synthetic */ foa1 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ bss d;

    public ass(foa1 foa1Var, ViewGroup viewGroup, View view, bss bssVar) {
        this.a = foa1Var;
        this.b = viewGroup;
        this.c = view;
        this.d = bssVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new c45((Object) viewGroup, (Object) this.c, (Object) this.d, (byte) 11));
        if (th30.P(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (th30.P(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
