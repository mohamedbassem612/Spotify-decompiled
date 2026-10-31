package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hp1 implements cq1 {
    public final Set a;
    public final Set b;
    public final Set c;

    public hp1(Set set, Set set2, Set set3) {
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp1)) {
            return false;
        }
        hp1 hp1Var = (hp1) obj;
        return u890.j(this.a, hp1Var.a) && u890.j(this.b, hp1Var.b) && u890.j(this.c, hp1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
