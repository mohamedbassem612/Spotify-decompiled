package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r480 implements Serializable {
    public final p480 a;
    public final y6r0 b;

    public r480(p480 p480Var, y6r0 y6r0Var) {
        this.a = p480Var;
        this.b = y6r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r480)) {
            return false;
        }
        r480 r480Var = (r480) obj;
        return this.a.equals(r480Var.a) && u890.j(this.b, r480Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        y6r0 y6r0Var = this.b;
        return iHashCode + (y6r0Var == null ? 0 : y6r0Var.a.hashCode());
    }
}
