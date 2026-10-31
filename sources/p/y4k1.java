package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y4k1 implements b5k1 {
    public final s5k1 a;
    public final wkt b;
    public final t0c c;
    public final Uri d;
    public final Uri e;

    public y4k1(s5k1 s5k1Var, wkt wktVar, t0c t0cVar, Uri uri, Uri uri2) {
        this.a = s5k1Var;
        this.b = wktVar;
        this.c = t0cVar;
        this.d = uri;
        this.e = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4k1)) {
            return false;
        }
        y4k1 y4k1Var = (y4k1) obj;
        return this.a.equals(y4k1Var.a) && u890.j(this.b, y4k1Var.b) && u890.j(this.c, y4k1Var.c) && u890.j(this.d, y4k1Var.d) && u890.j(this.e, y4k1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.e;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
