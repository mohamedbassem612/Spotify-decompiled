package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vyd0 implements azd0 {
    public final ArrayList a;

    public vyd0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyd0) && this.a.equals(((vyd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
