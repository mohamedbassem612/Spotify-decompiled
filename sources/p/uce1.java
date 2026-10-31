package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uce1 {
    public final int a;
    public final String b;
    public final z0e1 c;
    public final boolean d;

    public uce1(int i, String str, z0e1 z0e1Var, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z0e1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uce1)) {
            return false;
        }
        uce1 uce1Var = (uce1) obj;
        return this.a == uce1Var.a && u890.j(this.b, uce1Var.b) && this.c.equals(uce1Var.c) && this.d == uce1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
