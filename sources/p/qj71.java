package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qj71 {
    public final List a;
    public final int b;
    public final t890 c;

    public qj71(List list, int i, t890 t890Var) {
        this.a = list;
        this.b = i;
        this.c = t890Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj71)) {
            return false;
        }
        qj71 qj71Var = (qj71) obj;
        return u890.j(this.a, qj71Var.a) && this.b == qj71Var.b && u890.j(this.c, qj71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
