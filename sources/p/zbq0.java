package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zbq0 implements jcq0 {
    public final ept a;
    public final String b;

    public zbq0(String str, ept eptVar) {
        this.a = eptVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbq0)) {
            return false;
        }
        zbq0 zbq0Var = (zbq0) obj;
        return u890.j(this.a, zbq0Var.a) && u890.j(this.b, zbq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
