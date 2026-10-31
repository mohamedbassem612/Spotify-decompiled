package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class khe1 {
    public final hhe1 a;
    public final mhe1 b;
    public final lhe1 c;

    public khe1(hhe1 hhe1Var, mhe1 mhe1Var, lhe1 lhe1Var) {
        this.a = hhe1Var;
        this.b = mhe1Var;
        this.c = lhe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khe1)) {
            return false;
        }
        khe1 khe1Var = (khe1) obj;
        return this.a.equals(khe1Var.a) && this.b == khe1Var.b && this.c == khe1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
