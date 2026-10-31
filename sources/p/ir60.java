package p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ir60 extends f611 {
    public final int a;
    public final int b;
    public final int c;

    public ir60(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        int iS = RecyclerView.S(view);
        if (iS == -1) {
            return;
        }
        boolean z = iS == 0;
        z511 adapter = recyclerView.getAdapter();
        if (adapter == null) {
            eg.m("Required value was null.");
            return;
        }
        boolean z2 = iS == adapter.e() - 1;
        boolean z3 = recyclerView.getLayoutDirection() == 1;
        int i = this.a;
        int i2 = z ? this.b : i / 2;
        int i3 = z2 ? this.c : i / 2;
        rect.left = z3 ? i3 : i2;
        if (!z3) {
            i2 = i3;
        }
        rect.right = i2;
    }
}
