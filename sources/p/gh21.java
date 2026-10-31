package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gh21 extends lh21 {
    public final String a;
    public final t7q0 b;

    public gh21(String str, t7q0 t7q0Var) {
        this.a = str;
        this.b = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh21)) {
            return false;
        }
        gh21 gh21Var = (gh21) obj;
        return u890.j(this.a, gh21Var.a) && u890.j(this.b, gh21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
