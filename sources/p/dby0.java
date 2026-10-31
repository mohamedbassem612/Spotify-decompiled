package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dby0 extends hby0 {
    public final wkt a;
    public final Uri b;
    public final Uri c;

    public dby0(wkt wktVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dby0)) {
            return false;
        }
        dby0 dby0Var = (dby0) obj;
        return u890.j(this.a, dby0Var.a) && u890.j(this.b, dby0Var.b) && u890.j(this.c, dby0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
