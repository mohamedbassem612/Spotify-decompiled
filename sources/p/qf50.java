package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qf50 extends t3k1 {
    public final ArrayList b;

    public qf50(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf50) && this.b.equals(((qf50) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
