package p;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bwb extends ovb {
    public final boolean a;
    public final boolean b;
    public final hsl1 c;

    public bwb(View view, hsl1 hsl1Var) {
        ColorStateList backgroundTintList;
        this.c = hsl1Var;
        boolean z = false;
        boolean z2 = (view.getSystemUiVisibility() & 8192) != 0;
        this.b = z2;
        gch0 gch0Var = BottomSheetBehavior.z(view).i;
        if (gch0Var != null) {
            backgroundTintList = gch0Var.a.c;
        } else {
            WeakHashMap weakHashMap = b8k1.a;
            backgroundTintList = view.getBackgroundTintList();
        }
        if (backgroundTintList != null) {
            int defaultColor = backgroundTintList.getDefaultColor();
            if (defaultColor != 0 && uah.f(defaultColor) > 0.5d) {
                z = true;
            }
            this.a = z;
            return;
        }
        if (!(view.getBackground() instanceof ColorDrawable)) {
            this.a = z2;
            return;
        }
        int color = ((ColorDrawable) view.getBackground()).getColor();
        if (color != 0 && uah.f(color) > 0.5d) {
            z = true;
        }
        this.a = z;
    }

    public final void a(View view, float f) {
        c(view);
    }

    public final void b(View view, int i) {
        c(view);
    }

    public final void c(View view) {
        int top = view.getTop();
        hsl1 hsl1Var = this.c;
        if (top < hsl1Var.d()) {
            int i = cwb.P0;
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(this.a ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            view.setPadding(view.getPaddingLeft(), hsl1Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            int i2 = cwb.P0;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            view.setSystemUiVisibility(this.b ? systemUiVisibility2 | 8192 : systemUiVisibility2 & (-8193));
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
