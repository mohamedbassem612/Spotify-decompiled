package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mwy extends swy {
    public final wkt a;
    public final Uri b;
    public final Uri c;
    public final int d;

    public mwy(wkt wktVar, Uri uri, Uri uri2, int i) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwy)) {
            return false;
        }
        mwy mwyVar = (mwy) obj;
        return u890.j(this.a, mwyVar.a) && u890.j(this.b, mwyVar.b) && u890.j(this.c, mwyVar.c) && this.d == mwyVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
