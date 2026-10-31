package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nd11 {
    public final List a;
    public final String b;

    public nd11(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd11)) {
            return false;
        }
        nd11 nd11Var = (nd11) obj;
        return this.a.equals(nd11Var.a) && this.b.equals(nd11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
