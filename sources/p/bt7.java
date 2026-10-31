package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bt7 extends eso1 {
    public final wkt b;
    public final Uri c;
    public final lt7 d;

    public bt7(wkt wktVar, Uri uri, lt7 lt7Var) {
        this.b = wktVar;
        this.c = uri;
        this.d = lt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt7)) {
            return false;
        }
        bt7 bt7Var = (bt7) obj;
        return u890.j(this.b, bt7Var.b) && u890.j(this.c, bt7Var.c) && this.d.equals(bt7Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Uri uri = this.c;
        return this.d.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }
}
