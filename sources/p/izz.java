package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izz implements a700 {
    public final Uri a;

    public izz(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izz) && u890.j(this.a, ((izz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
