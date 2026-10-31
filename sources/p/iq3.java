package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iq3 extends kq3 {
    public final fqq0 a;
    public final List b;

    public iq3(fqq0 fqq0Var, List list) {
        this.a = fqq0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq3)) {
            return false;
        }
        iq3 iq3Var = (iq3) obj;
        return this.a.equals(iq3Var.a) && u890.j(this.b, iq3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
