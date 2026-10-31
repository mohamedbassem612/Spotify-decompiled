package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cgo {
    public final wkt a;
    public final Uri b;
    public final Uri c;
    public final Uri d;

    public cgo(Uri uri, Uri uri2, Uri uri3, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
        this.d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgo)) {
            return false;
        }
        cgo cgoVar = (cgo) obj;
        return u890.j(this.a, cgoVar.a) && u890.j(this.b, cgoVar.b) && u890.j(this.c, cgoVar.c) && u890.j(this.d, cgoVar.d);
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
