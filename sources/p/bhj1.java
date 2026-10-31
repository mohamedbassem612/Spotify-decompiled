package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bhj1 {
    public final u771 a;
    public final wkt b;
    public final ant c;
    public final Uri d;
    public final Uri e;

    public bhj1(u771 u771Var, wkt wktVar, ant antVar, Uri uri, Uri uri2) {
        this.a = u771Var;
        this.b = wktVar;
        this.c = antVar;
        this.d = uri;
        this.e = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhj1)) {
            return false;
        }
        bhj1 bhj1Var = (bhj1) obj;
        return u890.j(this.a, bhj1Var.a) && u890.j(this.b, bhj1Var.b) && this.c.equals(bhj1Var.c) && u890.j(this.d, bhj1Var.d) && u890.j(this.e, bhj1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.e;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
