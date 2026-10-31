package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d871 {
    public final s4b1 a;
    public final boolean b;
    public final LinkedHashSet c;
    public final Set d;

    public d871(s4b1 s4b1Var, boolean z, LinkedHashSet linkedHashSet, Set set) {
        this.a = s4b1Var;
        this.b = z;
        this.c = linkedHashSet;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d871)) {
            return false;
        }
        d871 d871Var = (d871) obj;
        return this.a.equals(d871Var.a) && this.b == d871Var.b && this.c.equals(d871Var.c) && this.d.equals(d871Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
