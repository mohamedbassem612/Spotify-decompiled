package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fpf0 {
    public final String a;
    public final List b;
    public final bff0 c;

    public fpf0(String str, List list, bff0 bff0Var) {
        this.a = str;
        this.b = list;
        this.c = bff0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpf0)) {
            return false;
        }
        fpf0 fpf0Var = (fpf0) obj;
        return u890.j(this.a, fpf0Var.a) && u890.j(this.b, fpf0Var.b) && u890.j(this.c, fpf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
