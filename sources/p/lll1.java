package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lll1 implements nll1 {
    public final Uri a;

    public lll1(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lll1) && this.a.equals(((lll1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
