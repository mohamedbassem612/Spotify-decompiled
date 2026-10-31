package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h720 {
    public final djx a;
    public final k3h1 b;

    public h720(djx djxVar, k3h1 k3h1Var) {
        this.a = djxVar;
        this.b = k3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h720) {
            h720 h720Var = (h720) obj;
            if (this.a == h720Var.a && this.b.equals(h720Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.b) + ((this.a.hashCode() + 768935575) * 31);
    }
}
