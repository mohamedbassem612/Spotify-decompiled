package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j4n0 {
    public final String a;
    public final ArrayList b;

    public j4n0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4n0)) {
            return false;
        }
        j4n0 j4n0Var = (j4n0) obj;
        return this.a.equals(j4n0Var.a) && this.b.equals(j4n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
