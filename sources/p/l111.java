package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l111 {
    public final List a;
    public final int b;

    public l111(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l111)) {
            return false;
        }
        l111 l111Var = (l111) obj;
        return u890.j(this.a, l111Var.a) && this.b == l111Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
