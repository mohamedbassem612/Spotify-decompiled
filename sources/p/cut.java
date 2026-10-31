package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cut {
    public final String a;
    public final fi9 b;
    public final di9 c;
    public final Set d;

    public cut(String str, fi9 fi9Var, di9 di9Var, Set set) {
        this.a = str;
        this.b = fi9Var;
        this.c = di9Var;
        this.d = set;
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.d;
    }

    public final fi9 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cut)) {
            return false;
        }
        cut cutVar = (cut) obj;
        return u890.j(this.a, cutVar.a) && this.b == cutVar.b && this.c == cutVar.c && u890.j(this.d, cutVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
