package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a1k implements k1k {
    public final String a;
    public final List b;

    public a1k(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1k)) {
            return false;
        }
        a1k a1kVar = (a1k) obj;
        return u890.j(this.a, a1kVar.a) && this.b.equals(a1kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
