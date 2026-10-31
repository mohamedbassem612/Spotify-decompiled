package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class us80 implements ws80 {
    public final Uri a;

    public us80(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us80) && this.a.equals(((us80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
