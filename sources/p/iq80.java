package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iq80 {
    public final Bitmap a;
    public final g5n b;
    public final Float c;

    public iq80(Bitmap bitmap, g5n g5nVar, Float f) {
        this.a = bitmap;
        this.b = g5nVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq80)) {
            return false;
        }
        iq80 iq80Var = (iq80) obj;
        return u890.j(this.a, iq80Var.a) && this.b == iq80Var.b && u890.j(this.c, iq80Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Float f = this.c;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
