package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jxx extends d8v {
    public PorterDuff.Mode b;
    public ColorStateList c;
    public int[] d;

    public final int[] getState() {
        return this.d;
    }

    public final boolean isStateful() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.c;
        if (colorStateList == null) {
            return true;
        }
        int colorForState = colorStateList.getColorForState(iArr, -1);
        Drawable drawable = ((d8v) this).a;
        if (drawable != null) {
            PorterDuff.Mode mode = this.b;
            if (mode == null) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(colorForState, mode));
        }
        invalidateSelf();
        return true;
    }

    public final boolean setState(int[] iArr) {
        if (Arrays.equals(this.d, iArr)) {
            return false;
        }
        this.d = iArr;
        onStateChange(iArr);
        return true;
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTintList(ColorStateList colorStateList) {
        this.c = colorStateList;
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTintMode(PorterDuff.Mode mode) {
        this.b = mode;
        invalidateSelf();
    }
}
