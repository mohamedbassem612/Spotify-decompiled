package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g5h0 implements h5h0 {
    public final String a;
    public final String b;
    public final Uri c;

    public g5h0(Uri uri, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5h0)) {
            return false;
        }
        g5h0 g5h0Var = (g5h0) obj;
        return u890.j(this.a, g5h0Var.a) && u890.j(this.b, g5h0Var.b) && u890.j(this.c, g5h0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        return iD + (uri == null ? 0 : uri.hashCode());
    }
}
