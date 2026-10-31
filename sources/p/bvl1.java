package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bvl1 {
    public final Object a;
    public final boolean b;

    public bvl1(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public static bvl1 a(bvl1 bvl1Var, Object obj, boolean z, int i) {
        if ((i & 1) != 0) {
            obj = bvl1Var.a;
        }
        if ((i & 2) != 0) {
            z = bvl1Var.b;
        }
        bvl1Var.getClass();
        return new bvl1(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvl1)) {
            return false;
        }
        bvl1 bvl1Var = (bvl1) obj;
        return u890.j(this.a, bvl1Var.a) && this.b == bvl1Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return f4i1.g(sb, this.b, ')');
    }
}
