package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ovd1 extends k1p1 {
    public final List c;
    public final qvd1 d;

    public ovd1(List list, qvd1 qvd1Var) {
        this.c = list;
        this.d = qvd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovd1)) {
            return false;
        }
        ovd1 ovd1Var = (ovd1) obj;
        return u890.j(this.c, ovd1Var.c) && this.d == ovd1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
