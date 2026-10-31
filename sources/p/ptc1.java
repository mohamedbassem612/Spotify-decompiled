package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ptc1 implements qtc1 {
    public final String a;
    public final List b;

    public ptc1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptc1)) {
            return false;
        }
        ptc1 ptc1Var = (ptc1) obj;
        return this.a.equals(ptc1Var.a) && this.b.equals(ptc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
