package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class tc4 {
    public static final sc4 Companion = new sc4();
    public static final znb0[] c = {dm5.S(2, ou1.Y0), dm5.S(2, ou1.Z0)};
    public final Set a;
    public final Set b;

    public /* synthetic */ tc4(int i, Set set, Set set2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, rc4.a.getDescriptor());
            throw null;
        }
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc4)) {
            return false;
        }
        tc4 tc4Var = (tc4) obj;
        return u890.j(this.a, tc4Var.a) && u890.j(this.b, tc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public tc4(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }
}
