package p;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ui5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ gch0 a;
    public final /* synthetic */ AppBarLayout b;

    public ui5(AppBarLayout appBarLayout, gch0 gch0Var) {
        this.b = appBarLayout;
        this.a = gch0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.l(fFloatValue);
        AppBarLayout appBarLayout = this.b;
        Drawable drawable = appBarLayout.U0;
        if (drawable instanceof gch0) {
            ((gch0) drawable).l(fFloatValue);
        }
        Iterator it = appBarLayout.S0.iterator();
        if (it.hasNext()) {
            pze0.m(it.next());
            throw null;
        }
    }
}
