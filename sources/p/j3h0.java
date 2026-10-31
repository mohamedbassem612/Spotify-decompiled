package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j3h0 implements e4h0 {
    public final Uri a;

    public j3h0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3h0) && u890.j(this.a, ((j3h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
