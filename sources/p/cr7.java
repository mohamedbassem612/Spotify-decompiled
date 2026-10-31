package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cr7 extends jr7 {
    public final wkt a;
    public final Uri b;

    public cr7(Uri uri, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr7)) {
            return false;
        }
        cr7 cr7Var = (cr7) obj;
        return u890.j(this.a, cr7Var.a) && u890.j(this.b, cr7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
