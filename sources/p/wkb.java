package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wkb implements xkb {
    public final ArrayList a;
    public final ykb b;

    public wkb(ArrayList arrayList, ykb ykbVar) {
        this.a = arrayList;
        this.b = ykbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkb)) {
            return false;
        }
        wkb wkbVar = (wkb) obj;
        return this.a.equals(wkbVar.a) && this.b.equals(wkbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
