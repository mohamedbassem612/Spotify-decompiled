package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x6n0 extends c7n0 {
    public final wkt a;
    public final Uri b;
    public final Uri c;
    public final int d;

    public x6n0(wkt wktVar, Uri uri, Uri uri2, int i) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6n0)) {
            return false;
        }
        x6n0 x6n0Var = (x6n0) obj;
        return u890.j(this.a, x6n0Var.a) && u890.j(this.b, x6n0Var.b) && u890.j(this.c, x6n0Var.c) && this.d == x6n0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
