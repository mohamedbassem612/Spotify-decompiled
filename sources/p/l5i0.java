package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l5i0 implements m5i0 {
    public final ArrayList a;

    public l5i0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5i0) && this.a.equals(((l5i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
