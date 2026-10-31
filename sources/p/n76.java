package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n76 implements m86 {
    public final am10 a;
    public final String b;

    public n76(am10 am10Var, String str) {
        this.a = am10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n76)) {
            return false;
        }
        n76 n76Var = (n76) obj;
        return u890.j(this.a, n76Var.a) && u890.j(this.b, n76Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
