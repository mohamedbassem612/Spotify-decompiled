package p;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xbh0 extends LinearLayoutManager {
    public final /* synthetic */ int g1;
    public final /* synthetic */ zbh0 h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbh0(zbh0 zbh0Var, int i, int i2) {
        super(i);
        this.h1 = zbh0Var;
        this.g1 = i2;
    }

    public final void R0(RecyclerView recyclerView, s611 s611Var, int i) {
        cq91 cq91Var = new cq91(recyclerView.getContext(), (byte) 0);
        cq91Var.a = i;
        S0(cq91Var);
    }

    public final void U0(s611 s611Var, int[] iArr) {
        zbh0 zbh0Var = this.h1;
        RecyclerView recyclerView = zbh0Var.M1;
        if (this.g1 == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = zbh0Var.M1.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = zbh0Var.M1.getHeight();
        }
    }
}
