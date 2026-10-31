package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d5k1 extends m5k1 {
    public final Uri a;
    public final wkt b;
    public final Uri c;
    public final Uri d;

    public d5k1(Uri uri, Uri uri2, Uri uri3, wkt wktVar) {
        this.a = uri;
        this.b = wktVar;
        this.c = uri2;
        this.d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5k1)) {
            return false;
        }
        d5k1 d5k1Var = (d5k1) obj;
        return u890.j(this.a, d5k1Var.a) && u890.j(this.b, d5k1Var.b) && u890.j(this.c, d5k1Var.c) && u890.j(this.d, d5k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
