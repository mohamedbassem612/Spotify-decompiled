package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a651 implements whm0 {
    public final List a;
    public final List b;
    public final i3o1 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a651(i3o1 i3o1Var, String str, int i) {
        i3o1Var = (i & 4) != 0 ? eb51.c : i3o1Var;
        str = (i & 8) != 0 ? "" : str;
        z6x z6xVar = z6x.a;
        this(z6xVar, z6xVar, i3o1Var, str);
    }

    public static a651 b(a651 a651Var, List list, List list2, i3o1 i3o1Var, String str, int i) {
        if ((i & 1) != 0) {
            list = a651Var.a;
        }
        if ((i & 2) != 0) {
            list2 = a651Var.b;
        }
        return new a651(list, list2, i3o1Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a651)) {
            return false;
        }
        a651 a651Var = (a651) obj;
        return u890.j(this.a, a651Var.a) && u890.j(this.b, a651Var.b) && u890.j(this.c, a651Var.c) && u890.j(this.d, a651Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public a651(List list, List list2, i3o1 i3o1Var, String str) {
        this.a = list;
        this.b = list2;
        this.c = i3o1Var;
        this.d = str;
    }
}
