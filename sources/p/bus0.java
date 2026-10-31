package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bus0 {
    public final List a;
    public final String b;
    public final int c;

    public bus0(List list, String str, int i) {
        this.a = list;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bus0)) {
            return false;
        }
        bus0 bus0Var = (bus0) obj;
        return this.a.equals(bus0Var.a) && u890.j(this.b, bus0Var.b) && this.c == bus0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
