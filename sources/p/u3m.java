package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u3m extends z3m {
    public final int a;
    public final ArrayList b;

    public u3m(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3m)) {
            return false;
        }
        u3m u3mVar = (u3m) obj;
        return this.a == u3mVar.a && this.b.equals(u3mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
