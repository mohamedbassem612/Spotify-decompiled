package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qgw {
    public final String a;
    public final Uri b;

    public qgw(Uri uri, String str) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgw)) {
            return false;
        }
        qgw qgwVar = (qgw) obj;
        return u890.j(this.a, qgwVar.a) && u890.j(this.b, qgwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
