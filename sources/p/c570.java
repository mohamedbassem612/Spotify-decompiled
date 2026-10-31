package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c570 extends f611 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ l570 d;

    public c570(d570 d570Var, int i, boolean z) {
        this.d = d570Var;
        this.c = i;
        this.b = z;
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        byte b = this.a;
        int i = this.c;
        l570 l570Var = this.d;
        boolean z = this.b;
        switch (b) {
            case 0:
                d570 d570Var = (d570) l570Var;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -1 && layoutParams.height == -2) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                }
                ((l570) d570Var).a.getClass();
                int iS = RecyclerView.S(view);
                int iR = d570Var.c.R() - 1;
                int i2 = iS == 0 ? i : i / 2;
                if (iS != iR) {
                    i /= 2;
                }
                int i3 = z ? i : i2;
                if (!z) {
                    i2 = i;
                }
                rect.set(i3, 0, i2, 0);
                break;
            default:
                d570 d570Var2 = (d570) l570Var;
                LinearLayoutManager linearLayoutManager = d570Var2.c;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null && layoutParams2.width == -1 && layoutParams2.height == -2) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                }
                ((l570) d570Var2).a.getClass();
                int iS2 = RecyclerView.S(view);
                int iR2 = z ? 0 : linearLayoutManager.R() - 1;
                int i4 = iS2 == (z ? linearLayoutManager.R() + (-1) : 0) ? i : i / 2;
                if (iS2 != iR2) {
                    i /= 2;
                }
                rect.set(i4, 0, i, 0);
                break;
        }
    }

    public c570(d570 d570Var, boolean z, int i) {
        this.d = d570Var;
        this.b = z;
        this.c = i;
    }
}
