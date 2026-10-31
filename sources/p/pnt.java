package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pnt implements ez00 {
    public final String a;
    public final ArrayList b;

    public pnt(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnt)) {
            return false;
        }
        pnt pntVar = (pnt) obj;
        return this.a.equals(pntVar.a) && this.b.equals(pntVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
