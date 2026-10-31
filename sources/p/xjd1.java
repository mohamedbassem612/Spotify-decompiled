package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xjd1 {
    public final String a = "";
    public final List b = z6x.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjd1)) {
            return false;
        }
        xjd1 xjd1Var = (xjd1) obj;
        return this.a.equals(xjd1Var.a) && this.b.equals(xjd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
