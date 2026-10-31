package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l98 implements ez00 {
    public final ArrayList a;

    public l98(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l98) && this.a.equals(((l98) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
