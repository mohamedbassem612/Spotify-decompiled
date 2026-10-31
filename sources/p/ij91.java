package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ij91 {
    public final String a;
    public final ody0 b;
    public final Set c;
    public final nl91 d;

    public ij91(String str, ody0 ody0Var, Set set, nl91 nl91Var) {
        this.a = str;
        this.b = ody0Var;
        this.c = set;
        this.d = nl91Var;
    }

    public static ij91 a(ij91 ij91Var, Set set, nl91 nl91Var, int i) {
        String str = ij91Var.a;
        ody0 ody0Var = ij91Var.b;
        if ((i & 4) != 0) {
            set = ij91Var.c;
        }
        if ((i & 8) != 0) {
            nl91Var = ij91Var.d;
        }
        return new ij91(str, ody0Var, set, nl91Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij91)) {
            return false;
        }
        ij91 ij91Var = (ij91) obj;
        return u890.j(this.a, ij91Var.a) && u890.j(this.b, ij91Var.b) && u890.j(this.c, ij91Var.c) && u890.j(this.d, ij91Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        int iC = gvg.c((Boolean.hashCode(false) + iHashCode) * 31, 31, this.c);
        nl91 nl91Var = this.d;
        return iC + (nl91Var != null ? nl91Var.hashCode() : 0);
    }

    public ij91(String str, ody0 ody0Var) {
        this(str, ody0Var, w7x.a, null);
    }
}
