package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kp1 implements cq1 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Map d;

    public kp1(Set set, Set set2, Set set3, Map map) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp1)) {
            return false;
        }
        kp1 kp1Var = (kp1) obj;
        return u890.j(this.a, kp1Var.a) && u890.j(this.b, kp1Var.b) && this.c.equals(kp1Var.c) && this.d.equals(kp1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
