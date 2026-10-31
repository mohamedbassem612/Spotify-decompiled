package p;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cvq0 {
    public final View a;
    public final View b;
    public final int c;
    public final int d;
    public int e;
    public ValueAnimator f;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public c1g0 i;

    public cvq0(MainLayoutFragmentContainerView mainLayoutFragmentContainerView, ViewGroup viewGroup, int i, int i2) {
        this.a = mainLayoutFragmentContainerView;
        this.b = viewGroup;
        this.c = i;
        this.d = i2;
        viewGroup.setAlpha(0.0f);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.h;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final int b(int i) {
        int i2 = i == 0 ? -1 : avq0.a[l1d.C(i)];
        if (i2 == -1 || i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return this.d;
        }
        eg.o();
        return 0;
    }
}
