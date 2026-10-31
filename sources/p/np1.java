package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class np1 implements cq1 {
    public final Set a;
    public final String b;

    public np1(String str, Set set) {
        this.a = set;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np1)) {
            return false;
        }
        np1 np1Var = (np1) obj;
        return u890.j(this.a, np1Var.a) && u890.j(this.b, np1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
