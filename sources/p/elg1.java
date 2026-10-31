package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class elg1 {
    public final List a;
    public final boolean b;

    public elg1(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elg1)) {
            return false;
        }
        elg1 elg1Var = (elg1) obj;
        return u890.j(this.a, elg1Var.a) && this.b == elg1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
