package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nt30 {
    public final yt30 a;
    public final wkt b;
    public final Uri c;

    public nt30(yt30 yt30Var, wkt wktVar, Uri uri) {
        this.a = yt30Var;
        this.b = wktVar;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt30)) {
            return false;
        }
        nt30 nt30Var = (nt30) obj;
        return this.a.equals(nt30Var.a) && u890.j(this.b, nt30Var.b) && u890.j(this.c, nt30Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
