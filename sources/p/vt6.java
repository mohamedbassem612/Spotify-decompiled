package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vt6 extends jmo1 {
    public final ArrayList c;

    public vt6(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt6) && this.c.equals(((vt6) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
