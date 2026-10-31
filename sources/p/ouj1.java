package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ouj1 {
    public final String a;
    public final zx9 b;
    public final String c;
    public final List d;
    public final e4p1 e;

    public ouj1(String str, zx9 zx9Var, String str2, List list, e4p1 e4p1Var) {
        this.a = str;
        this.b = zx9Var;
        this.c = str2;
        this.d = list;
        this.e = e4p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouj1)) {
            return false;
        }
        ouj1 ouj1Var = (ouj1) obj;
        return this.a.equals(ouj1Var.a) && this.b == ouj1Var.b && this.c.equals(ouj1Var.c) && this.d.equals(ouj1Var.d) && u890.j(this.e, ouj1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f4i1.b(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
