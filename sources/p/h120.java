package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h120 {
    public final kby a;
    public final String b;
    public final List c;

    public h120(kby kbyVar, String str, List list) {
        this.a = kbyVar;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h120)) {
            return false;
        }
        h120 h120Var = (h120) obj;
        return u890.j(this.a, h120Var.a) && u890.j(this.b, h120Var.b) && this.c.equals(h120Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
