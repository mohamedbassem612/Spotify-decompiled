package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u57 {
    public final l420 a;
    public final Uri b;

    public u57(l420 l420Var, Uri uri) {
        this.a = l420Var;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u57)) {
            return false;
        }
        u57 u57Var = (u57) obj;
        return u890.j(this.a, u57Var.a) && this.b.equals(u57Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
