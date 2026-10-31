package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f2j1 {
    public final String a;
    public final List b;

    public f2j1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2j1)) {
            return false;
        }
        f2j1 f2j1Var = (f2j1) obj;
        return u890.j(this.a, f2j1Var.a) && u890.j(this.b, f2j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
