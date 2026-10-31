package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dxq extends f2p1 {
    public final ArrayList c;

    public dxq(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxq) && this.c.equals(((dxq) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
