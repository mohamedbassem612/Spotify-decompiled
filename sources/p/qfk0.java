package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qfk0 implements ufk0 {
    public final String a;
    public final List b;
    public final List c;

    public qfk0(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfk0)) {
            return false;
        }
        qfk0 qfk0Var = (qfk0) obj;
        return u890.j(this.a, qfk0Var.a) && u890.j(this.b, qfk0Var.b) && u890.j(this.c, qfk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
