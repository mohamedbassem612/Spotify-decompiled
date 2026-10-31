package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class lhk0 {
    public static final khk0 Companion = new khk0();
    public static final znb0[] c = {dm5.S(2, z7i0.T0), null};
    public final Set a;
    public final int b;

    public /* synthetic */ lhk0(int i, int i2, Set set) {
        this.a = (i & 1) == 0 ? w7x.a : set;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhk0)) {
            return false;
        }
        lhk0 lhk0Var = (lhk0) obj;
        return u890.j(this.a, lhk0Var.a) && this.b == lhk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public lhk0(int i, Set set) {
        this.a = set;
        this.b = i;
    }
}
