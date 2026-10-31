package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h5k1 extends m5k1 {
    public final wkt a;
    public final t0c b;
    public final Uri c;
    public final Uri d;

    public h5k1(wkt wktVar, t0c t0cVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = t0cVar;
        this.c = uri;
        this.d = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5k1)) {
            return false;
        }
        h5k1 h5k1Var = (h5k1) obj;
        return u890.j(this.a, h5k1Var.a) && u890.j(this.b, h5k1Var.b) && u890.j(this.c, h5k1Var.c) && u890.j(this.d, h5k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
