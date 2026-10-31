package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tg40 {
    public final String a;
    public final List b;
    public final nmu0 c;

    public tg40(String str, List list, nmu0 nmu0Var) {
        this.a = str;
        this.b = list;
        this.c = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg40)) {
            return false;
        }
        tg40 tg40Var = (tg40) obj;
        return u890.j(this.a, tg40Var.a) && u890.j(this.b, tg40Var.b) && this.c == tg40Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
