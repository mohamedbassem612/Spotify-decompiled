package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x4k1 implements b5k1 {
    public final wkt a;
    public final Uri b;
    public final Uri c;
    public final Uri d;
    public final s5k1 e;

    public x4k1(wkt wktVar, Uri uri, Uri uri2, Uri uri3, s5k1 s5k1Var) {
        this.a = wktVar;
        this.b = uri;
        this.c = uri2;
        this.d = uri3;
        this.e = s5k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4k1)) {
            return false;
        }
        x4k1 x4k1Var = (x4k1) obj;
        return u890.j(this.a, x4k1Var.a) && u890.j(this.b, x4k1Var.b) && u890.j(this.c, x4k1Var.c) && u890.j(this.d, x4k1Var.d) && this.e.equals(x4k1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.c;
        int iHashCode3 = (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (uri3 != null ? uri3.hashCode() : 0)) * 31);
    }
}
