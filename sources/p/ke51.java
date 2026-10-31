package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ke51 {
    public final ArrayList a;

    public ke51(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke51) && this.a.equals(((ke51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
