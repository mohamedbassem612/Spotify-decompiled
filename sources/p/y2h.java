package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y2h {
    public final ArrayList a;
    public final sxq0 b;

    public y2h(ArrayList arrayList, sxq0 sxq0Var) {
        this.a = arrayList;
        this.b = sxq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2h)) {
            return false;
        }
        y2h y2hVar = (y2h) obj;
        return this.a.equals(y2hVar.a) && this.b.equals(y2hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
