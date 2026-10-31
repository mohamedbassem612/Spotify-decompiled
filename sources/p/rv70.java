package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rv70 {
    public final pv70 a;
    public final ArrayList b;
    public final Set c;

    public rv70(pv70 pv70Var, ArrayList arrayList, Set set) {
        this.a = pv70Var;
        this.b = arrayList;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv70)) {
            return false;
        }
        rv70 rv70Var = (rv70) obj;
        return u890.j(this.a, rv70Var.a) && this.b.equals(rv70Var.b) && u890.j(this.c, rv70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
