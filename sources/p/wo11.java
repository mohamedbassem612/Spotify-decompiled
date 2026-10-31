package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wo11 {
    public final String a;
    public final uv11 b;

    public wo11(String str, uv11 uv11Var) {
        this.a = str;
        this.b = uv11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo11)) {
            return false;
        }
        wo11 wo11Var = (wo11) obj;
        return u890.j(this.a, wo11Var.a) && this.b.equals(wo11Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
