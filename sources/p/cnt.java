package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cnt extends t0c {
    public final String e;
    public final boolean f;

    public cnt(String str, boolean z) {
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnt)) {
            return false;
        }
        cnt cntVar = (cnt) obj;
        return u890.j(this.e, cntVar.e) && this.f == cntVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    public cnt(Uri uri, boolean z) {
        this(uri.toString(), z);
    }
}
