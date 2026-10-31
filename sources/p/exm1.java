package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class exm1 implements gxm1 {
    public final List a;
    public final boolean b;

    public exm1(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exm1)) {
            return false;
        }
        exm1 exm1Var = (exm1) obj;
        return u890.j(this.a, exm1Var.a) && this.b == exm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
