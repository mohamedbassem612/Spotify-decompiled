package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class khf1 extends lhf1 {
    public final Uri a;

    public khf1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khf1) && this.a.equals(((khf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
