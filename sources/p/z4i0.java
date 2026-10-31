package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z4i0 implements m5i0 {
    public final Bitmap a;

    public z4i0(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4i0) && u890.j(this.a, ((z4i0) obj).a);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }
}
