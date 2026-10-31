package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u740 {
    public final String a;
    public final ArrayList b;
    public final xsi1 c;
    public final fi10 d;

    public u740(String str, ArrayList arrayList, xsi1 xsi1Var, fi10 fi10Var) {
        this.a = str;
        this.b = arrayList;
        this.c = xsi1Var;
        this.d = fi10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u740)) {
            return false;
        }
        u740 u740Var = (u740) obj;
        return this.a.equals(u740Var.a) && this.b.equals(u740Var.b) && this.c.equals(u740Var.c) && this.d.equals(u740Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
