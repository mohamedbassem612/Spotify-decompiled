package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vex0 {
    public final String a;
    public final String b;
    public final List c;

    public vex0(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vex0)) {
            return false;
        }
        vex0 vex0Var = (vex0) obj;
        return this.a.equals(vex0Var.a) && this.b.equals(vex0Var.b) && u890.j(this.c, vex0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
