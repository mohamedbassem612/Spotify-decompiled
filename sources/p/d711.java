package p;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d711 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ RecyclerViewFastScroller a;

    public d711(RecyclerViewFastScroller recyclerViewFastScroller) {
        this.a = recyclerViewFastScroller;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerViewFastScroller recyclerViewFastScroller = this.a;
        recyclerViewFastScroller.getViewTreeObserver().removeOnPreDrawListener(this);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(recyclerViewFastScroller, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(boo1.x(RecyclerViewFastScroller.a(recyclerViewFastScroller).getContext()));
        objectAnimatorOfPropertyValuesHolder.start();
        return true;
    }
}
