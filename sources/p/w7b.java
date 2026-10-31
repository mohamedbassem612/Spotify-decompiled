package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w7b {
    public final List a;
    public final i7g0 b;

    public w7b(List list, i7g0 i7g0Var) {
        this.a = list;
        this.b = i7g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7b)) {
            return false;
        }
        w7b w7bVar = (w7b) obj;
        return this.a.equals(w7bVar.a) && this.b == w7bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
