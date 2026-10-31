package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xe9 {
    public final String a;
    public final fi9 b;
    public final int c;
    public final long d;
    public final Set e;

    public xe9(String str, fi9 fi9Var, int i, long j, Set set) {
        this.a = str;
        this.b = fi9Var;
        this.c = i;
        this.d = j;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe9)) {
            return false;
        }
        xe9 xe9Var = (xe9) obj;
        return u890.j(this.a, xe9Var.a) && this.b == xe9Var.b && this.c == xe9Var.c && this.d == xe9Var.d && u890.j(this.e, xe9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31);
    }
}
