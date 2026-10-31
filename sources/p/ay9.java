package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ay9 {
    public final Uri a;
    public final Uri b;

    public ay9(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay9)) {
            return false;
        }
        ay9 ay9Var = (ay9) obj;
        return u890.j(this.a, ay9Var.a) && u890.j(this.b, ay9Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.b;
        return iHashCode + (uri2 != null ? uri2.hashCode() : 0);
    }
}
