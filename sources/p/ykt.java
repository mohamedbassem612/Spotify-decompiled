package p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ykt implements alt {
    public final LayerDrawable a;

    public ykt(LayerDrawable layerDrawable) {
        this.a = layerDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykt) && this.a.equals(((ykt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
