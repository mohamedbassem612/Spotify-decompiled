package p;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hmu extends f611 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public hmu(Resources resources, boolean z, uk00 uk00Var) {
        this.a = z;
        this.b = resources.getDimensionPixelSize(2131167033);
        this.c = resources.getDimensionPixelSize(2131167024);
        this.d = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        int iR = RecyclerView.R(view);
        View viewI = recyclerView.I(view);
        if ((viewI == null ? null : recyclerView.T(viewI)) instanceof o04) {
            return;
        }
        boolean z = iR == this.a;
        Object tag = view.getTag(2131428353);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null && !z) {
            rect.top = num.intValue();
            return;
        }
        int i = this.d;
        int i2 = this.c;
        rect.top = z ? this.b : i2 + i;
        if (iR == s611Var.b() - 1) {
            rect.bottom = i2;
            return;
        }
        Integer num2 = 2131428351;
        Object tag2 = view.getTag(num2.intValue());
        Integer num3 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num3 != null) {
            rect.bottom = (num3.intValue() - i2) - i;
        }
    }
}
