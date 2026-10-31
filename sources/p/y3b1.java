package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y3b1 {
    public final int a;
    public final ie30 b;
    public final np51 c;

    public y3b1(int i, ie30 ie30Var, np51 np51Var) {
        this.a = i;
        this.b = ie30Var;
        this.c = np51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3b1)) {
            return false;
        }
        y3b1 y3b1Var = (y3b1) obj;
        return this.a == y3b1Var.a && this.b.equals(y3b1Var.b) && this.c.equals(y3b1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
