package p;

import android.view.View;
import android.widget.FrameLayout;
import com.spotify.appendix.contentviewstate.view.LoadingView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rtl extends FrameLayout {
    public i0c0 a;
    public LoadingView b;
    public View c;

    public View getContentView() {
        return this.c;
    }

    public f8x getEmptyState() {
        return this.a;
    }

    public LoadingView getLoadingView() {
        return this.b;
    }

    public void setContentView(View view) {
        View view2 = this.c;
        if (view2 != null) {
            removeView(view2);
            this.c = null;
        }
        if (view != null) {
            xap1.y(view);
            this.c = view;
            addView(view, 0);
        }
    }
}
