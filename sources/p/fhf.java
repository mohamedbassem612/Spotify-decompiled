package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fhf extends gto1 {
    public final Uri b;

    public fhf(Uri uri) {
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhf) && u890.j(this.b, ((fhf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
