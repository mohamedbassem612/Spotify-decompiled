package p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x6g1 extends f611 {
    public final /* synthetic */ TraitsLayoutManager a;

    public x6g1(TraitsLayoutManager traitsLayoutManager) {
        this.a = traitsLayoutManager;
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        w611 w611VarT = recyclerView.T(view);
        z511 adapter = recyclerView.getAdapter();
        if (w611VarT == null || w611VarT.n() == -1 || adapter == null) {
            return;
        }
        TraitsLayoutManager traitsLayoutManager = this.a;
        if (traitsLayoutManager.r1 != null) {
            l7m0 l7m0VarM1 = TraitsLayoutManager.M1(traitsLayoutManager);
            ((x390) l7m0VarM1.b).c(rect, w611VarT.n(), adapter.e(), TraitsLayoutManager.L1(traitsLayoutManager), traitsLayoutManager.r1);
        }
    }
}
