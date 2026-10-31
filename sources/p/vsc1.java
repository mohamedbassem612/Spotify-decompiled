package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vsc1 {
    public final ArrayList a;

    public vsc1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsc1) && this.a.equals(((vsc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
