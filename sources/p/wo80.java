package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wo80 {
    public final String a;
    public final so80 b;

    public wo80(String str, so80 so80Var) {
        this.a = str;
        this.b = so80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo80)) {
            return false;
        }
        wo80 wo80Var = (wo80) obj;
        return u890.j(this.a, wo80Var.a) && this.b.equals(wo80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
