package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k300 extends v600 {
    public final wkt a;
    public final Uri b;

    public k300(Uri uri, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k300)) {
            return false;
        }
        k300 k300Var = (k300) obj;
        return u890.j(this.a, k300Var.a) && u890.j(this.b, k300Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
