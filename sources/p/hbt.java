package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hbt {
    public final kko a;
    public final idd1 b;
    public final idd1 c;
    public final idd1 d;
    public final idd1 e;

    public hbt(kko kkoVar, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4) {
        this.a = kkoVar;
        this.b = idd1Var;
        this.c = idd1Var2;
        this.d = idd1Var3;
        this.e = idd1Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hbt) {
            hbt hbtVar = (hbt) obj;
            return u890.j(this.a, hbtVar.a) && this.b == hbtVar.b && this.c == hbtVar.c && this.d == hbtVar.d && this.e == hbtVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
