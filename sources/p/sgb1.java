package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sgb1 extends wgb1 {
    public final wkt a;
    public final Uri b;
    public final Uri c;

    public sgb1(wkt wktVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgb1)) {
            return false;
        }
        sgb1 sgb1Var = (sgb1) obj;
        return u890.j(this.a, sgb1Var.a) && u890.j(this.b, sgb1Var.b) && u890.j(this.c, sgb1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
