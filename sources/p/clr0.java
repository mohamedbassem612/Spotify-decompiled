package p;

import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class clr0 extends k611 implements AbsListView.OnScrollListener {
    public int a;
    public boolean b;

    public final void h(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            n57.e("LayoutManager is not compatible: ".concat(String.valueOf(layoutManager)));
            return;
        }
        LinearLayoutManager linearLayoutManager = layoutManager;
        int iF1 = linearLayoutManager.f1();
        int I = linearLayoutManager.I();
        l(iF1 + (I <= 0 ? 0 : I - 1), I, linearLayoutManager.R());
    }

    public abstract boolean i();

    public int j() {
        return 5;
    }

    public abstract void k(int i);

    public final void l(int i, int i2, int i3) {
        if (i3 != this.a) {
            this.a = i3;
            this.b = false;
        }
        if (!i()) {
            this.b = false;
        } else {
            if (this.b || i2 == 0 || j() + i < i3 - 1) {
                return;
            }
            k(i);
            this.b = true;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        l((i + i2) - 1, i2, i3);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
