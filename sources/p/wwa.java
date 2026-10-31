package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wwa {
    public final vwa a;
    public final Uri b;

    public wwa(vwa vwaVar, Uri uri) {
        this.a = vwaVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwa)) {
            return false;
        }
        wwa wwaVar = (wwa) obj;
        return u890.j(this.a, wwaVar.a) && u890.j(this.b, wwaVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
