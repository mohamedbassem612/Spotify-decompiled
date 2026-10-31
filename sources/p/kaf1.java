package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kaf1 {
    public final String a;
    public final gsc1 b;
    public final List c;
    public final boolean d;

    public kaf1(String str, gsc1 gsc1Var, List list, boolean z) {
        this.a = str;
        this.b = gsc1Var;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kaf1) {
            kaf1 kaf1Var = (kaf1) obj;
            if (u890.j(this.a, kaf1Var.a) && this.b == kaf1Var.b && u890.j(this.c, kaf1Var.c) && this.d == kaf1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
