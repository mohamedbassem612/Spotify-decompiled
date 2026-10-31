package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sea1 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final Uri d;

    public sea1(String str, Uri uri, Uri uri2, Uri uri3) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sea1)) {
            return false;
        }
        sea1 sea1Var = (sea1) obj;
        return this.a.equals(sea1Var.a) && u890.j(this.b, sea1Var.b) && u890.j(this.c, sea1Var.c) && u890.j(this.d, sea1Var.d);
    }

    public final int hashCode() {
        int iH = hrt.h(this.b, this.a.hashCode() * 31, 31);
        Uri uri = this.c;
        int iHashCode = (iH + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.d;
        return iHashCode + (uri2 != null ? uri2.hashCode() : 0);
    }
}
