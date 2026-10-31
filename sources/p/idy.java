package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class idy implements kdy {
    public final String a;
    public final ArrayList b;

    public idy(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idy)) {
            return false;
        }
        idy idyVar = (idy) obj;
        return this.a.equals(idyVar.a) && this.b.equals(idyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
