package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z5l1 {
    public final String a;
    public final ArrayList b;

    public z5l1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5l1)) {
            return false;
        }
        z5l1 z5l1Var = (z5l1) obj;
        return this.a.equals(z5l1Var.a) && this.b.equals(z5l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
