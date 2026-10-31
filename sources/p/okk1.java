package p;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class okk1 extends k611 {
    public static final Handler h = new Handler(Looper.getMainLooper());
    public final boolean a;
    public final short b;
    public final dy5 c;
    public tr80 d;
    public tr80 e;
    public boolean f;
    public final seg1 g = new seg1(this, (byte) 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public okk1(boolean z, long j, dy5 dy5Var) {
        this.a = z;
        this.b = (int) j;
        this.c = dy5Var;
    }

    public static int i(RecyclerView recyclerView) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager.I();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).I();
        }
        tw20.t(recyclerView.getLayoutManager(), "LayoutManager is not compatible: ");
        return 0;
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        int iIntValue;
        int iIntValue2;
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            iIntValue = layoutManager.f1();
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                tw20.t(recyclerView.getLayoutManager(), "LayoutManager is not compatible: ");
                return;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int iG1 = staggeredGridLayoutManager.g1();
            int[] iArr = new int[iG1];
            staggeredGridLayoutManager.Z0(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < iG1; i3++) {
                int i4 = iArr[i3];
                if (i4 != -1) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            Integer num = (Integer) o7h.G0(arrayList);
            iIntValue = num != null ? num.intValue() : -1;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (iIntValue != -1) {
            numValueOf = null;
        }
        boolean z = this.a;
        if (numValueOf != null) {
            iIntValue2 = numValueOf.intValue();
        } else {
            int i5 = iIntValue - (z ? 1 : 0);
            iIntValue2 = i5 >= 0 ? i5 : 0;
        }
        int i6 = iIntValue == 0 ? i(recyclerView) - (z ? 1 : 0) : i(recyclerView);
        int iMin = i6 <= 0 ? iIntValue2 : (i6 + iIntValue2) - 1;
        z511 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            iMin = Math.min(iMin, (adapter.e() - 1) - (z ? 1 : 0));
        }
        if (iIntValue2 == -1 || iMin <= iIntValue2) {
            return;
        }
        tr80 tr80Var = new tr80(iIntValue2, iMin, 1);
        long j = this.b;
        if (tr80Var.equals(this.d)) {
            return;
        }
        this.d = tr80Var;
        dy5 dy5Var = this.c;
        if (j <= 0) {
            dy5Var.invoke(tr80Var);
        } else {
            if (this.f) {
                this.e = tr80Var;
                return;
            }
            this.f = true;
            dy5Var.invoke(tr80Var);
            h.postDelayed(this.g, j);
        }
    }
}
