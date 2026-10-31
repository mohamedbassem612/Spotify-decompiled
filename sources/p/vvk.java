package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vvk implements fxk {
    public final Uri a;

    public vvk(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvk) && this.a.equals(((vvk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
