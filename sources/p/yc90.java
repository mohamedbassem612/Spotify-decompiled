package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yc90 {
    public final b5i1 a;
    public final me90 b;

    public yc90(b5i1 b5i1Var, me90 me90Var) {
        this.a = b5i1Var;
        this.b = me90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc90)) {
            return false;
        }
        yc90 yc90Var = (yc90) obj;
        return this.a.equals(yc90Var.a) && this.b == yc90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
