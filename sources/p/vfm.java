package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vfm extends rzn1 {
    public final Drawable f;

    public vfm(Drawable drawable) {
        this.f = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfm) && this.f.equals(((vfm) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
