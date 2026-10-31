package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ki90 {
    public final zv31 a;
    public final wly0 b;
    public final boolean c;

    public ki90(zv31 zv31Var, wly0 wly0Var, boolean z) {
        this.a = zv31Var;
        this.b = wly0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki90)) {
            return false;
        }
        ki90 ki90Var = (ki90) obj;
        return u890.j(this.a, ki90Var.a) && this.b == ki90Var.b && this.c == ki90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
