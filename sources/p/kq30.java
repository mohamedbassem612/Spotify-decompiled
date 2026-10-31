package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kq30 extends mq30 {
    public final Uri a;
    public final wkt b;

    public kq30(Uri uri, wkt wktVar) {
        this.a = uri;
        this.b = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq30)) {
            return false;
        }
        kq30 kq30Var = (kq30) obj;
        return u890.j(this.a, kq30Var.a) && u890.j(this.b, kq30Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }
}
