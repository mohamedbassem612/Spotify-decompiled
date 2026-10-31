package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cbw {
    public final Uri a;

    public cbw(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbw) && u890.j(this.a, ((cbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
