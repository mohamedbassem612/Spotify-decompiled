package p;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class g611 extends ViewGroup.MarginLayoutParams {
    public w611 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public g611(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g611(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g611(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g611(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public g611(g611 g611Var) {
        super((ViewGroup.LayoutParams) g611Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
