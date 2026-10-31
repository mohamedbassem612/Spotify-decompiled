package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vwa {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.PNG;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwa) && this.a == ((vwa) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(100) + (this.a.hashCode() * 31);
    }
}
