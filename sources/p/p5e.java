package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p5e {
    public final List a;
    public final wcb0 b;
    public final boolean c;

    public p5e(List list, wcb0 wcb0Var, boolean z) {
        this.a = list;
        this.b = wcb0Var;
        this.c = z;
    }

    public static p5e a(p5e p5eVar, List list, wcb0 wcb0Var, int i) {
        if ((i & 1) != 0) {
            list = p5eVar.a;
        }
        if ((i & 2) != 0) {
            wcb0Var = p5eVar.b;
        }
        return new p5e(list, wcb0Var, p5eVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5e)) {
            return false;
        }
        p5e p5eVar = (p5e) obj;
        return this.a.equals(p5eVar.a) && u890.j(this.b, p5eVar.b) && this.c == p5eVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
