package p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jjs extends f611 {
    public final /* synthetic */ byte a;
    public final int b;
    public int c;

    public jjs(int i, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = i;
                this.c = i / 2;
                break;
            default:
                this.b = i;
                this.c = -1;
                break;
        }
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                z511 adapter = recyclerView.getAdapter();
                if (adapter != null && adapter.e() == 1) {
                    rect.set(i, 0, i, 0);
                } else {
                    int iR = RecyclerView.R(view);
                    if (iR == 0) {
                        rect.set(i, 0, i, 0);
                    } else if (iR != this.c) {
                        rect.set(0, 0, i, 0);
                    } else {
                        rect.set(0, 0, i, 0);
                    }
                }
                break;
            default:
                GridLayoutManager layoutManager = recyclerView.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? layoutManager : null;
                int i2 = gridLayoutManager != null ? gridLayoutManager.h1 : 2;
                if (i2 != 0) {
                    int iR2 = RecyclerView.R(view) % i2;
                    int i3 = this.c;
                    rect.top = i3;
                    rect.bottom = i3;
                    rect.left = (iR2 * i) / i2;
                    rect.right = (((i2 - 1) - iR2) * i) / i2;
                    break;
                }
                break;
        }
    }
}
