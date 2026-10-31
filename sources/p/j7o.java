package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j7o implements ez00 {
    public final ArrayList a;
    public final ArrayList b;

    public j7o(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7o)) {
            return false;
        }
        j7o j7oVar = (j7o) obj;
        return this.a.equals(j7oVar.a) && this.b.equals(j7oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
