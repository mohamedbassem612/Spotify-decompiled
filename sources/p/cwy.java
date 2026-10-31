package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cwy extends t3k1 {
    public final ywy b;
    public final wkt c;
    public final Uri d;
    public final Uri e;
    public final int f;

    public cwy(ywy ywyVar, wkt wktVar, Uri uri, Uri uri2, int i) {
        this.b = ywyVar;
        this.c = wktVar;
        this.d = uri;
        this.e = uri2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwy)) {
            return false;
        }
        cwy cwyVar = (cwy) obj;
        return this.b.equals(cwyVar.b) && u890.j(this.c, cwyVar.c) && u890.j(this.d, cwyVar.d) && u890.j(this.e, cwyVar.e) && this.f == cwyVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.e;
        return Integer.hashCode(this.f) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
