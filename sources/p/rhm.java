package p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rhm {
    public final LayerDrawable a;

    public rhm(LayerDrawable layerDrawable) {
        this.a = layerDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhm) && this.a.equals(((rhm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
