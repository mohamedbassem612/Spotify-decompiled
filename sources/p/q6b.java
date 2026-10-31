package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q6b implements dbr0 {
    public final boolean a;
    public final Set b;

    public /* synthetic */ q6b(int i, boolean z) {
        this(w7x.a, (i & 1) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6b)) {
            return false;
        }
        q6b q6bVar = (q6b) obj;
        return this.a == q6bVar.a && u890.j(this.b, q6bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public q6b(Set set, boolean z) {
        this.a = z;
        this.b = set;
    }
}
