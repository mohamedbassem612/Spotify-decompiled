package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gay0 extends kay0 {
    public final wkt a;
    public final Uri b;
    public final Uri c;

    public gay0(wkt wktVar, Uri uri, Uri uri2) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gay0)) {
            return false;
        }
        gay0 gay0Var = (gay0) obj;
        return u890.j(this.a, gay0Var.a) && u890.j(this.b, gay0Var.b) && u890.j(this.c, gay0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
