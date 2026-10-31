package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bsd extends hsd {
    public final i a;
    public final ArrayList b;

    public bsd(i iVar, ArrayList arrayList) {
        this.a = iVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsd)) {
            return false;
        }
        bsd bsdVar = (bsd) obj;
        return this.a.equals(bsdVar.a) && this.b.equals(bsdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
