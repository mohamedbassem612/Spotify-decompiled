package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t9n0 extends op71 {
    public final String c;
    public final ArrayList d;
    public final om11 e;

    public t9n0(String str, ArrayList arrayList, om11 om11Var) {
        this.c = str;
        this.d = arrayList;
        this.e = om11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9n0)) {
            return false;
        }
        t9n0 t9n0Var = (t9n0) obj;
        return this.c.equals(t9n0Var.c) && this.d.equals(t9n0Var.d) && u890.j(this.e, t9n0Var.e);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.d, this.c.hashCode() * 31, 31);
        om11 om11Var = this.e;
        return iF + (om11Var == null ? 0 : om11Var.hashCode());
    }
}
