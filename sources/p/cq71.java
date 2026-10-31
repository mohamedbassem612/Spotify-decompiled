package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cq71 {
    public final bc71 a;
    public final boolean b;

    public cq71(bc71 bc71Var, boolean z) {
        this.a = bc71Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq71)) {
            return false;
        }
        cq71 cq71Var = (cq71) obj;
        return u890.j(this.a, cq71Var.a) && this.b == cq71Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
