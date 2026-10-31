package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z4z0 extends ajo1 {
    public final ArrayList d;

    public z4z0(ArrayList arrayList) {
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4z0) && this.d.equals(((z4z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
