package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tj61 extends oqo1 {
    public final Uri d;

    public tj61(Uri uri) {
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj61) && this.d.equals(((tj61) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
