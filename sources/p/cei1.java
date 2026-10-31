package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cei1 {
    public final String a;
    public final String b;
    public final Uri c;

    public cei1(Uri uri, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cei1)) {
            return false;
        }
        cei1 cei1Var = (cei1) obj;
        return u890.j(this.a, cei1Var.a) && this.b.equals(cei1Var.b) && u890.j(this.c, cei1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        return iD + (uri == null ? 0 : uri.hashCode());
    }
}
