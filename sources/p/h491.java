package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h491 implements j6t0 {
    public final List a;
    public ShimmerFrameLayout b;
    public v241 c;

    public h491(List list) {
        this.a = list;
    }

    public final void a(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.b;
        if (shimmerFrameLayout != null) {
            if (!z) {
                shimmerFrameLayout.postDelayed(this.c, 500L);
            } else {
                shimmerFrameLayout.c(false);
                this.b.d();
            }
        }
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View f491Var = new f491(context);
        f491Var.setComponents(this.a);
        ShimmerFrameLayout shimmerFrameLayoutInflate = layoutInflater.inflate(2131625378, viewGroup, false);
        this.b = shimmerFrameLayoutInflate;
        shimmerFrameLayoutInflate.addView(f491Var);
        this.c = new v241(this, (byte) 8);
    }

    public final View getView() {
        return this.b;
    }

    public final void stop() {
        ShimmerFrameLayout shimmerFrameLayout = this.b;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.removeCallbacks(this.c);
            this.b = null;
        }
    }

    public final void start() {
    }
}
