package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hbb1 implements ibb1 {
    public final Uri a;

    public hbb1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbb1) && u890.j(this.a, ((hbb1) obj).a);
    }

    public final Uri getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
