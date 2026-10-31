package p;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m181 extends k611 {
    public final bl00 a;
    public int b;

    public m181(bl00 bl00Var) {
        this.a = bl00Var;
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        int iR;
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null || (iR = linearLayoutManager.R()) == 0 || i2 < 0) {
            return;
        }
        int iH1 = linearLayoutManager.h1();
        int iF1 = linearLayoutManager.f1();
        if (iR < 5) {
            return;
        }
        int i3 = iR / 2;
        boolean z = iF1 <= i3 && i3 <= iH1;
        boolean z2 = iH1 >= iR + (-5) && iR > 5;
        if ((z || z2) && this.b != iR) {
            this.a.invoke(this);
            this.b = iR;
        }
    }
}
