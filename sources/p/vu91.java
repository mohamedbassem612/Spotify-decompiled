package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vu91 extends k611 {
    public boolean a = false;
    public final /* synthetic */ xic0 b;

    public vu91(xic0 xic0Var) {
        this.b = xic0Var;
    }

    public final void c(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.m();
        }
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
