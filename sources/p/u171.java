package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u171 extends w171 {
    public final qz61 a;
    public final boolean b;

    public u171(qz61 qz61Var, boolean z) {
        this.a = qz61Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u171)) {
            return false;
        }
        u171 u171Var = (u171) obj;
        return u890.j(this.a, u171Var.a) && this.b == u171Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
