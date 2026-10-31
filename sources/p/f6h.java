package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f6h extends x3p1 {
    public final q6h c;
    public final wkt d;
    public final Uri e;
    public final Uri f;

    public f6h(q6h q6hVar, wkt wktVar, Uri uri, Uri uri2) {
        this.c = q6hVar;
        this.d = wktVar;
        this.e = uri;
        this.f = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6h)) {
            return false;
        }
        f6h f6hVar = (f6h) obj;
        return this.c.equals(f6hVar.c) && u890.j(this.d, f6hVar.d) && u890.j(this.e, f6hVar.e) && u890.j(this.f, f6hVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Uri uri = this.e;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
