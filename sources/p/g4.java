package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g4 {
    public final String a;
    public final wkt b;
    public final Uri c;

    public g4(Uri uri, String str, wkt wktVar) {
        this.a = str;
        this.b = wktVar;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return u890.j(this.a, g4Var.a) && u890.j(this.b, g4Var.b) && u890.j(this.c, g4Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
