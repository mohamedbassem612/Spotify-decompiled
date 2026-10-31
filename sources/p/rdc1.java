package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rdc1 {
    public final String a;
    public final int b;
    public final qdc1 c;

    public rdc1(String str, int i, qdc1 qdc1Var) {
        this.a = str;
        this.b = i;
        this.c = qdc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdc1)) {
            return false;
        }
        rdc1 rdc1Var = (rdc1) obj;
        return u890.j(this.a, rdc1Var.a) && this.b == rdc1Var.b && this.c == rdc1Var.c;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        qdc1 qdc1Var = this.c;
        return iK + (qdc1Var == null ? 0 : qdc1Var.hashCode());
    }
}
