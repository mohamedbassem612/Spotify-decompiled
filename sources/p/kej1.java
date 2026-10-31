package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kej1 {
    public final int a;
    public final String b;
    public final List c;

    public kej1(String str, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kej1)) {
            return false;
        }
        kej1 kej1Var = (kej1) obj;
        return this.a == kej1Var.a && this.b.equals(kej1Var.b) && this.c.equals(kej1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b);
    }
}
