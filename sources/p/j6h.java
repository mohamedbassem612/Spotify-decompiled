package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j6h extends n6h {
    public final wkt a;
    public final Uri b;
    public final Uri c;

    public j6h(wkt wktVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6h)) {
            return false;
        }
        j6h j6hVar = (j6h) obj;
        return u890.j(this.a, j6hVar.a) && u890.j(this.b, j6hVar.b) && u890.j(this.c, j6hVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
