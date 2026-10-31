package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class frn {
    public final Uri a;
    public final boolean b;

    public frn(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frn)) {
            return false;
        }
        frn frnVar = (frn) obj;
        return u890.j(this.a, frnVar.a) && this.b == frnVar.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return Boolean.hashCode(this.b) + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public /* synthetic */ frn() {
        this(null, false);
    }
}
