package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jnl1 extends k611 {
    public final xic0 a;
    public final i4o b;
    public final wrs c;
    public final LinkedHashSet d = new LinkedHashSet();
    public int e = -1;

    public jnl1(xic0 xic0Var, i4o i4oVar, wrs wrsVar) {
        this.a = xic0Var;
        this.b = i4oVar;
        this.c = wrsVar;
    }

    public final void c(RecyclerView recyclerView, int i) {
        View viewI;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashSet linkedHashSet = this.d;
        linkedHashSet.add(numValueOf);
        if (i == 0) {
            a layoutManager = recyclerView.getLayoutManager();
            this.b.invoke(Integer.valueOf((layoutManager == null || (viewI = this.a.i(layoutManager)) == null) ? -1 : RecyclerView.R(viewI)), Boolean.valueOf(linkedHashSet.contains(1)));
            linkedHashSet.clear();
        }
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        View viewI;
        a layoutManager = recyclerView.getLayoutManager();
        int iR = (layoutManager == null || (viewI = this.a.i(layoutManager)) == null) ? -1 : RecyclerView.R(viewI);
        if (iR != this.e) {
            this.e = iR;
            this.c.invoke(Integer.valueOf(iR));
            if (recyclerView.isLaidOut() && recyclerView.getScrollState() == 0) {
                c(recyclerView, 0);
            }
        }
    }
}
