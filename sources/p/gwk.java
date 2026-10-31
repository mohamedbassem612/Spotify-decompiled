package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gwk implements fxk {
    public final Uri a;

    public gwk(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwk) && u890.j(this.a, ((gwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
