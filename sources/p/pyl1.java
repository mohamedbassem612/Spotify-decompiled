package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pyl1 {
    public final qxc0 a;
    public final boolean b;

    public pyl1(qxc0 qxc0Var, boolean z) {
        this.a = qxc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyl1)) {
            return false;
        }
        pyl1 pyl1Var = (pyl1) obj;
        return this.a.equals(pyl1Var.a) && this.b == pyl1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
