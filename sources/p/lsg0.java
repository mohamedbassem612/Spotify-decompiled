package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsg0 {
    public final String a;
    public final ArrayList b;

    public lsg0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsg0)) {
            return false;
        }
        lsg0 lsg0Var = (lsg0) obj;
        return u890.j(this.a, lsg0Var.a) && this.b.equals(lsg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
