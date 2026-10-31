package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pbb1 implements rbb1 {
    public final Uri a;

    public pbb1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbb1) && u890.j(this.a, ((pbb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
