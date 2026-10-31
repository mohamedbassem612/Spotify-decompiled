package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z7h {
    public final List a;
    public final long b;

    public z7h(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7h)) {
            return false;
        }
        z7h z7hVar = (z7h) obj;
        if (!u890.j(this.a, z7hVar.a)) {
            return false;
        }
        long j = z7hVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
