package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zk8 {
    public final lj8 a;
    public final iu30 b;

    public zk8(lj8 lj8Var, iu30 iu30Var) {
        this.a = lj8Var;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk8)) {
            return false;
        }
        zk8 zk8Var = (zk8) obj;
        return this.a.equals(zk8Var.a) && this.b.equals(zk8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
