package p;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hqw implements k1q0 {
    public final /* synthetic */ dtw a;

    public hqw(dtw dtwVar) {
        this.a = dtwVar;
    }

    public final hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        h3n h3nVar = new h3n(-1, -1);
        h3nVar.setMarginStart(nk80VarI.c);
        h3nVar.setMarginEnd(nk80VarI.a);
        h3nVar.b(new AppBarLayout.ScrollingViewBehavior());
        this.a.w.setLayoutParams(h3nVar);
        return hsl1Var;
    }
}
