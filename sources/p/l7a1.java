package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l7a1 {
    public final String a;
    public final ArrayList b;

    public l7a1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7a1)) {
            return false;
        }
        l7a1 l7a1Var = (l7a1) obj;
        return this.a.equals(l7a1Var.a) && this.b.equals(l7a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
