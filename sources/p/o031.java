package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o031 {
    public final ArrayList a;
    public final int b;

    public o031(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o031)) {
            return false;
        }
        o031 o031Var = (o031) obj;
        return this.a.equals(o031Var.a) && this.b == o031Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
