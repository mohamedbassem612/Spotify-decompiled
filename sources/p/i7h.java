package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i7h {
    public final ilw0 a;
    public final List b;

    public i7h(ilw0 ilw0Var, List list) {
        this.a = ilw0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7h)) {
            return false;
        }
        i7h i7hVar = (i7h) obj;
        return this.a.equals(i7hVar.a) && this.b.equals(i7hVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
