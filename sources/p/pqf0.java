package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pqf0 {
    public final List a;
    public final int b;

    public pqf0(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqf0)) {
            return false;
        }
        pqf0 pqf0Var = (pqf0) obj;
        return this.a.equals(pqf0Var.a) && this.b == pqf0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
