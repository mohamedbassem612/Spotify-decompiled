package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pvc0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final Map f;
    public final pc41 g;

    public pvc0(String str, int i, String str2, String str3, List list, Map map, pc41 pc41Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = map;
        this.g = pc41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvc0)) {
            return false;
        }
        pvc0 pvc0Var = (pvc0) obj;
        return u890.j(this.a, pvc0Var.a) && this.b == pvc0Var.b && u890.j(this.c, pvc0Var.c) && u890.j(this.d, pvc0Var.d) && u890.j(this.e, pvc0Var.e) && u890.j(this.f, pvc0Var.f) && u890.j(this.g, pvc0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iE = cy30.e(f4i1.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        pc41 pc41Var = this.g;
        return iE + (pc41Var != null ? pc41Var.hashCode() : 0);
    }
}
