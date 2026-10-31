package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u530 extends f611 {
    public final uk00 a;
    public final Rect b = new Rect();
    public final Drawable c;
    public final int d;

    public u530(Context context, Resources resources, uk00 uk00Var) {
        this.a = uk00Var;
        Resources resources2 = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = qx21.a;
        this.c = resources2.getDrawable(2131233837, theme);
        this.d = resources.getDimensionPixelSize(2131167022);
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        if (u890.j(view.getTag(), "ReleaseRowElement")) {
            int i = this.d;
            rect.left = -i;
            rect.right = -i;
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            Rect rect = this.b;
            RecyclerView.V(rect, childAt);
            int iR = RecyclerView.R(childAt);
            z511 adapter = recyclerView.getAdapter();
            int iE = adapter != null ? adapter.e() : 0;
            if (iR >= 0 && iR < iE && u890.j(childAt.getTag(), "ReleaseRowElement")) {
                int iU = jch0.U(childAt.getTranslationY()) + rect.bottom;
                Drawable drawable = this.c;
                int intrinsicHeight = iU - (drawable != null ? drawable.getIntrinsicHeight() : 0);
                int i2 = this.a.b;
                int i3 = this.d;
                int i4 = i2 - i3;
                int width = (recyclerView.getWidth() - i2) + i3;
                if (drawable != null) {
                    drawable.setBounds(i4, intrinsicHeight, width, iU);
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            }
        }
    }
}
