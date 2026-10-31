package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f240 implements i240 {
    public final String a;
    public final List b;
    public final tv80 c;

    public f240(String str, List list, tv80 tv80Var) {
        this.a = str;
        this.b = list;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f240)) {
            return false;
        }
        f240 f240Var = (f240) obj;
        return u890.j(this.a, f240Var.a) && u890.j(this.b, f240Var.b) && u890.j(this.c, f240Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
