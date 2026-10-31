package p;

import android.graphics.ColorFilter;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w9w0 extends StateListDrawable {
    public ColorFilter a;

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        for (int i : iArr) {
            if (i == 16842919) {
                setColorFilter(this.a);
                return super.onStateChange(iArr);
            }
        }
        clearColorFilter();
        return super.onStateChange(iArr);
    }
}
