package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h4 implements k4 {
    public final wkt a;
    public final Uri b;

    public h4(Uri uri, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return u890.j(this.a, h4Var.a) && u890.j(this.b, h4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
