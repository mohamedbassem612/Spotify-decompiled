package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nob extends xto {
    public final ArrayList d;

    public nob(ArrayList arrayList) {
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nob) && this.d.equals(((nob) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
