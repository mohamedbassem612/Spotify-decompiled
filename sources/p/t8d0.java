package p;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t8d0 extends xic0 {
    public int g;
    public boolean h;
    public boolean i;
    public RecyclerView j;
    public kba k;
    public lo9 l;
    public final zl7 m;

    public t8d0() {
        super((byte) 1);
        this.g = -1;
        this.m = new zl7(this, (byte) 9);
    }

    public final void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == recyclerView) {
            return;
        }
        zl7 zl7Var = this.m;
        if (recyclerView2 != null) {
            recyclerView2.p0(zl7Var);
        }
        this.j = recyclerView;
        recyclerView.m(zl7Var);
    }

    public final int j(a aVar, int i, int i2) {
        if (i <= 0 || !this.i) {
            return (i >= 0 || !this.h) ? super.j(aVar, i, i2) : this.g;
        }
        return this.g;
    }
}
