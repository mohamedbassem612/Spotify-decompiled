package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hew {
    public final u771 a;
    public final wkt b;
    public final ant c;
    public final Uri d;

    public hew(u771 u771Var, wkt wktVar, ant antVar, Uri uri) {
        this.a = u771Var;
        this.b = wktVar;
        this.c = antVar;
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hew)) {
            return false;
        }
        hew hewVar = (hew) obj;
        return u890.j(this.a, hewVar.a) && u890.j(this.b, hewVar.b) && this.c.equals(hewVar.c) && u890.j(this.d, hewVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Uri uri = this.d;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
