package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hol1 extends t3k1 {
    public final ArrayList b;

    public hol1(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hol1) && this.b.equals(((hol1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
