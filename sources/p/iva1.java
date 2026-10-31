package p;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iva1 {
    public static Rect a(fva1 fva1Var) {
        Parcelable parcelable;
        Bundle bundle = ((zf30) fva1Var).f;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("anchorRect", Rect.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("anchorRect");
                if (!(parcelable2 instanceof Rect)) {
                    parcelable2 = null;
                }
                parcelable = (Rect) parcelable2;
            }
            Rect rect = (Rect) parcelable;
            if (rect != null) {
                return rect;
            }
        }
        return new Rect();
    }
}
