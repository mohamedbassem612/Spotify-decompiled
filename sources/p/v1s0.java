package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v1s0 extends zmo1 {
    public final Uri b;

    public v1s0(Uri uri) {
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1s0) && this.b.equals(((v1s0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
