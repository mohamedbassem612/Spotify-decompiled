package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pnc0 extends t3k1 {
    public final ArrayList b;

    public pnc0(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnc0) && this.b.equals(((pnc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
