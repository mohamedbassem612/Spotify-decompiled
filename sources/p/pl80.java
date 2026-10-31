package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pl80 {
    public final String a;
    public final ol80 b;
    public final List c;

    public pl80(String str, ol80 ol80Var, List list) {
        this.a = str;
        this.b = ol80Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl80)) {
            return false;
        }
        pl80 pl80Var = (pl80) obj;
        return u890.j(this.a, pl80Var.a) && u890.j(this.b, pl80Var.b) && this.c.equals(pl80Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ol80 ol80Var = this.b;
        return this.c.hashCode() + ((iHashCode + (ol80Var == null ? 0 : ol80Var.hashCode())) * 31);
    }
}
