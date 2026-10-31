package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l2n implements m2n {
    public final ArrayList a;

    public l2n(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2n) && this.a.equals(((l2n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
