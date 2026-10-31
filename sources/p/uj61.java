package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uj61 {
    public final Uri a;

    public uj61(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj61) && u890.j(this.a, ((uj61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
