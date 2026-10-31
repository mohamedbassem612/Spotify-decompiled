package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pdw extends j0o1 {
    public final rnf0 c;
    public final wkt d;
    public final Uri e;

    public pdw(rnf0 rnf0Var, wkt wktVar, Uri uri) {
        this.c = rnf0Var;
        this.d = wktVar;
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdw)) {
            return false;
        }
        pdw pdwVar = (pdw) obj;
        return this.c.equals(pdwVar.c) && u890.j(this.d, pdwVar.d) && u890.j(this.e, pdwVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Uri uri = this.e;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
