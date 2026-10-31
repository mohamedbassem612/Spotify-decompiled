package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ghf extends gto1 {
    public final Uri b;

    public ghf(Uri uri) {
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghf) && this.b.equals(((ghf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
