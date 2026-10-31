package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aby0 {
    public final kby0 a;
    public final wkt b;
    public final Uri c;
    public final Uri d;

    public aby0(kby0 kby0Var, wkt wktVar, Uri uri, Uri uri2) {
        this.a = kby0Var;
        this.b = wktVar;
        this.c = uri;
        this.d = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aby0)) {
            return false;
        }
        aby0 aby0Var = (aby0) obj;
        return this.a.equals(aby0Var.a) && u890.j(this.b, aby0Var.b) && u890.j(this.c, aby0Var.c) && u890.j(this.d, aby0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
