package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cfl1 {
    public final boolean a;
    public final int b;

    public cfl1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public static cfl1 a(cfl1 cfl1Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = cfl1Var.a;
        }
        if ((i2 & 2) != 0) {
            i = cfl1Var.b;
        }
        cfl1Var.getClass();
        return new cfl1(i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfl1)) {
            return false;
        }
        cfl1 cfl1Var = (cfl1) obj;
        return this.a == cfl1Var.a && this.b == cfl1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
