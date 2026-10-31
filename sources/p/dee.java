package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dee {
    public final Uri a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public dee(Uri uri, String str, boolean z, boolean z2) {
        this.a = uri;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dee)) {
            return false;
        }
        dee deeVar = (dee) obj;
        return this.a.equals(deeVar.a) && u890.j(this.b, deeVar.b) && this.c == deeVar.c && this.d == deeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, true);
    }
}
