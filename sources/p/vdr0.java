package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vdr0 extends xdr0 {
    public final ArrayList b;

    public vdr0(ArrayList arrayList) {
        super(arrayList);
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdr0) && this.b.equals(((vdr0) obj).b);
    }

    public final String getId() {
        return "FindInShowLoadedItems";
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
