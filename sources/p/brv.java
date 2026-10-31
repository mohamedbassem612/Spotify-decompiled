package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class brv implements irv {
    public final List a;
    public final List b;
    public final boolean c;

    public brv(c380 c380Var, List list, boolean z) {
        this.a = c380Var;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brv)) {
            return false;
        }
        brv brvVar = (brv) obj;
        return this.a.equals(brvVar.a) && u890.j(this.b, brvVar.b) && this.c == brvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
