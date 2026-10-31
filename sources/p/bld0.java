package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bld0 {
    public final zkd0 a;
    public final Integer b;

    public bld0(zkd0 zkd0Var, Integer num) {
        this.a = zkd0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bld0)) {
            return false;
        }
        bld0 bld0Var = (bld0) obj;
        return this.a == bld0Var.a && u890.j(this.b, bld0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
