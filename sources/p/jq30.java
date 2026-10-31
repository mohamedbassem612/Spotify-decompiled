package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jq30 {
    public final oq30 a;
    public final wkt b;
    public final Uri c;

    public jq30(oq30 oq30Var, wkt wktVar, Uri uri) {
        this.a = oq30Var;
        this.b = wktVar;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq30)) {
            return false;
        }
        jq30 jq30Var = (jq30) obj;
        return this.a.equals(jq30Var.a) && u890.j(this.b, jq30Var.b) && u890.j(this.c, jq30Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
