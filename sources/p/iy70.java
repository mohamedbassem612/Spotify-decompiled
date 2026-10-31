package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iy70 implements jy70 {
    public final Bitmap a;
    public final Bitmap b;

    public iy70(Bitmap bitmap, Bitmap bitmap2) {
        this.a = bitmap;
        this.b = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy70)) {
            return false;
        }
        iy70 iy70Var = (iy70) obj;
        return this.a.equals(iy70Var.a) && this.b.equals(iy70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
