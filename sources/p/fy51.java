package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fy51 implements hy51 {
    public final List a;
    public final boolean b;

    public fy51(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy51)) {
            return false;
        }
        fy51 fy51Var = (fy51) obj;
        return u890.j(this.a, fy51Var.a) && this.b == fy51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
