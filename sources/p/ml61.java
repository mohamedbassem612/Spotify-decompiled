package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ml61 implements nl61 {
    public final Uri a;
    public final String b;

    public ml61(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml61)) {
            return false;
        }
        ml61 ml61Var = (ml61) obj;
        return u890.j(this.a, ml61Var.a) && u890.j(this.b, ml61Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
