package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pm11 {
    public final String a;
    public final ArrayList b;
    public final om11 c;

    public pm11(String str, ArrayList arrayList, om11 om11Var) {
        this.a = str;
        this.b = arrayList;
        this.c = om11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm11)) {
            return false;
        }
        pm11 pm11Var = (pm11) obj;
        return this.a.equals(pm11Var.a) && this.b.equals(pm11Var.b) && u890.j(this.c, pm11Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        om11 om11Var = this.c;
        return iF + (om11Var == null ? 0 : om11Var.hashCode());
    }
}
