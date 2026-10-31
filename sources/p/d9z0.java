package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d9z0 {
    public static final d9z0 d;
    public static final int[] e = new int[0];
    public static final int[] f = {-16842910};
    public static final int[] g = {R.attr.state_focused};
    public static final int[] h = {R.attr.state_pressed};
    public final /* synthetic */ byte a;
    public final int b;
    public final int c;

    static {
        int i = 0;
        d = new d9z0((byte) 0, i, i);
    }

    public d9z0(Context context) {
        this.a = (byte) 1;
        TypedValue typedValue = new TypedValue();
        float fraction = context.getTheme().resolveAttribute(2130970001, typedValue, true) ? typedValue.getFraction(1.0f, 1.0f) : 0.3f;
        TypedValue typedValue2 = new TypedValue();
        float fraction2 = context.getTheme().resolveAttribute(2130969989, typedValue2, true) ? typedValue2.getFraction(1.0f, 1.0f) : 0.6f;
        int iT = foo1.t(context, 2130969988);
        this.b = uah.l(iT, (int) (fraction * 255.0f));
        this.c = uah.l(iT, (int) (fraction2 * 255.0f));
    }

    public ColorStateList a(int i) {
        int i2 = this.b;
        return new ColorStateList(new int[][]{f, h, g, e}, new int[]{uah.i(this.c, i), uah.i(i2, i), uah.i(i2, i), i});
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(d9z0.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return gvg.j(sb, this.c, "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d9z0(byte b, int i, int i2) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }
}
