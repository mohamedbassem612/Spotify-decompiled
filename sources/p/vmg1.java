package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vmg1 {
    public final boolean a;
    public final String b;

    public vmg1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmg1)) {
            return false;
        }
        vmg1 vmg1Var = (vmg1) obj;
        return this.a == vmg1Var.a && u890.j(this.b, vmg1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
