package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ez9 extends u4p1 {
    public final b0a c;
    public final wkt d;
    public final Uri e;
    public final Uri f;

    public ez9(b0a b0aVar, wkt wktVar, Uri uri, Uri uri2) {
        this.c = b0aVar;
        this.d = wktVar;
        this.e = uri;
        this.f = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez9)) {
            return false;
        }
        ez9 ez9Var = (ez9) obj;
        return this.c.equals(ez9Var.c) && u890.j(this.d, ez9Var.d) && u890.j(this.e, ez9Var.e) && u890.j(this.f, ez9Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Uri uri = this.e;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
