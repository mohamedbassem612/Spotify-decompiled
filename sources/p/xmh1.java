package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xmh1 {
    public final List a;
    public final String b;

    public xmh1(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmh1)) {
            return false;
        }
        xmh1 xmh1Var = (xmh1) obj;
        return this.a.equals(xmh1Var.a) && u890.j(this.b, xmh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
