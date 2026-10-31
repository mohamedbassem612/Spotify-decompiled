package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ckc0 {
    public final String a;
    public final xjc0 b;

    public ckc0(String str, xjc0 xjc0Var) {
        this.a = str;
        this.b = xjc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckc0)) {
            return false;
        }
        ckc0 ckc0Var = (ckc0) obj;
        return u890.j(this.a, ckc0Var.a) && this.b.equals(ckc0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
