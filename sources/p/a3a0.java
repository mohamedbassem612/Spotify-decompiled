package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a3a0 implements g3a0 {
    public final String a;
    public final be9 b;

    public a3a0(String str, be9 be9Var) {
        this.a = str;
        this.b = be9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3a0)) {
            return false;
        }
        a3a0 a3a0Var = (a3a0) obj;
        return u890.j(this.a, a3a0Var.a) && u890.j(this.b, a3a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
