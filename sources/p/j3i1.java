package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j3i1 {
    public final boolean a;
    public final Uri b;

    public j3i1(Uri uri, boolean z) {
        this.a = z;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3i1)) {
            return false;
        }
        j3i1 j3i1Var = (j3i1) obj;
        return this.a == j3i1Var.a && this.b.equals(j3i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
