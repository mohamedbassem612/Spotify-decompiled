package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ghj1 extends khj1 {
    public final wkt a;
    public final Uri b;
    public final Uri c;

    public ghj1(wkt wktVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghj1)) {
            return false;
        }
        ghj1 ghj1Var = (ghj1) obj;
        return u890.j(this.a, ghj1Var.a) && u890.j(this.b, ghj1Var.b) && u890.j(this.c, ghj1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
