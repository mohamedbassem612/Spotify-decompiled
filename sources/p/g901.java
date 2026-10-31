package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g901 implements i901 {
    public final List a;
    public final boolean b;

    public g901(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g901)) {
            return false;
        }
        g901 g901Var = (g901) obj;
        return u890.j(this.a, g901Var.a) && this.b == g901Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
