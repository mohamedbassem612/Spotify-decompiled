package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class prs {
    public final Uri a;
    public final u7h b;
    public final by9 c;

    public prs(Uri uri, u7h u7hVar, by9 by9Var) {
        this.a = uri;
        this.b = u7hVar;
        this.c = by9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prs)) {
            return false;
        }
        prs prsVar = (prs) obj;
        return u890.j(this.a, prsVar.a) && u890.j(this.b, prsVar.b) && u890.j(this.c, prsVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u7h u7hVar = this.b;
        return this.c.hashCode() + ((iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31);
    }
}
