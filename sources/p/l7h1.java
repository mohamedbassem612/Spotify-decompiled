package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l7h1 extends q6h1 {
    public final List d;
    public final m7h1 e;

    public l7h1(y6h1 y6h1Var, r6h1 r6h1Var, long j, ArrayList arrayList, List list) {
        super(y6h1Var, r6h1Var, j, arrayList);
        this.d = list;
        this.e = new m7h1(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l7h1) {
            return this.e.equals(((l7h1) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // p.q6h1
    public final String toString() {
        return "impression = ".concat(super.toString());
    }
}
