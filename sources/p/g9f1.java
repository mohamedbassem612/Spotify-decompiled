package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g9f1 extends f611 {
    public final int a;
    public final Drawable b;

    public g9f1(Context context) {
        this.a = context.getResources().getDimensionPixelSize(2131165696);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = qx21.a;
        Drawable drawable = resources.getDrawable(2131231307, theme);
        if (drawable != null) {
            this.b = drawable;
        } else {
            hhg1.n("Required value was null.");
            throw null;
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        int i = 0;
        while (true) {
            boolean z = i < recyclerView.getChildCount();
            int i2 = this.a;
            if (!z) {
                int width = recyclerView.getWidth();
                Drawable drawable = this.b;
                drawable.setBounds(0, 0, width, i2);
                drawable.draw(canvas);
                return;
            }
            int i3 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            } else if (childAt.getTop() + ((int) childAt.getTranslationY()) < i2 && childAt.getTranslationX() != 0.0f) {
                return;
            } else {
                i = i3;
            }
        }
    }
}
