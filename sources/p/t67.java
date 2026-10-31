package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t67 {
    public final List a;
    public final op41 b;
    public final int c;

    public t67(List list, op41 op41Var, int i) {
        this.a = list;
        this.b = op41Var;
        this.c = i;
    }

    public static t67 a(t67 t67Var, op41 op41Var, int i, int i2) {
        List list = t67Var.a;
        if ((i2 & 4) != 0) {
            i = t67Var.c;
        }
        return new t67(list, op41Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t67)) {
            return false;
        }
        t67 t67Var = (t67) obj;
        return u890.j(this.a, t67Var.a) && this.b == t67Var.b && this.c == t67Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ t67(List list) {
        this(list, op41.a, -1);
    }
}
