package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d6v0 extends e6v0 {
    public final String a;
    public final String b;
    public final List c;
    public final ou80 d;
    public final gqt0 e;

    public d6v0(String str, String str2, List list, ou80 ou80Var, gqt0 gqt0Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = ou80Var;
        this.e = gqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6v0)) {
            return false;
        }
        d6v0 d6v0Var = (d6v0) obj;
        return u890.j(this.a, d6v0Var.a) && this.b.equals(d6v0Var.b) && this.c.equals(d6v0Var.c) && u890.j(this.d, d6v0Var.d) && u890.j(this.e, d6v0Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ou80 ou80Var = this.d;
        return this.e.hashCode() + ((iB + (ou80Var == null ? 0 : ou80Var.a.hashCode())) * 31);
    }
}
