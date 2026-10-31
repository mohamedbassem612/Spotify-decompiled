package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q6n0 extends bs51 {
    public final h7n0 b;
    public final wkt c;
    public final Uri d;
    public final Uri e;
    public final int f;

    public q6n0(h7n0 h7n0Var, wkt wktVar, Uri uri, Uri uri2, int i) {
        this.b = h7n0Var;
        this.c = wktVar;
        this.d = uri;
        this.e = uri2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6n0)) {
            return false;
        }
        q6n0 q6n0Var = (q6n0) obj;
        return this.b.equals(q6n0Var.b) && u890.j(this.c, q6n0Var.c) && u890.j(this.d, q6n0Var.d) && u890.j(this.e, q6n0Var.e) && this.f == q6n0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.e;
        return Integer.hashCode(this.f) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
