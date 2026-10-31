package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yq60 {
    public final xpw a;
    public final Object b;

    public yq60(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq60)) {
            return false;
        }
        yq60 yq60Var = (yq60) obj;
        return u890.j(this.a, yq60Var.a) && this.b.equals(yq60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
