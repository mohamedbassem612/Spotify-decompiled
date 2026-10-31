package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vxd {
    public final ArrayList a;

    public vxd(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxd) && this.a.equals(((vxd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
