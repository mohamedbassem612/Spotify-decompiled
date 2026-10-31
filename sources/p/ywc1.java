package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ywc1 {
    public final int a;
    public final gab b;
    public final iu30 c;

    public ywc1(int i, gab gabVar, iu30 iu30Var) {
        this.a = i;
        this.b = gabVar;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ywc1) {
            ywc1 ywc1Var = (ywc1) obj;
            if (this.a == ywc1Var.a && this.b == ywc1Var.b && u890.j(this.c, ywc1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
