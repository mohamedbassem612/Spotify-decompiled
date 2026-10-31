package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ia1 extends wa1 {
    public final String a;
    public final List b;
    public final g4a c;
    public final g4a d;
    public final boolean e;

    public ia1(String str, List list, g4a g4aVar, g4a g4aVar2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia1)) {
            return false;
        }
        ia1 ia1Var = (ia1) obj;
        return u890.j(this.a, ia1Var.a) && u890.j(this.b, ia1Var.b) && this.c == ia1Var.c && this.d == ia1Var.d && this.e == ia1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
