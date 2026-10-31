package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wdr0 extends xdr0 {
    public final ArrayList b;

    public wdr0(ArrayList arrayList) {
        super(arrayList);
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdr0) && this.b.equals(((wdr0) obj).b);
    }

    public final String getId() {
        return "FindInShowPlaceholders";
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
