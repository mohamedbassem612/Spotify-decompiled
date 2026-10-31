package p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ds91 implements fs91 {
    public final LayerDrawable a;

    public ds91(LayerDrawable layerDrawable) {
        this.a = layerDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds91) && this.a.equals(((ds91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
