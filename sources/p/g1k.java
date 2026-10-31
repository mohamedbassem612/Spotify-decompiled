package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g1k implements k1k {
    public final String a;
    public final String b;
    public final List c;

    public g1k(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1k)) {
            return false;
        }
        g1k g1kVar = (g1k) obj;
        return u890.j(this.a, g1kVar.a) && u890.j(this.b, g1kVar.b) && this.c.equals(g1kVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
