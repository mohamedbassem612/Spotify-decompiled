package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d00 implements l10 {
    public final eln0 a;
    public final List b;
    public final c00 c;

    public d00(eln0 eln0Var, List list, c00 c00Var) {
        this.a = eln0Var;
        this.b = list;
        this.c = c00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d00)) {
            return false;
        }
        d00 d00Var = (d00) obj;
        return this.a.equals(d00Var.a) && this.b.equals(d00Var.b) && this.c.equals(d00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
