package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uq3 extends hr3 {
    public final bx51 a;
    public final Set b;
    public final Set c;
    public final Set d;

    public uq3(bx51 bx51Var, Set set, Set set2, Set set3) {
        this.a = bx51Var;
        this.b = set;
        this.c = set2;
        this.d = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq3)) {
            return false;
        }
        uq3 uq3Var = (uq3) obj;
        return this.a == uq3Var.a && u890.j(this.b, uq3Var.b) && u890.j(this.c, uq3Var.c) && u890.j(this.d, uq3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
