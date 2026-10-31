package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class poa1 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public poa1(String str, int i, int i2, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poa1)) {
            return false;
        }
        poa1 poa1Var = (poa1) obj;
        return u890.j(this.a, poa1Var.a) && this.b.equals(poa1Var.b) && this.c == poa1Var.c && this.d == poa1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
