package p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xnd1 extends f611 {
    public final um90 a;

    public xnd1(um90 um90Var) {
        this.a = um90Var;
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        super.e(rect, view, recyclerView, s611Var);
        rect.top = this.a.a;
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnd1) && this.a.equals(((xnd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
