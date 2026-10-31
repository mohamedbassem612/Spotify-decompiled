package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n2e1 extends u2e1 {
    public final wkt a;
    public final Uri b;

    public n2e1(Uri uri, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2e1)) {
            return false;
        }
        n2e1 n2e1Var = (n2e1) obj;
        return u890.j(this.a, n2e1Var.a) && u890.j(this.b, n2e1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
