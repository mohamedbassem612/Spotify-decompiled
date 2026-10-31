package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e5z0 extends ajo1 {
    public final ArrayList d;

    public e5z0(ArrayList arrayList) {
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5z0) && this.d.equals(((e5z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
