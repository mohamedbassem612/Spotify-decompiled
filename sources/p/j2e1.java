package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j2e1 extends l2p1 {
    public final wkt c;
    public final Uri d;
    public final a3e1 e;

    public j2e1(wkt wktVar, Uri uri, a3e1 a3e1Var) {
        this.c = wktVar;
        this.d = uri;
        this.e = a3e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2e1)) {
            return false;
        }
        j2e1 j2e1Var = (j2e1) obj;
        return u890.j(this.c, j2e1Var.c) && u890.j(this.d, j2e1Var.d) && this.e.equals(j2e1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Uri uri = this.d;
        return this.e.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }
}
