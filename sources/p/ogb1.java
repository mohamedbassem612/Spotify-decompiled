package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ogb1 {
    public final zgb1 a;
    public final wkt b;
    public final Uri c;
    public final Uri d;

    public ogb1(zgb1 zgb1Var, wkt wktVar, Uri uri, Uri uri2) {
        this.a = zgb1Var;
        this.b = wktVar;
        this.c = uri;
        this.d = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogb1)) {
            return false;
        }
        ogb1 ogb1Var = (ogb1) obj;
        return this.a.equals(ogb1Var.a) && u890.j(this.b, ogb1Var.b) && u890.j(this.c, ogb1Var.c) && u890.j(this.d, ogb1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
