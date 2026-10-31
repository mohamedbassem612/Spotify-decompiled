package p;

import io.reactivex.rxjava3.core.Maybe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lyo0 {
    public final tka0 a;
    public final Maybe b;
    public final boolean c;

    public lyo0(tka0 tka0Var, Maybe maybe, boolean z) {
        this.a = tka0Var;
        this.b = maybe;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyo0)) {
            return false;
        }
        lyo0 lyo0Var = (lyo0) obj;
        return u890.j(this.a, lyo0Var.a) && this.b.equals(lyo0Var.b) && this.c == lyo0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
