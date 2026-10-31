package p;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dn90 {
    public static final aja c = new aja((byte) 1);
    public static final aja d = new aja((byte) 2);
    public final /* synthetic */ byte a;
    public int b;

    public dn90() {
        this.a = (byte) 0;
        this.b = -1;
    }

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static String d(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void a(RecyclerView recyclerView, w611 w611Var) {
        View view = w611Var.a;
        Object tag = view.getTag(2131429694);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = b8k1.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(2131429694, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int e(w611 w611Var) {
        int iG;
        boolean z = w611Var instanceof zm90;
        int i = 0;
        if (z) {
            iG = ((zm90) w611Var).g();
        } else {
            iG = w611Var instanceof gh51 ? 0 : 3;
        }
        if (z) {
            i = ((zm90) w611Var).i();
        } else if (!(w611Var instanceof gh51)) {
            i = 48;
        }
        return i | iG | (i << 8) | (iG << 16);
    }

    public float f() {
        return Float.MAX_VALUE;
    }

    public float g() {
        return Float.MAX_VALUE;
    }

    public int h(RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.b;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(2131166190);
            this.b = dimensionPixelSize;
        }
        int interpolation = (int) (c.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (d.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public void i(Canvas canvas, RecyclerView recyclerView, w611 w611Var, float f, float f2, int i, boolean z) {
        View view = w611Var.a;
        if (z && view.getTag(2131429694) == null) {
            WeakHashMap weakHashMap = b8k1.a;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = b8k1.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(2131429694, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public boolean j(w611 w611Var, w611 w611Var2) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return d(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dn90(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public void k(int i, w611 w611Var) {
    }

    public void l(int i, w611 w611Var) {
    }
}
