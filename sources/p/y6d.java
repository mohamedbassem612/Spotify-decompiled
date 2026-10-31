package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y6d implements d7d {
    public final ArrayList a;
    public final int b;

    public y6d(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6d)) {
            return false;
        }
        y6d y6dVar = (y6d) obj;
        return this.a.equals(y6dVar.a) && this.b == y6dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
