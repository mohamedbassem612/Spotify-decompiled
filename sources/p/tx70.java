package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tx70 {
    public final Bitmap a;
    public final boolean b;
    public final boolean c;

    public tx70(Bitmap bitmap, boolean z, boolean z2) {
        this.a = bitmap;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx70)) {
            return false;
        }
        tx70 tx70Var = (tx70) obj;
        return u890.j(this.a, tx70Var.a) && this.b == tx70Var.b && this.c == tx70Var.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((bitmap == null ? 0 : bitmap.hashCode()) * 31, 31, this.b);
    }
}
