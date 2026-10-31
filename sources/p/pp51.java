package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pp51 {
    public final String a;
    public final List b;
    public final int c;

    public pp51(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp51)) {
            return false;
        }
        pp51 pp51Var = (pp51) obj;
        return this.a.equals(pp51Var.a) && this.b.equals(pp51Var.b) && this.c == pp51Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
