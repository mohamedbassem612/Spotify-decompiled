package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u3a0 {
    public final t3a0 a;
    public final Set b;
    public final Set c;

    public u3a0(t3a0 t3a0Var, Set set, Set set2) {
        this.a = t3a0Var;
        this.b = set;
        this.c = set2;
    }

    public static u3a0 a(u3a0 u3a0Var, t3a0 t3a0Var, Set set, Set set2, int i) {
        if ((i & 1) != 0) {
            t3a0Var = u3a0Var.a;
        }
        if ((i & 2) != 0) {
            set = u3a0Var.b;
        }
        if ((i & 4) != 0) {
            set2 = u3a0Var.c;
        }
        return new u3a0(t3a0Var, set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3a0)) {
            return false;
        }
        u3a0 u3a0Var = (u3a0) obj;
        return this.a.equals(u3a0Var.a) && u890.j(this.b, u3a0Var.b) && u890.j(this.c, u3a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
