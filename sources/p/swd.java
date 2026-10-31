package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class swd extends t3k1 {
    public final ArrayList b;

    public swd(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swd) && this.b.equals(((swd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
