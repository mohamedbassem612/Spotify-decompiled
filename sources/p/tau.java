package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tau implements r6t0 {
    public final gmt a;
    public final ConstraintLayout b;

    public tau(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        tau tauVar;
        gmt gmtVarJ = gmt.j(layoutInflater, viewGroup);
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            tauVar = this;
            viewGroup.addOnLayoutChangeListener(new sau(viewGroup, gmtVarJ, tauVar, context, (byte) 0));
        } else {
            rwq0.s(viewGroup, new nzd(gmtVarJ, this, context, viewGroup));
            tauVar = this;
        }
        tauVar.a = gmtVarJ;
        tauVar.b = (ConstraintLayout) gmtVarJ.b;
    }

    public final void a(boolean z) {
        ((ShimmerFrameLayout) this.a.c).c(true);
    }

    public final Object getView() {
        return this.b;
    }

    public final void stop() {
        ((ShimmerFrameLayout) this.a.c).e();
    }

    public final void start() {
    }
}
