package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class svk {
    public final Uri a;

    public svk(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svk) && u890.j(this.a, ((svk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
