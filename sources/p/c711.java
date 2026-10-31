package p;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c711 extends f611 {
    public static final a711 c = new a711();
    public final /* synthetic */ byte a;
    public final Object b;

    public c711(Context context) {
        this.a = (byte) 0;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.listDivider, typedValue, true)) {
            jah.g("Divider drawable is not defined in the theme.");
            throw null;
        }
        Drawable drawable = context.getDrawable(typedValue.resourceId);
        this.b = drawable;
        if (drawable instanceof NinePatchDrawable) {
            ((NinePatchDrawable) drawable).getPaint();
        }
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj;
                int iA = (recyclerView.getAdapter() instanceof b711 ? (b711) recyclerView.getAdapter() : c).a(RecyclerView.R(view));
                if ((iA & 2) != 0) {
                    rect.top = drawable.getIntrinsicHeight() + rect.top;
                }
                if ((iA & 1) != 0) {
                    rect.bottom = drawable.getIntrinsicHeight() + rect.bottom;
                }
                break;
            case 1:
                super.e(rect, view, recyclerView, s611Var);
                z511 adapter = recyclerView.getAdapter();
                if (adapter != null && RecyclerView.R(view) != adapter.e() - 1) {
                    int layoutDirection = recyclerView.getLayoutDirection();
                    int i = ((qwd) obj).f;
                    if (layoutDirection != 1) {
                        rect.set(0, 0, -i, 0);
                    } else {
                        rect.set(-i, 0, 0, 0);
                    }
                }
                break;
            default:
                uk00 uk00Var = (uk00) obj;
                Object tag = view.getTag(2131427536);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    int i2 = uk00Var.b;
                    rect.left = i2;
                    rect.right = i2;
                    break;
                }
                break;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int iA = (recyclerView.getAdapter() instanceof b711 ? (b711) recyclerView.getAdapter() : c).a(RecyclerView.R(childAt));
                    if (iA > 0) {
                        WeakHashMap weakHashMap = b8k1.a;
                        drawable.setAlpha((int) (childAt.getAlpha() * 255.0f));
                        g611 layoutParams = childAt.getLayoutParams();
                        if ((iA & 2) != 0) {
                            int top = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((int) childAt.getTranslationY());
                            drawable.setBounds(paddingLeft, top - drawable.getIntrinsicHeight(), width, top);
                            drawable.draw(canvas);
                        }
                        if ((iA & 1) != 0) {
                            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((int) childAt.getTranslationY());
                            drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                            drawable.draw(canvas);
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ c711(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
