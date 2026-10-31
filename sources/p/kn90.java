package p;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kn90 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final RecyclerView a;
    public e611 b;
    public ViewTreeObserver c;

    public kn90(RecyclerView recyclerView) {
        dev0 dev0Var = dev0.a;
        this.a = recyclerView;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver = this.c;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
        this.c = null;
        RecyclerView recyclerView = this.a;
        recyclerView.removeOnAttachStateChangeListener(this);
        if (recyclerView.getItemAnimator() == null) {
            recyclerView.setItemAnimator(this.b);
        }
        this.b = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.isShown() && (recyclerView.isLayoutRequested() || recyclerView.isLayoutSuppressed())) {
            return true;
        }
        a();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
