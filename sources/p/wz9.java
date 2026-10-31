package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wz9 extends zz9 {
    public final wkt a;
    public final Uri b;
    public final Uri c;

    public wz9(wkt wktVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz9)) {
            return false;
        }
        wz9 wz9Var = (wz9) obj;
        return u890.j(this.a, wz9Var.a) && u890.j(this.b, wz9Var.b) && u890.j(this.c, wz9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
