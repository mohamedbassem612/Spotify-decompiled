package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gvc implements hvc {
    public final String a;
    public final String b;
    public final int c;
    public final Uri d;

    public /* synthetic */ gvc(int i, String str, String str2) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 2 : 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvc)) {
            return false;
        }
        gvc gvcVar = (gvc) obj;
        return u890.j(this.a, gvcVar.a) && u890.j(this.b, gvcVar.b) && this.c == gvcVar.c && u890.j(this.d, gvcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iK = ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Uri uri = this.d;
        return iK + (uri != null ? uri.hashCode() : 0);
    }

    public gvc(String str, String str2, int i, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = uri;
    }
}
