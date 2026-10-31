package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r32 implements t32 {
    public final String a;
    public final k32 b;
    public final List c;
    public final h32 d;

    public r32(String str, k32 k32Var, List list, h32 h32Var) {
        this.a = str;
        this.b = k32Var;
        this.c = list;
        this.d = h32Var;
    }

    public final k32 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r32)) {
            return false;
        }
        r32 r32Var = (r32) obj;
        return u890.j(this.a, r32Var.a) && u890.j(this.b, r32Var.b) && u890.j(this.c, r32Var.c) && u890.j(this.d, r32Var.d);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k32 k32Var = this.b;
        int iB = f4i1.b((iHashCode + (k32Var == null ? 0 : k32Var.hashCode())) * 31, 31, this.c);
        h32 h32Var = this.d;
        return iB + (h32Var != null ? h32Var.hashCode() : 0);
    }
}
