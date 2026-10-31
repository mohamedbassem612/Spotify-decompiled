package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bnt extends t0c {
    public final String e;

    public bnt(Uri uri) {
        this(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnt) && u890.j(this.e, ((bnt) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public bnt(String str) {
        this.e = str;
    }
}
