package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i4n0 {
    public final String a;
    public final ArrayList b;

    public i4n0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4n0)) {
            return false;
        }
        i4n0 i4n0Var = (i4n0) obj;
        return this.a.equals(i4n0Var.a) && this.b.equals(i4n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
