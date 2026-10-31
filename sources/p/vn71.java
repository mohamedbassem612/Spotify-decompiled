package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vn71 implements ez00 {
    public final ArrayList a;

    public vn71(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn71) && this.a.equals(((vn71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
