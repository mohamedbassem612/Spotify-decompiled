package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class saq0 {
    public final List a;
    public final int b;

    public saq0(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saq0)) {
            return false;
        }
        saq0 saq0Var = (saq0) obj;
        return u890.j(this.a, saq0Var.a) && this.b == saq0Var.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Integer.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }
}
