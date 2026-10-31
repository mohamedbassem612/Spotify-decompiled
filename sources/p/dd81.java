package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dd81 {
    public final pjw0 a;
    public final nbw0 b;
    public final boolean c;

    public /* synthetic */ dd81(int i) {
        this(null, null, (i & 4) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd81)) {
            return false;
        }
        dd81 dd81Var = (dd81) obj;
        return u890.j(this.a, dd81Var.a) && u890.j(this.b, dd81Var.b) && this.c == dd81Var.c;
    }

    public final int hashCode() {
        pjw0 pjw0Var = this.a;
        int iHashCode = (pjw0Var == null ? 0 : pjw0Var.hashCode()) * 31;
        nbw0 nbw0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (nbw0Var != null ? nbw0Var.hashCode() : 0)) * 31);
    }

    public dd81(pjw0 pjw0Var, nbw0 nbw0Var, boolean z) {
        this.a = pjw0Var;
        this.b = nbw0Var;
        this.c = z;
    }
}
