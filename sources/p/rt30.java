package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rt30 extends ut30 {
    public final wkt a;
    public final Uri b;

    public rt30(Uri uri, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt30)) {
            return false;
        }
        rt30 rt30Var = (rt30) obj;
        return u890.j(this.a, rt30Var.a) && u890.j(this.b, rt30Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
