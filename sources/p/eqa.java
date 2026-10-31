package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eqa extends iqa {
    public final wkt a;
    public final Uri b;

    public eqa(Uri uri, wkt wktVar) {
        this.a = wktVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqa)) {
            return false;
        }
        eqa eqaVar = (eqa) obj;
        return u890.j(this.a, eqaVar.a) && u890.j(this.b, eqaVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
