package p;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lg50 extends eg50 {
    public final /* synthetic */ byte d = 0;
    public final /* synthetic */ RecyclerView e;
    public final /* synthetic */ GridLayoutManager f;

    public lg50(GridRecyclerView gridRecyclerView, GridLayoutManager gridLayoutManager) {
        this.e = gridRecyclerView;
        this.f = gridLayoutManager;
    }

    @Override // p.eg50
    public final int e(int i) {
        byte b = this.d;
        GridRecyclerView gridRecyclerView = this.e;
        GridLayoutManager gridLayoutManager = this.f;
        switch (b) {
            case 0:
                GridRecyclerView gridRecyclerView2 = gridRecyclerView;
                z511 adapter = gridRecyclerView2.getAdapter();
                adapter.getClass();
                int iG = adapter.g(i);
                if (iG == 2131624042) {
                    return gridLayoutManager.h1;
                }
                if (iG == 2131624043) {
                    return gridLayoutManager.h1;
                }
                int i2 = gridLayoutManager.h1;
                return iG == 2131624041 ? i2 / gridRecyclerView2.getResources().getInteger(2131492867) : i2 / gridRecyclerView2.getResources().getInteger(2131492868);
            default:
                TraitsLayoutManager traitsLayoutManager = (TraitsLayoutManager) gridLayoutManager;
                int i3 = ((GridLayoutManager) traitsLayoutManager).h1;
                z511 adapter2 = gridRecyclerView.getAdapter();
                if (adapter2 == null || traitsLayoutManager.r1 == null) {
                    return ((GridLayoutManager) traitsLayoutManager).h1;
                }
                if (i < adapter2.e()) {
                    l7m0 l7m0Var = traitsLayoutManager.q1;
                    adapter2.e();
                    Set setI = ((x390) l7m0Var.b).i(i, traitsLayoutManager.r1);
                    if (!setI.contains(ix40.d)) {
                        if (setI.contains(ix40.X)) {
                            return 2;
                        }
                        if (setI.contains(ix40.i)) {
                            return 3;
                        }
                        return i3;
                    }
                }
                return 1;
        }
    }

    public lg50(TraitsLayoutManager traitsLayoutManager, RecyclerView recyclerView) {
        this.f = traitsLayoutManager;
        this.e = recyclerView;
    }
}
