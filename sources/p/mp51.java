package p;

import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mp51 {
    public final TreeMap a;
    public final int b;

    public mp51(TreeMap treeMap, int i) {
        this.a = treeMap;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp51)) {
            return false;
        }
        mp51 mp51Var = (mp51) obj;
        return this.a.equals(mp51Var.a) && this.b == mp51Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
