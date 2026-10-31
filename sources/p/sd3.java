package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sd3 {
    public final boolean a;
    public final ok51 b;

    public sd3(boolean z, ok51 ok51Var, int i) {
        z = (i & 1) != 0 ? false : z;
        ok51Var = (i & 2) != 0 ? null : ok51Var;
        this.a = z;
        this.b = ok51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return this.a == sd3Var.a && u890.j(this.b, sd3Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ok51 ok51Var = this.b;
        return iHashCode + (ok51Var == null ? 0 : ok51Var.hashCode());
    }
}
