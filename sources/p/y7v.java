package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class y7v {
    public static final v8h a = new v8h(6);

    public static void a(Drawable drawable, ColorStateList colorStateList, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (drawable.mutate() == drawable) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                int colorForState = colorStateList.getColorForState(iArr, 0);
                v8h v8hVar = a;
                v8hVar.getClass();
                int i = (31 + colorForState) * 31;
                porterDuffColorFilter = (PorterDuffColorFilter) v8hVar.c(Integer.valueOf(mode.hashCode() + i));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
                }
            }
            drawable.setColorFilter(porterDuffColorFilter);
            drawable.invalidateSelf();
        }
    }
}
