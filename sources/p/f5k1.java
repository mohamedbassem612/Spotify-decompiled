package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f5k1 extends m5k1 {
    public final wkt a;
    public final Uri b;
    public final Uri c;
    public final Uri d;

    public f5k1(Uri uri, Uri uri2, Uri uri3, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
        this.d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5k1)) {
            return false;
        }
        f5k1 f5k1Var = (f5k1) obj;
        return u890.j(this.a, f5k1Var.a) && u890.j(this.b, f5k1Var.b) && u890.j(this.c, f5k1Var.c) && u890.j(this.d, f5k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        int iHashCode3 = (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.d;
        return iHashCode3 + (uri3 != null ? uri3.hashCode() : 0);
    }
}
