package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z7r {
    public final ArrayList a;

    public z7r(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7r) && this.a.equals(((z7r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
