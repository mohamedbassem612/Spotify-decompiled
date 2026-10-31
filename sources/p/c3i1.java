package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c3i1 {
    public final Uri a;
    public final List b;

    public c3i1(Uri uri, List list) {
        this.a = uri;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3i1)) {
            return false;
        }
        c3i1 c3i1Var = (c3i1) obj;
        return this.a.equals(c3i1Var.a) && this.b.equals(c3i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
