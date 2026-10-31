package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ch20 extends c2p1 {
    public final ArrayList c;

    public ch20(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch20) && this.c.equals(((ch20) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
