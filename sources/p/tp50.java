package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tp50 {
    public final zv31 a;
    public final int b;

    public tp50(zv31 zv31Var, int i) {
        this.a = zv31Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp50)) {
            return false;
        }
        tp50 tp50Var = (tp50) obj;
        return this.a.equals(tp50Var.a) && this.b == tp50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
