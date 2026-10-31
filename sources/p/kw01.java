package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kw01 {
    public final String a;
    public final List b;

    public kw01(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw01)) {
            return false;
        }
        kw01 kw01Var = (kw01) obj;
        return this.a.equals(kw01Var.a) && this.b.equals(kw01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
