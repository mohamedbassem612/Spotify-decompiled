package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ds1 implements bt1 {
    public final go1 a;
    public final List b;

    public ds1(go1 go1Var, List list) {
        this.a = go1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds1)) {
            return false;
        }
        ds1 ds1Var = (ds1) obj;
        return u890.j(this.a, ds1Var.a) && u890.j(this.b, ds1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
