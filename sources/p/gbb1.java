package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gbb1 implements ibb1 {
    public final Uri a;

    public gbb1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbb1) && this.a.equals(((gbb1) obj).a);
    }

    public final Uri getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
