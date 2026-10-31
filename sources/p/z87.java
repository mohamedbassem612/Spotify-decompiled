package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z87 extends f611 {
    public final Set a;
    public final Rect b = new Rect();
    public final Drawable c;

    public z87(Context context, Set set) {
        this.a = set;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = qx21.a;
        this.c = resources.getDrawable(2131230962, theme);
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            Rect rect = this.b;
            RecyclerView.V(rect, childAt);
            int iR = RecyclerView.R(childAt);
            z511 adapter = recyclerView.getAdapter();
            int iE = adapter != null ? adapter.e() : 0;
            if (iR >= 0 && iR < iE) {
                z511 adapter2 = recyclerView.getAdapter();
                if (o7h.i0(this.a, adapter2 != null ? Integer.valueOf(adapter2.g(RecyclerView.R(childAt))) : null)) {
                    int iU = jch0.U(childAt.getTranslationY()) + rect.bottom;
                    Drawable drawable = this.c;
                    int intrinsicHeight = iU - (drawable != null ? drawable.getIntrinsicHeight() : 0);
                    if (drawable != null) {
                        drawable.setBounds(paddingLeft, intrinsicHeight, width, iU);
                    }
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }
}
