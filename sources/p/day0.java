package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class day0 {
    public final u771 a;
    public final wkt b;
    public final Uri c;
    public final Uri d;

    public day0(u771 u771Var, wkt wktVar, Uri uri, Uri uri2) {
        this.a = u771Var;
        this.b = wktVar;
        this.c = uri;
        this.d = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof day0)) {
            return false;
        }
        day0 day0Var = (day0) obj;
        return u890.j(this.a, day0Var.a) && u890.j(this.b, day0Var.b) && u890.j(this.c, day0Var.c) && u890.j(this.d, day0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
