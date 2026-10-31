package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ez31 {
    public final List a;
    public final boolean b;

    public ez31(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez31)) {
            return false;
        }
        ez31 ez31Var = (ez31) obj;
        return u890.j(this.a, ez31Var.a) && this.b == ez31Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
